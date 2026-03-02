public final class tnu extends ttk {
    public static final byte[] a = null;
    public static final tvr b = null;
    public static final byte[] c = null;
    private static final long serialVersionUID = 1L;

    static {
        byte[] arr_b = {-97, 107};
        tnu.a = arr_b;
        tnu.c = new byte[]{0, 0, 0, 0};
        tnu.b = new tvr("CIAC Denial", "The Card Issuer Action Codes are compared to the \"\n            + \"the Card Verification Results to take decisions when the payment \"\n            + \"mode is active.\";", arr_b, 4, 0x80000000, 0x7FFFFFFF, 3, 1, 2, 3, 5, 3, 4);
    }

    public tnu(byte[] arr_b) {
        super(arr_b, tnu.b);
    }

    public final boolean a(tny tny0) {
        return !new tww(tny0.r()).b(new tww(this.r())).equals(new tww(tnu.c));
    }
}

