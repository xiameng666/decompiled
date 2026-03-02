public enum hcjd implements hfub {
    SECURE_ELEMENT_STATE_UNKNOWN(0),
    SECURE_ELEMENT_STATE_NOT_SUPPORTED(1),
    SECURE_ELEMENT_STATE_SUPPORTED(2);

    public final int d;

    private hcjd(int v1) {
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

