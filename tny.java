public final class tny extends ttk {
    public static final byte[] a;
    public static final byte[] b;
    public static final tvr c;

    static {
        tny.a = new byte[]{0, 0, 0, 0};
        byte[] arr_b = {-97, 100};
        tny.b = arr_b;
        tny.c = new tvr("Card Verification Results", "This data element was originally defined in [DI ICC Spec]. MDA bit settings have been reused for\ncMDA as described in the following table. Some MDA bit settings are unused by cMDA", arr_b, 4, 0x80000000, 0x7FFFFFFF, 3, 1, 2, 2, 2, 3, 5);
    }

    public tny(byte[] arr_b) {
        super(arr_b, tny.c);
    }

    public final void a() {
        this.l(0, 2, true);
    }

    public final void b() {
        this.l(0, 0, true);
    }

    public final void c() {
        this.l(0, 3, true);
    }

    public final void d() {
        this.l(0, 1, true);
    }

    public final void e() {
        this.l(3, 6, true);
    }

    public final void f() {
        this.l(1, 2, true);
    }

    public final void g() {
        this.l(3, 7, true);
    }

    public final boolean h() {
        return this.q(0, 7);
    }
}

