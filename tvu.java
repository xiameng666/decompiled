public final class tvu extends ttk {
    public static final byte[] a;
    public static final tvr b;

    static {
        byte[] arr_b = {-97, 3};
        tvu.a = arr_b;
        tvu.b = new tvr("Amount, Other", "Secondary amount associated with the transaction representing a cashback amount", arr_b, 6, 0x80000000, 0x7FFFFFFF, 3, 2, 0, 1, 1, 3, 1);
    }

    public tvu(byte[] arr_b) {
        super(arr_b, tvu.b);
    }
}

