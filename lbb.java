final class lbb extends ibsl implements ibtw {
    Object a;
    final lec b;

    public lbb(lec lec0, ibrl ibrl0) {
        this.b = lec0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((lbb)this.c(((lec)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new lbb(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        lec lec0 = (lec)this.a;
        return Boolean.valueOf((lec0 instanceof lah) && ((lah)lec0).c <= ((lah)this.b).c);
    }
}

