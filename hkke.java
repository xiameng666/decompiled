public enum hkke implements hfub {
    PROVISION_STATUS_UNSPECIFIED(0),
    PROVISION_STATUS_PROVISIONED(1),
    PROVISION_STATUS_DELETED(2),
    UNRECOGNIZED(-1);

    private final int f;

    private hkke(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hkke.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

