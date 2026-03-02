public enum hkfg implements hfub {
    PARAMETER_NAME_UNKNOWN(0),
    PARAMETER_NAME_DISPLAY_CARD_NUMBER(1),
    PARAMETER_NAME_CARD_VERIFICATION_NUMBER(2),
    PARAMETER_NAME_EXPIRATION_MONTH(3),
    PARAMETER_NAME_EXPIRATION_YEAR(4),
    PARAMETER_NAME_CARD_HOLDER_FIRST_NAME(5),
    PARAMETER_NAME_CARD_HOLDER_LAST_NAME(6),
    PARAMETER_NAME_PHONE_NUMBER(7),
    UNRECOGNIZED(-1);

    private final int k;

    private hkfg(int v1) {
        this.k = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hkfg.i) {
            return this.k;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.k);
    }
}

