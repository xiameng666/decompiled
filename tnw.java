public final class tnw extends ttk {
    public static final byte[] a = null;
    public static final tvr b = null;
    private static final long serialVersionUID = 1L;

    static {
        byte[] arr_b = {-97, 97};
        tnw.a = arr_b;
        tnw.b = new tvr("Card Option Status", "This data element was originally defined in [DI ICC Spec]. Some of the bit settings have been\nreused by cMDA", arr_b, 2, 0x80000000, 0x7FFFFFFF, 3, 1, 2, 3, 5, 3, 4);
    }

    public tnw(byte[] arr_b) {
        super(arr_b, tnw.b);
    }

    public final boolean a() {
        return this.q(0, 1) && !this.q(0, 0);
    }
}

