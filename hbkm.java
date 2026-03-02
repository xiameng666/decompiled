public enum hbkm implements gpdm {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);

    private final int f;

    private hbkm(int v1) {
        this.f = v1;
    }

    @Override  // gpdm
    public final int a() {
        return this.f;
    }
}

