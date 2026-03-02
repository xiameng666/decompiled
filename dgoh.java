final class dgoh extends ibsl implements ibtw {
    Object a;

    public dgoh(ibrl ibrl0) {
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgoh)this.c(((dgnb)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dgoh(ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        dgnb dgnb0 = (dgnb)this.a;
        return Boolean.valueOf(!(dgnb0 instanceof dgna) || ((dgna)dgnb0).b);
    }
}

