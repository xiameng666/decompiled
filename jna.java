final class jna extends ibur implements ibtw {
    final ibts a;
    final hfc b;
    final ibts c;
    final int d;
    final int e;

    public jna(ibts ibts0, hfc hfc0, ibts ibts1, int v, int v1) {
        this.a = ibts0;
        this.b = hfc0;
        this.c = ibts1;
        this.d = v;
        this.e = v1;
        super(2);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ((Number)object1).intValue();
        jnl.b(this.a, this.b, this.c, ((goz)object0), gsc.a(this.d | 1), this.e);
        return ibom.a;
    }
}

