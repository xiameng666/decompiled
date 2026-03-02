import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import jeb.synthetic.TWR;

public abstract class ggsl implements ggsu, ggtu {
    private static final String a;
    private ggso b;
    private Object[] c;
    public final Level e;
    public final long f;
    public ggsk g;
    public ggtc h;
    public ggux i;

    static {
        ggsl.a = new String();
    }

    protected ggsl(Level level0) {
        long v = gguv.b();
        super();
        this.g = null;
        this.b = null;
        this.h = null;
        this.i = null;
        this.c = null;
        ggwv.d(level0, "level");
        this.e = level0;
        this.f = v;
    }

    @Override  // ggsu
    public final void A(String s, long v) {
        if(this.au()) {
            this.l(s, new Object[]{v});
        }
    }

    @Override  // ggsu
    public final void B(String s, Object object0) {
        if(this.au()) {
            this.l(s, new Object[]{object0});
        }
    }

    @Override  // ggsu
    public final void C(String s, short v) {
        if(this.au()) {
            this.l(s, new Object[]{v});
        }
    }

    @Override  // ggsu
    public final void D(String s, byte b, byte b1) {
        if(this.au()) {
            this.l(s, new Object[]{b, b1});
        }
    }

    @Override  // ggsu
    public final void E(String s, double f, double f1) {
        if(this.au()) {
            this.l(s, new Object[]{f, f1});
        }
    }

    @Override  // ggsu
    public final void F(String s, int v, int v1) {
        if(this.au()) {
            this.l(s, new Object[]{v, v1});
        }
    }

    @Override  // ggsu
    public final void G(String s, int v, long v1) {
        if(this.au()) {
            this.l(s, new Object[]{v, v1});
        }
    }

    @Override  // ggsu
    public final void H(String s, int v, Object object0) {
        if(this.au()) {
            this.l(s, new Object[]{v, object0});
        }
    }

    @Override  // ggsu
    public final void I(String s, int v, boolean z) {
        if(this.au()) {
            this.l(s, new Object[]{v, Boolean.valueOf(z)});
        }
    }

    @Override  // ggsu
    public final void J(String s, long v, int v1) {
        if(this.au()) {
            this.l(s, new Object[]{v, v1});
        }
    }

    @Override  // ggsu
    public final void K(String s, long v, long v1) {
        if(this.au()) {
            this.l(s, new Object[]{v, v1});
        }
    }

    @Override  // ggsu
    public final void L(String s, long v, Object object0) {
        if(this.au()) {
            this.l(s, new Object[]{v, object0});
        }
    }

    @Override  // ggsu
    public final void M(String s, long v, boolean z) {
        if(this.au()) {
            this.l(s, new Object[]{v, Boolean.valueOf(z)});
        }
    }

    @Override  // ggsu
    public final void N(String s, Object object0, byte b) {
        if(this.au()) {
            this.l(s, new Object[]{object0, b});
        }
    }

    @Override  // ggsu
    public final void O(String s, Object object0, double f) {
        if(this.au()) {
            this.l(s, new Object[]{object0, f});
        }
    }

    @Override  // ggsu
    public final void P(String s, Object object0, int v) {
        if(this.au()) {
            this.l(s, new Object[]{object0, v});
        }
    }

    @Override  // ggsu
    public final void Q(String s, Object object0, long v) {
        if(this.au()) {
            this.l(s, new Object[]{object0, v});
        }
    }

    @Override  // ggsu
    public final void R(String s, Object object0, Object object1) {
        if(this.au()) {
            this.l(s, new Object[]{object0, object1});
        }
    }

    @Override  // ggsu
    public final void S(String s, Object object0, boolean z) {
        if(this.au()) {
            this.l(s, new Object[]{object0, Boolean.valueOf(z)});
        }
    }

    @Override  // ggsu
    public final void T(String s, boolean z, int v) {
        if(this.au()) {
            this.l(s, new Object[]{Boolean.valueOf(z), v});
        }
    }

    @Override  // ggsu
    public final void U(String s, boolean z, long v) {
        if(this.au()) {
            this.l(s, new Object[]{Boolean.valueOf(z), v});
        }
    }

    @Override  // ggsu
    public final void V(String s, boolean z, Object object0) {
        if(this.au()) {
            this.l(s, new Object[]{Boolean.valueOf(z), object0});
        }
    }

    @Override  // ggsu
    public final void W(String s, boolean z, boolean z1) {
        if(this.au()) {
            this.l(s, new Object[]{Boolean.valueOf(z), Boolean.valueOf(z1)});
        }
    }

    @Override  // ggsu
    public final void X(String s, Object object0, Object object1, Object object2) {
        if(this.au()) {
            this.l(s, new Object[]{object0, object1, object2});
        }
    }

    @Override  // ggsu
    public final void Y(String s, Object object0, Object object1, Object object2, Object object3) {
        if(this.au()) {
            this.l(s, new Object[]{object0, object1, object2, object3});
        }
    }

    @Override  // ggsu
    public final void Z(String s, Object object0, Object object1, Object object2, Object object3, Object object4) {
        if(this.au()) {
            this.l(s, new Object[]{object0, object1, object2, object3, object4});
        }
    }

    @Override  // ggtu
    public final long a() {
        return this.f;
    }

    @Override  // ggsu
    public final void aa(String s, Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        if(this.au()) {
            this.l(s, new Object[]{object0, object1, object2, object3, object4, object5});
        }
    }

    @Override  // ggsu
    public final void ab(String s, Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6) {
        if(this.au()) {
            this.l(s, new Object[]{object0, object1, object2, object3, object4, object5, object6});
        }
    }

    @Override  // ggsu
    public final void ac(String s, Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        if(this.au()) {
            this.l(s, new Object[]{object0, object1, object2, object3, object4, object5, object6, object7});
        }
    }

    @Override  // ggsu
    public final void ad(String s, Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        if(this.au()) {
            this.l(s, new Object[]{object0, object1, object2, object3, object4, object5, object6, object7, object8, object9});
        }
    }

    @Override  // ggsu
    public final void ae(String s, Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object[] arr_object) {
        if(this.au()) {
            Object[] arr_object1 = new Object[arr_object.length + 10];
            arr_object1[0] = object0;
            arr_object1[1] = object1;
            arr_object1[2] = object2;
            arr_object1[3] = object3;
            arr_object1[4] = object4;
            arr_object1[5] = object5;
            arr_object1[6] = object6;
            arr_object1[7] = object7;
            arr_object1[8] = object8;
            arr_object1[9] = object9;
            System.arraycopy(arr_object, 0, arr_object1, 10, arr_object.length);
            this.l(s, arr_object1);
        }
    }

    @Override  // ggsu
    public final void af(String s, Object[] arr_object) {
        if(this.au()) {
            this.l(s, Arrays.copyOf(arr_object, arr_object.length));
        }
    }

    @Override  // ggsu
    public final boolean ag() {
        return this.h() || this.j().m(this.e);
    }

    @Override  // ggsu
    public final void ah(byte b, Object object0) {
        if(this.au()) {
            this.l("Endpoint info has the wrong version %s. Using current profile %s...", new Object[]{b, object0});
        }
    }

    @Override  // ggsu
    public final void ai(double f, int v) {
        if(this.au()) {
            this.l("notifyProximity: %f to %d listeners", new Object[]{f, v});
        }
    }

    @Override  // ggsu
    public final void aj(double f, Object object0) {
        if(this.au()) {
            this.l("FastPairSeeker: Detected bloom filter but too far away, ignoring. %.3fm, %s", new Object[]{f, object0});
        }
    }

    @Override  // ggsu
    public final void ak(float f, int v) {
        if(this.au()) {
            this.l("Device compatibility check. Limited max accel range: %f, required at least: %d", new Object[]{f, v});
        }
    }

    @Override  // ggsu
    public final void al(float f, long v) {
        if(this.au()) {
            this.l("Peak of %f at %d", new Object[]{f, v});
        }
    }

    @Override  // ggsu
    public final void am(int v, byte b) {
        if(this.au()) {
            this.l("HearingAidPairingProgressHandler: bonded devices size: %d, coordinated set size: %d", new Object[]{v, b});
        }
    }

    @Override  // ggsu
    public final void an(int v) {
        if(this.au()) {
            this.l("Current passkey-cache version is %d so we need to update it to version %d", new Object[]{v, ((short)1)});
        }
    }

    @Override  // ggsu
    public final void ao(short v, int v1) {
        if(this.au()) {
            this.l("ATC mismatch, SDK passed %d, TapAndPay has %d", new Object[]{v, v1});
        }
    }

    @Override  // ggsu
    public final void ap(short v, short v1) {
        if(this.au()) {
            this.l("ATCs from status and SUK lists don\'t match, ATC in status: %d, ATC in SUK: %d", new Object[]{v, v1});
        }
    }

    @Override  // ggsu
    public final void aq(boolean z, double f) {
        if(this.au()) {
            this.l("Distance was already crossed or ptr is null [%b], ignoring %f", new Object[]{Boolean.valueOf(z), f});
        }
    }

    @Override  // ggsu
    public final ggsu ar(int v) {
        ggsn ggsn0 = new ggsn(v);
        if(this.b == null) {
            this.b = ggsn0;
        }
        return this.k();
    }

    @Override  // ggsu
    public final void as(Object object0, float f) {
        if(this.au()) {
            this.l("serialization failed (extras/values=%.2f/%.2fkb)", new Object[]{object0, f});
        }
    }

    @Override  // ggsu
    public final void at(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        if(this.au()) {
            this.l("BleAdvHandler:%s, decryptBatteryAllTheTimeData, isSecurityEnhanced=%s, keyState=%s, initialVector=%s, accountKey=%s, batteryLevelData=%s, battBattery=%s, isCaseAdvertisement=%s, hideBatteryNotification=%s", new Object[]{object0, object1, object2, object3, object4, object5, object6, object7, object8});
        }
    }

    private final boolean au() {
        ggsp ggsp0;
        int v = 1;
        if(this.b == null) {
            this.b = gguv.g().a(ggsl.class, 1);
        }
        if(this.b == ggso.a) {
            ggsp0 = null;
        }
        else {
            ggsp0 = this.b;
            ggsk ggsk0 = this.g;
            if(ggsk0 != null && ggsk0.b > 0) {
                ggwv.d(ggsp0, "logSiteKey");
                int v1 = ggsk0.b;
                for(int v2 = 0; v2 < v1; ++v2) {
                    ggsx ggsx0 = ggsk0.c(v2);
                    if(ggsj.f.equals(ggsx0)) {
                        Object object0 = ggsk0.e(v2);
                        ggsp0 = (object0 instanceof ggsv) ? ((ggsv)object0).b() : new ggtg(ggsp0, object0);
                    }
                }
            }
        }
        int v3 = this.n(ggsp0);
        ggtc ggtc0 = this.h;
        if(ggtc0 != null) {
            ggtb ggtb0 = (ggtb)ggtb.a.b(ggsp0, this.g);
            int v4 = ggtb0.c.incrementAndGet();
            int v5 = -1;
            if(ggtc0 != ggtc.c && ggtb0.b.compareAndSet(false, true)) {
                try {
                    ggtc0.a();
                }
                catch(Throwable throwable0) {
                    ggtb0.b.set(false);
                    throw throwable0;
                }
                ggtb0.b.set(false);
                ggtb0.c.addAndGet(-v4);
                v5 = -1 + v4;
            }
            if(v3 && v5 > 0) {
                ggsk ggsk1 = this.g;
                if(ggsk1 != null) {
                    ggsk1.f(ggsj.e, Integer.valueOf(v5));
                }
            }
            if(v5 < 0) {
                v = 0;
            }
            return v3 & v;
        }
        return v3 != 0;
    }

    @Override  // ggtu
    public final ggso b() {
        ggso ggso0 = this.b;
        if(ggso0 != null) {
            return ggso0;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override  // ggtu
    public final ggub c() {
        ggub ggub0 = this.g;
        return ggub0 != null ? ggub0 : ggua.a;
    }

    @Override  // ggtu
    public final ggux d() {
        return this.i;
    }

    @Override  // ggtu
    public final Object e() {
        ggwv.b(this.i == null, "cannot get literal argument if a template context exists");
        Object[] arr_object = this.c;
        if(arr_object != null) {
            return arr_object[0];
        }
        throw new IllegalStateException("cannot get literal argument before calling log()");
    }

    @Override  // ggtu
    public final String f() {
        return this.j().b.d();
    }

    @Override  // ggtu
    public final Level g() {
        return this.e;
    }

    @Override  // ggtu
    public final boolean h() {
        return this.g != null && Boolean.TRUE.equals(this.g.d(ggsj.g));
    }

    @Override  // ggtu
    public final Object[] i() {
        ggwv.b(this.i != null, "cannot get arguments unless a template context exists");
        Object[] arr_object = this.c;
        if(arr_object != null) {
            return arr_object;
        }
        throw new IllegalStateException("cannot get arguments before calling log()");
    }

    protected abstract ggrv j();

    protected abstract ggsu k();

    private final void l(String s, Object[] arr_object) {
        ggwx ggwx0;
        this.c = arr_object;
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if((object0 instanceof ggsg)) {
                arr_object[v] = ((ggsg)object0).a();
            }
        }
        if(s != ggsl.a) {
            this.i = new ggux(this.m(), s);
        }
        ggwj ggwj0 = gguv.k();
        if(!ggwj0.a()) {
            ggsx ggsx0 = ggsj.h;
            ggwj ggwj1 = (ggwj)this.c().d(ggsx0);
            if(ggwj1 != null && !ggwj1.a()) {
                ggwj0 = ggwj0.a() ? ggwj1 : new ggwj(new ggwh(ggwj0.c, ggwj1.c));
            }
            this.u(ggsx0, ggwj0);
        }
        ggrv ggrv0 = this.j();
        try {
            ggwx0 = ggwx.a();
        }
        catch(RuntimeException runtimeException0) {
            goto label_35;
        }
        int v1 = ggwx0.a + 1;
        ggwx0.a = v1;
        if(v1 == 0) {
            throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
        }
        try {
            if(v1 <= 100) {
                ggrv0.b.b(this);
            }
            else {
                ggrv.l("unbounded recursion in log statement", this);
            }
            goto label_30;
        }
        catch(Throwable throwable0) {
            try {
                TWR.safeClose$NT(ggwx0, throwable0);
                throw throwable0;
            label_30:
                if(ggwx0 != null) {
                    ggwx0.close();
                    return;
                }
                return;
            }
            catch(RuntimeException runtimeException0) {
            }
        }
        try {
        label_35:
            ggrv0.b.a(runtimeException0, this);
        }
        catch(ggty ggty0) {
            throw ggty0;
        }
        catch(RuntimeException runtimeException1) {
            ggrv.l((runtimeException1.getClass().getName() + ": " + runtimeException1.getMessage()), this);
            try {
                runtimeException1.printStackTrace(System.err);
            }
            catch(RuntimeException unused_ex) {
            }
        }
    }

    protected abstract ggwr m();

    protected boolean n(ggsp ggsp0) {
        throw null;
    }

    @Override  // ggsu
    public final ggsu o(int v, TimeUnit timeUnit0) {
        if(!this.h()) {
            if(v < 0) {
                throw new IllegalArgumentException("rate limit period cannot be negative");
            }
            if(v > 0) {
                ggrz ggrz0 = new ggrz(v, timeUnit0);
                this.u(ggsj.d, ggrz0);
                return this.k();
            }
        }
        return this.k();
    }

    @Override  // ggsu
    public final ggsu p(int v) {
        ggsx ggsx0 = ggsj.b;
        if(!this.h()) {
            if(v <= 0) {
                throw new IllegalArgumentException("rate limit count must be positive");
            }
            if(v > 1) {
                this.u(ggsx0, Integer.valueOf(v));
                return this.k();
            }
        }
        return this.k();
    }

    @Override  // ggsu
    public final ggsu q(String s) {
        return this.r(ggsj.f, s);
    }

    @Override  // ggsu
    public final ggsu r(ggsx ggsx0, Object object0) {
        ggwv.d(ggsx0, "metadata key");
        if(object0 != null) {
            this.u(ggsx0, object0);
        }
        return this.k();
    }

    @Override  // ggsu
    public final ggsu s(Throwable throwable0) {
        return this.r(ggsj.a, throwable0);
    }

    @Override  // ggsu
    public final ggsu t(ggti ggti0) {
        ggwv.d(ggti0, "stack size");
        if(ggti0 != ggti.e) {
            this.u(ggsj.i, ggti0);
        }
        return this.k();
    }

    protected final void u(ggsx ggsx0, Object object0) {
        if(this.g == null) {
            this.g = new ggsk();
        }
        this.g.f(ggsx0, object0);
    }

    @Override  // ggsu
    public final void v() {
        if(this.au()) {
            this.l(ggsl.a, new Object[]{""});
        }
    }

    @Override  // ggsu
    public final void w(Object object0) {
        if(this.au()) {
            this.l("%s", new Object[]{object0});
        }
    }

    @Override  // ggsu
    public final void x(String s) {
        if(this.au()) {
            this.l(ggsl.a, new Object[]{s});
        }
    }

    @Override  // ggsu
    public final void y(String s, byte b) {
        if(this.au()) {
            this.l(s, new Object[]{b});
        }
    }

    @Override  // ggsu
    public final void z(String s, int v) {
        if(this.au()) {
            this.l(s, new Object[]{v});
        }
    }
}

