public enum hbjl implements gpdm {
    FORMAT_UNKNOWN(0),
    FORMAT_JPEG(1),
    FORMAT_PDF(2);

    private final int e;

    private hbjl(int v1) {
        this.e = v1;
    }

    @Override  // gpdm
    public final int a() {
        return this.e;
    }
}

