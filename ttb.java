public final class ttb extends tgc {
    public static final byte[] a = null;
    public static final tik d = null;
    private static final long serialVersionUID = 1L;

    static {
        byte[] arr_b = {-97, 90};
        ttb.a = arr_b;
        ttb.d = new tik("Terminal Transaction Type", "Used to identify transaction type requested by terminal", arr_b, 1, 0x80000000, 0x7FFFFFFF, 3, 2, 2, 1, 1, 3, 1);
    }

    public ttb(byte[] arr_b) {
        super(arr_b, ttb.d);
    }

    public final boolean n() {
        return this.j(0, 0);
    }
}

