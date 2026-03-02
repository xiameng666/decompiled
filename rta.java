final class rta extends ibsl implements ibtw {
    final ryh a;
    private Object b;

    public rta(ryh ryh0, ibrl ibrl0) {
        this.a = ryh0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rta)this.c(((sag)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new rta(this.a, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return ((sag)this.b).fg(this.a);
    }
}

