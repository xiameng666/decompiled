public final class trf extends tgc {
    public static final byte[] a = null;
    public static final tik d = null;
    private static final long serialVersionUID = 1L;

    static {
        byte[] arr_b = {-97, 82};
        trf.a = arr_b;
        trf.d = new tik("Merchant Type Indicator Limits 01", "Defines the Authentication Required Limit and\nContactless Per Transaction Limit Merchant for MTI 01", arr_b, 12, 0x80000000, 0x7FFFFFFF, 3, 1, 1, 3, 5, 3, 5);
    }

    public trf(byte[] arr_b) {
        super(arr_b, true, trf.d);
    }
}

