import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;
import j..util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

public final class aucd extends aubi {
    public LaunchOptions A;
    public String B;
    public String C;
    public LaunchOptions D;
    public String E;
    public int F;
    atyx G;
    public long H;
    public final boolean I;
    public final atxp J;
    public final aulm K;
    public final long L;
    public final String M;
    public final atyb N;
    public aubj O;
    gehk P;
    public final audn Q;
    public String R;
    public String S;
    final aucj T;
    public final aucg U;
    public boolean V;
    public boolean W;
    public auba X;
    public aubu Y;
    final aucc Z;
    private static final AtomicLong aa;
    private final gful_cronetEngineProvider ab;
    private final gful_cronetEngineProvider ac;
    private final long ad;
    private final long ae;
    private final int af;
    private final int ag;
    private int ah;
    private final auad ai;
    private final aubz aj;
    private final Set ak;
    private final String al;
    private String am;
    private String[] an;
    private ScheduledFuture ao;
    private int ap;
    private gket aq;
    private final aveu ar;
    private JoinOptions as;
    private final auhn at;
    private final aveq au;
    private ScheduledFuture av;
    private final esaa aw;
    private auch ax;
    private final aucb ay;
    public static final AtomicLong h;
    public final boolean i;
    public final String j;
    public final avjh k;
    public final Handler l;
    public final Context m;
    public final aual n;
    public final String o;
    public audm p;
    public auct q;
    public audq r;
    public audd s;
    public audg t;
    public final ggla u;
    public ApplicationMetadata v;
    public String w;
    public String x;
    public boolean y;
    public boolean z;

    static {
        aucd.h = new AtomicLong(0L);
        aucd.aa = new AtomicLong(0L);
    }

    public aucd(Context context0, ScheduledExecutorService scheduledExecutorService0, CastDevice castDevice0, auxc auxc0, String s, String s1, aubj aubj0, atxp atxp0, aulm aulm0, aveu aveu0, auhn auhn0) {
        super(castDevice0, auxc0, scheduledExecutorService0, (TextUtils.isEmpty(aubj0.d) ? "CDC" : String.format("%s-%s", aubj0.d, "CDC")), aubj0.a);
        this.i = hqrp.a.b().e();
        this.j = hqrp.a.b().b();
        this.ab = gfus.a(((gful_cronetEngineProvider)new aubs()));
        this.ac = gfus.a(((gful_cronetEngineProvider)new aubt()));
        this.ad = hqqp.a.b().e();
        this.ae = hqqp.a.b().d();
        int v = (int)hqqp.a.b().h();
        this.af = v;
        int v1 = (int)hqqp.a.b().g();
        this.ag = v1;
        this.l = new clht(Looper.getMainLooper());
        long v2 = aurf.b();
        this.L = v2;
        this.O = aubj0;
        String s2 = aubj0.a;
        this.o = s2;
        avjh avjh0 = new avjh("CDC", this.c);
        this.k = avjh0;
        avjh0.f("Creating a new CastDeviceController from %s for %s", new Object[]{s2, castDevice0});
        this.F = 0;
        this.ah = 0;
        this.m = context0;
        this.I = aubj0.b >= 5000000;
        this.V(aubj0.c);
        this.J = atxp0;
        this.K = aulm0;
        String s3 = String.format(Locale.ROOT, "%s-%d", s2, aucd.aa.incrementAndGet());
        this.al = s3;
        this.u = new gfza();
        this.ak = new HashSet();
        this.ap = 0;
        this.aq = gket.a;
        audn audn0 = new audn();
        this.Q = audn0;
        this.ar = aveu0;
        aveq aveq0 = aveu0.c;
        this.au = aveq0;
        esaa esaa0 = new esaa(context0, 1, "CastDeviceController-" + s2, s2, (Objects.equals(s2, "gms_cast_mrp") || Objects.equals(s2, "gms_cast_rcn") ? "com.google.android.gms" : s2));
        this.aw = esaa0;
        WorkSource workSource0 = bbrd.b(context0, s2);
        if(workSource0 != null) {
            esaa0.k(workSource0);
        }
        auby auby0 = new auby(this);
        this.ai = auby0;
        this.n = auaj.a(context0, auby0, this.f, s2, s3, 0x20000, true, aveq0.e(castDevice0), atxp0, castDevice0.j);
        this.aj = new aubz(this);
        this.as = new JoinOptions();
        this.M = s;
        atyb atyb0 = null;
        if(this.e.p()) {
            atyb atyb1 = atxp0.f.a();
            if(atxp0.f.q(atyb1)) {
                atyb0 = atyb1;
            }
            this.N = atyb0;
        }
        else {
            this.N = null;
        }
        this.P = gehk.a;
        boolean z = s1 == null || ((hgfj)this.a.j.mr()).b.contains(s1);
        if(this.a.r() && !z) {
            boolean z1 = (this.H & 2L) == 2L;
            avjh0.n("Creating wake on lan proxy with error tracking: %b", Boolean.valueOf(z1));
            auba auba0 = new auba(castDevice0.f(), aulm0, s3, atxp0, v2, z1, s, this.N, s2);
            this.X = auba0;
            if(auba0.a("checking for device") != null) {
                audn0.a = hqqh.a.b().e();
            }
        }
        if(hqtc.a.b().a()) {
            this.G = new atyx();
        }
        aucj aucj0 = new aucj(this.P, s3, v, v1);
        this.T = aucj0;
        aucc aucc0 = new aucc(this);
        this.Z = aucc0;
        aucj0.e = aucc0;
        aucg aucg0 = new aucg(this.G);
        this.U = aucg0;
        aucb aucb0 = new aucb(this);
        this.ay = aucb0;
        aucg0.b = aucb0;
        this.at = auhn0;
    }

    public final void A(boolean z) {
        synchronized(this.n) {
            ++this.ah;
            if(z && this.O != null) {
                this.aw.d(this.o);
            }
        }
    }

    public final void B(aube aube0, boolean z, long v, int v1) {
        this.k.c("connectToApplicationAndNotify", new Object[0]);
        String s = aube0.e;
        this.k.c("setting current session ID to %s", new Object[]{s});
        this.W(s);
        this.ac();
        this.x = aube0.f;
        this.v = aucd.ab(aube0, v1);
        this.w = aube0.e;
        this.R = aube0.a;
        String s1 = this.w;
        this.S = s1;
        batl.s(s1);
        this.at.h(s1, this, aube0.a);
        if(this.Q.b()) {
            ScheduledFuture scheduledFuture0 = this.av;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(false);
            }
            this.N(true);
            return;
        }
        this.ai(aube0.a, z, v);
    }

    public final void C() {
        int v3;
        int v = this.n.c.a();
        avjh avjh0 = this.k;
        String s = this.o;
        avjh0.q("connectToDeviceInternal. Client: %s controller state: %s socket state: %s", s, auau.a(this.F), auau.a(v));
        if(this.X != null && this.X.e()) {
            avjh0.n("Waking wake-on-lan device: %s", this.e.e());
            auba auba0 = this.X;
            batl.s(auba0);
            auba0.d();
        }
        else {
            avjh0.n("Wake-on-Lan device does not need waking: %s", this.e.e());
        }
        int v1 = 2;
        if(this.F == 0 && (v != 1 && v != 2)) {
            aveq aveq0 = this.au;
            boolean z = aveq0.e(this.e);
            if(!z) {
                if(!this.e.p()) {
                    v1 = 3;
                }
            }
            else if(aveq0.d(this.e.f())) {
                this.J.o.d();
                v1 = 5;
            }
            else {
                v1 = 4;
            }
            this.J.af(this.e, this.L, this.af(), this.M, this.N, v1, s);
            this.F = 1;
            audn audn0 = this.Q;
            if(!audn0.c()) {
                long v2 = SystemClock.elapsedRealtime();
                audn0.b = v2;
                audn0.c = v2;
            }
            if(audn0.c != 0L) {
                audn0.b = SystemClock.elapsedRealtime();
            }
            if(z) {
                if(s != null) {
                    Context context0 = this.m;
                    String s1 = this.e.f();
                    if(!aveq.c(s1)) {
                        if(aveq0.d(s1) && !hque.a.d().h().b.contains(s)) {
                        label_42:
                            String s2 = null;
                            this.V = true;
                            aveu aveu0 = this.ar;
                            CastDevice castDevice0 = this.e;
                            aual aual0 = this.n;
                            aubu aubu0 = this.Y;
                            avjh avjh1 = new avjh("RelayCastSessionManager", this.c);
                            Context context1 = aveu0.b;
                            Context context2 = context1.getApplicationContext();
                            String s3 = castDevice0.f();
                            aveq aveq1 = aveu0.c;
                            gqft gqft0 = null;
                            if(aveq.c(s3)) {
                                s2 = cjpd.c(avjn.e(context2), "RELAY_CASTING_ACTIVE_ACCOUNT_NAME", null);
                            }
                            else if(aveq1.d(s3)) {
                                String s4 = aveq1.b(castDevice0.f());
                                for(Object object0: aveq1.a.b.e().values()) {
                                    Iterator iterator1 = ((List)object0).iterator();
                                label_63:
                                    if(iterator1.hasNext()) {
                                        Object object1 = iterator1.next();
                                        auku auku0 = (auku)object1;
                                        if(!TextUtils.equals(s4, auku0.b)) {
                                            goto label_63;
                                        }
                                        s2 = auku0.a;
                                        break;
                                    }
                                }
                            }
                            boolean z1 = aveq.c(castDevice0.f());
                            if(aveq1.d(castDevice0.f())) {
                                aukm aukm0 = aveq1.a(castDevice0.f());
                                if(aukm0 == null || !aukm0.a()) {
                                    avjh1.g("The target device is not eligible for relay casting, connection will fail", new Object[0]);
                                    aubu0.a(0x971);
                                    return;
                                }
                            }
                            if(s2 == null) {
                                avjh1.g("No account configured for relay casting, connection will fail", new Object[0]);
                                aubu0.a((z1 ? 2401 : 0x970));
                                return;
                            }
                            String s5 = aveq1.b(castDevice0.f());
                            batl.s(s5);
                            auiz auiz0 = aveu0.a;
                            String s6 = auiz0.i(s5);
                            if(s6 == null) {
                                v3 = 2402;
                            }
                            else {
                                aujd aujd0 = auiz0.c(s6);
                                gqft gqft1 = aujd0 == null ? null : aujd0.o;
                                if(gqft1 == null) {
                                    v3 = 2406;
                                }
                                else if(gqft1.f.isEmpty()) {
                                    v3 = 2407;
                                }
                                else {
                                    gqft0 = gqft1;
                                    v3 = 0;
                                }
                            }
                            if(z1 && v3 != 0) {
                                avjh1.g("Failed to fetch RAT, errorCode=" + v3, new Object[0]);
                                aubu0.a(v3);
                                return;
                            }
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqfk.a).v_newBuilder();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp0.b_message;
                            ((gqfk)hftv0).c = s5;
                            if(gqft0 == null) {
                                avjh1.m("making relay connection without RAT");
                            }
                            else {
                                if(!hftv0.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ((gqfk)hftp0.b_message).e = gqft0;
                                ((gqfk)hftp0.b_message).b |= 1;
                            }
                            aubg aubg0 = aubg.a(context1);
                            aubg0.b();
                            byte[] arr_b = aubg0.a;
                            if(arr_b != null) {
                                ByteString hfsf0 = ByteString.copyFrom(arr_b);
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ((gqfk)hftp0.b_message).d = hfsf0;
                            }
                            avel avel0 = new avel(aveu0.e);
                            baqr baqr0 = bbfe_BaseGrpcServer.createAuthRequest(s2);
                            if(aveu0.d == null) {
                                aveu0.d = new bbll(((int)hqqv.a.c().c()), 10);
                            }
                            evql evql0 = avjn.f(aveu0.d, new aver(avel0, baqr0, hftp0));
                            evql0.y(atzn.a(), new aves(castDevice0, aual0, aubu0, avjh1));
                            evql0.v(atzn.a(), new avet(aubu0, avjh1));
                            return;
                        }
                    }
                    else if(TextUtils.equals(s, "com.google.android.apps.chromecast.app")) {
                        try {
                            avjn.n(context0, s);
                            goto label_42;
                        }
                        catch(IllegalArgumentException | SecurityException unused_ex) {
                        }
                    }
                }
                this.k.d("Device connect should be done via relay but relay casting is disabled", new Object[0]);
                this.K(2400, false, aucd.x(2400));
                return;
            }
            if(this.e.p()) {
                try {
                    this.k.m("connecting socket now");
                    CastDevice castDevice1 = this.e;
                    auag auag0 = auah.a(castDevice1.c, castDevice1.g, castDevice1.r);
                    auag0.c = castDevice1.p;
                    auah auah0 = auag0.a();
                    this.n.a(castDevice1.d, auah0, true);
                    return;
                }
                catch(IOException iOException0) {
                    this.k.e(iOException0, "connection exception", new Object[0]);
                    this.K(0x8D1, true, gket.c);
                }
            }
            return;
        }
        avjh0.g("Redundant call to connect to device", new Object[0]);
    }

    public final void D() {
        auct auct0 = this.q;
        if(auct0 != null) {
            Object[] arr_object = {auct0.b.a()};
            auct0.n.c("connect to receiver destination ID = %s", arr_object);
            auct0.m(auct0.b().toString(), 0L, auct0.b.a());
        }
    }

    public final void E(int v) {
        String s = this.y(v);
        String s1 = atru.a(v);
        this.k.p("listener.onApplicationDisconnected (%s) and sessionId (%s)", s1, s);
        aubj aubj0 = this.O;
        if(aubj0 != null) {
            aubj0.e.hj(v, s);
        }
    }

    public final void F(int v) {
        aual aual0 = this.n;
        if(aual0.c.n()) {
            this.ap = v;
            aual0.b();
            return;
        }
        this.J(v);
    }

    public final void G() {
        audq audq0 = this.r;
        if(audq0 != null) {
            audq0.e.a();
        }
    }

    // Detected as a lambda impl.
    public final void H() {
        int v1;
        synchronized(this) {
            if(this.ax == null) {
                this.ax = this.T.b();
            }
            auch auch0 = this.ax;
            if(auch0 != null) {
                gehl gehl0 = auch0.a;
                String s = gehl0.f;
                if(((ProtoLiteMessage)gehl0).isImmutable()) {
                    v1 = ((ProtoLiteMessage)gehl0).t(null);
                    if(v1 < 0) {
                        throw new IllegalStateException("serialized size must be non-negative, was " + v1);
                    }
                }
                else {
                    v1 = gehl0.memoizedSerializedSize & 0x7FFFFFFF;
                    if(v1 == 0x7FFFFFFF) {
                        v1 = ((ProtoLiteMessage)gehl0).t(null);
                        if(v1 < 0) {
                            throw new IllegalStateException("serialized size must be non-negative, was " + v1);
                        }
                        gehl0.memoizedSerializedSize = gehl0.memoizedSerializedSize & 0x80000000 | v1;
                    }
                }
                long v2 = auch0.b;
                if(v1 > 0x10000) {
                    aubj aubj0 = this.O;
                    if(aubj0 != null) {
                        aubj0.e.m(s, v2, 2006);
                    }
                    gehk gehk0 = gehk.b(gehl0.c) == null ? gehk.a : gehk.b(gehl0.c);
                    auch auch1 = this.ax;
                    batl.s(auch1);
                    this.X(gkfu.e, gehk0, auch1.c);
                    this.T.e(s, v2);
                    this.ax = null;
                    this.S();
                    return;
                }
                aual aual0 = this.n;
                if(aual0.c.m(v1)) {
                    try {
                        aual0.c.j(gehl0);
                        if(!gehl0.j) {
                            aubj aubj1 = this.O;
                            if(aubj1 != null) {
                                aubj1.e.l(s, v2);
                            }
                            gehk gehk1 = gehk.b(gehl0.c) == null ? gehk.a : gehk.b(gehl0.c);
                            auch auch2 = this.ax;
                            batl.s(auch2);
                            this.X(gkfu.b, gehk1, auch2.c);
                        }
                    }
                    catch(IllegalStateException unused_ex) {
                        aubj aubj2 = this.O;
                        if(aubj2 != null) {
                            aubj2.e.m(s, v2, 0x8D1);
                        }
                        gehk gehk2 = gehk.b(gehl0.c) == null ? gehk.a : gehk.b(gehl0.c);
                        auch auch3 = this.ax;
                        batl.s(auch3);
                        this.X(gkfu.f, gehk2, auch3.c);
                        this.T.e(s, v2);
                    }
                    catch(IOException iOException0) {
                        this.k.h(iOException0, "Error while sending message", new Object[0]);
                        this.T.d();
                        this.F(0x8D1);
                    }
                    this.ax = null;
                    this.S();
                }
            }
        }
    }

    public final void I(boolean z) {
        this.k.m("finishConnecting");
        this.D();
        audg audg0 = new audg(this.ad, this.c);
        this.t = audg0;
        this.P(audg0);
        aubl aubl0 = new aubl(this);
        this.ao = this.f.scheduleWithFixedDelay(aubl0, this.ae, this.ae, TimeUnit.MILLISECONDS);
        this.F = 2;
        boolean z1 = this.af();
        this.J.g(this.e, this.L, z1, this.M, this.N, z, this.o);
        String s = this.R;
        if(s != null) {
            String s1 = this.S;
            if(s1 != null) {
                this.z = false;
                this.ah(s, s1);
                return;
            }
        }
        this.Q.b();
        this.N(true);
        this.p.b();
    }

    public final void J(int v) {
        if(this.q()) {
            this.K(aucd.ae(v), true, atyg.a(v));
            return;
        }
        avjh avjh0 = this.k;
        avjh0.p("finishDisconnecting; socketError=%s, mDisconnectStatusCode=%s", auaf.h(v), atru.a(this.ap));
        this.F = 0;
        audg audg0 = this.t;
        if(audg0 != null) {
            this.Y(audg0);
            this.t = null;
        }
        audd audd0 = this.s;
        if(audd0 != null) {
            this.Y(audd0);
            this.s = null;
        }
        audm audm0 = this.p;
        audm0.d.k(2002);
        audm0.f.k(2002);
        audm0.h.k(2002);
        audm0.i.k(2002);
        audm0.j = NaN;
        audm0.k = -1;
        audm0.l = -1;
        this.at.m(this.w, this);
        this.v = null;
        this.w = null;
        this.x = null;
        ScheduledFuture scheduledFuture0 = this.ao;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(false);
        }
        this.T.d();
        this.U.a();
        this.ax = null;
        int v1 = this.ap;
        if(v1 == 0) {
            v1 = aucd.ae(v);
        }
        else {
            this.ap = 0;
        }
        this.Q.b();
        avjh0.n("listener.onDisconnected(%s)", atru.a(v1));
        aubj aubj0 = this.O;
        if(aubj0 != null) {
            aubj0.e.k(v1);
        }
        atyx atyx0 = this.G;
        if(atyx0 == null) {
            return;
        }
        this.J.i(atyx0, this.o);
    }

    public final void K(int v, boolean z, gket gket0) {
        gket gket2;
        boolean z1;
        this.F = 0;
        String s = atru.a(v);
        String s1 = atru.a(this.ap);
        avjh avjh0 = this.k;
        avjh0.s("handleConnectionFailure; castStatusCode=%s, analytics: %s, originalDisconnectStatusCode=%s originalAnalyticsErrorCode: %s, tryAgain:%b", s, gket0, s1, this.aq, Boolean.valueOf(z));
        if(!this.a.r()) {
            if(z) {
                long v2 = this.Q.a();
                if(v2 >= 0L) {
                    this.av = this.f.schedule(new aubn(this), v2, TimeUnit.MILLISECONDS);
                    return;
                }
                this.ag();
            }
            else {
                this.Q.b();
            }
        }
        else if(!z) {
            this.Q.b();
        }
        else {
            long v1 = this.Q.a();
            if(this.X != null && this.X.e()) {
                avjh0.c("Continue retrying for wake-on-lan device", new Object[0]);
                z1 = true;
                v1 = 0L;
            }
            else {
                z1 = false;
            }
            avjh0.n("Reconnect delay: %d", Long.valueOf(v1));
            if(v1 >= 0L) {
                this.av = this.f.schedule(new aubp(this, z1), v1, TimeUnit.MILLISECONDS);
                return;
            }
            this.ag();
        }
        if(this.X != null) {
            avjh0.m("Updating wake-on-lan device status after connection failed");
            auba auba0 = this.X;
            batl.s(auba0);
            auba0.c(this.e);
        }
        int v3 = this.ap;
        if(v3 == 0) {
            gket2 = gket0;
        }
        else {
            gket gket1 = this.aq;
            this.ap = 0;
            this.aq = gket.a;
            v = v3;
            gket2 = gket1;
        }
        this.J.f(this.e, this.L, this.af(), gket2, this.M, this.N, this.o);
        avjh0.n("listener.onConnectionFailed(%s)", atru.a(v));
        aubj aubj0 = this.O;
        if(aubj0 != null) {
            aubj0.e.h(v);
        }
    }

    public final void L(String s, LaunchOptions launchOptions0) {
        if(((Boolean)this.ab.mr()).booleanValue() && this.e.n()) {
            String s1 = this.e.f();
            this.k.p("SendIntent. targetDeviceId=%s, appId=%s", s1, s);
            Intent intent0 = new Intent("com.google.android.apps.mediashell.cast_local_launch").putExtra("target_device_id", s1).putExtra("app_id", s).setPackage("com.google.android.apps.mediashell");
            baif.a(this.m, intent0);
        }
        if(!TextUtils.isEmpty(s) && !s.equals("")) {
            this.an = launchOptions0.c ? new String[]{"WEB", "ANDROID_TV"} : new String[]{"WEB"};
            CredentialsData credentialsData0 = launchOptions0.d;
            this.W = hqrj.c();
            if(launchOptions0.a) {
                long v = this.p.a(s, launchOptions0.b, this.an, credentialsData0);
                this.J.v(this.e, this.L, s, launchOptions0.a, this.M, this.N, v, this.o);
                return;
            }
            this.z = true;
            this.A = launchOptions0;
            launchOptions0.a = true;
            this.ah(s, "");
            return;
        }
        this.M(2004, s, null);
    }

    public final void M(int v, String s, String s1) {
        this.J.b(this.e, this.L, v, this.M, this.N, s, s1, this.o);
        String s2 = atru.a(v);
        ((ggtj)((ggtj)this.k.d.i()).ar(0x5FC)).X("calling Listener.onApplicationConnectionFailed(%s) appId:%s receiverSessionId:%s", s2, s, s1);
        aubj aubj0 = this.O;
        if(aubj0 != null) {
            aubj0.e.hi(v);
        }
    }

    public final void N(boolean z) {
        this.k.n("calling Listener.onConnected(%b)", Boolean.valueOf(z));
        aubj aubj0 = this.O;
        if(aubj0 != null) {
            aubj0.e.hn(z);
        }
    }

    public final void O(String s, LaunchOptions launchOptions0) {
        this.J.u(this.e, this.L, s, launchOptions0.a, this.M, this.N, this.o);
        this.L(s, launchOptions0);
    }

    public final void P(auqv auqv0) {
        auqv0.n(this.aj);
        synchronized(this.u) {
            this.u.v(auqv0.o, auqv0);
        }
    }

    public final void Q() {
        this.O = null;
        this.R(false);
    }

    final void R(boolean z) {
        synchronized(this.n) {
            if(z) {
                esaa esaa0 = this.aw;
                if(!esaa0.l()) {
                    this.k.d("Unbalanced call in releasing the wake lock.", new Object[0]);
                }
                else if(this.O != null) {
                    esaa0.n(this.o);
                }
            }
            int v1 = this.ah;
            if(v1 > 0) {
                this.ah = v1 - 1;
                if(v1 - 1 == 0) {
                    avjh avjh0 = this.k;
                    avjh0.n("[%s] *** disposing ***", this.e);
                    if(avij.e().l() && !avij.e().w() && this.r != null) {
                        avjh0.m("Closing the TOS dialog during CDC dispose.");
                        this.G();
                        this.M(0x809, this.am, null);
                    }
                    int v2 = 0;
                    while(true) {
                        esaa esaa1 = this.aw;
                        if(!esaa1.l()) {
                            break;
                        }
                        ++v2;
                        esaa1.n(this.c);
                    }
                    if(v2 > 0) {
                        avjh0.g("Unbalanced call in releasing the wake lock. Released %d locks.", new Object[]{v2});
                    }
                    ScheduledFuture scheduledFuture0 = this.ao;
                    if(scheduledFuture0 != null) {
                        scheduledFuture0.cancel(false);
                    }
                    ScheduledFuture scheduledFuture1 = this.av;
                    if(scheduledFuture1 != null) {
                        scheduledFuture1.cancel(false);
                    }
                    this.d(false);
                    this.F = 4;
                }
            }
            else {
                this.k.d("Unbalanced call to releaseReference(); controller state=%s", new Object[]{auau.a(this.F)});
            }
        }
    }

    public final void S() {
        aubm aubm0 = () -> {
            int v1;
            synchronized(this) {
                if(this.ax == null) {
                    this.ax = this.T.b();
                }
                auch auch0 = this.ax;
                if(auch0 != null) {
                    gehl gehl0 = auch0.a;
                    String s = gehl0.f;
                    if(((ProtoLiteMessage)gehl0).isImmutable()) {
                        v1 = ((ProtoLiteMessage)gehl0).t(null);
                        if(v1 < 0) {
                            throw new IllegalStateException("serialized size must be non-negative, was " + v1);
                        }
                    }
                    else {
                        v1 = gehl0.memoizedSerializedSize & 0x7FFFFFFF;
                        if(v1 == 0x7FFFFFFF) {
                            v1 = ((ProtoLiteMessage)gehl0).t(null);
                            if(v1 < 0) {
                                throw new IllegalStateException("serialized size must be non-negative, was " + v1);
                            }
                            gehl0.memoizedSerializedSize = gehl0.memoizedSerializedSize & 0x80000000 | v1;
                        }
                    }
                    long v2 = auch0.b;
                    if(v1 > 0x10000) {
                        aubj aubj0 = this.O;
                        if(aubj0 != null) {
                            aubj0.e.m(s, v2, 2006);
                        }
                        gehk gehk0 = gehk.b(gehl0.c) == null ? gehk.a : gehk.b(gehl0.c);
                        auch auch1 = this.ax;
                        batl.s(auch1);
                        this.X(gkfu.e, gehk0, auch1.c);
                        this.T.e(s, v2);
                        this.ax = null;
                        this.S();
                        return;
                    }
                    aual aual0 = this.n;
                    if(aual0.c.m(v1)) {
                        try {
                            aual0.c.j(gehl0);
                            if(!gehl0.j) {
                                aubj aubj1 = this.O;
                                if(aubj1 != null) {
                                    aubj1.e.l(s, v2);
                                }
                                gehk gehk1 = gehk.b(gehl0.c) == null ? gehk.a : gehk.b(gehl0.c);
                                auch auch2 = this.ax;
                                batl.s(auch2);
                                this.X(gkfu.b, gehk1, auch2.c);
                            }
                        }
                        catch(IllegalStateException unused_ex) {
                            aubj aubj2 = this.O;
                            if(aubj2 != null) {
                                aubj2.e.m(s, v2, 0x8D1);
                            }
                            gehk gehk2 = gehk.b(gehl0.c) == null ? gehk.a : gehk.b(gehl0.c);
                            auch auch3 = this.ax;
                            batl.s(auch3);
                            this.X(gkfu.f, gehk2, auch3.c);
                            this.T.e(s, v2);
                        }
                        catch(IOException iOException0) {
                            this.k.h(iOException0, "Error while sending message", new Object[0]);
                            this.T.d();
                            this.F(0x8D1);
                        }
                        this.ax = null;
                        this.S();
                    }
                }
            }
        };
        this.f.execute(aubm0);
    }

    public final void T(String s, byte[] arr_b, long v, String s1) {
        if(arr_b != null && !TextUtils.isEmpty(s1)) {
            if(TextUtils.isEmpty(s1)) {
                throw new IllegalStateException("Destination ID is null.");
            }
            this.f.execute(new aubo(this, arr_b, s, s1, v));
            return;
        }
        int v1 = 0;
        this.k.d("sendBinaryMessage - Binary message has no destination ID. Message discarded.", new Object[0]);
        aubj aubj0 = this.O;
        if(aubj0 != null) {
            aubj0.e.m(s, v, 2001);
        }
        gkfu gkfu0 = gkfu.c;
        gehk gehk0 = gehk.a;
        if(arr_b != null) {
            v1 = arr_b.length;
        }
        this.X(gkfu0, gehk0, v1);
    }

    final void U(String s, Object object0, long v, String s1) {
        if(TextUtils.isEmpty(s1)) {
            this.k.d("sendMessageSyncInternal - Text message has no destination ID. Message discarded.", new Object[0]);
            aubj aubj0 = this.O;
            if(aubj0 != null) {
                aubj0.e.m(s, v, 2001);
            }
            this.X(gkfu.c, gehk.a, aucj.a(object0));
            return;
        }
        auch auch0 = this.T.c(s, object0, v, s1);
        if(auch0 == null) {
            this.k.d("sendMessageSyncInternal - Chunked message is null. Message discarded.", new Object[0]);
            aubj aubj1 = this.O;
            if(aubj1 != null) {
                aubj1.e.m(s, v, 2001);
            }
            this.X(gkfu.c, gehk.a, aucj.a(object0));
            return;
        }
        try {
            gehl gehl0 = auch0.a;
            this.n.c.j(gehl0);
            aubj aubj2 = this.O;
            if(aubj2 != null) {
                aubj2.e.l(s, v);
            }
            gehk gehk0 = gehk.b(gehl0.c) == null ? gehk.a : gehk.b(gehl0.c);
            this.X(gkfu.b, gehk0, auch0.c);
        }
        catch(aubf unused_ex) {
            aubj aubj3 = this.O;
            if(aubj3 != null) {
                aubj3.e.m(s, v, 0x8D1);
            }
            gehk gehk1 = gehk.b(auch0.a.c) == null ? gehk.a : gehk.b(auch0.a.c);
            this.X(gkfu.d, gehk1, auch0.c);
        }
        catch(IllegalStateException unused_ex) {
            aubj aubj4 = this.O;
            if(aubj4 != null) {
                aubj4.e.m(s, v, 0x8D1);
            }
            gehk gehk2 = gehk.b(auch0.a.c) == null ? gehk.a : gehk.b(auch0.a.c);
            this.X(gkfu.f, gehk2, auch0.c);
        }
        catch(IOException iOException0) {
            this.k.h(iOException0, "Error while sending message", new Object[0]);
            this.F(0x8D1);
        }
    }

    public final void V(long v) {
        if(this.H == v) {
            return;
        }
        this.H = v;
        boolean z = (v & 1L) != 0L;
        this.k.c = z;
        aurs.a = z;
    }

    public final void W(String s) {
        this.g.b(s);
    }

    public final void X(gkfu gkfu0, gehk gehk0, int v) {
        atyx atyx0 = this.G;
        if(atyx0 != null) {
            atyw atyw0 = new atyw(gkfu0, gehk0);
            Map map0 = atyx0.a;
            if(!map0.containsKey(atyw0)) {
                map0.put(atyw0, new atzh());
            }
            ((atzh)map0.get(atyw0)).b(((double)v));
        }
    }

    public final void Y(auqv auqv0) {
        auqv0.n(null);
        synchronized(this.u) {
            this.u.E(auqv0.o, auqv0);
        }
    }

    public final boolean Z(String s) {
        if(TextUtils.isEmpty(s)) {
            s = "WEB";
        }
        String[] arr_s = this.an;
        if(arr_s != null) {
            for(int v = 0; v < arr_s.length; ++v) {
                if(arr_s[v].equals(s)) {
                    return true;
                }
            }
            this.k.n("Active app has the same app ID but sender doesn\'t support the type: %s. ", s);
            return false;
        }
        this.k.g("C2N is enabled but supported types is not available.", new Object[0]);
        return false;
    }

    @Override  // aubi
    public final CastDevice a() {
        return this.e;
    }

    static void aa(aucd aucd0) {
        atrq atrq0 = new atrq(aucd0.e);
        atrq0.j = 0;
        CastDevice castDevice0 = atrq0.a();
        aucd0.e = castDevice0;
        aujd aujd0 = aucd0.K.a.c(aucd0.e.f());
        if(aujd0 != null) {
            aujd0.j(castDevice0, true);
        }
        aucd0.k.n("Updated CastDevice status to %d after TOS acceptance.", Integer.valueOf(aucd0.e.h));
    }

    public static final ApplicationMetadata ab(aube aube0, int v) {
        String s = aube0.a;
        String s1 = aube0.b;
        String s2 = aube0.c;
        audo audo0 = null;
        if(TextUtils.isEmpty(s1)) {
            s2 = null;
        }
        else {
            if(TextUtils.isEmpty(s2)) {
                s2 = "WEB";
            }
            s = s1;
        }
        ApplicationMetadata applicationMetadata0 = new ApplicationMetadata();
        Objects.requireNonNull(applicationMetadata0);
        applicationMetadata0.a = s;
        applicationMetadata0.g = s2;
        applicationMetadata0.b = aube0.d;
        applicationMetadata0.f = aube0.j;
        applicationMetadata0.c = aube0.a();
        applicationMetadata0.h = aube0.g;
        applicationMetadata0.i = aube0.h;
        applicationMetadata0.j = v;
        for(Object object0: aube0.i) {
            audo audo1 = (audo)object0;
            if(audo1.a == 1) {
                audo0 = audo1;
                break;
            }
        }
        if(audo0 != null) {
            applicationMetadata0.d = audo0.b;
            applicationMetadata0.e = audo0.c;
        }
        return applicationMetadata0;
    }

    public final void ac() {
        auct auct0 = this.q;
        if(auct0 != null) {
            int v = this.as.a;
            String s = auct0.b.f;
            if(TextUtils.isEmpty(s)) {
                auct0.n.f("skip sending out connectToApplicationDestination as the sessionId is null", new Object[0]);
                return;
            }
            JSONObject jSONObject0 = auct0.b();
            try {
                jSONObject0.put("connType", v);
            }
            catch(JSONException jSONException0) {
                auct0.n.g("Error while creating a virtual connection: %s", new Object[]{jSONException0.getMessage()});
            }
            auct0.n.c("send out connectToApplicationDestination to (destinationId = %s): %s", new Object[]{s, jSONObject0.toString()});
            auct0.m(jSONObject0.toString(), 0L, s);
        }
    }

    final void ad(Object object0, String s) {
        List list0;
        if(TextUtils.isEmpty(s)) {
            this.k.g("Received a message with an empty or missing namespace", new Object[0]);
            return;
        }
        synchronized(this.u) {
            list0 = ((gfxo)this.u).g(s);
        }
        ArrayList arrayList0 = new ArrayList(list0);
        int v2 = arrayList0.size();
        for(int v = 0; v < v2; ++v) {
            auqv auqv0 = (auqv)arrayList0.get(v);
            if((object0 instanceof String)) {
                auqv0.E(((String)object0));
            }
            else {
                auqv0.g(((byte[])object0));
            }
        }
        synchronized(this.ak) {
            boolean z = this.ak.contains(s);
        }
        if(z) {
            if((object0 instanceof String)) {
                aubj aubj0 = this.O;
                if(aubj0 != null) {
                    aubj0.e.o(s, ((String)object0));
                }
            }
            else {
                aubj aubj1 = this.O;
                if(aubj1 != null) {
                    aubj1.e.hm(s, ((byte[])object0));
                }
            }
        }
        int v4 = aucj.a(object0);
        atyx atyx0 = this.G;
        if(atyx0 != null) {
            atyx0.c.b(((double)v4));
        }
        if(list0.isEmpty() && !z) {
            this.k.n("Ignoring message. Namespace \'%s\' has not been registered.", s);
        }
    }

    public static final int ae(int v) {
        switch(v) {
            case 0: {
                return 0;
            }
            case 1: {
                return 2250;
            }
            case 2: {
                return 0x8CB;
            }
            case 3: {
                return 0x8CC;
            }
            case 4: {
                return 0x8CD;
            }
            case 5: {
                return 0x8CE;
            }
            case 6: {
                return 0x8D6;
            }
            case 7: {
                return 0x8D7;
            }
            case 8: {
                return 0x8D8;
            }
            case 9: {
                return 0x8D9;
            }
            case 10: {
                return 0x8DA;
            }
            case 11: {
                return 0x8DB;
            }
            case 12: {
                return 0x8DC;
            }
            case 13: {
                return 0x8DD;
            }
            case 14: {
                return 2270;
            }
            case 15: {
                return 0x8DF;
            }
            case 16: {
                return 0x8E0;
            }
            case 17: {
                return 0x8E1;
            }
            case 18: {
                return 0x8E2;
            }
            case 19: {
                return 0x8E3;
            }
            default: {
                return 0x8D2;
            }
        }
    }

    public final boolean af() {
        return (this.H & 2L) == 2L;
    }

    private final void ag() {
        if(avij.e().l() && avij.e().w() && this.r != null) {
            this.k.m("Closing the TOS dialog after reconnection failed.");
            this.G();
            this.M(0x809, this.C, null);
        }
    }

    private final void ah(String s, String s1) {
        avjh avjh0 = this.k;
        avjh0.q("joinApplicationInternal: appId:%s sessionId:%s joinOptions:%s", s, s1, this.as);
        ApplicationMetadata applicationMetadata0 = this.v;
        if(applicationMetadata0 == null) {
            if(s == null) {
                s = "";
            }
            this.B = s;
            this.E = s1;
            this.p.b();
            return;
        }
        if((TextUtils.isEmpty(s) || s.equals(applicationMetadata0.a)) && (TextUtils.isEmpty(s1) || s1.equals(this.w)) && (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) || this.Z(applicationMetadata0.g)) && this.w != null) {
            avjh0.m("already connected to requested app, so skipping join logic");
            this.ai(s, false, -1L);
            String s2 = this.w;
            batl.s(s2);
            this.at.h(s2, this, s);
            return;
        }
        avjh0.m("clearing mLastConnected* variables");
        this.R = null;
        this.S = null;
        if(this.Q.b()) {
            this.N(false);
            return;
        }
        this.M(0x805, s, s1);
    }

    private final void ai(String s, boolean z, long v) {
        this.k.n("notifyApplicationConnected with applicationId = %s", s);
        this.n.c();
        this.J.c(this.e, this.L, s, this.M, this.N, v, this.o);
        aubj aubj0 = this.O;
        if(aubj0 != null && this.x != null) {
            ApplicationMetadata applicationMetadata0 = this.v;
            batl.s(applicationMetadata0);
            String s1 = this.x;
            batl.s(s1);
            String s2 = this.w;
            batl.s(s2);
            aubj0.e.hh(applicationMetadata0, s1, s2, z);
        }
    }

    @Override  // aubi
    public final String b() {
        return this.k.b();
    }

    @Override  // aubi
    public final void c() {
        if(this.r()) {
            this.k.m("already reconnecting; ignoring");
            return;
        }
        if(this.O == null) {
            this.k.g("No device controller client. Don\'t connect.", new Object[0]);
            return;
        }
        this.k.m("calling CastOperationService.connectToDevice");
        this.C();
    }

    @Override  // aubi
    public final void d(boolean z) {
        CastDevice castDevice0 = this.e;
        String s = auau.a(this.F);
        aual aual0 = this.n;
        String s1 = auau.a(aual0.c.a());
        avjh avjh0 = this.k;
        avjh0.r("disconnectFromDevice. Device: %s. controller state: %s socket state: %s, explicit: %b", castDevice0, s, s1, Boolean.valueOf(z));
        this.F = 3;
        this.Q.b();
        if(aual0.c.o()) {
            aual0.b();
        }
        else if(aual0.c.n()) {
            if(z) {
                String s2 = this.z();
                if(s2 != null && this.q != null) {
                    avjh0.n("explicitly disconnecting from app %s", s2);
                    auct auct0 = this.q;
                    batl.s(auct0);
                    auct0.d();
                }
            }
            aual0.b();
        }
        else {
            avjh0.m("Socket is NOT connected. No-op.");
        }
        if(this.X != null) {
            avjh0.m("Updating wake-on-lan device status after connection disconnected");
            auba auba0 = this.X;
            batl.s(auba0);
            auba0.c(this.e);
        }
        this.T.d();
        this.U.a();
    }

    @Override  // aubi
    public final void e(String s, String s1, JoinOptions joinOptions0) {
        String[] arr_s;
        CastDevice castDevice0 = this.e;
        int v = TextUtils.isEmpty(s1) ^ 1;
        this.J.t(castDevice0, this.L, s, ((boolean)v), this.M, this.N, joinOptions0.a, this.o);
        this.as = joinOptions0;
        boolean z = ((Boolean)this.ac.mr()).booleanValue();
        int v1 = joinOptions0.a;
        if(v1 != 2) {
            arr_s = new String[]{"WEB"};
        }
        else if(z) {
            arr_s = new String[]{"WEB", "ANDROID_TV", "NATIVE"};
        }
        else {
            arr_s = new String[]{"WEB", "ANDROID_TV"};
        }
        this.an = arr_s;
        this.W = v1 == 2 ? false : hqrj.c();
        this.ah(s, s1);
    }

    @Override  // aubi
    public final void f(String s, LaunchOptions launchOptions0) {
        aucd aucd0;
        avjh avjh0 = this.k;
        avjh0.p("launchApplication. id=%s, options=%s", s, launchOptions0);
        if(!avij.e().w()) {
            this.am = s;
        }
        if(this.a.l() && (this.e.h == 3 ? aujc.b : aujc.c) == aujc.b) {
            avjh0.m("Deferring the launch request because ToS has not been accepted.");
            if(avij.e().w()) {
                this.C = s;
                this.D = launchOptions0;
                aucd0 = this;
            }
            else {
                aucd0 = this;
                aubx aubx0 = new aubx(aucd0, this.m, this.c, this.e.d, s, launchOptions0);
                aucd0.r = aubx0;
                aucd0.P(aubx0);
            }
            audq audq0 = aucd0.r;
            if(audq0 != null) {
                audq0.e.c.b();
                audq0.e.d = 4;
                audq0.e.b(5);
            }
            return;
        }
        this.O(s, launchOptions0);
    }

    @Override  // aubi
    public final void g() {
        avjh avjh0 = this.k;
        avjh0.n("leaveApplication %s", (this.v == null ? null : this.v.a));
        if(this.v == null) {
            avjh0.d("listener.onApplicationLeaveFailed(%s)", new Object[]{"INVALID_REQUEST"});
            aubj aubj0 = this.O;
            if(aubj0 != null) {
                aubj0.e.hw();
            }
            return;
        }
        this.E(0);
    }

    @Override  // aubi
    public final void h(String s, String s1) {
        this.k.p("reconnectToDevice: lastApplicationId=%s, lastSessionId=%s", s, s1);
        this.R = s;
        this.S = s1;
        this.c();
    }

    @Override  // aubi
    public final void i(String s) {
        synchronized(this.ak) {
            this.ak.add(s);
        }
    }

    @Override  // aubi
    public final void j() {
        this.p.b();
    }

    @Override  // aubi
    public final void k(String s, byte[] arr_b, long v) {
        this.T(s, arr_b, v, this.z());
    }

    @Override  // aubi
    public final void l(String s, String s1, long v) {
        this.m(s, s1, v, this.z());
    }

    @Override  // aubi
    public final void m(String s, String s1, long v, String s2) {
        if(s1 != null && !TextUtils.isEmpty(s2)) {
            if(TextUtils.isEmpty(s2)) {
                throw new IllegalStateException("Destination ID is null.");
            }
            this.f.execute(new aubr(this, s1, s, s2, v));
            return;
        }
        int v1 = 0;
        this.k.d("sendTextMessage - message discarded without payload or destination ID.", new Object[0]);
        aubj aubj0 = this.O;
        if(aubj0 != null) {
            aubj0.e.m(s, v, 2001);
        }
        gkfu gkfu0 = gkfu.c;
        gehk gehk0 = gehk.a;
        if(s1 != null) {
            v1 = s1.length();
        }
        this.X(gkfu0, gehk0, v1);
    }

    @Override  // aubi
    public final void n(String s) {
        this.k.f("stopApplication %s", new Object[]{(this.v == null ? null : this.v.a)});
        this.y = true;
        audm audm0 = this.p;
        JSONObject jSONObject0 = new JSONObject();
        long v = audm0.k();
        try {
            jSONObject0.put("requestId", v);
            jSONObject0.put("type", "STOP");
            if(s != null && !"".equals(s)) {
                jSONObject0.put("sessionId", s);
            }
        }
        catch(JSONException unused_ex) {
        }
        audm0.m(jSONObject0.toString(), v, audm0.c.a());
        audm0.f.f(v, audm0.g);
    }

    @Override  // aubi
    public final void o(String s) {
        synchronized(this.ak) {
            this.ak.remove(s);
        }
    }

    @Override  // aubi
    public final boolean p() {
        return this.F == 2;
    }

    @Override  // aubi
    public final boolean q() {
        return this.F == 1;
    }

    @Override  // aubi
    public final boolean r() {
        return this.Q.c();
    }

    @Override  // aubi
    public final boolean s(boolean z, double f, boolean z1) {
        this.k.q("setMute; muteState:%b, currentVolume:%f, currentMuteSTate:%b", Boolean.valueOf(z), Double.valueOf(f), Boolean.valueOf(z1));
        boolean z2 = this.e.i(0x1800);
        if(!hqtx.d()) {
            if(!z2) {
                z2 = false;
                goto label_7;
            }
            return false;
        }
    label_7:
        audm audm0 = this.p;
        long v = audm0.k();
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("requestId", v);
            jSONObject0.put("type", "SET_VOLUME");
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("muted", z);
            jSONObject0.put("volume", jSONObject1);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("level", f);
            jSONObject2.put("muted", z1);
            jSONObject0.put("expectedVolume", jSONObject2);
        }
        catch(JSONException unused_ex) {
        }
        audm0.n.c("[%d] Set mute state to $b", new Object[]{v, Boolean.valueOf(z)});
        audm0.m(jSONObject0.toString(), v, audm0.c.a());
        audm0.i.c(v, z);
        return !z2;
    }

    @Override  // aubi
    public final boolean t(double f, double f1, boolean z) {
        this.k.q("setVolume; volume:%f, currentVolume:%f, currentMuteSTate:%b", Double.valueOf(f), Double.valueOf(f1), Boolean.valueOf(z));
        boolean z1 = this.e.i(0x1800);
        if(!hqtx.d()) {
            if(!z1) {
                z1 = false;
                goto label_7;
            }
            return false;
        }
    label_7:
        audm audm0 = this.p;
        double f2 = this.v();
        if(f < 0.0) {
            f = 0.0;
        }
        else if(f <= 1.0) {
        }
        else {
            f = 0.0;
        }
        long v = audm0.k();
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("requestId", v);
            jSONObject0.put("type", "SET_VOLUME");
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("level", f);
            jSONObject0.put("volume", jSONObject1);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("level", f1);
            jSONObject2.put("muted", z);
            if(audm0.a) {
                jSONObject2.put("stepInterval", f2);
            }
            jSONObject0.put("expectedVolume", jSONObject2);
        }
        catch(JSONException unused_ex) {
        }
        audm0.n.c("[%d] Set volume to %f", new Object[]{v, f});
        audm0.m(jSONObject0.toString(), v, audm0.c.a());
        audm0.i.d(v, f);
        return !z1;
    }

    @Override  // aubi
    public final void u(EqualizerSettings equalizerSettings0) {
        JSONObject jSONObject0 = equalizerSettings0.a();
        this.k.n("setEqualizerSettings; equalizerSettings: %s", jSONObject0);
        audm audm0 = this.p;
        long v = audm0.k();
        JSONObject jSONObject1 = new JSONObject();
        try {
            jSONObject1.put("requestId", v);
            jSONObject1.put("type", "SET_USER_EQ");
            jSONObject1.put("userEq", equalizerSettings0.a());
        }
        catch(JSONException unused_ex) {
        }
        audm0.m(jSONObject1.toString(), v, audm0.c.a());
    }

    public final double v() {
        return !this.p.a || Double.isNaN(this.p.j) ? 1.0 / avgi.a(this.e) : this.p.j;
    }

    public final double w() {
        return 1.0 / this.v();
    }

    public static gket x(int v) {
        switch(v) {
            case 2400: {
                return gket.y;
            }
            case 2401: {
                return gket.z;
            }
            case 2402: {
                return gket.A;
            }
            case 2403: {
                return gket.B;
            }
            case 2404: {
                return gket.C;
            }
            case 2405: {
                return gket.D;
            }
            case 2406: {
                return gket.E;
            }
            case 2407: {
                return gket.F;
            }
            case 2408: {
                return gket.G;
            }
            case 2409: {
                return gket.H;
            }
            case 2410: {
                return gket.I;
            }
            case 0x96B: {
                return gket.J;
            }
            case 0x96C: {
                return gket.K;
            }
            case 0x96D: {
                return gket.L;
            }
            case 0x96E: {
                return gket.M;
            }
            case 0x96F: {
                return gket.O;
            }
            case 0x970: {
                return gket.V;
            }
            case 0x971: {
                return gket.W;
            }
            default: {
                return gket.a;
            }
        }
    }

    public final String y(int v) {
        if(this.z() != null) {
            auct auct0 = this.q;
            if(auct0 != null) {
                auct0.d();
            }
        }
        String s = this.R;
        String s1 = this.w;
        if(this.v != null) {
            this.at.m(s1, this);
            this.v = null;
            this.w = null;
        }
        this.W(null);
        if(v != 0) {
            this.J.d(this.e, this.L, v, this.M, this.N, s, this.o);
        }
        return s1;
    }

    public final String z() {
        return this.g.f;
    }
}

