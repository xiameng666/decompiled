public final class tlh extends tak {
    public static final byte[] c = null;
    public static final byte[] d = null;
    public static final tdb e = null;
    public static final tcz f = null;
    private static final long serialVersionUID = 1L;

    static {
        tlh.c = new byte[]{0, 0};
        byte[] arr_b = {-57};
        tlh.d = arr_b;
        tlh.e = tdb.b;
        tlh.f = new tcz("Previous Transaction History", "Previous Transaction History", arr_b, 2, 0x7FFFFFFF, 3, 1, 2, 3, 2, tdb.b, 1);
    }

    public tlh() {
        super(tlh.c, tlh.f);
    }

    public tlh(byte[] arr_b) {
        super(arr_b, tlh.f);
    }

    public final boolean h() {
        return (((long)this.b[0]) & 16L) != 0L;
    }
}

