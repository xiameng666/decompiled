public final class tvx extends ttk {
    public static final byte[] a;
    public static final tvr b;

    static {
        byte[] arr_b = {-107};
        tvx.a = arr_b;
        tvx.b = new tvr("Terminal Verification Results", "Status of the different functions as seen from the terminal", arr_b, 5, 0x80000000, 0x7FFFFFFF, 3, 2, 2, 1, 1, 3, 1);
    }

    public tvx(byte[] arr_b) {
        super(arr_b, tvx.b);
    }
}

