import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class aucp extends aubi {
    private final long A;
    private final auca B;
    private final aveq C;
    private auhm D;
    private final boolean E;
    private final aulm F;
    private final aush G;
    private final String H;
    private final ausg I;
    public final avjh h;
    public final auhn i;
    final aubj j;
    Future k;
    public aucd l;
    public CastDevice m;
    public String n;
    public final Set o;
    final Set p;
    public final aubj q;
    public JoinOptions r;
    public final Context s;
    public auwu t;
    public boolean u;
    public auwx v;
    String w;
    int x;
    public final auwd y;
    auco z;

    public aucp(Context context0, CastDevice castDevice0, aubj aubj0, ScheduledExecutorService scheduledExecutorService0, aulm aulm0, ausg ausg0, auhn auhn0, auca auca0, aveu aveu0, auwd auwd0, String s) {
        super(castDevice0, null, scheduledExecutorService0, (TextUtils.isEmpty(aubj0.d) ? "CSC" : String.format("%s-%s", aubj0.d, "CSC")), aubj0.a);
        this.o = new HashSet();
        this.s = context0;
        this.F = aulm0;
        this.I = ausg0;
        this.i = auhn0;
        this.B = auca0;
        this.q = aubj0;
        this.y = auwd0;
        this.C = aveu0.c;
        this.H = s;
        this.h = new avjh("CSC", this.c);
        aucm aucm0 = new aucm(this);
        this.G = aucm0;
        ausg0.d(aucm0);
        aucn aucn0 = new aucn(this);
        this.j = new aubj(aubj0.a, aubj0.b, aubj0.c, this.b, aucn0);
        this.x = 1;
        this.E = aubk.a(this.e, aubj0, auhn0);
        this.A = aubj0.c;
        this.r = new JoinOptions();
        this.p = new HashSet();
    }

    public final void A() {
        Future future0 = this.k;
        if(future0 != null) {
            this.h.m("cancel the endpoint switch timer");
            future0.cancel(false);
        }
        this.k = null;
    }

    public final void B(int v) {
        this.C();
        this.x = 1;
        this.q.e.k(v);
        this.E();
    }

    public final void C() {
        if(this.y() != null) {
            this.i.m(this.y(), this);
        }
        this.w = null;
    }

    public final void D() {
        aucd aucd0 = this.l;
        if(aucd0 == null) {
            return;
        }
        Set set0 = this.p;
        synchronized(set0) {
            for(Object object0: set0) {
                aucd0.Y(((auqv)object0));
            }
        }
        aucd0.Q();
        aucd0.d(false);
        this.l = null;
        this.m = null;
    }

    public final void E() {
        CastDevice castDevice0 = this.w();
        this.h.p("Disposing the controller for %s (connected device: %s)", this.e, castDevice0);
        auco auco0 = this.z;
        if(auco0 != null) {
            this.t.i.remove(auco0);
            this.z = null;
        }
        this.N(this.t);
        auhm auhm0 = this.D;
        if(auhm0 != null) {
            this.i.l(auhm0);
        }
        aush aush0 = this.G;
        if(aush0 != null) {
            this.I.e(aush0);
        }
        this.D();
        this.A();
        this.C();
        this.x = 1;
    }

    public final void F() {
        ScheduledExecutorService scheduledExecutorService0 = this.f;
        String s = this.h.b();
        long v = this.a.d();
        this.t = new auwu(scheduledExecutorService0, this.g, s, v);
        auco auco0 = new auco(this);
        this.z = auco0;
        this.t.i.add(auco0);
        this.I(this.t);
    }

    public final void G() {
        if(this.t == null) {
            this.h.m("skip onMultizoneStatusChanged as multizoneControlChannel is null");
            return;
        }
        String s = this.g.b;
        if(s == null) {
            this.h.m("skip onMultizoneStatusChanged as endpointDeviceId is null");
            return;
        }
        this.h.m("onMultizoneStatusChanged");
        auwv[] arr_auwv = this.t.i();
        new aulz(this.F.a, this.F.b, s, arr_auwv).b();
    }

    public final void H(CastDevice castDevice0, String s, boolean z) {
        this.O(castDevice0, s);
        if(z) {
            this.h.n("stream expansion is in progress with sessionId = %s", this.y());
            auxf auxf0 = this.g.a;
            if(auxf0 != null) {
                auxf0.a(auxe.c);
            }
        }
        aucd aucd0 = this.l;
        batl.s(aucd0);
        aucd0.c();
    }

    public final void I(auqv auqv0) {
        aucd aucd0 = this.l;
        if(aucd0 != null) {
            aucd0.P(auqv0);
        }
        this.p.add(auqv0);
    }

    public final void J(auwv auwv0, boolean z) {
        if(this.t != null) {
            String s = auwv0.a;
            Boolean boolean0 = Boolean.valueOf(z);
            this.h.r("set multizone member device:%s from (volume:%f, mute:%b) to (muteState:%b)", s, Double.valueOf(auwv0.d), Boolean.valueOf(auwv0.e), boolean0);
            auwu auwu0 = this.t;
            if(TextUtils.isEmpty(s)) {
                throw new IllegalArgumentException("deviceID cannot be null or empty");
            }
            String s1 = (String)auwu0.d.get(s);
            if(s1 != null) {
                ScheduledFuture scheduledFuture0 = auwu0.j;
                if(scheduledFuture0 != null) {
                    auwu0.n.c("Set device mute state to %b, cancel the previous device update", new Object[]{boolean0});
                    scheduledFuture0.cancel(false);
                }
                auwu0.j = null;
                long v = auwu0.k();
                auwu0.f.c(v, z);
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("requestId", v);
                    jSONObject0.put("type", "SET_DEVICE_VOLUME");
                    jSONObject0.put("deviceId", s1);
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("muted", z);
                    jSONObject0.put("volume", jSONObject1);
                }
                catch(JSONException unused_ex) {
                }
                auwu0.n.c("[requestId = %d] Set mute state %b to destinationId = %s", new Object[]{v, Boolean.valueOf(z), auwu0.h.a()});
                auwu0.m(jSONObject0.toString(), v, auwu0.h.a());
                return;
            }
            auwu0.n.d("Attempt to mute non-existing device %s.", new Object[]{s});
        }
    }

    public final void K() {
        aucl aucl0 = new aucl(this);
        this.D = aucl0;
        this.i.g(aucl0);
    }

    public final void L(auxc auxc0) {
        avjh avjh0 = this.h;
        avjh0.p("switch from %s to new sessionEndpoint: %s", this.m, auxc0);
        String s = auxc0.b;
        if(!this.E && (this.A & 4L) != 4L) {
            avjh0.m("Session following is disallowed. No-op.");
            this.g.d();
            return;
        }
        String s1 = auxc0.f;
        if(!TextUtils.equals(s1, this.y())) {
            avjh0.q("The endpoint device has a different session (from %s to %s) for %s. Exit.", this.y(), s1, this.e);
            this.C();
            this.D();
            this.x = 1;
            this.q.e.k(0x908);
            return;
        }
        avjh0.p("Session following is enabled. %s is switching to endpoint device: %s", this.e, s);
        auxc auxc1 = this.g;
        auxc1.b = auxc0.b;
        auxc1.c = auxc0.c;
        auxc1.d = auxc0.d;
        auxc1.e = auxc0.e;
        auxc1.f = auxc0.f;
        String s2 = this.y();
        if(s2 != null && s != null) {
            this.i.o(s2, s);
        }
        String s3 = auxc1.b;
        aujk aujk0 = null;
        CastDevice castDevice0 = s3 == null ? null : this.i.a(s3);
        if(castDevice0 != null) {
            this.m = castDevice0;
            this.M();
            return;
        }
        this.k = this.f.schedule(new auck(this), this.a.d(), TimeUnit.MILLISECONDS);
        if(s2 != null) {
            aujk0 = this.i.e(s2);
        }
        if(aujk0 != null) {
            aujk0.h();
        }
        this.n = s3;
        avjh0.p("Waiting for the endpoint device (%s) of %s to come online.", s3, this.e);
    }

    public final void M() {
        CastDevice castDevice0 = this.m;
        if(castDevice0 == null) {
            this.h.m("Can not switch to new endpoint as the new endpoint is null");
            return;
        }
        CastDevice castDevice1 = this.w();
        if(castDevice1 != null && castDevice1.f().equals(castDevice0.f())) {
            this.h.m("Keep using the connected device as endpoint device ID equals to connected one.");
            return;
        }
        if(this.g.e != null && this.l != null) {
            this.h.m("Keep using the connected device as there is a local device ID");
            aucd aucd0 = this.l;
            batl.s(aucd0);
            aucd0.D();
            aucd aucd1 = this.l;
            batl.s(aucd1);
            aucd1.ac();
            return;
        }
        this.h.m("Need to physically switch endpoints, disconnect from the connected device");
        this.D();
        this.x = 4;
        this.q.e.i(0x906);
        this.h.p("The endpoint device %s of %s is online. Reconnecting to it.", castDevice0, this.e);
        this.H(castDevice0, castDevice0.j, true);
    }

    public final void N(auqv auqv0) {
        aucd aucd0 = this.l;
        if(aucd0 != null) {
            aucd0.Y(auqv0);
        }
        this.p.remove(auqv0);
    }

    private final void O(CastDevice castDevice0, String s) {
        this.h.n("acquire device controller for device: %s", castDevice0);
        aucd aucd0 = this.B.a(castDevice0, this.g, s, this.H, this.j);
        this.l = aucd0;
        this.m = castDevice0;
        Set set0 = this.p;
        synchronized(set0) {
            for(Object object0: set0) {
                aucd0.P(((auqv)object0));
            }
        }
        batl.s(this.l);
    }

    @Override  // aubi
    public final CastDevice a() {
        return this.m;
    }

    @Override  // aubi
    public final String b() {
        aucd aucd0 = this.l;
        if(aucd0 == null) {
            return "CSC";
        }
        String s = aucd0.b();
        return TextUtils.isEmpty(s) ? "CSC" : "CSC|" + s;
    }

    @Override  // aubi
    public final void c() {
        CastDevice castDevice0;
        this.h.m("connect to device");
        this.D();
        this.A();
        if(this.E) {
            auhn auhn0 = this.i;
            aujk aujk0 = auhn0.d(this.e.f());
            castDevice0 = null;
            if(aujk0 != null) {
                aujj aujj0 = auhn0.b(aujk0.l);
                if(aujj0 != null) {
                    castDevice0 = aujj0.d();
                }
            }
        }
        else {
            castDevice0 = this.e;
        }
        if(castDevice0 == null) {
            this.x = 1;
            this.q.e.h(2017);
            return;
        }
        this.u = false;
        this.O(castDevice0, castDevice0.j);
        aucd aucd0 = this.l;
        if(aucd0 == null) {
            return;
        }
        aucd0.c();
        this.x = 2;
    }

    @Override  // aubi
    public final void d(boolean z) {
        this.h.n("disconnect from device, explicit disconnect: %b", Boolean.valueOf(z));
        aucd aucd0 = this.l;
        if(aucd0 != null) {
            aucd0.d(z);
        }
        this.x = 1;
    }

    @Override  // aubi
    public final void e(String s, String s1, JoinOptions joinOptions0) {
        aucd aucd0 = this.l;
        if(aucd0 != null) {
            aucd0.e(s, s1, joinOptions0);
        }
        this.r = joinOptions0;
    }

    @Override  // aubi
    public final void f(String s, LaunchOptions launchOptions0) {
        aucd aucd0 = this.l;
        if(aucd0 != null) {
            aucd0.f(s, launchOptions0);
        }
        this.r = new JoinOptions();
    }

    @Override  // aubi
    public final void g() {
        aucd aucd0 = this.l;
        if(aucd0 != null) {
            aucd0.g();
        }
    }

    @Override  // aubi
    public final void h(String s, String s1) {
        this.h.m("reconnect to device");
        throw new UnsupportedOperationException("CastSessionController.reconnectToDevice() should never be called.");
    }

    @Override  // aubi
    public final void i(String s) {
        if(s != null) {
            this.o.add(s);
            aucd aucd0 = this.l;
            if(aucd0 != null) {
                aucd0.i(s);
            }
        }
    }

    @Override  // aubi
    public final void j() {
        aucd aucd0 = this.l;
        if(aucd0 != null) {
            aucd0.j();
        }
    }

    @Override  // aubi
    public final void k(String s, byte[] arr_b, long v) {
        aucd aucd0 = this.l;
        if(aucd0 != null) {
            aucd0.k(s, arr_b, v);
        }
    }

    @Override  // aubi
    public final void l(String s, String s1, long v) {
        aucd aucd0 = this.l;
        if(aucd0 != null) {
            aucd0.l(s, s1, v);
        }
    }

    @Override  // aubi
    public final void m(String s, String s1, long v, String s2) {
        aucd aucd0 = this.l;
        if(aucd0 != null) {
            aucd0.m(s, s1, v, s2);
        }
    }

    @Override  // aubi
    public final void n(String s) {
        aucd aucd0 = this.l;
        if(aucd0 != null) {
            aucd0.n(s);
        }
    }

    @Override  // aubi
    public final void o(String s) {
        if(s != null) {
            this.o.remove(s);
            aucd aucd0 = this.l;
            if(aucd0 != null) {
                aucd0.o(s);
            }
        }
    }

    @Override  // aubi
    public final boolean p() {
        return this.x == 3;
    }

    @Override  // aubi
    public final boolean q() {
        return this.x == 2;
    }

    @Override  // aubi
    public final boolean r() {
        return this.x == 4;
    }

    @Override  // aubi
    public final boolean s(boolean z, double f, boolean z1) {
        return this.l != null && this.l.s(z, f, z1);
    }

    @Override  // aubi
    public final boolean t(double f, double f1, boolean z) {
        return this.l != null && this.l.t(f, f1, z);
    }

    @Override  // aubi
    public final void u(EqualizerSettings equalizerSettings0) {
        aucd aucd0 = this.l;
        if(aucd0 != null) {
            aucd0.u(equalizerSettings0);
        }
    }

    public final int v(int v, CastDevice castDevice0) {
        if(this.u && !this.C.e(castDevice0)) {
            int v1 = this.I.l() ? 2260 : 0x8D3;
            this.h.c("update status code from %d to %d", new Object[]{v, v1});
            return v1;
        }
        return v;
    }

    final CastDevice w() {
        return this.l == null ? null : this.l.e;
    }

    public final auwv x(String s) {
        auwu auwu0 = this.t;
        if(auwu0 != null) {
            HashMap hashMap0 = auwu0.c;
            return (auwv)hashMap0.get(s);
        }
        return null;
    }

    final String y() {
        return this.g.f;
    }

    public final List z() {
        return new ArrayList(Arrays.asList(this.t.i()));
    }
}

