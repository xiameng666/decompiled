final class ctly extends ibsl implements ibtw {
    int a;
    final ctlz b;
    final ctna c;
    final ctmn d;

    public ctly(ctmn ctmn0, ctlz ctlz0, ctna ctna0, ibrl ibrl0) {
        this.d = ctmn0;
        this.b = ctlz0;
        this.c = ctna0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctly)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctly(this.d, this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                ctlx ctlx0 = new ctlx(this.b.a);
                this.a = 1;
                ctzi ctzi0 = new ctzi(ctlx0);
                ctzl ctzl0 = new ctzl(new icht(new ctoh(((ctoq)this.d.a.a), ctzi0, null)));
                if(ctzl0 != object1) {
                    object0 = ctzl0;
                    goto label_11;
                }
                break;
            }
            case 1: {
            label_11:
                icjm icjm0 = new icjm(((icig)object0), new ctlt(this.c, null));
                ctlu ctlu0 = new ctlu(this.c);
                this.a = 2;
                if(icjm0.oR(ctlu0, this) != object1) {
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

