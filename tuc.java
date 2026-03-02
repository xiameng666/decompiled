public final class tuc extends ttk {
    public static final byte[] a;
    public static final tvr b;

    static {
        byte[] arr_b = {0x5F, 36};
        tuc.a = arr_b;
        tuc.b = new tvr("Application Expiration Date", "Date after which the card application expires.", arr_b, 3, 0x80000000, 0x7FFFFFFF, 1, 1, 3, 2, 2, 2, 6);
    }

    public tuc(byte[] arr_b) {
        super(arr_b, tuc.b);
    }
}

