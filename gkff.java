public enum gkff implements hfub {
    KEY_EXCHANGE_UNKNOWN(0),
    KEY_EXCHANGE_SUCCEEDED(1),
    KEY_EXCHANGE_FAILED(2);

    public final int d;

    private gkff(int v1) {
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

