public enum rjx implements sdk {
    UNKNOWN,
    DISABLED,
    CUSTOM_DISABLED;

    public static final rjw a;
    private final String g;

    static {
        rjx.f = arr_rjx;
        rjx.e = ibsn.a(arr_rjx);
        rjx.a = new rjw();
    }

    private rjx() {
        this.g = this.name();
    }

    @Override  // sdk
    public final String b() {
        return this.g;
    }
}

