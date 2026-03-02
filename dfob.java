final class dfob extends ibsl implements ibtw {
    int a;
    final ddag b;
    final dfoc c;
    private Object d;

    public dfob(ddag ddag0, dfoc dfoc0, ibrl ibrl0) {
        this.b = ddag0;
        this.c = dfoc0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dfob)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dfob(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        icih icih0;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                icih0 = (icih)this.d;
                this.d = icih0;
                this.a = 1;
                object0 = icll.a(this.b.g, this);
                if(object0 != object1) {
                    goto label_13;
                }
                break;
            }
            case 1: {
                icih0 = (icih)this.d;
                ibnx.b(object0);
            label_13:
                if(this.c.a == 1 && !((Boolean)object0).booleanValue()) {
                    this.d = null;
                    this.a = 2;
                    return icih0.a(dfom.a, this) != object1 ? ibom.a : object1;
                }
                this.d = null;
                this.a = 3;
                if(this.b.c(this) != object1) {
                    goto label_23;
                }
                break;
            }
            case 3: {
                ibnx.b(object0);
            label_23:
                this.d = null;
                this.a = 4;
                if(this.b.m(this.c.a, this) != object1) {
                    return ibom.a;
                }
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        return object1;
    }
}

