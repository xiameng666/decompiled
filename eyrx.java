import java.util.Map;

final class eyrx extends ibsl implements ibtw {
    Object a;
    int b;
    final iccs c;
    final eysa d;
    final exwv e;

    public eyrx(iccs iccs0, eysa eysa0, exwv exwv0, ibrl ibrl0) {
        this.c = iccs0;
        this.d = eysa0;
        this.e = exwv0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyrx)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyrx(this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        boolean z = true;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                this.b = 1;
                object0 = this.c.n(this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_12;
            }
            case 1: {
                ibnx.b(object0);
            label_12:
                Map map0 = ((exxc)object0).b;
                eysa eysa0 = this.d;
                exwv exwv0 = this.e;
                eysa0.w(ibqg.f(eysa0.l(), exwv0));
                switch(((exxc)object0).a.ordinal()) {
                    case 0: {
                        this.a = map0;
                        this.b = 3;
                        if(eysa0.c(exwv0, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 3: {
                        eysa0.x(ibpo.al(eysa0.k(), exwv0));
                        this.a = map0;
                        this.b = 2;
                        if(eysa0.c(exwv0, this) == object1) {
                            return object1;
                        }
                    }
                }
                object2 = map0;
                break;
            }
            case 2: {
                object2 = this.a;
                ibnx.b(object0);
                break;
            }
            default: {
                object2 = this.a;
                ibnx.b(object0);
            }
        }
        Boolean boolean0 = (Boolean)((Map)object2).get(exmq.b);
        boolean z1 = boolean0 == null ? false : boolean0.booleanValue();
        eysa eysa1 = this.d;
        if(!z1 || !holo.e() || eysa1.d.b(exjx.f) == null) {
            z = false;
        }
        eysa1.r(z);
        ((ggtj)eysa1.e.h()).B("distancebasedrelock ready %b", Boolean.valueOf(z1));
        return ibom.a;
    }
}

