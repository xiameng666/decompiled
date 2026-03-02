public final class tis extends tgc {
    public static final byte[] a;
    public static final tik d;

    static {
        byte[] arr_b = {-100};
        tis.a = arr_b;
        tis.d = new tik("Transaction Type", "Indicates the type of financial transaction, represented by the first two digits of the ISO 8583:1987 Processing Code. The actual values to be used for the Transaction Type data element are defined by the relevant payment system", arr_b, 1, 0x80000000, 0x7FFFFFFF, 3, 2, 0, 1, 1, 3, 1);
    }

    public tis(byte[] arr_b) {
        super(arr_b, tis.d);
    }
}

