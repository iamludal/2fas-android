package com.twofasapp.locale

import android.content.Context
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

@Stable
@Immutable
class Strings(c: Context) {
    val placeholder = "Lorem ipsum"
    val placeholderMedium =
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
    val placeholderLong =
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."

    val commonOk = c.getString(R.string.commons__OK)
    val commonYes = c.getString(R.string.commons__yes)
    val commonNo = c.getString(R.string.commons__no)
    val commonNext = c.getString(R.string.commons__next)
    val commonContinue = c.getString(R.string.commons__continue)
    val commonSkip = c.getString(R.string.commons__skip)
    val commonEdit = c.getString(R.string.commons__edit)
    val commonDelete = c.getString(R.string.commons__delete)
    val commonCancel = c.getString(R.string.commons__cancel)
    val commonSave = c.getString(R.string.commons__save)
    val commonAdd = c.getString(R.string.commons__add)
    val commonSearch = c.getString(R.string.commons__search)
    val commonApprove = c.getString(R.string.commons__approve)
    val commonDeny = c.getString(R.string.commons__deny)
    val commonError = c.getString(R.string.commons__error)
    val commonInfo = c.getString(R.string.commons__info)
    val commonProceed = c.getString(R.string.commons__proceed)
    val commonTryAgain = c.getString(R.string.commons__try_again)

    val errorUnknown = c.getString(R.string.commons__unknown_error)

    val bottomBarTokens = c.getString(R.string.commons__tokens)
    val bottomBarSettings = c.getString(R.string.settings__settings)
    val bottomBarNotifications = c.getString(R.string.commons__notifications)

    val startupTermsLabel = c.getString(R.string.introduction__tos)
    val startupStepOneHeader = c.getString(R.string.introduction__page_1_title)
    val startupStepOneBody = c.getString(R.string.introduction__page_1_content)
    val startupStepTwoHeader = c.getString(R.string.introduction__page_2_title)
    val startupStepTwoBody = c.getString(R.string.introduction__page_2_content)
    val startupStepThreeHeader = c.getString(R.string.introduction__page_3_title)
    val startupStepThreeBody = c.getString(R.string.introduction__page_3_content)
    val startupStepFourHeader = c.getString(R.string.introduction__page_4_title)
    val startupStepFourBody = c.getString(R.string.introduction__page_4_content_android)
    val startupStartCta = c.getString(R.string.introduction__title)

    val servicesEmptyBody = c.getString(R.string.introduction__description_title)
    val servicesEmptyImportCta = c.getString(R.string.introduction__import_external_app)
    val servicesEmptyPairServiceCta = c.getString(R.string.introduction__pair_new_service)
    val servicesEmptySearch = c.getString(R.string.tokens__service_not_found_search)
    val servicesEmptySearchBody = c.getString(R.string.tokens__try_different_search_term)
    val servicesMyTokens = c.getString(R.string.tokens__my_tokens)
    val servicesManageList = c.getString(R.string.tokens__manage_list)
    val servicesSortBy = c.getString(R.string.tokens__sort_by)
    val servicesSortByOptions = listOf(c.getString(R.string.tokens__sort_by_a_to_z), c.getString(R.string.tokens__sort_by_manual))
    val servicesCopyToken = c.getString(R.string.tokens__copied_clipboard)
    val servicesCopyNextToken = c.getString(R.string.tokens__next_copied_clipboard)
    val servicesQrFromGalleryTitle = c.getString(R.string.tokens__gallery_advice_title)
    val servicesQrFromGalleryBody1 = c.getString(R.string.tokens__gallery_advice_content_first)
    val servicesQrFromGalleryBody2 = c.getString(R.string.tokens__gallery_advice_content_middle_bold)
    val servicesQrFromGalleryBody3 = c.getString(R.string.tokens__gallery_advice_content_last)
    val servicesQrFromGalleryCta = c.getString(R.string.commons__got_it)
    val groupsAdd = c.getString(R.string.tokens__add_group)
    val groupsEdit = c.getString(R.string.commons__edit)
    val groupsDelete = c.getString(R.string.groups_delete_msg)
    val groupsName = c.getString(R.string.tokens__group_name)
    val addManually = c.getString(R.string.tokens__fab_addmanually)
    val scanQr = c.getString(R.string.commons__scan_qr_code)
    val editService = c.getString(R.string.commons__edit)
    val copyToken = c.getString(R.string.tokens__copy_token)

    val externalImportTitle = c.getString(R.string.settings__external_import)
    val externalImportHeader = c.getString(R.string.externalimport_select_app)
    val externalImportNotice = c.getString(R.string.externalimport_description)
    val externalImportGoogleAuthenticator = c.getString(R.string.externalimport_google_authenticator)
    val externalImportAegis = c.getString(R.string.externalimport_aegis)
    val externalImportRaivo = c.getString(R.string.externalimport_raivo)
    val externalImportLastPass = c.getString(R.string.externalimport_lastpass)
    val externalImportAuthenticatorPro = c.getString(R.string.externalimport__authenticatorpro)
    val externalImportGoogleAuthenticatorMsg = c.getString(R.string.introduction__google_authenticator_import_process)
    val externalImportAegisMsg = c.getString(R.string.externalimport__aegis_msg)
    val externalImportRaivoMsg = c.getString(R.string.externalimport__raivo_msg)
    val externalImportLastPassMsg = c.getString(R.string.externalimport__lastpass_msg)
    val externalImportAuthenticatorProMsg = c.getString(R.string.externalimport__authenticatorpro_msg)
    val externalImportChooseJsonCta = c.getString(R.string.externalimport__choose_json_cta)
    val externalImportChooseTxtCta = c.getString(R.string.externalimport__choose_txt_cta)
    val externalImportChooseQrCta = c.getString(R.string.introduction__choose_qr_code)
    val externalImportResultTitle = c.getString(R.string.settings__external_import)
    val externalImportResultGoogleAuthenticatorTitle = c.getString(R.string.externalimport__ga_title)
    val externalImportResultAegisTitle = c.getString(R.string.externalimport__aegis_title)
    val externalImportResultRaivoTitle = c.getString(R.string.externalimport__raivo_title)
    val externalImportResultLastPassTitle = c.getString(R.string.externalimport__lastpass_title)
    val externalImportResultAuthenticatorProTitle = c.getString(R.string.externalimport__authenticatorpro_title)
    val externalImportResultSuccessGoogleAuthenticatorMsg = c.getString(R.string.externalimport__ga_success_msg)
    val externalImportResultSuccessAegisMsg = c.getString(R.string.externalimport__aegis_success_msg)
    val externalImportResultSuccessRaivoMsg = c.getString(R.string.externalimport__raivo_success_msg)
    val externalImportResultSuccessLastPassMsg = c.getString(R.string.externalimport__lastpass_success_msg)
    val externalImportResultSuccessAuthenticatorProMsg = c.getString(R.string.externalimport__authenticatorpro_success_msg)
    val externalImportResultTokensCount = c.getString(R.string.tokens__google_auth_out_of_title)
    val externalImportResultTokensMsg = c.getString(R.string.tokens__google_auth_import_subtitle_end)
    val externalImportResultErrorMsg = c.getString(R.string.externalimport__read_error)
    val externalImportSuccessToast = c.getString(R.string.backup__import_completed_successfuly)

    val trashTitle = c.getString(R.string.settings__trash)
    val trashEmpty = c.getString(R.string.settings__trash_is_empty)
    val trashRestoreCta = c.getString(R.string.settings__restore)
    val trashDisposeCta = c.getString(R.string.tokens__remove_forever)

    val notificationsTitle = c.getString(R.string.commons__notifications)
    val notificationsEmpty = c.getString(R.string.notifications__no_notifications)

    val aboutTitle = c.getString(R.string.settings__about)
    val aboutGeneral = c.getString(R.string.settings__general)
    val aboutShare = c.getString(R.string.settings__share_app)
    val aboutSendCrashes = c.getString(R.string.settings__about_crash_optout_title)
    val aboutWriteReview = c.getString(R.string.settings__write_a_review)
    val aboutPrivacyPolicy = c.getString(R.string.settings__privacy_policy)
    val aboutTerms = c.getString(R.string.settings__terms_of_service)
    val aboutLicenses = c.getString(R.string.about_licenses)
    val aboutTellFriend = c.getString(R.string.settings__tell_a_friend)
    val aboutTellFriendShareText = c.getString(R.string.settings__recommendation)
    val aboutSocialMedia = c.getString(R.string.social__social_media)
    val aboutSocialDiscord = c.getString(R.string.social__discord)
    val aboutSocialYouTube = c.getString(R.string.social__youtube)
    val aboutSocialTwitter = c.getString(R.string.social__twitter)
    val aboutSocialGitHub = c.getString(R.string.social__github)
    val aboutSocialLinkedIn = c.getString(R.string.social__linkedin)
    val aboutSocialReddit = c.getString(R.string.social__reddit)
    val aboutSocialFacebook = c.getString(R.string.social__facebook)

    val settingsBackup = c.getString(R.string.backup__2fas_backup)
    val settingsSecurity = c.getString(R.string.settings__security)
    val settingsSettings = c.getString(R.string.settings__settings)
    val settingsAppearance = c.getString(R.string.settings__appearance)
    val settingsExternalImport = c.getString(R.string.settings__external_import)
    val settingsBrowserExt = c.getString(R.string.browser__browser_extension)
    val settingsTrash = c.getString(R.string.settings__trash)
    val settingsSupport = c.getString(R.string.settings__support)
    val settingsAbout = c.getString(R.string.settings__about)
    val settingsDonate = c.getString(R.string.settings__donate_twofas)

    val browserExtTitle = c.getString(R.string.browser__browser_extension)
    val browserExtHeader = c.getString(R.string.browser__info_title)
    val browserExtBody1 = c.getString(R.string.browser__info_description_first)
    val browserExtBody2 = c.getString(R.string.browser__info_description_second)
    val browserExtMore1 = c.getString(R.string.browser__more_info)
    val browserExtMore2 = c.getString(R.string.browser__more_info_link_title)
    val browserExtCta = c.getString(R.string.browser__pair_with_web_browser)
    val browserExtAddNew = c.getString(R.string.browser__add_new)
    val browserExtPairedDevices = c.getString(R.string.browser__paired_devices_browser_title)
    val browserExtDeviceName = c.getString(R.string.browser__this_device_name)
    val browserExtDeviceNameSubtitle = c.getString(R.string.browser__this_device_footer)
    val browserPairManuallyCta = c.getString(R.string.browser__pair_manually_cta)
    val browserPairManuallyHint = c.getString(R.string.browser__pair_manually_hint)
    val browserErrorScanMsg = c.getString(R.string.browser__scan_error_dialog_msg_unknown)
    val browserErrorScanFormatMsg = c.getString(R.string.browser__scan_error_dialog_msg_invalid_code)
    val browserPairingTitle = c.getString(R.string.browser__pairing_with_browser)
    val browserPairingResultTitle = c.getString(R.string.settings__browser_extension_result_toolbar_title)
    val browserPairingSuccessTitle = c.getString(R.string.browser__pairing_successful_title)
    val browserPairingSuccessMsg = c.getString(R.string.browser_extension_result_success_description)
    val browserPairingFailureTitle = c.getString(R.string.browser__pairing_failed_title)
    val browserPairingFailureMsg = c.getString(R.string.browser__pairing_failed_description)
    val browserPairingAlreadyPairedTitle = c.getString(R.string.browser__already_paired_title)
    val browserPairingAlreadyPairedMsg = c.getString(R.string.browser__result_error_browser_paired)
    val browserPairingSuccessCta = c.getString(R.string.commons__continue)
    val browserPairingFailureCta = c.getString(R.string.browser__result_error_cta)
    val browserPermissionTitle = c.getString(R.string.browser__push_notifications_title)
    val browserPermissionMsg = c.getString(R.string.browser__push_notifications_content)
    val browserPermissionCta = c.getString(R.string.commons__continue)
    val browserDetailsName = c.getString(R.string.browser__name)
    val browserDetailsDate = c.getString(R.string.browser__pairing_date)
    val browserDetailsForget = c.getString(R.string.browser__forget_this_browser)
    val browserDetailsForgetTitle = c.getString(R.string.browser__deleting_paired_device_title)
    val browserDetailsForgetMsg = c.getString(R.string.browser__deleting_paired_device_content)
    val browserRequestTitle = c.getString(R.string.browser__request)
    val browserRequestInfo = c.getString(R.string.browser__request_source_description)
    val browserRequestSaveChoice = c.getString(R.string.browser__save_choice)
    val browserRequestSuggested = c.getString(R.string.extension__services_suggested_header)
    val browserRequestAll = c.getString(R.string.extension__services_all_header)
    val browserRequestOther = c.getString(R.string.extension__services_other_header)

    val settingsTheme = c.getString(R.string.settings__option_theme)
    val settingsShowNextCode = c.getString(R.string.settings__show_next_token)
    val settingsShowNextCodeBody = c.getString(R.string.settings__show_next_token_desc)
    val settingsAutoFocusSearch = c.getString(R.string.appearance__toggle_active_search)
    val settingsAutoFocusSearchBody = c.getString(R.string.appearance__active_search_description)
    val settingsServicesStyle = c.getString(R.string.settings__list_style)
    val settingsShowBackupNotice = c.getString(R.string.settings__gd_sync_info)
    val settingsShowBackupNoticeConfirmBody = c.getString(R.string.settings__gd_sync_disable_confirm)
    val settingsSendCrashes = c.getString(R.string.settings__enable_crashlytics)
    val settingsSendCrashesBody = c.getString(R.string.settings__enable_crashlytics_description)
    val settingsHideCodes = c.getString(R.string.settings__hide_tokens_title)
    val settingsHideCodesBody = c.getString(R.string.settings__hide_tokens_description)

    val backupSyncNotice = c.getString(R.string.backup__reminder_msg)
    val backupSyncCta = c.getString(R.string.backup__reminder_cta)
    val backupReminder = c.getString(R.string.backup_notice_title)
    val backupReminderBody = c.getString(R.string.backup_notice_msg)
    val backupReminderDismiss = c.getString(R.string.backup_notice_later)
    val backupReminderCta = c.getString(R.string.backup_notice_cta)

    val disposeBody1 = c.getString(R.string.tokens__do_you_really_want_to_remove_all_devices)
    val disposeBody2 = c.getString(R.string.tokens__caution)
    val disposeBody3 = c.getString(R.string.tokens__you_will_not_be_able_to_sign_in_to_your)
    val disposeConfirm = c.getString(R.string.tokens__i_want_to_delete_this_token)
    val disposeCta = c.getString(R.string.tokens__remove_it_forever)

    val permissionCameraTitle = c.getString(R.string.permissions__camera_permission)
    val permissionCameraBody = c.getString(R.string.permissions__camera_permission_description)
    val permissionPushTitle = c.getString(R.string.browser__push_notifications_title)
    val permissionPushBody = c.getString(R.string.browser__push_notifications_content)

    val tokenRequestTitle = c.getString(R.string.browser__2fa_token_request_title)
    val tokenRequestBody = c.getString(R.string.browser__2fa_token_request_content)

    val addTitle = c.getString(R.string.tokens__add_title)
    val addDescription = c.getString(R.string.tokens__add_description)
    val addOtherMethods = c.getString(R.string.tokens__add_other_methods)
    val addEnterManual = c.getString(R.string.tokens__add_enter_manual)
    val addWithGuide = c.getString(R.string.tokens__add_with_guide)
    val addFromGallery = c.getString(R.string.tokens__add_from_gallery)
    val addSuccessTitle = c.getString(R.string.tokens__add_success_title)
    val addSuccessDescription = c.getString(R.string.tokens__add_success_description)
    val addManualTitle = c.getString(R.string.tokens__add_manual_title)
    val addManualDescription = c.getString(R.string.tokens__add_manual_description)
    val addManualServiceName = c.getString(R.string.tokens__add_manual_service_name)
    val addManualServiceKey = c.getString(R.string.tokens__add_manual_service_key)
    val addManualOther = c.getString(R.string.tokens__add_manual_other)
    val addManualOtherOptional = c.getString(R.string.tokens__add_manual_other_optional)
    val addManualDoneCta = c.getString(R.string.tokens__add_manual_done_cta)
    val addManualHelpCta = c.getString(R.string.tokens__add_manual_help_cta)
    val addManualAdvanced = c.getString(R.string.tokens__add_manual_advanced)
    val addManualAdvancedDescription = c.getString(R.string.tokens__add_manual_advanced_description)
    val addManualAdditionalInfo = c.getString(R.string.tokens__add_manual_additional_info)
    val addManualAlgorithm = c.getString(R.string.tokens__algorithm)
    val addManualRefreshTime = c.getString(R.string.tokens__refresh_time)
    val addManualInitialCounter = c.getString(R.string.tokens__initial_counter)
    val addManualDigits = c.getString(R.string.tokens__number_of_digits)

    val addScanInvalidQrTitle = c.getString(R.string.tokens__qr_does_not_work)
    val addScanInvalidQrBody = c.getString(R.string.tokens__qr_point_and_scan_again)
    val addScanInvalidQrCta = c.getString(R.string.tokens__try_again)

    val addScanServiceExistsTitle = c.getString(R.string.commons__warning)
    val addScanServiceExistsBody = c.getString(R.string.tokens__service_already_exists)
    val addScanServiceExistsPositiveCta = c.getString(R.string.commons__yes)
    val addScanServiceExistsNegativeCta = c.getString(R.string.commons__no)

    val addScanErrorTitle = c.getString(R.string.tokens__qr_does_not_work)
    val addScanErrorBody = c.getString(R.string.tokens__qr_point_and_scan_again)
    val addScanErrorPositiveCta = c.getString(R.string.tokens__try_again)

    val addGalleryErrorTitle = c.getString(R.string.tokens__qr_read_image_failed)
    val addGalleryErrorBody = c.getString(R.string.tokens__qr_read_image_try_again)
    val addGalleryErrorPositiveCta = c.getString(R.string.tokens__try_again)

    val guidesSelectTitle = c.getString(R.string.guides__select_title)
    val guidesSelectDescription = c.getString(R.string.guides__select_description)
    val guidesSelectProvideGuide = c.getString(R.string.guides__select_provide_guide)
    val guidesSelectProvideGuideCta = c.getString(R.string.guides__select_provide_guide_cta)
    val guideTitle = c.getString(R.string.guides__guide_title)
    val guideUniversalTitle = c.getString(R.string.guides__guide_universal_title)

    val password = c.getString(R.string.backup__password)
    val passwordConfirm = c.getString(R.string.backup__repeat_password)

    val backupTitle = c.getString(R.string.backup__2fas_backup)
    val backupDriveHeader = "Google Drive"
    val backupLocalHeader = c.getString(R.string.backup__local_file_title)
    val backupDebugHeader = "Debug"
    val backupSync = c.getString(R.string.backup__drive_title)
    val backupSyncDescription = c.getString(R.string.backup_explanation_msg)
    val backupSyncSettings = c.getString(R.string.backup__synchronization_settings)
    val backupImportFile = c.getString(R.string.backup__import_file)
    val backupExportFile = c.getString(R.string.backup__export_to_file)
    val backupExportFileDescription = c.getString(R.string.backup__file_backup_offline_title)
    val backupSetPassword = c.getString(R.string.backup_settings_password_set_title)
    val backupSetPasswordDescription = c.getString(R.string.backup__set_password_title)
    val backupEnterPassword = c.getString(R.string.backup__enter_password_dialog_title)
    val backupEnterPasswordDescription = c.getString(R.string.backup__enter_password_title)
    val backupShareError = c.getString(R.string.backup__share_result_failure)
    val backupDownloadError = c.getString(R.string.commons__unknown_error)
    val backupDownloadSuccess = c.getString(R.string.backup__export_result_success)

    val backupSettingsTitle = c.getString(R.string.backup__synchronization_settings)
    val backupSettingsSetPasswordTitle = c.getString(R.string.backup_settings_password_set_title)
    val backupSettingsSetPasswordMsg = c.getString(R.string.backup_settings_password_set_subtitle)
    val backupSettingsRemovePasswordTitle = c.getString(R.string.backup_settings_password_remove_title)
    val backupSettingsRemovePasswordMsg = c.getString(R.string.backup_settings_password_remove_subtitle)
    val backupSettingsDeleteBackupTitle = c.getString(R.string.backup_settings_delete_title)
    val backupSettingsDeleteBackupMsg = c.getString(R.string.backup_settings_delete_subtitle)
    val backupSettingsAccountTitle = c.getString(R.string.backup_settings_account_title)
    val backupSettingsSyncTitle = c.getString(R.string.backup_settings_sync_title)
    val backupSyncStatusWaiting = c.getString(R.string.backup__sync_status_waiting)
    val backupSyncStatusSyncing = c.getString(R.string.backup__sync_status_progress)
    val backupSyncStatusError = c.getString(R.string.commons__error)
    val backupDeleteConfirmTitle = c.getString(R.string.backup__delete_file_title)
    val backupDeleteConfirmMsg = c.getString(R.string.backup__delete_file_msg)
    val backupDeleteInternetErrorTitle = c.getString(R.string.gdrive_internet_title)
    val backupDeleteInternetErrorMsg = c.getString(R.string.gdrive_wipe_internet_msg)
    val backupDeleteEnterPasswordTitle = c.getString(R.string.backup__enter_password_dialog_title)
    val backupDeleteEnterPasswordMsg = c.getString(R.string.backup__revoke_google_access_msg)
    val backupSetCloudPasswordTitle = c.getString(R.string.backup_settings_password_set_title)
    val backupSetCloudPasswordMsg = c.getString(R.string.backup__set_password_title)
    val backupRemoveCloudPasswordTitle = c.getString(R.string.backup__enter_password_dialog_title)
    val backupRemoveCloudPasswordMsg = c.getString(R.string.backup__remove_password_msg)
    val backupEnterCloudPasswordTitle = c.getString(R.string.backup__enter_password_dialog_title)
    val backupEnterCloudPasswordMsg = c.getString(R.string.backup__enter_password_title)
    val backupIncorrectPassword = c.getString(R.string.backup__incorrect_password)

    val backupExportShareCta = c.getString(R.string.export_backup_share_cta)
    val backupExportCta = c.getString(R.string.export_backup_cta)
    val backupExportHeader = c.getString(R.string.export_backup_title)
    val backupExportMsg = c.getString(R.string.export_backup_msg)
    val backupExportPassMsg = c.getString(R.string.export_backup_pass)
    val backupImportCta = c.getString(R.string.import_backup_cta)
    val backupImportChooseAnotherFileCta = c.getString(R.string.backup__choose_antother_file)
    val backupImportHeader = c.getString(R.string.import_backup_title)
    val backupImportMsg1 = c.getString(R.string.import_backup_msg1)
    val backupImportMsg2 = c.getString(R.string.import_backup_msg2)
    val backupImportMsg1Encrypted = c.getString(R.string.import_backup_msg1_encrypted)
    val backupImportErrorHeader = c.getString(R.string.backup__file_error)
    val backupImportErrorMsg = c.getString(R.string.backup__import_error_file_invalid)
    val backupImportErrorMsgSize = c.getString(R.string.backup__import_error_file_size)
    val backupImportErrorDecryptError = c.getString(R.string.backup_error_decrypt_unknown)
    val backupImportSuccess = c.getString(R.string.import_ga_success)

    val backupTurnOffTitle = c.getString(R.string.backup_turn_off_title)
    val backupTurnOffMsg1 = c.getString(R.string.backup_turn_off_msg1)
    val backupTurnOffMsg2 = c.getString(R.string.backup_turn_off_msg2)
    val backupTurnOffCta = c.getString(R.string.backup_turn_off_cta)
    val backupSignInPermissionErrorTitle = c.getString(R.string.gdrive_permission_title)
    val backupSignInPermissionErrorMsg = c.getString(R.string.gdrive_permission_msg)
    val backupSignInInternetErrorTitle = c.getString(R.string.gdrive_internet_title)
    val backupSignInInternetErrorMsg = c.getString(R.string.gdrive_internet_msg)

    val widgetSettingsTitle = c.getString(R.string.widgets__settings)
    val widgetSettingsEmpty = c.getString(R.string.tokens__tokens_list_is_empty)
    val widgetSelectMsg = c.getString(R.string.widgets_select_msg)
    val widgetNoServices = c.getString(R.string.widgets_empty_msg)

}