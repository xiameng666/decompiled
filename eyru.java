final class eyru extends ibsl implements ibtw {
    int a;
    final eysa b;
    final exwv c;

    public eyru(eysa eysa0, exwv exwv0, ibrl ibrl0) {
        this.b = eysa0;
        this.c = exwv0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyru)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyru(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            eysa eysa0 = this.b;
            eysa0.r(false);
            eyec eyec0 = eysa0.b;
            eyec0.a();
            if(holo.g()) {
                eyec0.c();
            }
            this.a = 1;
            if(eysa0.c.h(this.c, eygd.a, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

