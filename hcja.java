public enum hcja implements hfub {
    DEVICE_BASED_INPUT_TYPE_UNKNOWN(0),
    DEVICE_BASED_INPUT_TYPE_CARD_OCR(1),
    DEVICE_BASED_INPUT_TYPE_NFC(2);

    public final int d;

    private hcja(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}

