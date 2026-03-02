public enum hkni implements hfub {
    STORED_VALUE_TRANSACTION_TYPE_UNKNOWN(0),
    GIFT(1),
    TOPUP(2),
    PURCHASE(3),
    UNRECOGNIZED(-1);

    private final int g;

    private hkni(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hkni.e) {
            return this.g;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}

