public final class trn extends tgc {
    public static final byte[] a;
    public static final tik d;

    static {
        byte[] arr_b = {-97, 120};
        trn.a = arr_b;
        trn.d = new tik("Upper Total Contactless Spend Limit", "Hard limit requiring Passcode authentication.", arr_b, 6, 0x80000000, 0x7FFFFFFF, 3, 2, 0, 1, 1, 3, 1);
    }

    public trn(byte[] arr_b) {
        super(arr_b, true, trn.d);
    }
}

