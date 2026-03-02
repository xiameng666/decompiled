public enum gzya implements hfub {
    UNKNOWN_FEATURE_AVAILABILITY(0),
    FEATURE_AVAILABLE(1),
    FEATURE_UNAVAILABLE_UNSUPPORTED(2),
    FEATURE_UNAVAILABLE_DISABLED_BY_DEVICE_POLICY(3),
    FEATURE_UNAVAILABLE_TRUST_AGENT_OFF(4),
    FEATURE_UNAVAILABLE_NO_BLUETOOTH_PERMISSION(5),
    FEATURE_UNAVAILABLE_BLUETOOTH_OFF(6),
    FEATURE_UNAVAILABLE_LOCKSCREEN_DISABLED(7),
    UNRECOGNIZED(-1);

    private final int k;

    private gzya(int v1) {
        this.k = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gzya.i) {
            return this.k;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.k);
    }
}

