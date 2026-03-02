import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LocationRequest;
import j..util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import jeb.synthetic.FIN;

public final class bgsq extends fxov implements Supplier {
    public volatile boolean a;
    public Optional b;
    public fxob c;
    public static final int d;
    private final Context e;
    private final ibnf f;
    private final cmnh g;
    private final fxog h;
    private final fxps j;
    private final bbku k;
    private final long l;
    private final long m;
    private final cmoa n;
    private Optional o;
    private Optional p;
    private long q;

    static {
        bgrz.a("LocLstnr");
    }

    public bgsq(fxnw fxnw0, Context context0, ibnf ibnf0) {
        cnjv cnjv0 = new cnjv(context0);
        fxog fxog0 = new fxog("", true, ((int)hsbn.a.e().o()));
        bbll bbll0 = new bbll(1, 9);
        long v = huqg.c();
        long v1 = huqg.b();
        super(fxnw0);
        this.n = new bgso(this);
        this.b = Optional.empty();
        this.o = Optional.empty();
        this.p = Optional.empty();
        this.c = fxob.a;
        this.e = context0;
        this.f = ibnf0;
        this.g = cnjv0;
        this.h = fxog0;
        this.j = new fxps(hsbn.a.e().e());
        this.k = bbll0;
        this.m = v1;
        this.l = v1 - v;
    }

    public final fxob a() {
        synchronized(this) {
            if(SystemClock.elapsedRealtime() - this.q > this.m) {
                this.q = -1L;
                this.c = fxob.a;
            }
        }
        return this.c;
    }

    @Override  // fxov
    public final fxou b() {
        int v1;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        switch(this.c.c) {
            case 0: {
                v1 = 14;
            label_10:
                fxou fxou1 = new fxou(2, v1);
                FIN.finallyCodeBegin$NT(v);
                return fxou1;
            }
            case 1: {
                FIN.finallyExec$NT(v);
                return fxou.b;
            }
            default: {
                bgwf.b(this.e).e(gxod.c);
                v1 = 15;
                if(this.c.c != 0 && !bbqr.c(this.c.b.a.getProvider()).equals("cache")) {
                    fxou fxou0 = new fxou(1, 15);
                    FIN.finallyExec$NT(v);
                    return fxou0;
                }
                goto label_10;
            }
        }
    }

    // Detected as a lambda impl.
    public final void c(Location location0) {
        synchronized(this) {
            if(this.a && location0 != null && !location0.isMock() && (this.c == fxob.a || !bbqr.c(location0.getProvider()).equals("cache"))) {
                this.q = SystemClock.elapsedRealtime();
                this.c = this.h.a(location0);
                this.i.a();
            }
        }
    }

    public final void d() {
        cmmy cmmy0 = new cmmy();
        cmmy0.b(hsbn.a.e().l());
        cmmy0.c(hsbn.a.e().k());
        bgsl bgsl0 = new bgsl();
        cmmy0.d((this.j.b(bgsl0) ? 100 : 102));
        cmmy0.e(2);
        CurrentLocationRequest currentLocationRequest0 = cmmy0.a();
        evpl evpl0 = ((evpn)this.p.get()).a;
        evql evql0 = this.g.c(currentLocationRequest0, evpl0);
        evql0.b((Location location0) -> synchronized(this) {
            if(this.a && location0 != null && !location0.isMock() && (this.c == fxob.a || !bbqr.c(location0.getProvider()).equals("cache"))) {
                this.q = SystemClock.elapsedRealtime();
                this.c = this.h.a(location0);
                this.i.a();
            }
        });
        evql0.A(new bgsn());
    }

    // Detected as a lambda impl.
    public final void e() {
        long v2;
        synchronized(this) {
            long v1 = SystemClock.elapsedRealtime() - this.q;
            if(this.q == 0L) {
                v2 = this.l;
            }
            else {
                long v3 = this.l;
                if(v1 >= v3) {
                    this.d();
                    v2 = v3;
                }
                else {
                    v2 = v3 - v1;
                }
            }
            bgsk bgsk0 = new bgsk(this);
            this.o = Optional.of(this.k.g(bgsk0, v2, TimeUnit.MILLISECONDS));
        }
    }

    @Override  // fxov
    public final void f() {
        synchronized(this) {
            this.a = true;
            this.p = Optional.of(new evpn());
            gmbu.t(((fvvp)this.f.get()).c(this.e), new bgsp(this), this.k);
            cmoc cmoc0 = new cmoc(hsbn.a.e().f());
            cmoc0.k(102);
            cmoc0.j(hsbn.a.e().d());
            cmoc0.i(((float)hsbn.a.e().p()));
            cmoc0.l(2);
            LocationRequest locationRequest0 = cmoc0.a();
            this.g.k(locationRequest0, this.k, this.n);
            this.h();
            this.e();
        }
    }

    @Override  // fxov
    public final void g() {
        synchronized(this) {
            this.a = false;
            this.g.f(this.n);
            this.b.ifPresent(new bgsg());
            this.b = Optional.empty();
            this.o.ifPresent(new bgsh());
            this.o = Optional.empty();
            this.p.ifPresent(new bgsi());
            this.p = Optional.empty();
            this.c = fxob.a;
        }
    }

    @Override
    public final Object get() {
        return this.a();
    }

    private final void h() {
        synchronized(this) {
            bgsj bgsj0 = new bgsj(this);
            long v1 = hsbn.a.e().c();
            this.b = Optional.of(this.k.g(bgsj0, v1, TimeUnit.MILLISECONDS));
        }
    }
}

