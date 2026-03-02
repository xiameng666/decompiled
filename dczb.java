final class dczb extends ibsl implements ibtw {
    int a;
    final Object b;
    final dczc c;
    final dixi d;

    public dczb(Object object0, dczc dczc0, dixi dixi0, ibrl ibrl0) {
        this.b = object0;
        this.c = dczc0;
        this.d = dixi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dczb)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dczb(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dcvz.a.b().h("[SettingsMiddleware] %s", this.b);
            icig icig0 = ((dcyy)this.b).a(this.c.a);
            dcza dcza0 = new dcza(this.d);
            this.a = 1;
            if(icig0.oR(dcza0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

