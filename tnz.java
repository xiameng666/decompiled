public final class tnz extends ttt {
    public static final byte[] a;

    static {
        tnz.a = new byte[]{(byte)0xE0};
    }

    public tnz() {
        this.d(new ton(ton.b));
        this.d(new tom(tom.b));
    }

    public tnz(byte[] arr_b) {
        super(arr_b);
    }

    public final tom a() {
        return this.j(tom.a) ? new tom(this.k(tom.a)) : null;
    }

    public final ton b() {
        return this.j(ton.a) ? new ton(this.k(ton.a)) : null;
    }

    public final syd c() {
        byte[] arr_b = this.b.a();
        return syb.b(tnz.a, arr_b);
    }
}

