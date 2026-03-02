public final class tbl {
    public static final byte[] a;
    public static final tdb b;
    public static final tcz c;
    public static final byte[] d;

    static {
        byte[] arr_b = {-33, -1, 1};
        tbl.a = arr_b;
        tbl.b = tdb.c;
        tbl.d = new byte[]{0x4F};
        tbl.c = new tcz("AID with DGIs", "Container for storing AID with corresponding AID specific DGIs", arr_b, -1, 0x7FFFFFFF, 3, 1, 4, 3, 2, tdb.c, 5);
    }
}

