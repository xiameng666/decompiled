final class zmp extends ibsl implements ibtw {
    final zms a;
    final String b;
    final Throwable c;

    public zmp(zms zms0, String s, Throwable throwable0, ibrl ibrl0) {
        this.a = zms0;
        this.b = s;
        this.c = throwable0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((zmp)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new zmp(this.a, this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        zms zms0 = this.a;
        icnl icnl0 = zms0.l;
        if(ibuq.m(((zmo)icnl0.b()).a, this.b)) {
            icnl0.g(zms.a);
            zmv zmv0 = new zmv(this.c);
            zms0.j.l(zmv0);
        }
        return ibom.a;
    }
}

