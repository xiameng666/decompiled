public final class tqt extends tgc {
    public static final byte[] a = null;
    public static final tik d = null;
    public static final byte[] e = null;
    private static final long serialVersionUID = 1L;

    static {
        byte[] arr_b = {-97, 107};
        tqt.a = arr_b;
        tqt.e = new byte[]{0, 0, 0, 0};
        tqt.d = new tik("CIAC Denial", "The Card Issuer Action Codes are compared to the \"\n            + \"the Card Verification Results to take decisions when the payment \"\n            + \"mode is active.\";", arr_b, 4, 0x80000000, 0x7FFFFFFF, 3, 1, 2, 3, 5, 3, 4);
    }

    public tqt(byte[] arr_b) {
        super(arr_b, tqt.d);
    }

    public final boolean n(tqx tqx0) {
        return !new tjp(tqx0.k()).b(new tjp(this.k())).equals(new tjp(tqt.e));
    }
}

