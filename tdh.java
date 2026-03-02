public final class tdh extends tak {
    public static final byte[] c;
    public static final tdb d;
    public static final tcz e;

    static {
        byte[] arr_b = {-97, 26};
        tdh.c = arr_b;
        tdh.d = tdb.c;
        tdh.e = new tcz("Terminal Country Code", "Indicates the country of the terminal, represented according to ISO 3166", arr_b, 2, 0x7FFFFFFF, 3, 2, 2, 1, 1, tdb.c, 1);
    }

    public tdh(byte[] arr_b) {
        super(arr_b, tdh.e);
    }
}

