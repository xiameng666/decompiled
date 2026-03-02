public enum hfiv implements hfub {
    UNKNOWN_FORMAT(0),
    CONTACT_INFO(1),
    EMAIL(2),
    ISBN(3),
    PHONE(4),
    PRODUCT(5),
    SMS(6),
    TEXT(7),
    URL(8),
    WIFI(9),
    GEO(10),
    CALENDAR_EVENT(11),
    DRIVER_LICENSE(12),
    BOARDING_PASS(13);

    public final int o;

    private hfiv(int v1) {
        this.o = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.o;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.o);
    }
}

