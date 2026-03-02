public final class tkx extends tak {
    public static final tdb c;
    public static final tcz d;

    static {
        tkx.c = tdb.c;
        tkx.d = new tcz("CCI", "CCI", null, 1, 0x7FFFFFFF, 3, 1, 4, 3, 1, tdb.c, 1);
    }

    public tkx(byte[] arr_b) {
        super(arr_b, true, tkx.d);
    }
}

