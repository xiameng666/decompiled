final class fxdn extends fxov {
    public final kba a;
    public long b;

    static {
        bboh.c("EQMon", bbcu.g, "BofRCL");
    }

    public fxdn(kba kba0, fxnw fxnw0) {
        super(fxnw0);
        this.a = kba0;
    }

    public final boolean a() {
        return this.b > ((long)(((Long)this.a.a()))) + 10000L;
    }

    @Override  // fxov
    public final fxou b() {
        return this.a() ? new fxou(2, 17) : fxou.b;
    }

    @Override  // fxov
    public final void f() {
    }

    @Override  // fxov
    public final void g() {
    }
}

