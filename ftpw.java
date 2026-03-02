public enum ftpw implements hfub {
    PROVISION_OPERATION_UNKNOWN(0),
    PROVISION_NEW_CARD(1),
    PROVISION_PARKED_CARD(2),
    PROVISION_PROVISION_IN_PROGRESS_CARD(3),
    UNRECOGNIZED(-1);

    private final int g;

    private ftpw(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != ftpw.e) {
            return this.g;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}

