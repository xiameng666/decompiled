final class lbn extends ibsl implements ibtw {
    int a;
    final lcc b;

    public lbn(lcc lcc0, ibrl ibrl0) {
        this.b = lcc0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((lbn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new lbn(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                this.a = 1;
                Object object2 = this.b.g.a.F(this);
                if(object2 != object1) {
                    object2 = ibom.a;
                }
                if(object2 != object1) {
                    goto label_10;
                }
                break;
            }
            case 1: {
            label_10:
                icig icig0 = iciv.b(this.b.c().e());
                lbm lbm0 = new lbm(this.b);
                this.a = 2;
                if(icig0.oR(lbm0, this) != object1) {
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

