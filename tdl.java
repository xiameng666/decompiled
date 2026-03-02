public final class tdl extends tak {
    public static final byte[] c;
    public static final tdb d;
    public static final tcz e;

    static {
        byte[] arr_b = {-102};
        tdl.c = arr_b;
        tdl.d = tdb.c;
        tdl.e = new tcz("Transaction Date", "Local date that the transaction was authorised", arr_b, 3, 0x7FFFFFFF, 3, 2, 0, 1, 1, tdb.c, 1);
    }

    public tdl(byte[] arr_b) {
        super(arr_b, tdl.e);
    }
}

