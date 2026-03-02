final class ehzd extends ibsl implements ibtw {
    int a;
    final chb b;

    public ehzd(chb chb0, ibrl ibrl0) {
        this.b = chb0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ehzd)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ehzd(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                this.a = 1;
                if(this.b.e(new Float(0.4f), this) != object1) {
                    goto label_7;
                }
                break;
            }
            case 1: {
            label_7:
                cmb cmb0 = chm.c(((int)ibzw.h(ehze.a)), 0, cih.d, 2);
                this.a = 2;
                if(chb.k(this.b, new Float(0.0f), cmb0, null, this, 12) != object1) {
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

