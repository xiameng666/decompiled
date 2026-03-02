final class eyje extends ibsl implements ibtw {
    int a;
    final eyja b;
    final exwv c;
    final eyjw d;
    final exwv e;

    public eyje(eyja eyja0, exwv exwv0, eyjw eyjw0, exwv exwv1, ibrl ibrl0) {
        this.b = eyja0;
        this.c = exwv0;
        this.d = eyjw0;
        this.e = exwv1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyje)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyje(this.b, this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            exod exod0 = this.b.e;
            if(exod0 != null) {
                exwv exwv0 = this.c;
                eyjw eyjw0 = this.d;
                exwv exwv1 = this.e;
                if(exwv0 != null) {
                    this.a = 1;
                    if(eyjw0.b.c(exwv0, exwv1.k, exod0, this) == object1) {
                        return object1;
                    }
                }
            }
        }
        return ibom.a;
    }
}

