public enum eyan {
    FIRST_REENROLL_DEVICE_REMINDER,
    FINAL_REENROLL_DEVICE_REMINDER,
    EXPIRED_DEVICE_NOTIFICATION,
    FIRST_RANGING_METHOD_DOWNGRADABLE,
    FINAL_RANGING_METHOD_DOWNGRADABLE,
    FIRST_RANGING_METHOD_ENABLEMENT,
    FINAL_RANGING_METHOD_ENABLEMENT,
    RANGING_METHOD_AIRPLANE_MODE;

    static {
        eyan.i = arr_eyan;
        ibsn.a(arr_eyan);
    }

    public static eyan a(String s) {
        return (eyan)Enum.valueOf(eyan.class, s);
    }
}

