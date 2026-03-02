final class deuu extends ibsl implements ibtw {
    int a;
    final ibts b;
    final gei c;

    public deuu(ibts ibts0, gei gei0, ibrl ibrl0) {
        this.b = ibts0;
        this.c = gei0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((deuu)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new deuu(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                long v1 = hvqs.a.aT().ab();
                this.a = 1;
                if(iccv.c(v1, this) != object1) {
                    goto label_8;
                }
                break;
            }
            case 1: {
            label_8:
                this.b.a(deko.a);
                this.a = 2;
                if(gee.a(this.c, this) != object1) {
                    return ibom.a;
                }
                break;
            }
            default: {
                return ibom.a;
            }
        }
        return object1;
    }
}

