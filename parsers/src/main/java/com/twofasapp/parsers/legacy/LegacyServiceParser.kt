package com.twofasapp.parsers.legacy

import com.twofasapp.di.BackupSyncStatus
import com.twofasapp.prefs.model.OtpAuthLink
import com.twofasapp.prefs.model.OtpAuthLink.Companion.ALGORITHM_PARAM
import com.twofasapp.prefs.model.OtpAuthLink.Companion.COUNTER
import com.twofasapp.prefs.model.OtpAuthLink.Companion.DIGITS_PARAM
import com.twofasapp.prefs.model.OtpAuthLink.Companion.PERIOD_PARAM
import com.twofasapp.prefs.model.ServiceDto

@Deprecated("Remove")
abstract class LegacyServiceParser {

    abstract val serviceType: com.twofasapp.prefs.model.ServiceType
    abstract val displayedName: String
    abstract val displayedIcon: Int
    abstract val supportedIssuer: String?

    open val supportedManualNames: List<String> = emptyList()
    open val isNameStrict: Boolean = false

    fun isMatching(link: OtpAuthLink): Boolean {
        if (link.issuer != null && supportedIssuer != null) {
            return when (isNameStrict) {
                true -> link.issuer == supportedIssuer
                false -> link.issuer!!.contains(supportedIssuer.toString(), true)
            }
        }

        return isMatchingCustomRule(link)
    }

    open fun isMatchingCustomRule(link: OtpAuthLink) = false

    fun parseService(link: OtpAuthLink): ServiceDto {
        val issuer = link.issuer

        var name = displayedName
        val account = parseAccount(link.issuer, link.label)

        // If name is still empty, just grab the issuer
        if (name.isBlank()) {
            if (issuer.isNullOrEmpty().not()) {
                name = issuer!!
            } else {
                val (labelPart1, labelPart2) = splitLabel(link.label)
                if (labelPart1.contains("@").not()) {
                    name = labelPart1
                }
            }
        }

        val digits = try {
            link.params[DIGITS_PARAM]?.toInt()
        } catch (e: Exception) {
            null
        }

        val period = try {
            link.params[PERIOD_PARAM]?.toInt()
        } catch (e: Exception) {
            null
        }

        val algorithm = try {
            link.params[ALGORITHM_PARAM]
        } catch (e: Exception) {
            null
        }

        val counter = try {
            link.params[COUNTER]?.toInt() ?: 1
        } catch (e: Exception) {
            1
        }

        return ServiceDto(
            name = name.take(30),
            secret = link.secret,
            authType = ServiceDto.AuthType.valueOf(link.type.uppercase()),
            otpLink = link.link,
            otpLabel = link.label,
            otpAccount = if (name == account) null else account?.take(50),
            otpIssuer = issuer,
            otpDigits = digits,
            otpPeriod = period,
            otpAlgorithm = parseSupportedAlgorithm(algorithm),
            hotpCounter = counter,
            backupSyncStatus = BackupSyncStatus.NOT_SYNCED,
            updatedAt = 0,
            assignedDomains = emptyList(),
            serviceTypeId = "",
            iconCollectionId = "",
            source = ServiceDto.Source.Link,
        )
    }

    protected open fun parseAccount(issuer: String?, label: String): String? {
        val (labelPart1, labelPart2) = splitLabel(label)

        return when {
            labelPart2.isNullOrBlank().not() -> labelPart2
            labelPart1.isNotBlank() && labelPart1.contains("@") -> labelPart1
            else -> null
        }
    }

    protected fun splitLabel(label: String): Pair<String, String?> {
        val matches = label.split(":".toRegex())

        return when (matches.size) {
            2 -> Pair(matches.first().removeWhiteSpaces(), matches.last().trim())
            else -> Pair(label.removeWhiteSpaces(), null)
        }
    }

    private fun String.removeWhiteSpaces() = this.replace(" ", "")

    private fun parseSupportedAlgorithm(otpAlgorithm: String?): String? =
        when {
            otpAlgorithm == null -> null
            otpAlgorithm.equals("SHA1", ignoreCase = true) -> "SHA1"
            otpAlgorithm.equals("SHA224", ignoreCase = true) -> "SHA224"
            otpAlgorithm.equals("SHA256", ignoreCase = true) -> "SHA256"
            otpAlgorithm.equals("SHA384", ignoreCase = true) -> "SHA384"
            otpAlgorithm.equals("SHA512", ignoreCase = true) -> "SHA512"
            else -> null
        }
}