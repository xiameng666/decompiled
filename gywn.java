public enum gywn implements hfub {
    BANDWIDTH_UNKNOWN(0),
    BANDWIDTH_24_GHZ(1),
    BANDWIDTH_5_GHZ(2),
    BANDWIDTH_6_GHZ(3);

    private final int f;

    private gywn(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

