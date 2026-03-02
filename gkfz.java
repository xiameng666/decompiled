public enum gkfz implements hfub {
    TCP_PROBER_UNKNOWN(0),
    TCP_PROBER_DEVICE_EXPIRED(1),
    TCP_PROBER_SUBTYPE_MDNS_MISSING(2),
    TCP_PROBER_BLE(3),
    TCP_PROBER_CLOUD_DISCOVERY(4),
    TCP_PROBER_GAIA_DISCOVERY(5),
    TCP_PROBER_KNOWN_SESSION_ENDPOINT(6),
    TCP_PROBER_APP_HINT(7),
    TCP_PROBER_REFRESH_SESSION_ENDPOINT(8),
    TCP_PROBER_CCHORD_DISCOVERY(9),
    TCP_PROBER_EUREKA_INFO(10);

    public final int l;

    private gkfz(int v1) {
        this.l = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.l;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.l);
    }
}

