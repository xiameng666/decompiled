public final class tqa extends ttk {
    public static final byte[] a = null;
    public static final tvr b = null;
    private static final long serialVersionUID = 1L;

    static {
        byte[] arr_b = {-97, 90};
        tqa.a = arr_b;
        tqa.b = new tvr("Terminal Transaction Type", "Used to identify transaction type requested by terminal", arr_b, 1, 0x80000000, 0x7FFFFFFF, 3, 2, 2, 1, 1, 3, 1);
    }

    public tqa(byte[] arr_b) {
        super(arr_b, tqa.b);
    }

    public final boolean b() {
        return this.q(0, 0);
    }
}

