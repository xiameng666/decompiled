import com.google.android.gms.trustagent.activeunlock.primary.data.discovereddevice.scanner.DiscoveredDevice;
import j..time.Duration;

public abstract class eyvq extends lsb {
    private static final Duration a;
    private final lqj b;
    static final ibxd[] l;
    public final ibvv m;
    public final lqi n;
    public final lqd o;

    static {
        eyvq.l = new ibxd[]{new ibut(eyvq.class, "enrollmentUiState", "getEnrollmentUiState()Lcom/google/android/gms/trustagent/activeunlock/primary/ui/enrollment/EnrollmentUiState;", 0)};
        Duration duration0 = Duration.ofMillis(2000L);
        ibuq.e(duration0, "ofMillis(...)");
        eyvq.a = duration0;
    }

    public eyvq() {
        this.m = new eyvp(new eyuk(eyuj.a, null, null, 6), this);
        eyuu eyuu0 = new eyuu(this);
        this.b = eyuu0;
        lqi lqi0 = new lqi(new eyuk(eyuj.a, null, null, 6));
        lqi0.ih(eyuu0);
        this.n = lqi0;
        this.o = lqi0;
    }

    protected abstract exur a();

    protected abstract gfuv c();

    protected abstract icck e();

    protected abstract void f();

    protected abstract eydr j();

    @Override  // lsb
    public final void km() {
        this.n.j(this.b);
    }

    public final eyuk l() {
        return (eyuk)this.m.a(this, eyvq.l[0]);
    }

    public final Object m(DiscoveredDevice discoveredDevice0, ibrl ibrl0) {
        eyve eyve0;
        DiscoveredDevice discoveredDevice1 = discoveredDevice0;
        if((ibrl0 instanceof eyve)) {
            eyve0 = (eyve)ibrl0;
            int v = eyve0.c;
            if((v & 0x80000000) == 0) {
                eyve0 = new eyve(this, ibrl0);
            }
            else {
                eyve0.c = v - 0x80000000;
            }
        }
        else {
            eyve0 = new eyve(this, ibrl0);
        }
        Object object0 = eyve0.a;
        Object object1 = ibrx.a;
        switch(eyve0.c) {
            case 0: {
                ibnx.b(object0);
                if(discoveredDevice1 == null) {
                    eyur eyur0 = new eyur(this);
                    eytx eytx0 = new eytx(eytw.h, null, null, null, null, null, null, eyur0, null, 382);
                    eyuk eyuk0 = new eyuk(eyuj.d, eytx0, null, 4);
                    this.n.l(eyuk0);
                    return ibom.a;
                }
                exur exur0 = this.a();
                eyve0.d = discoveredDevice1;
                eyve0.c = 1;
                object0 = exur0.b(discoveredDevice1.c, eyve0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_29;
            }
            case 1: {
                discoveredDevice1 = eyve0.d;
                ibnx.b(object0);
            label_29:
                if(((extx)object0) != extx.c) {
                    eyus eyus0 = new eyus(this, discoveredDevice1);
                    eyut eyut0 = new eyut(this);
                    eytx eytx1 = new eytx(eytw.b, discoveredDevice1.b, null, eyus0, null, null, null, eyut0, null, 372);
                    eyuk eyuk1 = new eyuk(eyuj.d, eytx1, null, 4);
                    this.n.l(eyuk1);
                    return ibom.a;
                }
                eyve0.d = null;
                eyve0.c = 2;
                return this.o(discoveredDevice1, false, eyve0) == object1 ? object1 : ibom.a;
            }
            case 2: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object n(Duration duration0, ibts ibts0, ibrl ibrl0) {
        gfug gfug0;
        eyvg eyvg0;
        if((ibrl0 instanceof eyvg)) {
            eyvg0 = (eyvg)ibrl0;
            int v = eyvg0.d;
            if((v & 0x80000000) == 0) {
                eyvg0 = new eyvg(this, ibrl0);
            }
            else {
                eyvg0.d = v - 0x80000000;
            }
        }
        else {
            eyvg0 = new eyvg(this, ibrl0);
        }
        Object object0 = eyvg0.b;
        Object object1 = ibrx.a;
        switch(eyvg0.d) {
            case 0: {
                ibnx.b(object0);
                gfug0 = gfug.c(this.c());
                eyvg0.a = duration0;
                eyvg0.e = gfug0;
                eyvg0.d = 1;
                object0 = ibts0.a(eyvg0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_24;
            }
            case 1: {
                gfug0 = eyvg0.e;
                duration0 = (Duration)eyvg0.a;
                ibnx.b(object0);
            label_24:
                gfug0.g();
                Duration duration1 = duration0.minus(gfug0.d());
                Duration duration2 = Duration.ZERO;
                ibuq.e(duration2, "ZERO");
                ibuq.f(duration1, "<this>");
                ibuq.f(duration2, "minimumValue");
                if(duration1.compareTo(duration2) < 0) {
                    duration1 = duration2;
                }
                ibuq.e(duration1, "coerceAtLeast(...)");
                eyvg0.a = object0;
                eyvg0.e = null;
                eyvg0.d = 2;
                return glya.a(duration1, eyvg0) == object1 ? object1 : object0;
            }
            case 2: {
                Object object2 = eyvg0.a;
                ibnx.b(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object o(DiscoveredDevice discoveredDevice0, boolean z, ibrl ibrl0) {
        lqi lqi2;
        lqi lqi1;
        eytw eytw1;
        eyuk eyuk1;
        lqi lqi0;
        exut exut0;
        eyvi eyvi0;
        DiscoveredDevice discoveredDevice1 = discoveredDevice0;
        if((ibrl0 instanceof eyvi)) {
            eyvi0 = (eyvi)ibrl0;
            int v = eyvi0.d;
            if((v & 0x80000000) == 0) {
                eyvi0 = new eyvi(this, ibrl0);
            }
            else {
                eyvi0.d = v - 0x80000000;
            }
        }
        else {
            eyvi0 = new eyvi(this, ibrl0);
        }
        Object object0 = eyvi0.b;
        Object object1 = ibrx.a;
    alab1:
        switch(eyvi0.d) {
            case 0: {
                ibnx.b(object0);
                eyul eyul0 = new eyul(this);
                eytx eytx0 = new eytx(eytw.e, null, null, null, null, null, null, eyul0, null, 382);
                eyuk eyuk0 = new eyuk(eyuj.c, eytx0, null, 4);
                this.n.l(eyuk0);
                if(z) {
                    eyvl eyvl0 = new eyvl(this, discoveredDevice1, null);
                    eyvi0.a = discoveredDevice1;
                    eyvi0.d = 1;
                    object0 = eyvq.v(this, eyvl0, eyvi0);
                    if(object0 == object1) {
                        return object1;
                    }
                }
                else {
                    exur exur0 = this.a();
                    eyvi0.a = discoveredDevice1;
                    eyvi0.d = 2;
                    object0 = exur0.e(discoveredDevice1, eyvi0);
                    if(object0 == object1) {
                        return object1;
                    }
                }
                exut0 = (exut)object0;
                goto label_41;
            }
            case 1: {
                discoveredDevice1 = (DiscoveredDevice)eyvi0.a;
                ibnx.b(object0);
                exut0 = (exut)object0;
                goto label_41;
            }
            case 2: {
                discoveredDevice1 = (DiscoveredDevice)eyvi0.a;
                ibnx.b(object0);
                exut0 = (exut)object0;
            label_41:
                lqi0 = this.n;
                switch(exut0.ordinal()) {
                    case 0: {
                        eyuk1 = new eyuk(eyuj.e, null, null, 6);
                        break alab1;
                    }
                    case 6: {
                        eyuk1 = new eyuk(eyuj.f, null, null, 6);
                        break alab1;
                    }
                    case 7: {
                        eyvd eyvd0 = new eyvd(this, discoveredDevice1);
                        eyum eyum0 = new eyum(this);
                        eytx eytx2 = new eytx(eytw.i, null, null, null, null, eyvd0, null, eyum0, null, 350);
                        eyuk1 = new eyuk(eyuj.d, eytx2, null, 4);
                        break alab1;
                    }
                    case 3: 
                    case 11: {
                        eytw eytw0 = eytw.f;
                        eydr eydr0 = this.j();
                        eyvi0.a = lqi0;
                        eyvi0.e = eytw0;
                        eyvi0.d = 4;
                        Object object2 = eydr0.a(discoveredDevice1.a, eyvi0);
                        if(object2 != object1) {
                            eytw1 = eytw0;
                            lqi1 = lqi0;
                            object0 = object2;
                            goto label_93;
                        }
                        return object1;
                    }
                    case 1: 
                    case 2: 
                    case 4: 
                    case 5: 
                    case 8: 
                    case 10: 
                    case 20: 
                    case 21: 
                    case 22: {
                        eyun eyun0 = new eyun(this, discoveredDevice1);
                        eyuv eyuv0 = new eyuv(this);
                        eyuw eyuw0 = new eyuw(this);
                        eytx eytx1 = new eytx(eytw.h, null, null, null, null, eyun0, eyuv0, eyuw0, null, 286);
                        eyuk1 = new eyuk(eyuj.d, eytx1, null, 4);
                        break alab1;
                    }
                    case 23: {
                        eyuz eyuz0 = new eyuz(this);
                        eyva eyva0 = new eyva(this, discoveredDevice1);
                        eytx eytx3 = new eytx(eytw.j, null, null, null, null, null, null, eyuz0, eyva0, 0x7E);
                        eyuk1 = new eyuk(eyuj.d, eytx3, null, 4);
                        break alab1;
                    }
                    case 9: 
                    case 12: 
                    case 13: 
                    case 14: 
                    case 15: 
                    case 16: 
                    case 17: 
                    case 18: 
                    case 19: 
                    case 24: 
                    case 25: 
                    case 26: 
                    case 27: 
                    case 28: {
                        eydr eydr1 = this.j();
                        eyvi0.a = lqi0;
                        eyvi0.d = 3;
                        object0 = eydr1.a(discoveredDevice1.a, eyvi0);
                        if(object0 != object1) {
                            lqi2 = lqi0;
                            goto label_85;
                        }
                        return object1;
                    }
                    default: {
                        throw new ibnq();
                    }
                }
            }
            case 3: {
                lqi2 = (lqi)eyvi0.a;
                ibnx.b(object0);
            label_85:
                eytx eytx4 = new eytx(eytw.g, null, (((eydo)object0) == null ? null : ((eydo)object0).a), null, new eyux(this, ((eydo)object0)), null, null, new eyuy(this), null, 362);
                eyuk1 = new eyuk(eyuj.d, eytx4, null, 4);
                lqi0 = lqi2;
                break;
            }
            case 4: {
                eytw eytw2 = eyvi0.e;
                lqi1 = (lqi)eyvi0.a;
                ibnx.b(object0);
                eytw1 = eytw2;
            label_93:
                eytx eytx5 = new eytx(eytw1, null, (((eydo)object0) == null ? null : ((eydo)object0).a), null, null, null, new eyvb(this), new eyvc(this), null, 314);
                eyuk1 = new eyuk(eyuj.d, eytx5, null, 4);
                lqi0 = lqi1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        lqi0.l(eyuk1);
        return ibom.a;
    }

    public final Object p(DiscoveredDevice discoveredDevice0, ibrl ibrl0) {
        eyvm eyvm0;
        DiscoveredDevice discoveredDevice1 = discoveredDevice0;
        if((ibrl0 instanceof eyvm)) {
            eyvm0 = (eyvm)ibrl0;
            int v = eyvm0.c;
            if((v & 0x80000000) == 0) {
                eyvm0 = new eyvm(this, ibrl0);
            }
            else {
                eyvm0.c = v - 0x80000000;
            }
        }
        else {
            eyvm0 = new eyvm(this, ibrl0);
        }
        Object object0 = eyvm0.a;
        Object object1 = ibrx.a;
        switch(eyvm0.c) {
            case 0: {
                ibnx.b(object0);
                eyuo eyuo0 = new eyuo(this);
                eytx eytx0 = new eytx(eytw.c, null, null, null, null, null, null, eyuo0, null, 382);
                eyuk eyuk0 = new eyuk(eyuj.b, eytx0, null, 4);
                this.n.l(eyuk0);
                eyvn eyvn0 = new eyvn(this, discoveredDevice1, null);
                eyvm0.d = discoveredDevice1;
                eyvm0.c = 1;
                object0 = eyvq.v(this, eyvn0, eyvm0);
                if(object0 != object1) {
                    goto label_27;
                }
                return object1;
            }
            case 1: {
                discoveredDevice1 = eyvm0.d;
                ibnx.b(object0);
            label_27:
                switch(((extx)object0).ordinal()) {
                    case 0: 
                    case 1: {
                        eyup eyup0 = new eyup(this, discoveredDevice1);
                        eyuq eyuq0 = new eyuq(this);
                        eytx eytx1 = new eytx(eytw.d, null, null, null, null, eyup0, null, eyuq0, null, 350);
                        eyuk eyuk1 = new eyuk(eyuj.d, eytx1, null, 4);
                        this.n.l(eyuk1);
                        return ibom.a;
                    }
                    case 2: {
                        eyvm0.d = null;
                        eyvm0.c = 2;
                        if(this.o(discoveredDevice1, true, eyvm0) != object1) {
                            return ibom.a;
                        }
                        break;
                    }
                    default: {
                        throw new ibnq();
                    }
                }
                return object1;
            }
            case 2: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final void q() {
        eyuk eyuk0 = new eyuk(eyuj.a, null, null, 6);
        this.n.l(eyuk0);
    }

    protected void r() {
    }

    static Object v(eyvq eyvq0, ibts ibts0, ibrl ibrl0) {
        return eyvq0.n(eyvq.a, ibts0, ibrl0);
    }
}

