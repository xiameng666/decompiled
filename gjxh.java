public enum gjxh implements hfub {
    UNKNOWN(0),
    HCE_SUPPORTED(1),
    NFC_ENABLED(2),
    DEFAULT_PAYMENT_SERVICE(3),
    ATTESTATION_PASS(4),
    TOKENIZED_FOP(5),
    DEVICE_LOCK(6);

    public final int h;

    private gjxh(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.h;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}

