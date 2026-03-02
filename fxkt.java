import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LocationRequest;
import j..util.Optional;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

final class fxkt extends fxov {
    public final fxmv a;
    public fxob b;
    public volatile boolean c;
    public Optional d;
    public static final int e;
    private final Context f;
    private final cmnh g;
    private final fxog h;
    private final fxog j;
    private final fxog k;
    private final fvvp l;
    private final fxmg m;
    private final long n;
    private final long o;
    private fxkr p;
    private final fxps q;
    private final bbku r;
    private long s;
    private fxob t;
    private Optional u;
    private Optional v;

    static {
        bboh.c("EAlert", bbcu.g, "EALocRCL_N");
    }

    public fxkt(fxnw fxnw0, Context context0, fvvp fvvp0) {
        cnjv cnjv0 = new cnjv(context0);
        fxog fxog0 = new fxog(huqb.a.s().aa(), huqb.a.s().aq(), ((int)huqb.m()));
        fxog fxog1 = new fxog(huqb.a.s().Z(), huqb.a.s().ap(), ((int)huqb.m()));
        fxog fxog2 = new fxog(huqb.a.s().Y(), huqb.a.s().ao(), ((int)huqb.m()));
        fxmg fxmg0 = fxmg.a();
        bbll bbll0 = new bbll(1, 9);
        long v = huqg.c();
        long v1 = huqg.b();
        super(fxnw0);
        this.b = fxob.a;
        this.d = Optional.empty();
        this.u = Optional.empty();
        this.v = Optional.empty();
        this.f = context0;
        this.l = fvvp0;
        this.g = cnjv0;
        this.h = fxog0;
        this.j = fxog1;
        this.k = fxog2;
        this.m = fxmg0;
        this.a = new fxmv(50, new fxks());
        this.q = new fxps(huqb.a.s().u());
        this.r = bbll0;
        this.o = v1;
        this.n = v1 - v;
    }

    public final fxob a() {
        synchronized(this) {
            if(SystemClock.elapsedRealtime() - this.s > this.o) {
                this.s = 0L;
                this.b = fxob.a;
            }
        }
        return this.b;
    }

    @Override  // fxov
    public final fxou b() {
        fxou fxou0;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(huqb.x()) {
            fxob fxob0 = this.b;
            if(fxob0.c == 0 || this.t == null) {
                fxou0 = new fxou(2, 14);
            }
            else if(fxob0.a() || this.t.a()) {
                fxou0 = fxou.b;
            }
            else if(fxkt.k(this.b)) {
                this.a.d(5);
                fxou0 = new fxou(1, 15);
            }
            else {
                this.a.d(4);
                fxou0 = new fxou(2, 15);
            }
            FIN.finallyCodeBegin$NT(v);
            return fxou0;
        }
        switch(this.b.c) {
            case 0: {
                fxou fxou3 = new fxou(2, 14);
                FIN.finallyExec$NT(v);
                return fxou3;
            }
            case 1: {
                FIN.finallyExec$NT(v);
                return fxou.b;
            }
            default: {
                fxmj.d(this.f, 15);
                if(fxkt.k(this.b)) {
                    this.a.d(5);
                    fxou fxou1 = new fxou(1, 15);
                    FIN.finallyExec$NT(v);
                    return fxou1;
                }
                this.a.d(4);
                fxou fxou2 = new fxou(2, 15);
                FIN.finallyExec$NT(v);
                return fxou2;
            }
        }
    }

    // Detected as a lambda impl.
    public final void c(Location location0) {
        synchronized(this) {
            if(this.c && location0 != null && !location0.isMock() && (this.b == fxob.a || !location0.getProvider().equals("cache"))) {
                this.i(location0);
            }
        }
    }

    public final void e() {
        cmmy cmmy0 = new cmmy();
        cmmy0.b(huqb.a.s().G());
        cmmy0.c(huqb.a.s().F());
        fxkm fxkm0 = new fxkm();
        cmmy0.d((this.q.b(fxkm0) ? 100 : 102));
        cmmy0.e(2);
        CurrentLocationRequest currentLocationRequest0 = cmmy0.a();
        evpl evpl0 = ((evpn)this.v.get()).a;
        this.g.c(currentLocationRequest0, evpl0).b((Location location0) -> synchronized(this) {
            if(this.c && location0 != null && !location0.isMock() && (this.b == fxob.a || !location0.getProvider().equals("cache"))) {
                this.i(location0);
            }
        });
    }

    @Override  // fxov
    public final void f() {
        synchronized(this) {
            this.c = true;
            this.p = new fxkr(this);
            this.v = Optional.of(new evpn());
            gmcd gmcd0 = this.l.c(this.f);
            gmbu.t(gmcd0, new fxkq(this, gmcd0), this.r);
            cmoc cmoc0 = new cmoc(huqb.a.s().v());
            cmoc0.k(102);
            cmoc0.j(huqb.a.s().t());
            cmoc0.i(((float)huqb.a.s().N()));
            cmoc0.l(2);
            LocationRequest locationRequest0 = cmoc0.a();
            this.g.k(locationRequest0, this.r, this.p);
            this.j();
            this.h();
        }
    }

    @Override  // fxov
    public final void g() {
        synchronized(this) {
            this.c = false;
            fxkr fxkr0 = this.p;
            if(fxkr0 != null) {
                this.g.f(fxkr0);
            }
            this.d.ifPresent(new fxkj());
            this.d = Optional.empty();
            this.u.ifPresent(new fxkk());
            this.u = Optional.empty();
            this.v.ifPresent(new fxkl());
            this.v = Optional.empty();
            this.b = fxob.a;
        }
    }

    // Detected as a lambda impl.
    public final void h() {
        long v2;
        synchronized(this) {
            long v1 = SystemClock.elapsedRealtime() - this.s;
            if(this.s == 0L) {
                v2 = this.n;
            }
            else {
                long v3 = this.n;
                if(v1 >= v3) {
                    this.e();
                    v2 = v3;
                }
                else {
                    v2 = v3 - v1;
                }
            }
            fxkp fxkp0 = new fxkp(this);
            this.u = Optional.of(this.r.g(fxkp0, v2, TimeUnit.MILLISECONDS));
        }
    }

    @Override  // fxov
    public final void hJ(PrintWriter printWriter0) {
        printWriter0.printf("Loc: %dms ago prov: %s state: %d\n", new Object[]{((long)(SystemClock.elapsedRealtime() - this.s)), (this.b == fxob.a ? "[none]" : this.b.b.a.getProvider()), ((int)this.b.c)});
        this.a.c(printWriter0);
        fxmg fxmg0 = this.m;
        if(fxmg0 != null) {
            printWriter0.println("##ArwUxAM >");
            fxmg0.e.c(printWriter0);
            printWriter0.println("##ArwUxAM <");
        }
    }

    private final void i(Location location0) {
        boolean z = false;
        synchronized(this) {
            if(huqb.x()) {
                fxob fxob0 = this.k.a(location0);
                if(this.t == null || this.t.c != fxob0.c || fxob0.b()) {
                    this.t = fxob0;
                    z = true;
                }
                fxmg fxmg0 = this.m;
                boolean z1 = this.t.a();
                String s = bbpg.a(this.f);
                if(huqb.w() && fxmg0.b() && !fxmg0.c && z1) {
                    fxlr fxlr0 = new fxlr();
                    fxmg0.a.a.b(fxlr0, gmap.a);
                    fxmg0.c = true;
                    fxmg0.d = SystemClock.elapsedRealtime();
                    cczb cczb0 = cedq.v().b(((gful_cronetEngineProvider)new fxnd(s)));
                    cczb0.c = (int)23;
                    cczb0.a();
                    fxmg0.e.d(2);
                }
            }
            fxob fxob1 = this.b;
            fxob fxob2 = huqj.c() || huqb.J() ? this.j.a(location0) : fxob.a;
            if(fxob2 == fxob.a || fxob2.b()) {
                fxob2 = this.h.a(location0);
            }
            this.b = fxob2;
            long v1 = SystemClock.elapsedRealtime() - this.s;
            if(fxob1.c != 0 && !fxob2.b() && fxob2.c == fxob1.c && fxob2.b.b == fxob1.b.b && (v1 < this.n && !z)) {
                return;
            }
            this.a.e(3, Integer.toString(fxob2.c));
            this.i.a();
            this.s = SystemClock.elapsedRealtime();
            location0.getProvider();
        }
    }

    private final void j() {
        synchronized(this) {
            fxko fxko0 = new fxko(this);
            long v1 = huqb.a.s().s();
            this.d = Optional.of(this.r.g(fxko0, v1, TimeUnit.MILLISECONDS));
        }
    }

    private static final boolean k(fxob fxob0) {
        return fxob0.c != 0 && !fxob0.b.a.getProvider().equals("cache");
    }
}

