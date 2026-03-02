import com.google.android.gms.common.api.Status;

public class aztk {
    // String Decryptor: 1 succeeded, 0 failed
    public static String d(int v) {
        switch(v) {
            case -1: {
                return "SUCCESS_CACHE";
            }
            case 0: {
                return "SUCCESS";
            }
            case 2: {
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            }
            case 3: {
                return "SERVICE_DISABLED";
            }
            case 4: {
                return "SIGN_IN_REQUIRED";
            }
            case 5: {
                return "INVALID_ACCOUNT";
            }
            case 6: {
                return "RESOLUTION_REQUIRED";
            }
            case 7: {
                return "NETWORK_ERROR";
            }
            case 8: {
                return "INTERNAL_ERROR";
            }
            case 10: {
                return "DEVELOPER_ERROR";
            }
            case 13: {
                return "ERROR";
            }
            case 14: {
                return "INTERRUPTED";
            }
            case 15: {
                return "TIMEOUT";
            }
            case 16: {
                return "CANCELED";
            }
            case 17: {
                return "API_NOT_CONNECTED";
            }
            case 18: {
                return "DEAD_CLIENT";
            }
            case 19: {
                return "REMOTE_EXCEPTION";
            }
            case 20: {
                return "CONNECTION_SUSPENDED_DURING_CALL";
            }
            case 21: {
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            }
            case 22: {
                return "RECONNECTION_TIMED_OUT";
            }
            default: {
                return "unknown status code: " + v;
            }
        }
    }

    public static int e(acse acse0) {
        ajpt ajpt0 = ajpt.a(acse0.getMessage());
        if(ajpt.e(ajpt0)) {
            return 23000;
        }
        return ajpt.d(ajpt0) ? 23001 : 23002;
    }

    public static boolean f(int v) {
        return v <= 0;
    }

    public static int g(int v) {
        return v == 0 || v >= 1000 && v < 1006 ? v : 13;
    }

    public static boolean h(int v) {
        return v >= 17600;
    }

    public static boolean i(int v) {
        return v > 0 && v <= 21019;
    }

    public static boolean j(int v) {
        return v <= 0 ? true : v >= 21020 && v < 0x522F;
    }

    public static Status k(int v) {
        switch(v) {
            case -30002: {
                return new Status(-30002, "CSL registration updated");
            }
            case -30001: {
                return new Status(-30001, "CSL registration succeeded");
            }
            case -30000: {
                return new Status(-30000, "No CSL registration");
            }
            case 30000: {
                return new Status(30000, "CSL disabled");
            }
            case 30001: {
                return new Status(30001, "Unsupported form factor");
            }
            case 30002: {
                return new Status(30002, "CSL API access not configured");
            }
            case 30003: {
                return new Status(30003, "Invalid certificate");
            }
            case 30004: {
                return new Status(30004, "Location turned off");
            }
            case 30005: {
                return new Status(30005, "No location permission");
            }
            case 30006: {
                return new Status(30006, "No background location permission");
            }
            case 30007: {
                return new Status(30007, "Ineligible account");
            }
            case 30008: {
                return new Status(30008, "Failed to estimate CSL");
            }
            case 30009: {
                return new Status(30009, "Invalid request parameters");
            }
            default: {
                return new Status(v, aztk.d(v));
            }
        }
    }

    public static Status l() {
        return new Status(13, "ERROR");
    }

    public static String m(int v) {
        switch(v) {
            case 0xCF09: {
                return "ERROR_REASON_CONCURRENT_REQUESTS";
            }
            case 0xCF0A: {
                return "ERROR_REASON_IN_EMERGENCY_CALL";
            }
            case 0xCF0B: {
                return "API_NOT_AVAILABLE";
            }
            case 0xCF0C: {
                return "ERROR_REASON_RATE_LIMIT_REACHED";
            }
            case 0xCF0D: {
                return "TELEPHONY_FEATURE_UNAVAILABLE";
            }
            case 0xCF0E: {
                return "INVALID_PHONE_NUMBER_RANGE";
            }
            case 0xCF0F: {
                return "USER_CONSENT_DENIED";
            }
            case 0xCF10: {
                return "FAILURE_OTHER";
            }
            default: {
                return aztk.d(v);
            }
        }
    }

    public static String n(int v) {
        switch(v) {
            case 40200: {
                return "RESTORE_CREDENTIAL_DEVELOPER_ERROR";
            }
            case 40201: {
                return "RESTORE_CREDENTIAL_INTERNAL_FAILURE";
            }
            case 40202: {
                return "RESTORE_CREDENTIAL_FIDO_FAILURE";
            }
            case 40203: {
                return "RESTORE_CREDENTIAL_E2EE_UNAVAILABLE";
            }
            default: {
                return aztk.d(v);
            }
        }
    }
}

