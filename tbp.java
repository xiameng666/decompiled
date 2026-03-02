public final class tbp extends tak {
    public static final byte[] c;
    public static final tdb d;
    public static final tcz e;

    static {
        byte[] arr_b = {(byte)0x84};
        tbp.c = arr_b;
        tbp.d = tdb.c;
        tbp.e = new tcz("Dedicated File Name", "Identifies the name of the DF as described in ISO/IEC 7816-4", arr_b, -1, 0x7FFFFFFF, 3, 1, 4, 2, 2, tdb.c, 7);
    }

    public tbp(byte[] arr_b) {
        super(arr_b, tbp.e);
    }
}

