public final class tqx extends tgc {
    public static final byte[] a;
    public static final byte[] d;
    public static final tik e;

    static {
        tqx.a = new byte[]{0, 0, 0, 0};
        byte[] arr_b = {-97, 100};
        tqx.d = arr_b;
        tqx.e = new tik("Card Verification Results", "This data element was originally defined in [DI ICC Spec]. MDA bit settings have been reused for\ncMDA as described in the following table. Some MDA bit settings are unused by cMDA", arr_b, 4, 0x80000000, 0x7FFFFFFF, 3, 1, 2, 2, 2, 3, 5);
    }

    public tqx(byte[] arr_b) {
        super(arr_b, tqx.e);
    }

    public final void n() {
        this.e(0, 2, true);
    }

    public final void o() {
        this.e(0, 0, true);
    }

    public final void p() {
        this.e(0, 3, true);
    }

    public final void q() {
        this.e(0, 1, true);
    }

    public final void r() {
        this.e(3, 6, true);
    }

    public final void s() {
        this.e(1, 2, true);
    }

    public final void t() {
        this.e(3, 7, true);
    }

    public final boolean u() {
        return this.j(0, 7);
    }
}

