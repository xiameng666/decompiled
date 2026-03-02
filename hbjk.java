public enum hbjk implements gpdm {
    MODE_UNKNOWN(0),
    MODE_AUTO(1),
    MODE_MANUAL(2);

    private final int e;

    private hbjk(int v1) {
        this.e = v1;
    }

    @Override  // gpdm
    public final int a() {
        return this.e;
    }
}

