public enum hkyj implements hfub {
    CONNECTION_TYPE_UNSPECIFIED(0),
    USB(1),
    WIFI(2);

    public final int d;

    private hkyj(int v1) {
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

