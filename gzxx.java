public enum gzxx implements hfub {
    UNKNOWN_ENTRY_POINT(0),
    ENTRY_POINT_ADVANCED_SECURITY_SETTINGS(1),
    ENTRY_POINT_COMPANION_SETTINGS(2),
    ENTRY_POINT_ANDROID_SETTINGS(3),
    ENTRY_POINT_DEVICE_EXPIRATION_NOTIFICATION(4),
    ENTRY_POINT_COMPANION_PROMO_CARD(5),
    ENTRY_POINT_METHOD_DOWNGRADE_NOTIFICATION(6),
    ENTRY_POINT_METHOD_UNAVAILABLE_NOTIFICATION(7),
    ENTRY_POINT_BUGREPORT_NOTIFICATION(8),
    ENTRY_POINT_METHOD_AIRPLANE_MODE_NOTIFICATION(9),
    UNRECOGNIZED(-1);

    private final int m;

    private gzxx(int v1) {
        this.m = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gzxx.k) {
            return this.m;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.m);
    }
}

