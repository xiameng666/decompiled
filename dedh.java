import com.google.android.gms.nearby.sharing.ShareTarget;

final class dedh extends ibsl implements ibtw {
    Object a;
    int b;
    final dedi c;
    final dcmf d;
    private Object e;

    public dedh(dedi dedi0, dcmf dcmf0, ibrl ibrl0) {
        this.c = dedi0;
        this.d = dcmf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dedh)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dedh(this.c, this.d, ibrl0);
        ibrl1.e = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object4;
        icih icih2;
        Object object2;
        icih icih0;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                icih0 = (icih)this.e;
                dems dems0 = new dems(dffg.a(this.c.a, dffm.a, false, 0x77F));
                this.e = icih0;
                object2 = this.c.a.k;
                this.a = object2;
                this.b = 1;
                if(icih0.a(dems0, this) == object1) {
                    return object1;
                }
                goto label_17;
            }
            case 1: {
                object2 = this.a;
                icih icih1 = (icih)this.e;
                ibnx.b(object0);
                icih0 = icih1;
            label_17:
                evql evql0 = this.d.w(((ShareTarget)object2), this.c.b, ((ShareTarget)object2).q);
                this.e = icih0;
                this.a = object2;
                this.b = 2;
                Object object3 = dcwp.c(evql0, this);
                if(object3 == object1) {
                    return object1;
                }
                icih2 = icih0;
                object4 = object3;
                break;
            }
            case 2: {
                object2 = this.a;
                icih2 = (icih)this.e;
                ibnx.b(object0);
                object4 = ((ibnw)object0).a;
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        dedi dedi0 = this.c;
        Throwable throwable0 = ibnw.a(object4);
        if(throwable0 != null) {
            int v = dcwk.a(throwable0);
            if(v != 0x8AB7) {
                if((throwable0 instanceof aztb) && v == 13) {
                    dcvz.a.b().f(throwable0).h("failed to send to target %s", object2);
                }
                else {
                    dcvz.a.c().f(throwable0).h("unexpected error sending to target %s", object2);
                }
                dems dems1 = new dems(dffg.a(dedi0.a, dffp.a, false, 0x77F));
                this.e = object4;
                this.a = null;
                this.b = 3;
                if(icih2.a(dems1, this) == object1) {
                    return object1;
                }
            }
        }
        return ibom.a;
    }
}

