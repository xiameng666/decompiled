public final class tdi extends tak {
    public static final byte[] c;
    public static final tdb d;
    public static final tcz e;

    static {
        byte[] arr_b = {-97, 53};
        tdi.c = arr_b;
        tdi.d = tdb.c;
        tdi.e = new tcz("Terminal Type", "Indicates the environment of the terminal, its communication capability, and\nits operational control", arr_b, 1, 0x7FFFFFFF, 1, 2, 2, 1, 1, tdb.c, 1);
    }

    public tdi(byte[] arr_b) {
        super(arr_b, tdi.e);
    }
}

