final class dglr extends ibsl implements ibtw {
    Object a;
    final ichm b;

    public dglr(ichm ichm0, ibrl ibrl0) {
        this.b = ichm0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dglr)this.c(((dggz)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dglr(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        dglm.a(this.b, ((dggz)this.a));
        return ibom.a;
    }
}

