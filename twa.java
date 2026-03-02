public final class twa extends ttk {
    public static final byte[] a;
    public static final tvr b;

    static {
        byte[] arr_b = {-100};
        twa.a = arr_b;
        twa.b = new tvr("Transaction Type", "Indicates the type of financial transaction, represented by the first two digits of the ISO 8583:1987 Processing Code. The actual values to be used for the Transaction Type data element are defined by the relevant payment system", arr_b, 1, 0x80000000, 0x7FFFFFFF, 3, 2, 0, 1, 1, 3, 1);
    }

    public twa(byte[] arr_b) {
        super(arr_b, twa.b);
    }
}

