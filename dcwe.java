final class dcwe extends ibsl implements ibtw {
    int a;
    final Object b;
    final dcwf c;
    final dixi d;

    public dcwe(Object object0, dcwf dcwf0, dixi dixi0, ibrl ibrl0) {
        this.b = object0;
        this.c = dcwf0;
        this.d = dixi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcwe)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dcwe(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dcvz.a.b().h("[SharingClientMiddleware] %s", this.b);
            icig icig0 = ((dcwb)this.b).a(this.c.a);
            dcwd dcwd0 = new dcwd(this.d);
            this.a = 1;
            if(icig0.oR(dcwd0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

