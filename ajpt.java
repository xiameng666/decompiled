public enum ajpt {
    @Deprecated
    CLIENT_LOGIN_DISABLED("ClientLoginDisabled"),
    @Deprecated
    SOCKET_TIMEOUT("SocketTimeout"),
    SUCCESS("Ok"),
    UNKNOWN_ERROR("UNKNOWN_ERR"),
    NETWORK_ERROR("NetworkError"),
    SERVICE_UNAVAILABLE("ServiceUnavailable"),
    INTNERNAL_ERROR("InternalError"),
    ILLEGAL_ARGUMENT("IllegalArgument"),
    BAD_AUTHENTICATION("BadAuthentication"),
    BAD_TOKEN_REQUEST("BAD_REQUEST"),
    EMPTY_CONSUMER_PKG_OR_SIG("EmptyConsumerPackageOrSig"),
    NEEDS_2F("InvalidSecondFactor"),
    NEEDS_POST_SIGN_IN_FLOW("PostSignInFlowRequired"),
    NEEDS_BROWSER("NeedsBrowser"),
    UNKNOWN("Unknown"),
    NOT_VERIFIED("NotVerified"),
    TERMS_NOT_AGREED("TermsNotAgreed"),
    ACCOUNT_DISABLED("AccountDisabled"),
    CAPTCHA("CaptchaRequired"),
    ACCOUNT_DELETED("AccountDeleted"),
    SERVICE_DISABLED("ServiceDisabled"),
    CHALLENGE_REQUIRED("ChallengeRequired"),
    NEED_PERMISSION("NeedPermission"),
    NEED_REMOTE_CONSENT("NeedRemoteConsent"),
    INVALID_SCOPE("INVALID_SCOPE"),
    USER_CANCEL("UserCancel"),
    PERMISSION_DENIED("PermissionDenied"),
    RESTRICTED_CLIENT("RESTRICTED_CLIENT"),
    INVALID_AUDIENCE("INVALID_AUDIENCE"),
    UNREGISTERED_ON_API_CONSOLE("UNREGISTERED_ON_API_CONSOLE"),
    THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED("ThirdPartyDeviceManagementRequired"),
    DM_INTERNAL_ERROR("DeviceManagementInternalError"),
    DM_SYNC_DISABLED("DeviceManagementSyncDisabled"),
    DM_ADMIN_BLOCKED("DeviceManagementAdminBlocked"),
    DM_ADMIN_PENDING_APPROVAL("DeviceManagementAdminPendingApproval"),
    DM_STALE_SYNC_REQUIRED("DeviceManagementStaleSyncRequired"),
    DM_DEACTIVATED("DeviceManagementDeactivated"),
    DM_SCREENLOCK_REQUIRED("DeviceManagementScreenlockRequired"),
    DM_REQUIRED("DeviceManagementRequired"),
    DEVICE_MANAGEMENT_REQUIRED("DeviceManagementRequiredOrSyncDisabled"),
    ALREADY_HAS_GMAIL("ALREADY_HAS_GMAIL"),
    BAD_PASSWORD("WeakPassword"),
    BAD_REQUEST("BadRequest"),
    BAD_USERNAME("BadUsername"),
    DELETED_GMAIL("DeletedGmail"),
    EXISTING_USERNAME("ExistingUsername"),
    LOGIN_FAIL("LoginFail"),
    NOT_LOGGED_IN("NotLoggedIn"),
    NO_GMAIL("NoGmail"),
    REQUEST_DENIED("RequestDenied"),
    SERVER_ERROR("ServerError"),
    USERNAME_UNAVAILABLE("UsernameUnavailable"),
    GPLUS_OTHER("GPlusOther"),
    GPLUS_NICKNAME("GPlusNickname"),
    GPLUS_INVALID_CHAR("GPlusInvalidChar"),
    GPLUS_INTERSTITIAL("GPlusInterstitial"),
    GPLUS_PROFILE_ERROR("ProfileUpgradeError"),
    AUTH_SECURITY_ERROR("AuthSecurityError"),
    AUTH_BINDING_ERROR("AuthBindingError"),
    ACCOUNT_NOT_PRESENT("AccountNotPresent"),
    APP_SUSPENDED("AppSuspended"),
    FRP_ACTIVE("FrpActive");

    public final String ak;

    private ajpt(String s1) {
        this.ak = s1;
    }

    public static final ajpt a(String s) {
        ajpt[] arr_ajpt = ajpt.values();
        for(int v = 0; v < arr_ajpt.length; ++v) {
            ajpt ajpt0 = arr_ajpt[v];
            if(ajpt0.ak.equals(s)) {
                return ajpt0;
            }
        }
        return ajpt.o;
    }

    public static ajpt b(String s) {
        return (ajpt)Enum.valueOf(ajpt.class, s);
    }

    public final boolean c(String s) {
        return this.ak.equals(s);
    }

    public static boolean d(ajpt ajpt0) {
        return ajpt.e.equals(ajpt0) || ajpt.f.equals(ajpt0) || ajpt.g.equals(ajpt0) || ajpt.af.equals(ajpt0) || ajpt.ah.equals(ajpt0);
    }

    public static boolean e(ajpt ajpt0) {
        return ajpt.i.equals(ajpt0) || ajpt.s.equals(ajpt0) || ajpt.w.equals(ajpt0) || ajpt.x.equals(ajpt0) || ajpt.n.equals(ajpt0) || ajpt.z.equals(ajpt0) || ajpt.N.equals(ajpt0) || ajpt.F.equals(ajpt0) || ajpt.G.equals(ajpt0) || ajpt.H.equals(ajpt0) || ajpt.I.equals(ajpt0) || ajpt.J.equals(ajpt0) || ajpt.K.equals(ajpt0) || ajpt.M.equals(ajpt0) || ajpt.E.equals(ajpt0) || ajpt.L.equals(ajpt0);
    }
}

