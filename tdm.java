public final class tdm extends tak {
    public static final byte[] c;
    public static final tdb d;
    public static final tcz e;

    static {
        byte[] arr_b = {-100};
        tdm.c = arr_b;
        tdm.d = tdb.c;
        tdm.e = new tcz("Transaction Type", "Indicates the type of financial transaction, represented by the first two digits of the ISO 8583:1987 Processing Code. The actual values to be used for the Transaction Type data element are defined by the relevant payment system", arr_b, 1, 0x7FFFFFFF, 3, 2, 0, 1, 1, tdb.c, 1);
    }

    public tdm(byte[] arr_b) {
        super(arr_b, tdm.e);
    }
}

