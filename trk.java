public final class trk extends tgc {
    public static final byte[] a = null;
    public static final tik d = null;
    private static final long serialVersionUID = 1L;

    static {
        byte[] arr_b = {-97, 0x72};
        trk.a = arr_b;
        trk.d = new tik("Multicurrency Authentication Limit", "Number of transactions permitted before CVM Required for Multicurrency transactions.\nSpecified by Issuer", arr_b, 2, 0x80000000, 0x7FFFFFFF, 3, 3, 4, 2, 5, 3, 5);
    }

    public trk(byte[] arr_b) {
        super(arr_b, true, trk.d);
    }
}

