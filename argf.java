import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import j..util.Objects;
import j..util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class argf implements ario {
    public static final aqql a;
    public final Context b;
    public final gmcg c;
    public final argt d;
    public final argm e;
    public final arfw f;
    public final aqrx g;
    public final arem h;
    public arjh i;
    public int j;
    public String k;
    public String l;
    public boolean m;
    public boolean n;
    public boolean o;
    public arls p;
    public final areh q;
    public final ares r;
    private final arfk s;
    private final argu t;
    private boolean u;
    private boolean v;
    private final aqee w;
    private final ExecutorService x;
    private final ScheduledExecutorService y;

    static {
        argf.a = new aqql(new String[]{"SourceManager"});
    }

    public argf(Context context0, gmcg gmcg0, ScheduledExecutorService scheduledExecutorService0, ares ares0, arem arem0, argt argt0, argu argu0, argm argm0, arfk arfk0, aqrx aqrx0, aqee aqee0, arfw arfw0, ExecutorService executorService0, areh areh0) {
        this.u = false;
        this.m = false;
        this.n = false;
        this.v = false;
        this.w = aqee0;
        this.b = context0;
        this.y = scheduledExecutorService0;
        batl.s(gmcg0);
        this.c = gmcg0;
        batl.s(ares0);
        this.r = ares0;
        batl.s(argt0);
        this.d = argt0;
        batl.s(argu0);
        this.t = argu0;
        this.h = arem0;
        batl.s(argm0);
        this.e = argm0;
        this.s = arfk0;
        batl.s(arfw0);
        this.f = arfw0;
        this.x = executorService0;
        this.g = aqrx0;
        this.q = areh0;
        this.p = null;
        this.f(0);
        this.p = new arls(scheduledExecutorService0, hqhq.a.j().x(), new arfz(this));
    }

    @Override  // ario
    public final void a() {
        this.f(7);
        this.r.j();
        if(!this.v && hqhq.w()) {
            areh areh0 = this.q;
            baun baun0 = areh.a;
            baun0.h("Sending transfer started broadcast", new Object[0]);
            Intent intent0 = new Intent("com.google.android.gms.SOURCE_D2D_TRANSFER_STARTED");
            if(hqhq.D()) {
                baun0.h("Making ACTION_D2D_TRANSFER_STARTED broadcast explicit", new Object[0]);
                intent0.setPackage("com.google.android.apps.wear.companion");
            }
            areh0.b.sendBroadcast(intent0);
        }
        this.v = true;
    }

    @Override  // ario
    public final void b(boolean z) {
        argf.a.h("onSmartDeviceComplete, success=%b", new Object[]{Boolean.valueOf(z)});
        if(z) {
            this.m = true;
        }
        this.f(2);
        this.u = z;
        this.r.g(z);
    }

    public final void c(armh armh0) {
        if(this.i == null) {
            argf.a.f("USB accessory connected for duplexing but source protocol is null.", new Object[0]);
            this.f(9);
            this.r.f();
            this.j();
            return;
        }
        Optional optional0 = this.n(armh0);
        if(optional0.isPresent()) {
            arjh arjh0 = this.i;
            Object object0 = optional0.get();
            arlk arlk0 = arjh0.e;
            if(!(arlk0 instanceof arlm)) {
                throw new IllegalStateException("The current transport is not MultiTransport, create and attach UsbTransport is not allowed");
            }
            if(((arlm)arlk0).e.equals(hkyj.b)) {
                arlm.a.m("Not attaching UsbTransport as we had already initialised MultiTransport using USB.", new Object[0]);
            }
            else {
                arlm.a.h("attach UsbTransport to MultiTransport.", new Object[0]);
                ((arlm)arlk0).i = false;
                ((arlm)arlk0).g = (armp)((arlh)object0).a(((arlm)arlk0).b);
                ((arlm)arlk0).g.j();
            }
            if(((Boolean)arjh0.G.mr()).booleanValue()) {
                arjh0.C = false;
            }
        }
    }

    public final void d() {
        argf.a.d("The user authorized transfer.", new Object[0]);
        this.m = true;
        arjh arjh0 = this.i;
        if(arjh0 != null) {
            aqql aqql0 = arjh.p;
            aqql0.d("Authorization granted.", new Object[0]);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asbd.a).v_newBuilder();
            Account account0 = arjh0.v.a();
            if(account0 == null) {
                aqql0.m("No backup account found on source - could not tell target desired backup account.", new Object[0]);
            }
            else {
                String s = account0.name;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                asbd asbd0 = (asbd)hftp0.b_message;
                s.getClass();
                asbd0.b |= 1;
                asbd0.c = s;
                aqql0.h("Sending source backup account (%s) to target.", new Object[]{asbd0.c});
            }
            asbd asbd1 = (asbd)hftp0.N_build();
            asci asci0 = arin.m(asch.e);
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)asci0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)asci0));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            asci asci1 = (asci)hftp1.b_message;
            asbd1.getClass();
            asci1.g = asbd1;
            asci1.b |= 0x20;
            arjh0.f(((asci)hftp1.N_build()));
        }
    }

    public final void e() {
        argf.a.j("Report state to UI requested: %s", new Object[]{((int)this.j)});
        if(this.l != null) {
            this.k();
        }
        switch(this.j) {
            case 0: {
                arfg arfg0 = new arfg();
                this.r.a(arfg0);
                return;
            }
            case 1: {
                arjh arjh0 = this.i;
                if(arjh0 != null) {
                    arjh0.v();
                    return;
                }
                return;
            }
            case 2: {
                this.r.g(this.u);
                return;
            }
            case 3: {
                this.r.c();
                return;
            }
            case 4: {
                this.r.d();
                return;
            }
            case 5: {
                this.r.e();
                return;
            }
            case 6: {
                this.r.h();
                return;
            }
            case 7: {
                this.r.j();
                return;
            }
            case 8: {
                this.r.i();
            }
        }
    }

    public final void f(int v) {
        int v1;
        aqql aqql0 = argf.a;
        Integer integer0 = v;
        aqql0.d("Setting most recent event from: %s to %s", new Object[]{((int)this.j), integer0});
        this.j = v;
        switch(v) {
            case 0: {
                v1 = 11;
                break;
            }
            case 1: {
                v1 = 21;
                break;
            }
            case 5: {
                v1 = 101;
                break;
            }
            case 6: {
                v1 = 0x1F;
                break;
            }
            case 7: {
                v1 = 61;
                break;
            }
            case 8: {
                v1 = 91;
                break;
            }
            default: {
                aqql0.j("Did not find a log state for %d", new Object[]{integer0});
                v1 = 1;
            }
        }
        if(v1 != 1) {
            arem arem0 = this.h;
            int v2 = hkyw.a(((hkyx)arem0.f.N_build()).c);
            if(v2 == 0) {
                v2 = 1;
            }
            if(v1 != v2) {
                int v3 = hkyw.a(((hkyx)arem0.f.b_message).c);
                if(v3 == 0) {
                    v3 = 1;
                }
                if(v1 != v3) {
                    long v4 = SystemClock.elapsedRealtime();
                    ProtoLiteBuilder hftp0 = arem0.f;
                    long v5 = v4 - arem0.c;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hkyx hkyx0 = (hkyx)hftp0.b_message;
                    hkyx0.b |= 2;
                    hkyx0.d = v5;
                    int v6 = arem0.a();
                    ProtoLiteBuilder hftp1 = arem0.f;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hkyx hkyx1 = (hkyx)hftp1.b_message;
                    hkyx1.b |= 8;
                    hkyx1.g = v6;
                    ProtoLiteBuilder hftp2 = arem0.f;
                    long v7 = arem0.c;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    hkyx hkyx2 = (hkyx)hftp2.b_message;
                    hkyx2.b |= 16;
                    hkyx2.h = v7;
                    arem0.b(((hkyx)arem0.f.N_build()));
                    arem0.c = v4;
                    arem0.f = ((ProtoLiteMessage)hkyx.a).v_newBuilder();
                    ProtoLiteBuilder hftp3 = arem0.f;
                    hkym hkym0 = hkym.a;
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    hkyx hkyx3 = (hkyx)hftp3.b_message;
                    hkym0.getClass();
                    hkyx3.i = hkym0;
                    hkyx3.b |= 0x20;
                    ProtoLiteBuilder hftp4 = arem0.f;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ((hkyx)hftp4.b_message).c = v1 - 1;
                    ((hkyx)hftp4.b_message).b |= 1;
                    ProtoLiteBuilder hftp5 = arem0.f;
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    hkyx hkyx4 = (hkyx)hftp5.b_message;
                    hkyx4.b |= 4;
                    hkyx4.f = v6;
                }
            }
        }
    }

    public final void g(armh armh0) {
        if(this.i != null) {
            argf.a.m("Protocol already exists. Stopping existing protocol before recreating.", new Object[0]);
            this.i();
        }
        argf.a.j("Creating protocol for USB D2D.", new Object[0]);
        this.o = false;
        arem arem0 = this.h;
        arem0.k = 3;
        Optional optional0 = this.n(armh0);
        if(optional0.isPresent()) {
            Context context0 = this.b;
            Object object0 = hqhq.p() ? new arfy(this, optional0) : optional0.get();
            bbll bbll0 = new bbll(1, 10);
            bbll bbll1 = new bbll(1, 10);
            bblp bblp0 = new bblp(1, 9);
            WifiManager wifiManager0 = (WifiManager)context0.getApplicationContext().getSystemService("wifi");
            arjh arjh0 = new arjh(context0, ((arlh)object0), this.s, this.g, this, this.c, arem0, this.w, bbll0, bbll1, bblp0, false, wifiManager0, null, null);
            arjh0.E = true;
            this.i = arjh0;
            this.o();
            return;
        }
        this.f(5);
    }

    public final void h() {
        arls arls0 = this.p;
        if(arls0 != null) {
            arls0.c();
        }
        if(this.i != null) {
            argf.a.m("Protocol already exists. Stopping existing protocol before recreating.", new Object[0]);
            this.i();
        }
        argf.a.j("Creating protocol for WiFi D2D.", new Object[0]);
        this.o = true;
        arem arem0 = this.h;
        arem0.k = 7;
        Context context0 = this.b;
        arnb arnb0 = new arnb(new eqvc(context0));
        argb argb0 = new argb(this, arnb0);
        arlh arlh0 = hqhq.o() ? new argc(this, argb0) : ((arlh)argb0.apply(Boolean.valueOf(this.n)));
        arhy arhy0 = new arhy(new arhj());
        WifiManager wifiManager0 = (WifiManager)context0.getApplicationContext().getSystemService("wifi");
        bbll bbll0 = new bbll(1, 10);
        bbll bbll1 = new bbll(1, 10);
        bblp bblp0 = new bblp(1, 9);
        this.i = new arjh(context0, arlh0, this.s, this.g, this, this.c, arem0, this.w, bbll0, bbll1, bblp0, true, wifiManager0, arnb0, arhy0);
        this.o();
    }

    public final void i() {
        arjh arjh0 = this.i;
        if(arjh0 != null) {
            arjh0.A();
            this.i = null;
        }
    }

    public final void j() {
        clht clht0 = new clht(this.b.getMainLooper());
        Objects.requireNonNull(this.t);
        clht0.post(new arga(this.t));
        this.d.g();
    }

    public final void k() {
        arfd arfd0 = new arfd(this.l);
        this.r.a(arfd0);
    }

    public final boolean l() {
        argf.a.d("#canTransferContinue. Most recent event: %s", new Object[]{((int)this.j)});
        return hqhq.a.j().aR() ? this.j != 10 && (this.j != 8 && this.j != 9) : this.j != 8;
    }

    @Override  // ario
    public final void m() {
        this.f(9);
        this.r.f();
        this.d.i(13, null, 1, 1);
        this.j();
    }

    private final Optional n(armh armh0) {
        try {
            return Optional.of(new arfx(this, armh0.a()));
        }
        catch(arlq arlq0) {
            argf.a.g("Compatible USB Accessory(Host) not found: ", arlq0, new Object[0]);
            return Optional.empty();
        }
    }

    private final void o() {
        this.m = false;
        if(this.j == 1) {
            this.i.v();
        }
        else {
            argf.a.j("Starting the protocol.", new Object[0]);
            this.i.e.j();
        }
        if(hqml.e()) {
            arge arge0 = new arge(this);
            this.x.execute(arge0);
            return;
        }
        this.d.f();
    }
}

