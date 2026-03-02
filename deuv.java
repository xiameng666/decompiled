final class deuv extends ibsl implements ibtw {
    int a;
    final gei b;

    public deuv(gei gei0, ibrl ibrl0) {
        this.b = gei0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((deuv)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new deuv(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                long v1 = hvqs.a.aT().bU();
                this.a = 1;
                if(iccv.c(v1, this) != object1) {
                    goto label_8;
                }
                break;
            }
            case 1: {
            label_8:
                this.a = 2;
                if(gee.a(this.b, this) != object1) {
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

