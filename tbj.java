public final class tbj extends tbo {
    public static final byte[] c;
    public static final tdb d;
    public static final tcz e;

    static {
        byte[] arr_b = {(byte)0x8C};
        tbj.c = arr_b;
        tbj.d = tdb.c;
        tbj.e = new tcz("Card Risk Management Data Object List", "List of data objects (tag and length) to be passed to the ICC in the first GENERATE AC command", arr_b, -1, 0x7FFFFFFF, 3, 1, 2, 2, 2, tdb.c, 7);
    }

    public tbj(byte[] arr_b) {
        super(arr_b, tbj.e);
    }
}

