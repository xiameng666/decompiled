public final class trl extends tgc {
    public static final byte[] a;
    public static final byte[] d;
    public static final tik e;

    static {
        byte[] arr_b = {-33, 27};
        trl.a = arr_b;
        trl.d = new byte[]{0, 0};
        trl.e = new tik("Multicurrency Unauthenticated Counter", "Tracks number of transactions not in Issuer currency since last successful Passcode check.  Counter stored incard\'s riscManagement and reset after successful passcode validation", arr_b, 2, 0x80000000, 0x7FFFFFFF, 1, 1, 3, 3, 1, 3, 5);
    }

    public trl(byte[] arr_b) {
        super(arr_b, trl.e);
    }

    public final long n() {
        try {
            return Long.parseLong(tjs.b(this.k()));
        }
        catch(NumberFormatException unused_ex) {
            return 0L;
        }
    }

    public final void o() {
        super.f(trl.d);
    }
}

