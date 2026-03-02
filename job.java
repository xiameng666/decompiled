final class job extends ibur implements ibth {
    final jpu a;
    final ibth b;
    final jpq c;
    final jlm d;

    public job(jpu jpu0, ibth ibth0, jpq jpq0, jlm jlm0) {
        this.a = jpu0;
        this.b = ibth0;
        this.c = jpq0;
        this.d = jlm0;
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        this.a.a(this.b, this.c, this.d);
        return ibom.a;
    }
}

