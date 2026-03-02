public enum hcjg implements hfub {
    UNKNOWN_FEATURE(0),
    ANDROID_LEANBACK(1),
    CAMERA_DOCUMENT_CAPTURE(2),
    ANDROID_WEAR(3),
    ANDROID_VIRTUAL_REALITY_SETUP(4),
    ANDROID_VIRTUAL_REALITY(5),
    ANDROID_FINGERPRINT(6),
    NFC_DEVICE_SUPPORT(7),
    FELICA_SUPPORT(8),
    TOKENIZATION_SUPPORT(9);

    public final int k;

    private hcjg(int v1) {
        this.k = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.k;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.k);
    }
}

