public enum hktv implements hfub {
    UNKNOWN(0),
    @Deprecated
    TOOGLE(1),
    @Deprecated
    TORINO(2),
    AMEX(3),
    DISCOVER(4),
    MASTERCARD(5),
    VISA(6),
    @Deprecated
    TOOGLE_DISCOVER(7),
    EFTPOS(8),
    INTERAC(9),
    OBERTHUR(10),
    PAYPAL(11),
    APTEST(12),
    APTEST_SECONDARY(13),
    JCB(14),
    ELO(15),
    GEMALTO(16),
    RUPAY(17),
    MIR(18),
    BANCOMAT(19),
    THALES(20),
    IDEMIA(21),
    UNRECOGNIZED(-1);

    private final int y;

    private hktv(int v1) {
        this.y = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hktv.w) {
            return this.y;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.y);
    }
}

