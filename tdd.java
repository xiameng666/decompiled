public class tdd extends tak {
    public static final byte[] c;
    public static final tdb d;
    public static final tcz e;

    static {
        byte[] arr_b = {-97, 3};
        tdd.c = arr_b;
        tdd.d = tdb.c;
        tdd.e = new tcz("Amount, Other", "Secondary amount associated with the transaction representing a cashback amount", arr_b, 6, 0x7FFFFFFF, 3, 2, 0, 1, 1, tdb.c, 1);
    }

    public tdd(byte[] arr_b) {
        super(arr_b, tdd.e);
    }

    public tdd(byte[] arr_b, tcz tcz0) {
        super(arr_b, tcz0);
    }
}

