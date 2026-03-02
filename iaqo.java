public final class iaqo {
    private int a;

    public iaqo(int v) {
        this.a = v;
    }

    public final iaqp a() {
        return new iaqp(this.a);
    }

    public final void b(int v) {
        this.a |= v;
    }

    public final void c() {
        this.b(0x200);
    }
}

