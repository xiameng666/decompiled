public final class tnx extends ttk {
    public static final byte[] a = null;
    public static final byte[] b = null;
    public static final tvr c = null;
    private static final long serialVersionUID = 1L;

    static {
        tnx.a = new byte[]{0, 20, 0, 0};
        byte[] arr_b = {-97, 99};
        tnx.b = arr_b;
        tnx.c = new tvr("Card Transaction Information", "", arr_b, 4, 0x80000000, 0x7FFFFFFF, 3, 1, 3, 3, 5, 3, 4);
    }

    public tnx(byte[] arr_b) {
        super(arr_b, tnx.c);
    }

    public final void a() {
        this.l(0, 7, false);
        this.l(0, 6, false);
    }

    public final void b() {
        this.l(0, 7, true);
    }

    public final void c() {
        this.l(0, 0, true);
    }

    public final void d() {
        this.l(2, 3, true);
    }

    public final void e() {
        this.l(0, 5, true);
        this.l(0, 4, true);
    }

    public final boolean f() {
        return this.q(2, 3);
    }
}

