final class deik extends ibsl implements ibtw {
    int a;
    final ddag b;
    private Object c;

    public deik(ddag ddag0, ibrl ibrl0) {
        this.b = ddag0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((deik)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new deik(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                icih icih0 = (icih)this.c;
                demz demz0 = new demz(true);
                this.a = 1;
                if(icih0.a(demz0, this) != object1) {
                    goto label_9;
                }
                break;
            }
            case 1: {
            label_9:
                this.a = 2;
                if(this.b.g(this) != object1) {
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

