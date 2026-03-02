import com.google.android.gms.common.api.Status;

final class ebtc extends ibsl implements ibtw {
    Object a;
    int b;
    final ebtm c;
    final dygm d;
    final dyna e;
    final dyzx f;
    final Status g;
    final ftgf h;
    final long i;

    public ebtc(ebtm ebtm0, dygm dygm0, dyna dyna0, dyzx dyzx0, Status status0, ftgf ftgf0, long v, ibrl ibrl0) {
        this.c = ebtm0;
        this.d = dygm0;
        this.e = dyna0;
        this.f = dyzx0;
        this.g = status0;
        this.h = ftgf0;
        this.i = v;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ebtc)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ebtc(this.c, this.d, this.e, this.f, this.g, this.h, this.i, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ebtc ebtc0;
        Object object2;
        Object object1 = ibrx.a;
        int v = this.b;
        switch(v) {
            case 0: {
                ibnx.b(object0);
                ebtm ebtm0 = this.c;
                this.a = ebtm0;
                this.b = 1;
                ebtc0 = this;
                object0 = ebte.d(this.e, this.h, this.f, this.d, ebtm0, this.i, ebtc0);
                if(object0 != object1) {
                    object2 = ebtm0;
                    goto label_19;
                }
                break;
            }
            case 1: {
                object2 = this.a;
                ibnx.b(object0);
                ebtc0 = this;
            label_19:
                ebtc0.a = null;
                ebtc0.b = 2;
                if(((ebtm)object2).f(((gjma)object0), ebtc0) != object1) {
                label_22:
                    dygm dygm0 = ebtc0.d;
                    String s = dygm0.g;
                    ibuq.e(s, "getNewBalance(...)");
                    if(!ibzk.D(s)) {
                        ebtc0.c.k(dygm0, ebtc0.e, ebtc0.f.a);
                    }
                    if(new hfuh(hwrz.e().c, dync.a).contains(ebtc0.e)) {
                        return ebtc0.g;
                    }
                    String s1 = ebtc0.c.i();
                    frli frli0 = new dybr(ebtc0.c.d.a, s1).a;
                    ibuq.e(frli0, "protoDataStore");
                    ebtb ebtb0 = new ebtb();
                    ebtc0.b = 3;
                    if(ftqa.b(frli0, ebtb0, ebtc0) != object1) {
                        return ebtc0.g;
                    }
                }
                break;
            }
            default: {
                ibnx.b(object0);
                ebtc0 = this;
                if(v == 2) {
                    goto label_22;
                }
                return ebtc0.g;
            }
        }
        return object1;
    }
}

