import com.google.android.gms.trustagent.activeunlock.primary.data.discovereddevice.scanner.DiscoveredDevice;

public final class eyzb extends eyvq {
    public DiscoveredDevice a;
    public final icnj b;
    private final exur c;
    private final eyny d;
    private final exki e;
    private final gfuv f;
    private final icck g;
    private final eydr h;
    private final icnl i;

    public eyzb(exur exur0, eyny eyny0, exki exki0, eydr eydr0, gfuv gfuv0) {
        ibuq.f(eyny0, "deeplinkArguments");
        ibuq.f(exki0, "rangingCapabilityRepository");
        super();
        this.c = exur0;
        this.d = eyny0;
        this.e = exki0;
        this.h = eydr0;
        this.f = gfuv0;
        this.g = lsc.a(this);
        icnl icnl0 = icnm.a(this.h());
        this.i = icnl0;
        this.b = new icmp(icnl0);
    }

    @Override  // eyvq
    protected final exur a() {
        return this.c;
    }

    public final Object b(exjx exjx0, ibrl ibrl0) {
        eyyz eyyz0;
        if((ibrl0 instanceof eyyz)) {
            eyyz0 = (eyyz)ibrl0;
            int v = eyyz0.c;
            if((v & 0x80000000) == 0) {
                eyyz0 = new eyyz(this, ibrl0);
            }
            else {
                eyyz0.c = v - 0x80000000;
            }
        }
        else {
            eyyz0 = new eyyz(this, ibrl0);
        }
        Object object0 = eyyz0.a;
        Object object1 = ibrx.a;
        boolean z = true;
        switch(eyyz0.c) {
            case 0: {
                ibnx.b(object0);
                eyyz0.d = exjx0;
                eyyz0.c = 1;
                object0 = this.e.a();
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                exjx0 = eyyz0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        exjy exjy0 = (exjy)exkh.c(((exod)object0)).get(exjx0);
        if(exjy0 == null || exjy0 == exjy.a) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override  // eyvq
    protected final gfuv c() {
        return this.f;
    }

    @Override  // eyvq
    protected final icck e() {
        return this.g;
    }

    @Override  // eyvq
    protected final void f() {
        eyyx eyyx0 = this.h();
        this.i.g(eyyx0);
    }

    public final Object g(ibrl ibrl0) {
        eyzb eyzb0;
        String s1;
        String s;
        eyza eyza0;
        if((ibrl0 instanceof eyza)) {
            eyza0 = (eyza)ibrl0;
            int v = eyza0.c;
            if((v & 0x80000000) == 0) {
                eyza0 = new eyza(this, ibrl0);
            }
            else {
                eyza0.c = v - 0x80000000;
            }
        }
        else {
            eyza0 = new eyza(this, ibrl0);
        }
        Object object0 = eyza0.a;
        Object object1 = ibrx.a;
        switch(eyza0.c) {
            case 0: {
                ibnx.b(object0);
                s = this.d.a;
                if(s == null) {
                    return eyyy.a;
                }
                if(this.a == null) {
                    eyza0.d = s;
                    eyza0.e = this;
                    eyza0.c = 1;
                    Object object2 = this.c.f(s, eyza0);
                    if(object2 == object1) {
                        return object1;
                    }
                    s1 = s;
                    object0 = object2;
                    eyzb0 = this;
                    goto label_30;
                }
                goto label_32;
            }
            case 1: {
                eyzb0 = eyza0.e;
                s1 = eyza0.d;
                ibnx.b(object0);
            label_30:
                eyzb0.a = (DiscoveredDevice)object0;
                s = s1;
            label_32:
                DiscoveredDevice discoveredDevice0 = this.a;
                if(discoveredDevice0 == null) {
                    eyza0.d = null;
                    eyza0.e = null;
                    eyza0.c = 2;
                    object0 = this.c.a.b(s, eyza0);
                    if(object0 == object1) {
                        return object1;
                    }
                    return ((Boolean)object0).booleanValue() ? eyyy.b : eyyy.d;
                }
                eyza0.d = null;
                eyza0.e = null;
                eyza0.c = 3;
                return this.m(discoveredDevice0, eyza0) == object1 ? object1 : eyyy.c;
            }
            case 2: {
                ibnx.b(object0);
                return ((Boolean)object0).booleanValue() ? eyyy.b : eyyy.d;
            }
            case 3: {
                ibnx.b(object0);
                return eyyy.c;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private final eyyx h() {
        boolean z = this.l().a != eyuj.c;
        return this.d.a == null ? new eyyx(new eyyw(z, 0x7F150815), this.l()) : new eyyx(new eyyw(z, 0x7F15080A), this.l());  // string:common_continue "Continue"
    }

    @Override  // eyvq
    protected final eydr j() {
        return this.h;
    }
}

