final class dcxp extends ibsl implements ibtw {
    int a;
    final Object b;
    final dcxq c;
    final dixi d;

    public dcxp(Object object0, dcxq dcxq0, dixi dixi0, ibrl ibrl0) {
        this.b = object0;
        this.c = dcxq0;
        this.d = dixi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcxp)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dcxp(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dcvz.a.b().h("[RadioStatusMiddleware] %s", this.b);
            icig icig0 = ((dcxm)this.b).a(this.c.a);
            dcxo dcxo0 = new dcxo(this.d);
            this.a = 1;
            if(icig0.oR(dcxo0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

