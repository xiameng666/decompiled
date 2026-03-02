public final class tlg extends tak {
    public static final tdb c;
    public static final tcz d;

    static {
        tlg.c = tdb.c;
        tlg.d = new tcz("Profile Parameters", "Profile Parameters", null, 1, 0x7FFFFFFF, 3, 1, 4, 3, 1, tdb.c, 1);
    }

    public tlg(byte[] arr_b) {
        super(arr_b, true, tlg.d);
    }
}

