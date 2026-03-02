final class lbg extends ibsl implements ibtw {
    Object a;
    int b;
    final lcc c;
    private Object d;

    public lbg(lcc lcc0, ibrl ibrl0) {
        this.c = lcc0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((lbg)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new lbg(this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object3;
        icih icih2;
        icih icih1;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                icih icih0 = (icih)this.d;
                this.d = icih0;
                this.b = 1;
                Object object2 = icbd.a(this.c.b.c(), new lbv(this.c, null), this);
                if(object2 == object1) {
                    return object1;
                }
                icih1 = icih0;
                object0 = object2;
                goto label_15;
            }
            case 1: {
                icih1 = (icih)this.d;
                ibnx.b(object0);
            label_15:
                if((((lec)object0) instanceof lah)) {
                    this.d = icih1;
                    this.a = (lec)object0;
                    this.b = 2;
                    if(icih1.a(((lah)(((lec)object0))).a, this) != object1) {
                        icih2 = icih1;
                        object3 = (lec)object0;
                        goto label_33;
                    }
                    return object1;
                }
                else {
                    if((((lec)object0) instanceof lef)) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    if((((lec)object0) instanceof ldo)) {
                        throw ((ldo)(((lec)object0))).a;
                    }
                    if(!(((lec)object0) instanceof lcs)) {
                        throw new ibnq();
                    }
                }
                break;
            }
            case 2: {
                object3 = this.a;
                icih2 = (icih)this.d;
                ibnx.b(object0);
            label_33:
                icjm icjm0 = new icjm(new lbf(new ickb(new ickk(new icjo(new laz(this.c, null), this.c.d.a), new lba(null)), new lbb(((lec)object3), null))), new lbc(this.c, null));
                this.d = null;
                this.a = null;
                this.b = 3;
                if(icir.c(icih2, icjm0, this) == object1) {
                    return object1;
                }
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        return ibom.a;
    }
}

