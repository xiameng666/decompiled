import com.google.android.gms.trustagent.activeunlock.primary.data.discovereddevice.scanner.DiscoveredDevice;
import j..time.Duration;

public final class eywt extends eyvq {
    static final ibxd[] a;
    public static final Duration b;
    public final icnj c;
    public DiscoveredDevice d;
    private final exur e;
    private final gfuv f;
    private final icck g;
    private final ibvv h;
    private iced i;
    private final eydr j;
    private final icnl k;

    static {
        eywt.a = new ibxd[]{new ibut(eywt.class, "screenLockSetUpUiState", "getScreenLockSetUpUiState()Lcom/google/android/gms/trustagent/activeunlock/primary/ui/screenlock/ScreenLockSetUpUiState;", 0)};
        Duration duration0 = Duration.ofSeconds(30L);
        ibuq.e(duration0, "ofSeconds(...)");
        eywt.b = duration0;
    }

    public eywt(exur exur0, eydr eydr0, gfuv gfuv0) {
        this.e = exur0;
        this.j = eydr0;
        this.f = gfuv0;
        this.g = lsc.a(this);
        this.h = new eywq(eyxg.a, this);
        icnl icnl0 = icnm.a(this.y());
        this.k = icnl0;
        this.c = new icmp(icnl0);
    }

    @Override  // eyvq
    protected final exur a() {
        return this.e;
    }

    public final Object b(ibrl ibrl0) {
        eyxg eyxg0;
        Object object3;
        eywr eywr0;
        if((ibrl0 instanceof eywr)) {
            eywr0 = (eywr)ibrl0;
            int v = eywr0.d;
            if((v & 0x80000000) == 0) {
                eywr0 = new eywr(this, ibrl0);
            }
            else {
                eywr0.d = v - 0x80000000;
            }
        }
        else {
            eywr0 = new eywr(this, ibrl0);
        }
        Object object0 = eywr0.b;
        Object object1 = ibrx.a;
        switch(eywr0.d) {
            case 0: {
                ibnx.b(object0);
                iced iced0 = icbb.b(lsc.a(this), null, null, new eyws(this, null), 3);
                eywr0.a = iced0;
                eywr0.d = 1;
                DiscoveredDevice discoveredDevice0 = this.d;
                Object object2 = discoveredDevice0 == null ? exty.c : this.e.c(discoveredDevice0, eywr0);
                if(object2 != object1) {
                    object3 = iced0;
                    object0 = object2;
                    break;
                }
                return object1;
            }
            case 1: {
                object3 = eywr0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((iced)object3).y()) {
            iceb.a(((iced)object3));
        }
        int v1 = ((exty)object0).ordinal();
        switch(v1) {
            case 0: {
                eyxg0 = eyxg.b;
                break;
            }
            case 1: {
                eyxg0 = eyxg.d;
                break;
            }
            default: {
                if(v1 != 2) {
                    throw new ibnq();
                }
                eyxg0 = eyxg.c;
                break;
            }
        }
        this.x(eyxg0);
        return ibom.a;
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
        this.k();
    }

    public final void g() {
        this.h();
        this.x(eyxg.f);
    }

    public final void h() {
        this.z();
        this.d = null;
    }

    public final void i() {
        this.x(eyxg.a);
    }

    @Override  // eyvq
    protected final eydr j() {
        return this.j;
    }

    public final void k() {
        eywv eywv0 = this.y();
        this.k.g(eywv0);
    }

    @Override  // eyvq
    protected final void r() {
        this.g();
    }

    public final void w() {
        this.z();
        this.i = icbb.b(lsc.a(this), null, null, new eywp(this, null), 3);
    }

    public final void x(eyxg eyxg0) {
        this.h.c(eywt.a[0], eyxg0);
    }

    private final eywv y() {
        return new eywv(this.l(), ((eyxg)this.h.a(this, eywt.a[0])));
    }

    private final void z() {
        iced iced0 = this.i;
        if(iced0 != null && iced0.y()) {
            iceb.a(iced0);
        }
    }
}

