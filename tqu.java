public final class tqu extends tgc {
    public static final byte[] a = null;
    public static final tik d = null;
    public static final byte[] e = null;
    private static final long serialVersionUID = 1L;

    static {
        byte[] arr_b = {-97, 109};
        tqu.a = arr_b;
        tqu.e = new byte[]{0, 0, 0, 0};
        tqu.d = new tik("CIAC Online", "Card Issuer Action Code Online", arr_b, 4, 0x80000000, 0x7FFFFFFF, 3, 1, 2, 3, 5, 3, 4);
    }

    public tqu(byte[] arr_b) {
        super(arr_b, tqu.d);
    }

    public final boolean n(tqx tqx0) {
        return !new tjp(tqx0.k()).b(new tjp(this.k())).equals(new tjp(tqu.e));
    }
}

