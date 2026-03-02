public final class tnv extends ttk {
    public static final byte[] a = null;
    public static final tvr b = null;
    public static final byte[] c = null;
    private static final long serialVersionUID = 1L;

    static {
        byte[] arr_b = {-97, 109};
        tnv.a = arr_b;
        tnv.c = new byte[]{0, 0, 0, 0};
        tnv.b = new tvr("CIAC Online", "Card Issuer Action Code Online", arr_b, 4, 0x80000000, 0x7FFFFFFF, 3, 1, 2, 3, 5, 3, 4);
    }

    public tnv(byte[] arr_b) {
        super(arr_b, tnv.b);
    }

    public final boolean a(tny tny0) {
        return !new tww(tny0.r()).b(new tww(this.r())).equals(new tww(tnv.c));
    }
}

