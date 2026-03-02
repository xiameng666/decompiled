final class cjdb extends ibsl implements ibtw {
    final cjdc a;
    final ibts b;
    private Object c;

    public cjdb(cjdc cjdc0, ibts ibts0, ibrl ibrl0) {
        this.a = cjdc0;
        this.b = ibts0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cjdb)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new cjdb(this.a, this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        cjcz cjcz0 = new cjcz(this.b, ((icck)this.c));
        this.a.m(cjcz0);
        return ibom.a;
    }
}

