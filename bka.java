import android.util.Log;
import android.util.Size;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import jeb.synthetic.FIN;

public abstract class bka {
    private static final boolean a;
    public static final Size b;
    public static final AtomicInteger c;
    public static final AtomicInteger d;
    public final Object e;
    public int f;
    public boolean g;
    public jqt h;
    public final gmcd i;
    public jqt j;
    public final gmcd k;
    public final Size l;
    public final int m;
    public Class n;

    static {
        bka.b = new Size(0, 0);
        bka.a = bcs.f("DeferrableSurface");
        bka.c = new AtomicInteger(0);
        bka.d = new AtomicInteger(0);
    }

    public bka() {
        this(bka.b, 0);
    }

    public bka(Size size0, int v) {
        this.e = new Object();
        this.f = 0;
        this.g = false;
        this.l = size0;
        this.m = v;
        gmcd gmcd0 = jqy.a(new bjv(this));
        this.i = gmcd0;
        this.k = jqy.a(new bjw(this));
        if(bcs.f("DeferrableSurface")) {
            this.g("Surface created", bka.d.incrementAndGet(), bka.c.get());
            Executor executor0 = bol.a();
            gmcd0.hB(new bjx(this, Log.getStackTraceString(new Exception())), executor0);
        }
    }

    protected abstract gmcd a();

    public final gmcd b() {
        synchronized(this.e) {
            if(this.g) {
                return new bpu(new bjy("DeferrableSurface already closed.", this));
            }
        }
        return this.a();
    }

    public final gmcd c() {
        return bpt.d(this.i);
    }

    public void d() {
        jqt jqt0;
        synchronized(this.e) {
            if(this.g) {
                jqt0 = null;
            }
            else {
                this.g = true;
                this.j.b(null);
                if(this.f == 0) {
                    jqt0 = this.h;
                    this.h = null;
                }
                else {
                    jqt0 = null;
                }
                if(bcs.f("DeferrableSurface")) {
                    bcs.h("DeferrableSurface");
                }
            }
        }
        if(jqt0 != null) {
            jqt0.b(null);
        }
    }

    public final void e() {
        jqt jqt0;
        Object object0 = this.e;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        int v1 = this.f;
        if(v1 != 0) {
            this.f = v1 - 1;
            if(v1 - 1 == 0 && this.g) {
                jqt0 = this.h;
                this.h = null;
            }
            else {
                jqt0 = null;
            }
            if(bcs.f("DeferrableSurface")) {
                bcs.h("DeferrableSurface");
                if(this.f == 0) {
                    this.g("Surface no longer in use", bka.d.get(), bka.c.decrementAndGet());
                }
            }
            FIN.finallyCodeBegin$NT(v);
            if(jqt0 != null) {
                jqt0.b(null);
            }
            return;
        }
        throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
    }

    public final void f() {
        synchronized(this.e) {
            int v1 = this.f;
            if(v1 == 0) {
                if(this.g) {
                    throw new bjy("Cannot begin use on a closed surface.", this);
                }
                v1 = 0;
            }
            this.f = v1 + 1;
            if(bcs.f("DeferrableSurface")) {
                if(this.f == 1) {
                    this.g("New surface in use", bka.d.get(), bka.c.incrementAndGet());
                }
                bcs.h("DeferrableSurface");
            }
        }
    }

    public final void g(String s, int v, int v1) {
        if(!bka.a && bcs.f("DeferrableSurface")) {
            bcs.h("DeferrableSurface");
        }
        bcs.h("DeferrableSurface");
    }

    public final boolean h() {
        synchronized(this.e) {
        }
        return this.g;
    }
}

