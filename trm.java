public final class trm extends tgc {
    public static final byte[] a;
    public static final byte[] d;
    public static final tik e;

    static {
        byte[] arr_b = {-33, 26};
        trm.a = arr_b;
        trm.d = new byte[]{0, 0, 0, 0, 0, 0};
        trm.e = new tik("Total Unauthenticated Spend Amount", "Tracks total spend since last successful Passcode check.  Amount stored incard\'s riscManagement and reset after successful passcode validation", arr_b, 6, 0x80000000, 0x7FFFFFFF, 1, 1, 3, 3, 1, 3, 5);
    }

    public trm(byte[] arr_b) {
        super(arr_b, trm.e);
    }

    public final long n() {
        try {
            return Long.parseLong(tjs.b(this.k()));
        }
        catch(NumberFormatException unused_ex) {
            return 0L;
        }
    }
}

