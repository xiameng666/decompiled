public final class tvz extends ttk {
    public static final byte[] a;
    public static final tvr b;

    static {
        byte[] arr_b = {-102};
        tvz.a = arr_b;
        tvz.b = new tvr("Transaction Date", "Local date that the transaction was authorised", arr_b, 3, 0x80000000, 0x7FFFFFFF, 3, 2, 0, 1, 1, 3, 1);
    }

    public tvz(byte[] arr_b) {
        super(arr_b, tvz.b);
    }
}

