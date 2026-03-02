import j..time.Duration;

final class eyjm extends ibsl implements ibtw {
    Object a;
    Object b;
    int c;
    final eyjw d;
    final exwv e;
    final eyce f;
    final exjx g;
    final eygi h;
    final eyjz i;
    final icbr j;
    private Object k;

    public eyjm(eyjw eyjw0, exwv exwv0, eyce eyce0, exjx exjx0, eygi eygi0, icbr icbr0, eyjz eyjz0, ibrl ibrl0) {
        this.d = eyjw0;
        this.e = exwv0;
        this.f = eyce0;
        this.g = exjx0;
        this.h = eygi0;
        this.j = icbr0;
        this.i = eyjz0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyjm)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new eyjm(this.d, this.e, this.f, this.g, this.h, this.j, this.i, ibrl0);
        ibrl1.k = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        eyfr eyfr1;
        Object object4;
        Object object3;
        Object object2;
        exjv exjv0;
        Object object1 = ibrx.a;
        boolean z = false;
        switch(this.c) {
            case 0: {
                ibnx.b(object0);
                icck icck0 = (icck)this.k;
                eyjw eyjw0 = this.d;
                eyce eyce0 = this.f;
                ibuq.e(eyjw0.g, "context");
                if(!eyef.a(eyjw0.g) && !homc.k()) {
                    ((ggtj)eyjw0.d.h()).x("Defaulting RangingConfig");
                    exjv0 = new exjp(null);
                }
                else {
                    exjv0 = eyce0.a();
                }
                bboh bboh0 = eyjw0.d;
                ((ggtj)bboh0.h()).B("RangingConfig=%s", exjv0.toString());
                exwv exwv0 = this.e;
                eyfl eyfl0 = ((eyfm)eyjw0.j.a.a).a();
                gfuv gfuv0 = exei.a();
                ibuq.f(this.g, "rangingMethod");
                eyfr eyfr0 = new eyfr(eyfl0, gfuv0, exwv0.d, this.g);
                Duration duration0 = eyjw0.k(exjv0) ? exjv0.b() : null;
                eygi eygi0 = this.h;
                iccs iccs0 = icbb.a(icck0, null, null, new eyjl(eyce0, exwv0, eyfr0, duration0, eygi0, null), 3);
                if(eyjw0.k(exjv0)) {
                    eygi0.b(exjo.c);
                    eyjw0.h = eyjw0.f ? eyiz.c : eyiz.b;
                    ((ggtj)bboh0.h()).B("relockDistanceCrossedDeferred created, changing state to %s.", eyjw0.h);
                    icbr icbr0 = new icbr();
                    icbr0.t(new eyix(eyjw0, iccs0, eyce0));
                    object2 = icbr0;
                }
                else {
                    eyjw0.h = eyiz.a;
                    eygi0.b(exjo.b);
                    object2 = null;
                }
                ((ggtj)bboh0.h()).z("requestUnlock, relockDistanceCrossedDeferred is: %d", (object2 == null ? 0 : object2.hashCode()));
                exol exol0 = exjv0.a();
                this.k = eyfr0;
                this.a = iccs0;
                this.b = object2;
                this.c = 1;
                object3 = eyjw0.a.r(exwv0, this.j, exol0, ((icbr)object2), this);
                if(object3 != object1) {
                    object4 = iccs0;
                    eyfr1 = eyfr0;
                    break;
                }
                return object1;
            }
            case 1: {
                Object object5 = this.b;
                Object object6 = this.a;
                eyfr eyfr2 = (eyfr)this.k;
                ibnx.b(object0);
                object2 = object5;
                eyfr1 = eyfr2;
                object3 = object0;
                object4 = object6;
                break;
            }
            default: {
                ibnx.b(object0);
                return object0;
            }
        }
        eyjw eyjw1 = this.d;
        exwv exwv1 = this.e;
        icbr icbr1 = this.j;
        exjx exjx0 = this.g;
        eyjz eyjz0 = this.i;
        eyjx eyjx0 = eyjw.n(((exzg)object3).a);
        eyjx eyjx1 = eyjx.a;
        if(eyjx0 != eyjx1) {
            icbr1 = null;
        }
        iccs iccs1 = eyjx0 == eyjx1 ? ((exzg)object3).b : null;
        exod exod0 = ((exzg)object3).d;
        if(object2 != null) {
            z = true;
        }
        Duration duration1 = this.h.d.d();
        this.h.h.V(duration1);
        this.k = null;
        this.a = null;
        this.b = null;
        this.c = 2;
        Object object7 = eyjw1.a(new eyja(eyjx0, exwv1, icbr1, iccs1, exjx0, exod0, eyjz0, Boolean.valueOf(z)), ((iccs)object4), eyfr1, this.f, exjx0, this);
        return object7 == object1 ? object1 : object7;
    }
}

