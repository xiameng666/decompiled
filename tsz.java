public final class tsz extends tgc {
    public static final byte[] a = null;
    public static final tik d = null;
    private static final long serialVersionUID = 1L;

    static {
        byte[] arr_b = {-97, 88};
        tsz.a = arr_b;
        tsz.d = new tik("Merchant Type Indicator", "Defines the Merchant type for card risk management\npurposes.", arr_b, 1, 0x80000000, 0x7FFFFFFF, 3, 2, 2, 2, 1, 3, 4);
    }

    public tsz(byte[] arr_b) {
        super(arr_b, tsz.d);
    }
}

