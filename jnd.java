final class jnd extends ibur implements ibtw {
    final ibts a;
    final hfc b;
    final ibts c;
    final ibts d;
    final int e;

    public jnd(ibts ibts0, hfc hfc0, ibts ibts1, ibts ibts2, int v) {
        this.a = ibts0;
        this.b = hfc0;
        this.c = ibts1;
        this.d = ibts2;
        this.e = v;
        super(2);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ((Number)object1).intValue();
        jnl.c(this.a, this.b, this.c, this.d, ((goz)object0), gsc.a(this.e | 1));
        return ibom.a;
    }
}

