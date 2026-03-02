public enum bxzo {
    UNKNOWN(0),
    SUCCESS_WITH_UI(1),
    FAILURE_API_NOT_ENABLED(2),
    FAILURE_INVALID_CALLING_PACKAGE(3),
    FAILURE_INTERNAL_ERROR(4);

    public final int f;

    static {
        bxzo.g = arr_bxzo;
        ibsn.a(arr_bxzo);
    }

    private bxzo(int v1) {
        this.f = v1;
    }
}

