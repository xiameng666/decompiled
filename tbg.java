public final class tbg extends tak {
    public static final byte[] c;
    public static final tdb d;
    public static final tcz e;

    static {
        byte[] arr_b = {0x5F, 36};
        tbg.c = arr_b;
        tbg.d = tdb.b;
        tbg.e = new tcz("Application Expiration Date", "Date after which the card application expires.", arr_b, 3, 0x7FFFFFFF, 1, 1, 3, 2, 2, tdb.b, 6);
    }

    public tbg(byte[] arr_b) {
        super(arr_b, tbg.e);
    }
}

