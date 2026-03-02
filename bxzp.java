public enum bxzp {
    UNKNOWN(0),
    SUCCESS(1),
    FAILURE_API_NOT_ENABLED(2),
    FAILURE_INVALID_CALLING_PACKAGE(3),
    FAILURE_STORAGE_ERROR(4),
    FAILURE_INTERNAL_ERROR(5);

    public final int g;

    static {
        bxzp.h = arr_bxzp;
        ibsn.a(arr_bxzp);
    }

    private bxzp(int v1) {
        this.g = v1;
    }
}

