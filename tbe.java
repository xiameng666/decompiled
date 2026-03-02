public final class tbe extends tak {
    public static final byte[] c;
    public static final tdb d;
    public static final tcz e;

    static {
        byte[] arr_b = {-97, 38};
        tbe.c = arr_b;
        tbe.d = tdb.c;
        tbe.e = new tcz("Application Cryptogram", "Cryptogram returned by the card in response to the GPO command.", arr_b, -1, 0x7FFFFFFF, 3, 1, 1, 6, 2, tdb.c, 5);
    }

    public tbe(byte[] arr_b) {
        this(arr_b, true);
    }

    public tbe(byte[] arr_b, boolean z) {
        super(arr_b, z, tbe.e);
    }
}

