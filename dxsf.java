final class dxsf extends ibsl implements ibtw {
    Object a;
    int b;
    final dxst c;

    public dxsf(dxst dxst0, ibrl ibrl0) {
        this.c = dxst0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dxsf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dxsf(this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object3;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                object3 = this.c;
                ((dxmi)object3).m();
                if(dxst.J(object3.h)) {
                    this.a = object3;
                    this.b = 1;
                    object0 = ((dxst)object3).v(this);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_16;
                }
                break;
            }
            case 1: {
                object3 = this.a;
                ibnx.b(object0);
            label_16:
                ((dxst)object3).m = (fsxo)object0;
                dxst dxst0 = this.c;
                if(dxst0.m == null) {
                    ((ggtj)dxmi.a.j()).A("No bundle found for card id: %s", dxst0.h.p);
                    dxmi.q(dxst0, null, null, hagu.c, 3);
                    return ibom.a;
                }
                break;
            }
            default: {
                object2 = this.a;
                ibnx.b(object0);
                goto label_30;
            }
        }
        dxst dxst1 = this.c;
        this.a = dxst1;
        this.b = 2;
        Object object4 = dxst1.w(this);
        if(object4 == object1) {
            return object1;
        }
        object2 = dxst1;
        object0 = object4;
    label_30:
        ((dxst)object2).n = (gtqs)object0;
        dxst dxst2 = this.c;
        if(dxst2.n == null) {
            dxmi.q(dxst2, null, null, hagu.b, 3);
            return ibom.a;
        }
        dxst2.l(dxmi.n(dxst2));
        return ibom.a;
    }
}

