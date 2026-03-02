final class dgdp extends ibsl implements ibtw {
    boolean a;

    public dgdp(ibrl ibrl0) {
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgdp)this.c(((Boolean)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dgdp(ibrl0);
        ibrl1.a = ((Boolean)object0).booleanValue();
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return Boolean.valueOf(this.a);
    }
}

