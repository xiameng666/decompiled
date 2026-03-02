public enum ggts {
    GENERAL(true),
    BOOLEAN(false),
    CHARACTER(false),
    INTEGRAL(false),
    FLOAT(true);

    public final boolean f;

    private ggts(boolean z) {
        this.f = z;
    }
}

