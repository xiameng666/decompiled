final class cgo extends ibur implements ibts {
    final cgp a;
    final long b;
    final int c;
    final int d;
    final iax e;
    final ibq f;

    public cgo(cgp cgp0, long v, int v1, int v2, iax iax0, ibq ibq0) {
        this.a = cgp0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = iax0;
        this.f = ibq0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        hel hel0 = this.a.b;
        jlm jlm0 = this.e.p();
        long v = hel0.a(this.b, ((long)this.c) << 0x20 | ((long)this.d) & 0xFFFFFFFFL, jlm0);
        ibp.z(((ibp)object0), this.f, v);
        return ibom.a;
    }
}

