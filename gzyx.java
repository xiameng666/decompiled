public enum gzyx implements hfub {
    UNKNOWN_UNENROLLMENT_EVENT(0),
    UNENROLLED_PD_SETTINGS(1),
    UNENROLLED_AD_SETTINGS(2),
    UNENROLLED_AD_LOCKSCREEN_REMOVED(3),
    UNENROLLED_ATTESTATION_EXPIRY(4),
    UNENROLLED_BLUETOOTH_UNBONDED(5),
    UNRECOGNIZED(-1);

    private final int i;

    private gzyx(int v1) {
        this.i = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gzyx.g) {
            return this.i;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.i);
    }
}

