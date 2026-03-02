public final class eyjo extends ibsl implements ibtw {
    int a;
    final eyjw b;

    public eyjo(eyjw eyjw0, ibrl ibrl0) {
        this.b = eyjw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyjo)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyjo(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = this.b.d(this);
            if(object0 == object1) {
                return object1;
            }
        }
        if(((exwv)object0) != null) {
            eyjw eyjw0 = this.b;
            exzb exzb0 = eyjw0.a.a(((exwv)object0));
            if(ibuq.m((exzb0 == null ? null : Boolean.valueOf(exzb0.d.b(exhp.d))), Boolean.valueOf(true))) {
                ((ggtj)eyjw0.d.h()).x("Current unlock monitoring was completed due to device locked.");
            }
        }
        return ibom.a;
    }
}

