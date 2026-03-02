public enum rfw {
    GENERATED(0L),
    DERIVED(1L),
    IMPORTED(2L),
    RESERVED(3L),
    SECURELY_IMPORTED(4L);

    public final long f;

    static {
        rfw.g = arr_rfw;
        ibsn.a(arr_rfw);
    }

    private rfw(long v1) {
        this.f = v1;
    }
}

