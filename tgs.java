public final class tgs extends tgc {
    public static final byte[] a;
    public static final tik d;

    static {
        byte[] arr_b = {-97, 38};
        tgs.a = arr_b;
        tgs.d = new tik("Application Cryptogram", "Cryptogram returned by the card in response to the GPO command.", arr_b, -1, 0x80000000, 0x7FFFFFFF, 3, 1, 1, 6, 2, 3, 5);
    }

    public tgs(byte[] arr_b, boolean z) {
        super(arr_b, z, tgs.d);
    }
}

