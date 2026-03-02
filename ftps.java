public enum ftps implements hfub {
    CARD_OPERATION_UNKNOWN(0),
    CARD_OPERATION_ASSOCIATION(1),
    CARD_OPERATION_DISASSOCIATION(2),
    UNRECOGNIZED(-1);

    private final int f;

    private ftps(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != ftps.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

