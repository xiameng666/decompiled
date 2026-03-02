public class tdk extends tak {
    public static final byte[] d;
    public static final tdb e;
    public static final tcz f;

    static {
        byte[] arr_b = {0x5F, 42};
        tdk.d = arr_b;
        tdk.e = tdb.c;
        tdk.f = new tcz("Transaction Currency Code", "Indicates the currency code of the transaction according to ISO 4217", arr_b, 2, 0x7FFFFFFF, 3, 2, 0, 1, 1, tdb.c, 1);
    }

    public tdk(byte[] arr_b) {
        super(arr_b, true, tdk.f);
    }

    public tdk(byte[] arr_b, tcz tcz0) {
        super(arr_b, true, tcz0);
    }
}

