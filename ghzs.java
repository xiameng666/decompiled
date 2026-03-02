public enum ghzs implements hfub {
    GMS_CORE_NOTIFICATION_STATE_UNSPECIFIED(0),
    ALLOWED(1),
    DENIED(2),
    UNKNOWN(3);

    public final int e;

    private ghzs(int v1) {
        this.e = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.e;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}

