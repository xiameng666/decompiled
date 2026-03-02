final class rub extends ibsl implements ibtw {
    Object a;
    final ryh b;

    public rub(ryh ryh0, ibrl ibrl0) {
        this.b = ryh0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rub)this.c(((sah)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new rub(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return ((sah)this.a).fg(this.b);
    }
}

