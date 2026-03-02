public final class tbt extends tak {
    public static final byte[] c;
    public static final tdb d;
    public static final tcz e;

    static {
        byte[] arr_b = {90};
        tbt.c = arr_b;
        tbt.d = tdb.b;
        tbt.e = new tcz("Application Primary Account Number (PAN)", "Valid cardholder account number.", arr_b, -1, 19, 2, 1, 3, 2, 2, tdb.b, 6);
    }

    public tbt(byte[] arr_b) {
        super(arr_b, tbt.e);
    }
}

