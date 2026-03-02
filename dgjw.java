final class dgjw extends ibsl implements ibtw {
    Object a;
    final dgkd b;
    final ichm c;

    public dgjw(dgkd dgkd0, ichm ichm0, ibrl ibrl0) {
        this.b = dgkd0;
        this.c = ichm0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgjw)this.c(((dgli)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dgjw(this.b, this.c, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        dgli dgli0 = (dgli)this.a;
        long v = this.b.a.a();
        this.b.h(this.c, v, dgli0.a, dgli0.b);
        return ibom.a;
    }
}

