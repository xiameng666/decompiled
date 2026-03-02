public enum hbkc implements gpdm {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);

    private final int h;

    private hbkc(int v1) {
        this.h = v1;
    }

    @Override  // gpdm
    public final int a() {
        return this.h;
    }
}

