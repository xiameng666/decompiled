import android.content.Context;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.os.Trace;
import android.util.Pair;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import jeb.synthetic.FIN;

public final class aqi implements bin {
    public volatile int A;
    final ayv B;
    private final bkz C;
    private int D;
    private final bap E;
    private final boolean F;
    private final boolean G;
    private boolean H;
    private final Set I;
    private bia J;
    private bmc K;
    private final ats L;
    private final awp M;
    private final avf N;
    public final bmy a;
    public final awt b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public final asy e;
    public final aow f;
    public final aqg g;
    final aqj h;
    CameraDevice i;
    int j;
    atl k;
    final AtomicInteger l;
    gmcd m;
    jqt n;
    final Map o;
    final apw p;
    final bje q;
    public boolean r;
    public boolean s;
    public auq t;
    public final atp u;
    public final avg v;
    final Object w;
    boolean x;
    public final axc y;
    public final aqb z;

    public aqi(Context context0, awt awt0, String s, aqj aqj0, ayv ayv0, bje bje0, Executor executor0, Handler handler0, ats ats0, long v, bap bap0) {
        String s1;
        this.A = 3;
        bkz bkz0 = new bkz();
        this.C = bkz0;
        boolean z = false;
        this.j = 0;
        this.l = new AtomicInteger(0);
        this.o = new LinkedHashMap();
        this.D = 0;
        this.r = false;
        this.s = false;
        this.H = true;
        this.I = new HashSet();
        this.J = bid.a;
        this.w = new Object();
        this.x = false;
        this.z = new aqb(this);
        this.b = awt0;
        this.B = ayv0;
        this.q = bje0;
        bor bor0 = new bor(handler0);
        this.d = bor0;
        boz boz0 = new boz(executor0);
        this.c = boz0;
        this.g = new aqg(this, boz0, bor0, v);
        this.a = new bmy(s);
        bkz0.b(bim.c);
        this.e = new asy(bje0);
        this.u = new atp(boz0);
        this.L = ats0;
        this.E = bap0;
        try {
            awp awp0 = awt0.b(s);
            this.M = awp0;
            aow aow0 = new aow(awp0, bor0, boz0, new apx(this), aqj0.g);
            this.f = aow0;
            this.h = aqj0;
            synchronized(aqj0.d) {
                aqj0.e = aow0;
                List list0 = aqj0.f;
                if(list0 != null) {
                    for(Object object1: list0) {
                        aqj0.e.j(((Executor)((Pair)object1).second), ((bhl)((Pair)object1).first));
                    }
                    aqj0.f = null;
                }
            }
            int v2 = aqj0.d();
            switch(v2) {
                case 0: {
                    s1 = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
                    break;
                }
                case 1: {
                    s1 = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
                    break;
                }
                case 2: {
                    s1 = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
                    break;
                }
                case 3: {
                    s1 = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
                    break;
                }
                default: {
                    s1 = v2 == 4 ? "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL" : "Unknown value: " + v2;
                }
            }
            bcs.c("Camera2CameraInfo", "Device Level: " + s1);
            lqd lqd0 = this.h.h.a;
            this.h.h.a = this.e.a;
            boj.c(new bod(lqd0, this.h.h, this.e.a));
        }
        catch(awl awl0) {
            throw new baf(awl0);
        }
        this.y = axc.b(this.M);
        this.k = this.a();
        this.v = new avg(this.c, this.d, handler0, this.u, aqj0.g, axv.a);
        if(aqj0.g.c(LegacyCameraOutputConfigNullPointerQuirk.class) || aqj0.g.c(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class)) {
            z = true;
        }
        this.F = z;
        this.G = aqj0.g.c(LegacyCameraSurfaceCleanupQuirk.class);
        apw apw0 = new apw(this, s);
        this.p = apw0;
        synchronized(this.q.a) {
            kay.d(((boolean)(this.q.c.containsKey(this) ^ 1)), "Camera is already registered: " + this);
            bjd bjd0 = new bjd(this.c, apw0);
            this.q.c.put(this, bjd0);
        }
        this.b.d(this.c, apw0);
        this.N = new avf(context0, s, awt0, new apr(), bes.e);
    }

    final void A(boolean z) {
        this.O();
        if(!this.q.d(this)) {
            this.O();
            this.J(4);
            return;
        }
        this.R(z);
    }

    public final void B(boolean z) {
        this.O();
        if(this.p.a && this.q.d(this)) {
            this.R(z);
            return;
        }
        this.O();
        this.J(4);
    }

    final void C() {
        bma bma0 = this.a.a();
        if(bma0.t()) {
            bmb bmb0 = bma0.a();
            this.f.v(bmb0.b());
            bma0.s(this.f.e());
            bmb bmb1 = bma0.a();
            this.k.i(bmb1);
            return;
        }
        this.f.v(1);
        this.k.i(this.f.e());
    }

    public final void D() {
        if(aul.a(this.h.b)) {
            bma bma0 = this.a.a();
            if(bma0.t()) {
                if(((int)(((Integer)bma0.a().c().getUpper()))) > 30) {
                    this.f.s(true);
                    return;
                }
                this.f.s(false);
            }
        }
    }

    public final void E() {
        int v = 0;
        for(Object object0: this.a.d()) {
            v |= ((bnc)object0).B();
        }
        this.f.w(((boolean)v));
    }

    @Override  // bin
    public final boolean F() {
        return true;
    }

    @Override  // bin
    public final boolean G() {
        return bil.b(this);
    }

    public final boolean H() {
        auq auq0 = this.t;
        if(auq0 == null) {
            return false;
        }
        String s = aqi.j(auq0);
        return this.a.j(s);
    }

    final boolean I() {
        return this.o.isEmpty();
    }

    final void J(int v) {
        this.K(v, null);
    }

    final void K(int v, bac bac0) {
        this.L(v, bac0, true);
    }

    final void L(int v, bac bac0, boolean z) {
        bim bim1;
        bim bim0;
        Objects.toString(aqc.a(this.A));
        Objects.toString(aqc.a(v));
        this.O();
        boolean z1 = false;
        if(Trace.isEnabled()) {
            oyn.c(a.i(this, "CX:C2State[", "]"), v - 1);
            if(bac0 != null) {
                ++this.D;
            }
            if(this.D > 0) {
                oyn.c(a.i(this, "CX:C2StateErrorCode[", "]"), (bac0 == null ? 0 : bac0.a));
            }
        }
        this.A = v;
        switch(v - 1) {
            case 0: {
                bim0 = bim.a;
                break;
            }
            case 1: {
                bim0 = bim.b;
                break;
            }
            case 2: {
                bim0 = bim.c;
                break;
            }
            case 3: {
                bim0 = bim.d;
                break;
            }
            case 4: 
            case 5: 
            case 6: {
                bim0 = bim.e;
                break;
            }
            case 7: 
            case 8: {
                bim0 = bim.f;
                break;
            }
            default: {
                bim0 = bim.g;
            }
        }
        bje bje0 = this.q;
        Object object0 = bje0.a;
        __monitor_enter(object0);
        int v1 = FIN.finallyOpen$NT();
        int v2 = bje0.d;
        HashMap hashMap0 = null;
        if(bim0 == bim.a) {
            bjd bjd0 = (bjd)bje0.c.remove(this);
            if(bjd0 == null) {
                bim1 = null;
            }
            else {
                bje0.a();
                bim1 = bjd0.a;
            }
        }
        else {
            bjd bjd1 = (bjd)bje0.c.get(this);
            kay.j(bjd1, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
            bim bim2 = bjd1.a(bim0);
            bim bim3 = bim.f;
            if(bim0 == bim3) {
                if(bje.c(bim0) || bim2 == bim3) {
                    z1 = true;
                }
                kay.d(z1, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
            }
            if(bim2 != bim0) {
                bje.b(this, bim0);
                bje0.a();
            }
            bim1 = bim2;
        }
        if(bim1 == bim0) {
            FIN.finallyCodeBegin$NT(v1);
        }
        else {
            if(v2 <= 0 && bje0.d > 0) {
                hashMap0 = new HashMap();
                for(Object object1: bje0.c.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object1;
                    if(((bjd)map$Entry0.getValue()).a != bim.d) {
                        continue;
                    }
                    hashMap0.put(((azp)map$Entry0.getKey()), ((bjd)map$Entry0.getValue()));
                }
            }
            else if(bim0 == bim.d && bje0.d > 0) {
                hashMap0 = new HashMap();
                hashMap0.put(this, ((bjd)bje0.c.get(this)));
            }
            if(hashMap0 != null && !z) {
                hashMap0.remove(this);
            }
            FIN.finallyExec$NT(v1);
            if(hashMap0 != null) {
                for(Object object2: hashMap0.values()) {
                    ((bjd)object2).b();
                }
            }
        }
        this.C.b(bim0);
        this.e.a(bim0, bac0);
    }

    final void M() {
        boolean z = true;
        switch(this.A) {
            case 2: 
            case 6: {
                break;
            }
            case 8: {
                if(this.j == 0) {
                    z = false;
                }
                break;
            }
            default: {
                z = false;
            }
        }
        kay.d(z, "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + aqc.a(this.A) + " (error: " + aqi.i(this.j) + ")");
        this.N();
        this.k.d();
    }

    final void N() {
        kay.c(this.k != null);
        this.O();
        atl atl0 = this.k;
        bmb bmb0 = atl0.a();
        List list0 = atl0.c();
        atl atl1 = this.a();
        this.k = atl1;
        atl1.i(bmb0);
        this.k.g(list0);
        int v = this.A - 1;
        if(this.A == 0) {
            throw null;
        }
        if(v != 9) {
            Objects.toString(aqc.a(this.A));
            atl0.k();
            this.O();
        }
        else if(this.F && atl0.k()) {
            this.O();
            this.J(7);
        }
        if(this.G && atl0.k()) {
            this.O();
            this.r = true;
        }
        atl0.e();
        gmcd gmcd0 = atl0.p();
        if(this.A == 0) {
            throw null;
        }
        this.O();
        this.o.put(atl0, gmcd0);
        bpt.j(gmcd0, new apu(this, atl0), bol.a());
    }

    public final void O() {
        bcs.i("Camera2CameraImpl");
    }

    @Override  // bin
    public final void P() {
        this.H = true;
    }

    private final Collection Q(Collection collection0) {
        Collection collection1 = new ArrayList();
        for(Object object0: collection0) {
            ben ben0 = (ben)object0;
            boolean z = this.H;
            ((List)collection1).add(new aqh(aqi.k(ben0), ben0.getClass(), (z ? ben0.m : ben0.n), ben0.i, ben0.A(), ben0.j, aqi.l(ben0)));
        }
        return collection1;
    }

    private final void R(boolean z) {
        if(!z) {
            this.g.a();
        }
        this.g.c();
        this.z.a();
        this.O();
        this.J(9);
        try {
            ArrayList arrayList0 = new ArrayList(this.a.b().a().c);
            arrayList0.add(this.u.f);
            arrayList0.add(this.g);
            CameraDevice.StateCallback cameraDevice$StateCallback0 = asw.a(arrayList0);
            this.b.c(this.h.a, this.c, cameraDevice$StateCallback0);
        }
        catch(awl awl0) {
            this.O();
            if(awl0.b != 10001) {
                aqb aqb0 = this.z;
                aqi aqi0 = aqb0.b;
                if(aqi0.A != 9) {
                    aqi0.O();
                    return;
                }
                aqi0.O();
                aqb0.a();
                aqb0.a = new aqa(aqb0);
                return;
            }
            this.K(3, new bac(7, awl0));
        }
        catch(SecurityException unused_ex) {
            this.O();
            this.J(8);
            this.g.b();
        }
        catch(RuntimeException unused_ex) {
            this.O();
            this.K(5, new bac(6, null));
        }
    }

    private final boolean S(auq auq0) {
        kay.i(auq0);
        ArrayList arrayList0 = new ArrayList();
        synchronized(this.w) {
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: this.a.a.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((bmx)map$Entry0.getValue()).e) {
                arrayList1.add(((bmx)map$Entry0.getValue()));
            }
        }
        for(Object object1: DesugarCollections.unmodifiableCollection(arrayList1)) {
            bmx bmx0 = (bmx)object1;
            List list0 = bmx0.d;
            if(list0 != null && list0.get(0) == bne.f) {
                continue;
            }
            bmi bmi0 = bmx0.c;
            if(bmi0 != null && list0 != null) {
                bnc bnc0 = bmx0.b;
                for(Object object2: bmx0.a.g()) {
                    int v = bnc0.a();
                    bmj bmj0 = bnc0.j();
                    bmp bmp0 = this.N.e(v, ((bka)object2).l, bmj0);
                    int v1 = bnc0.a();
                    boolean z = bnc0.u();
                    arrayList0.add(new bhk(bmp0, v1, ((bka)object2).l, bmi0.d, list0, bmi0.g, bmi0.e, bmi0.f, z));
                }
                continue;
            }
            Objects.toString(bmx0);
            bcs.d("Camera2CameraImpl", "Invalid stream spec or capture types in " + bmx0);
            return true;
        }
        kay.i(auq0);
        HashMap hashMap0 = new HashMap();
        List list1 = Collections.singletonList(auq0.d);
        hashMap0.put(auq0.c, list1);
        try {
            this.N.d(arrayList0, hashMap0, false, false, false);
        }
        catch(IllegalArgumentException unused_ex) {
            this.O();
            return true;
        }
        this.O();
        return this.E != null && !((Boolean)this.E.m.m(bap.l, Boolean.valueOf(true))).booleanValue();
    }

    public final atl a() {
        aze aze0;
        synchronized(this.w) {
            aze0 = this.E == null ? null : ((aze)this.E.m.m(azf.a, null));
            if(this.K == null) {
                return new atk(this.y, this.h.g, false, aze0);
            }
        }
        return new auy(this.K, this.y, this.c, this.d, aze0);
    }

    @Override  // bin
    public final azz b() {
        return bil.a(this);
    }

    @Override  // bin
    public final bia c() {
        return this.J;
    }

    @Override  // bin
    public final bih d() {
        return this.f;
    }

    @Override  // bin
    public final bik e() {
        return this.h;
    }

    @Override  // bin
    public final bld f() {
        return this.C;
    }

    @Override  // bin
    public final gmcd g() {
        return jqy.a(new aoy(this));
    }

    final Object h(jqt jqt0) {
        try {
            apj apj0 = new apj(this, jqt0);
            this.c.execute(apj0);
        }
        catch(RejectedExecutionException unused_ex) {
            jqt0.c(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
        }
        return "isMeteringRepeatingAttached";
    }

    static String i(int v) {
        switch(v) {
            case 0: {
                return "ERROR_NONE";
            }
            case 1: {
                return "ERROR_CAMERA_IN_USE";
            }
            case 2: {
                return "ERROR_MAX_CAMERAS_IN_USE";
            }
            case 3: {
                return "ERROR_CAMERA_DISABLED";
            }
            case 4: {
                return "ERROR_CAMERA_DEVICE";
            }
            case 5: {
                return "ERROR_CAMERA_SERVICE";
            }
            default: {
                return "UNKNOWN ERROR";
            }
        }
    }

    static String j(auq auq0) {
        return "MeteringRepeating" + auq0.hashCode();
    }

    static String k(ben ben0) {
        return ben0.G() + ben0.hashCode();
    }

    static List l(ben ben0) {
        return ben0.C() == null ? null : bud.f(ben0);
    }

    public final void m() {
        boolean z = true;
        bmy bmy0 = this.a;
        bmb bmb0 = bmy0.b().a();
        int v = bmb0.g.e().size();
        int v1 = bmb0.g().size();
        if(this.H()) {
            if(v == 1 && v1 != 1) {
                z = false;
            }
            if(z || this.S(this.t)) {
                if(this.t != null) {
                    String s = "MeteringRepeating" + this.t.hashCode();
                    Map map0 = bmy0.a;
                    if(map0.containsKey(s)) {
                        bmx bmx0 = (bmx)map0.get(s);
                        bmx0.e = false;
                        if(!bmx0.f) {
                            map0.remove(s);
                        }
                    }
                    bmy0.h("MeteringRepeating" + this.t.hashCode());
                    auq auq0 = this.t;
                    bcs.h("MeteringRepeating");
                    bka bka0 = auq0.a;
                    if(bka0 != null) {
                        bka0.d();
                    }
                    auq0.a = null;
                    this.t = null;
                }
                if(!z) {
                    bcs.a("Camera2CameraImpl", "The repeating surface is missing, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
                }
            }
        }
        else if(v == 0 && v1 > 0) {
            if(this.t == null) {
                apa apa0 = new apa(this);
                this.t = new auq(this.h.b, this.L, apa0);
            }
            if(this.S(this.t)) {
                bcs.a("Camera2CameraImpl", "The repeating surface is missing, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
            }
            else {
                auq auq1 = this.t;
                if(auq1 != null) {
                    String s1 = aqi.j(auq1);
                    bmy0.g(s1, this.t.b, this.t.c, null, Collections.singletonList(bne.f));
                    bmy0.f(s1, this.t.b, this.t.c, null, Collections.singletonList(bne.f));
                }
            }
        }
    }

    @Override  // bin
    public final void n(Collection collection0) {
        ArrayList arrayList0 = new ArrayList(collection0);
        if(arrayList0.isEmpty()) {
            return;
        }
        this.f.o();
        for(Object object0: new ArrayList(arrayList0)) {
            ben ben0 = (ben)object0;
            String s = aqi.k(ben0);
            Set set0 = this.I;
            if(!set0.contains(s)) {
                set0.add(s);
                ben0.M();
                ben0.ab();
            }
        }
        ArrayList arrayList1 = new ArrayList(this.Q(arrayList0));
        try {
            apm apm0 = new apm(this, arrayList1);
            this.c.execute(apm0);
        }
        catch(RejectedExecutionException unused_ex) {
            this.O();
            this.f.m();
        }
    }

    public final void o() {
        kay.c(this.A == 2 || this.A == 6);
        kay.c(this.o.isEmpty());
        if(!this.r) {
            this.q();
            return;
        }
        if(this.s) {
            this.O();
            return;
        }
        if(!this.p.a) {
            this.r = false;
            this.q();
            this.O();
            return;
        }
        this.O();
        gmcd gmcd0 = jqy.a(new apk(this));
        this.s = true;
        gmcd0.hB(new apl(this), this.c);
    }

    @Override  // bin
    public final void p(Collection collection0) {
        ArrayList arrayList0 = new ArrayList(collection0);
        if(arrayList0.isEmpty()) {
            return;
        }
        ArrayList arrayList1 = new ArrayList(this.Q(arrayList0));
        for(Object object0: new ArrayList(arrayList0)) {
            ben ben0 = (ben)object0;
            String s = aqi.k(ben0);
            Set set0 = this.I;
            if(set0.contains(s)) {
                ben0.o();
                set0.remove(s);
            }
        }
        apc apc0 = new apc(this, arrayList1);
        this.c.execute(apc0);
    }

    final void q() {
        kay.c(this.A == 2 || this.A == 6);
        kay.c(this.o.isEmpty());
        this.i = null;
        if(this.A == 6) {
            this.J(3);
            return;
        }
        this.b.e(this.p);
        this.J(1);
        jqt jqt0 = this.n;
        if(jqt0 != null) {
            jqt0.b(null);
            this.n = null;
        }
    }

    @Override  // bin
    public final void r() {
        api api0 = new api(this);
        this.c.execute(api0);
    }

    @Override  // bem
    public final void s(ben ben0) {
        apq apq0 = new apq(this, aqi.k(ben0), (this.H ? ben0.m : ben0.n), ben0.i, ben0.j, aqi.l(ben0));
        this.c.execute(apq0);
    }

    @Override  // bem
    public final void t(ben ben0) {
        app app0 = new app(this, aqi.k(ben0));
        this.c.execute(app0);
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", this.hashCode(), this.h.a);
    }

    @Override  // bem
    public final void u(ben ben0) {
        bmb bmb0 = this.H ? ben0.m : ben0.n;
        bnc bnc0 = ben0.i;
        bmi bmi0 = ben0.j;
        List list0 = aqi.l(ben0);
        this.x(aqi.k(ben0), bmb0, bnc0, bmi0, list0);
    }

    @Override  // bem
    public final void v(ben ben0) {
        kay.i(ben0);
        apo apo0 = new apo(this, aqi.k(ben0), (this.H ? ben0.m : ben0.n), ben0.i, ben0.j, aqi.l(ben0));
        this.c.execute(apo0);
    }

    public final void w() {
        kay.c(this.A == 10);
        bmy bmy0 = this.a;
        bma bma0 = bmy0.b();
        if(!bma0.t()) {
            this.O();
            return;
        }
        this.i.getId();
        String s = this.i.getId();
        this.B.c(s);
        this.q.e();
        HashMap hashMap0 = new HashMap();
        Collection collection0 = bmy0.c();
        Collection collection1 = bmy0.d();
        ibuq.f(collection0, "sessionConfigs");
        ibuq.f(collection1, "useCaseConfigs");
        ArrayList arrayList0 = new ArrayList(collection1);
        Iterator iterator0 = collection0.iterator();
    label_17:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            bmb bmb0 = (bmb)object0;
            bjr bjr0 = ava.a;
            if(bmb0.d().s(bjr0) && bmb0.g().size() != 1) {
                String s1 = String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Arrays.copyOf(new Object[]{bmb0.g().size()}, 1));
                ibuq.e(s1, "format(...)");
                bcs.a("StreamUseCaseUtil", s1);
                goto label_49;
            }
            if(bmb0.d().s(bjr0)) {
                Iterator iterator1 = collection0.iterator();
                for(int v = 0; true; ++v) {
                    if(!iterator1.hasNext()) {
                        break label_17;
                    }
                    Object object1 = iterator1.next();
                    bmb bmb1 = (bmb)object1;
                    if(((bnc)arrayList0.get(v)).k() == bne.f) {
                        List list0 = bmb1.g();
                        ibuq.e(list0, "getSurfaces(...)");
                        kay.d(((boolean)(list0.isEmpty() ^ 1)), "MeteringRepeating should contain a surface");
                        hashMap0.put(bmb1.g().get(0), Long.valueOf(1L));
                    }
                    else if(bmb1.d().s(bjr0)) {
                        List list1 = bmb1.g();
                        ibuq.e(list1, "getSurfaces(...)");
                        if(!list1.isEmpty()) {
                            Object object2 = bmb1.g().get(0);
                            Object object3 = bmb1.d().l(bjr0);
                            ibuq.c(object3);
                            hashMap0.put(object2, object3);
                        }
                    }
                }
            }
        }
        bcs.h("StreamUseCaseUtil");
    label_49:
        this.k.j(hashMap0);
        atl atl0 = this.k;
        bmb bmb2 = bma0.a();
        CameraDevice cameraDevice0 = this.i;
        kay.i(cameraDevice0);
        bpt.j(atl0.m(bmb2, cameraDevice0, this.v.a()), new apv(this, atl0), this.c);
    }

    public final void x(String s, bmb bmb0, bnc bnc0, bmi bmi0, List list0) {
        apd apd0 = new apd(this, s, bmb0, bnc0, bmi0, list0);
        this.c.execute(apd0);
    }

    @Override  // bin
    public final void y(boolean z) {
        ape ape0 = new ape(this, z);
        this.c.execute(ape0);
    }

    @Override  // bin
    public final void z(bia bia0) {
        bmc bmc0 = bia0.b();
        this.J = bia0;
        synchronized(this.w) {
            this.K = bmc0;
        }
    }
}

