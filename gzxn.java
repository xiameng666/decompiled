public enum gzxn implements hfub {
    ENABLEMENT_DEVICE_UNSPECIFIED(0),
    ENABLEMENT_DEVICE_PRIMARY(1),
    ENABLEMENT_DEVICE_ASSOCIATED(2),
    UNRECOGNIZED(-1);

    private final int f;

    private gzxn(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gzxn.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

