public final class tqr extends tgc {
    public static final byte[] a;
    public static final tik d;

    static {
        byte[] arr_b = {(byte)0x82};
        tqr.a = arr_b;
        tqr.d = new tik("Application Interchange Profile", "Indicates the capabilities of the card to support specific functions in the application.", arr_b, -1, 0x80000000, 0x7FFFFFFF, 3, 1, 1, 2, 2, 3, 5);
    }

    public tqr(byte[] arr_b) {
        super(arr_b, tqr.d, null);
    }
}

