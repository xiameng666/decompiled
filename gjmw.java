public enum gjmw implements hfub {
    NONE(0),
    WIFI_D2D(1),
    OEM_APP(2),
    FIRST_PARTY_APP(3);

    public final int e;

    private gjmw(int v1) {
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

