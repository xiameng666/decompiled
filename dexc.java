final class dexc extends ibsl implements ibtw {
    int a;
    final dexd b;
    final ddag c;
    private Object d;

    public dexc(dexd dexd0, ddag ddag0, ibrl ibrl0) {
        this.b = dexd0;
        this.c = ddag0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dexc)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dexc(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                icih icih0 = (icih)this.d;
                deyw deyw0 = this.b.a ? deyw.a : deyx.a;
                deni deni0 = new deni(deyw0);
                this.a = 1;
                if(icih0.a(deni0, this) != object1) {
                    goto label_13;
                }
                break;
            }
            case 1: {
            label_13:
                this.a = 2;
                if(this.c.k(this.b.a, this) != object1) {
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

