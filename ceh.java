final class ceh extends ibur implements ibts {
    final ibq a;
    final long b;
    final long c;
    final ibts d;

    public ceh(ibq ibq0, long v, long v1, ibts ibts0) {
        this.a = ibq0;
        this.b = v;
        this.c = v1;
        this.d = ibts0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ((ibp)object0).D(this.a, jlf.a(this.b) + jlf.a(this.c), jlf.b(this.b) + jlf.b(this.c), this.d);
        return ibom.a;
    }
}

