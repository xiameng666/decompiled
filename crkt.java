import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import java.util.concurrent.atomic.AtomicInteger;

public final class crkt implements crlw {
    private final crbw A;
    private final crnm B;
    private Boolean C;
    private long D;
    private volatile Boolean E;
    public final Context a;
    public final boolean b;
    public final crcn c;
    public final crcu d;
    public final crjx e;
    public final crji f;
    public final crkq g;
    public final crqx h;
    public final crir i;
    public final bbng j;
    public final crni k;
    public final String l;
    public criq m;
    public croz n;
    public crdl o;
    public crin p;
    public crno q;
    public boolean r;
    public volatile boolean s;
    public int t;
    public int u;
    public final AtomicInteger v;
    final long w;
    private static volatile crkt x;
    private final crpq y;
    private final crnz z;

    public crkt(crmh crmh0) {
        boolean z = false;
        this.r = false;
        this.v = new AtomicInteger(0);
        crcn crcn0 = new crcn(crmh0.a);
        this.c = crcn0;
        crid.a = crcn0;
        Context context0 = crmh0.a;
        this.a = context0;
        this.b = crmh0.e;
        this.E = crmh0.b;
        this.l = crmh0.f;
        this.s = true;
        fpjb.f(context0);
        this.j = bbnk.a;
        new einq(context0).cz("com.google.android.gms.measurement#com.google.android.gms", 0, new String[0], null);
        fpim.e(context0);
        this.w = System.currentTimeMillis();
        this.d = new crcu(this);
        crjx crjx0 = new crjx(this);
        crjx0.o();
        this.e = crjx0;
        crji crji0 = new crji(this);
        crji0.o();
        this.f = crji0;
        crqx crqx0 = new crqx(this);
        crqx0.o();
        this.h = crqx0;
        this.i = new crir(new crmg(crmh0, this));
        this.A = new crbw(this);
        crnz crnz0 = new crnz(this);
        crnz0.b();
        this.z = crnz0;
        crni crni0 = new crni(this);
        crni0.b();
        this.k = crni0;
        crpq crpq0 = new crpq(this);
        crpq0.b();
        this.y = crpq0;
        crnm crnm0 = new crnm(this);
        crnm0.o();
        this.B = crnm0;
        crkq crkq0 = new crkq(this);
        crkq0.o();
        this.g = crkq0;
        if(crmh0.d == null || crmh0.d.b == 0L) {
            z = true;
        }
        if(!crcn0.a) {
            if((context0.getApplicationContext() instanceof Application)) {
                crni crni1 = this.j();
                if((crni1.aj().getApplicationContext() instanceof Application)) {
                    Application application0 = (Application)crni1.aj().getApplicationContext();
                    if(crni1.a == null) {
                        crni1.a = new crnh(crni1);
                    }
                    if(z) {
                        application0.unregisterActivityLifecycleCallbacks(crni1.a);
                        application0.registerActivityLifecycleCallbacks(crni1.a);
                        crni1.aJ().k.a("Registered activity lifecycle callback");
                    }
                }
            }
            else {
                this.aJ().f.a("Application context is not an Application");
            }
        }
        crkq0.f(new crks(this, crmh0));
    }

    private static final void A(crby crby0) {
        if(crby0 != null) {
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    private static final void B(crlu crlu0) {
        if(crlu0 != null) {
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    private static final void C(crbz crbz0) {
        if(crbz0 == null) {
            throw new IllegalStateException("Component not created");
        }
        if(crbz0.o()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + crbz0.getClass());
    }

    public final int a() {
        this.s();
        crcu crcu0 = this.d;
        if(crcu0.x()) {
            return 1;
        }
        if(!this.w()) {
            return 8;
        }
        Boolean boolean0 = this.g().g();
        if(boolean0 != null) {
            return boolean0.booleanValue() ? 0 : 3;
        }
        Boolean boolean1 = crcu0.al().a ? null : crcu0.o("firebase_analytics_collection_enabled");
        if(boolean1 != null) {
            return boolean1.booleanValue() ? 0 : 4;
        }
        if(this.E != null) {
            return this.E.booleanValue() ? 0 : 7;
        }
        return 0;
    }

    @Override  // crlw
    public final crji aJ() {
        crkt.y(this.f);
        return this.f;
    }

    @Override  // crlw
    public final crkq aK() {
        crkt.y(this.g);
        return this.g;
    }

    public final crbw b() {
        crkt.A(this.A);
        return this.A;
    }

    public final crdl c() {
        crkt.y(this.o);
        return this.o;
    }

    public final crin d() {
        crkt.C(this.p);
        return this.p;
    }

    public final criq e() {
        crkt.C(this.m);
        return this.m;
    }

    public final crjx g() {
        crkt.B(this.e);
        return this.e;
    }

    public static crkt i(Context context0) {
        return crkt.z(context0, null);
    }

    public final crni j() {
        crkt.C(this.k);
        return this.k;
    }

    public final crnm k() {
        crkt.y(this.B);
        return this.B;
    }

    public final crno l() {
        crkt.A(this.q);
        return this.q;
    }

    public final crnz m() {
        crkt.C(this.z);
        return this.z;
    }

    public final croz n() {
        crkt.C(this.n);
        return this.n;
    }

    public final crpq o() {
        crkt.C(this.y);
        return this.y;
    }

    public final crqx p() {
        crkt.B(this.h);
        return this.h;
    }

    final void q() {
        if(!this.c.a) {
            return;
        }
        throw new IllegalStateException("Unexpected call on package side");
    }

    final void r() {
        if(this.c.a) {
            return;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    public final void s() {
        this.aK().n();
    }

    final void t() {
        this.v.incrementAndGet();
    }

    final void u() {
        ++this.t;
    }

    public final boolean v() {
        return this.a() == 0;
    }

    public final boolean w() {
        this.s();
        return this.s;
    }

    protected final boolean x() {
        if(!this.r) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        this.s();
        if(this.C == null || this.D == 0L || !this.C.booleanValue() && Math.abs(SystemClock.elapsedRealtime() - this.D) > 1000L) {
            this.D = SystemClock.elapsedRealtime();
            boolean z = true;
            if(this.c.a) {
                this.C = Boolean.valueOf(true);
                return true;
            }
            if(!this.p().Y("android.permission.INTERNET") || !this.p().Y("android.permission.ACCESS_NETWORK_STATE") || !bbsr.b(this.a).i() && !this.d.y() && (!crqx.ae(this.a) || !crqx.au(this.a))) {
                z = false;
            }
            Boolean boolean0 = Boolean.valueOf(z);
            this.C = boolean0;
            if(boolean0.booleanValue()) {
                this.C = Boolean.valueOf(this.p().Q(this.d().v()));
            }
        }
        return this.C.booleanValue();
    }

    public static final void y(crlv crlv0) {
        if(crlv0 == null) {
            throw new IllegalStateException("Component not created");
        }
        if(crlv0.q()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + crlv0.getClass());
    }

    public static crkt z(Context context0, InitializationParams initializationParams0) {
        if(initializationParams0 != null) {
            initializationParams0 = new InitializationParams(initializationParams0.a, initializationParams0.b, initializationParams0.c, initializationParams0.d, null);
        }
        batl.s(context0);
        batl.s(context0.getApplicationContext());
        if(crkt.x == null) {
            synchronized(crkt.class) {
                if(crkt.x == null) {
                    crkt.x = new crkt(new crmh(context0, initializationParams0));
                }
            }
        }
        else if(initializationParams0 != null) {
            Bundle bundle0 = initializationParams0.d;
            if(bundle0 != null && bundle0.containsKey("dataCollectionDefaultEnabled")) {
                batl.s(crkt.x);
                crkt crkt0 = crkt.x;
                crkt0.E = Boolean.valueOf(bundle0.getBoolean("dataCollectionDefaultEnabled"));
            }
        }
        batl.s(crkt.x);
        return crkt.x;
    }
}

