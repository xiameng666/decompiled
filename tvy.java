public final class tvy extends ttk {
    public static final byte[] a;
    public static final tvr b;

    static {
        byte[] arr_b = {0x5F, 42};
        tvy.a = arr_b;
        tvy.b = new tvr("Transaction Currency Code", "Indicates the currency code of the transaction according to ISO 4217", arr_b, 2, 0x80000000, 0x7FFFFFFF, 3, 2, 0, 1, 1, 3, 1);
    }

    public tvy(byte[] arr_b) {
        super(arr_b, true, tvy.b);
    }
}

