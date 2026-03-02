public enum bxzh {
    UNKNOWN(0),
    SUCCESS_WITH_UI(1),
    SUCCESS_WITH_RESPONSE(2),
    FAILURE_API_NOT_ENABLED(3),
    FAILURE_INVALID_CALLING_PACKAGE(4),
    FAILURE_INTERNAL_ERROR(5),
    FAILURE_NO_PROVIDER_FOUND(6),
    FAILURE_APP_NOT_IN_FOREGROUND(7);

    public final int i;

    static {
        bxzh.j = arr_bxzh;
        ibsn.a(arr_bxzh);
    }

    private bxzh(int v1) {
        this.i = v1;
    }
}

