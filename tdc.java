public class tdc extends tak {
    public static final byte[] c;
    public static final tdb d;
    public static final tcz e;

    static {
        byte[] arr_b = {-97, 2};
        tdc.c = arr_b;
        tdc.d = tdb.c;
        tdc.e = new tcz("Amount, Authorized", "Authorized amount of the transaction (including Amount, Other and excluding adjustments).", arr_b, 6, 0x7FFFFFFF, 3, 2, 0, 1, 1, tdb.c, 1);
    }

    public tdc(byte[] arr_b) {
        super(arr_b, true, tdc.e);
    }

    public tdc(byte[] arr_b, tcz tcz0) {
        super(arr_b, true, tcz0);
    }
}

