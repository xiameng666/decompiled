import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class bxmu {
    public final gmcd a;
    public final Exception b;
    public final Object c;
    public Object d;
    public boolean e;
    public static final int f;
    private static final bboh g;
    private final ScheduledExecutorService h;
    private final Object i;
    private final ggeo j;
    private final gged_interceptors k;
    private final Long l;
    private final Executor m;
    private final Object n;
    private boolean o;
    private gmcu p;

    static {
        bxmu.g = bboh.c("Auth.Api.Credentials", bbcu.aB, "FlowRunner");
    }

    public bxmu(Object object0, Map map0, List list0, Long long0, Exception exception0, Executor executor0) {
        this.h = new bbll(1, 10);
        gftb.check(object0);
        this.i = object0;
        this.j = ggeo.k(map0);
        ggdy ggdy0 = new ggdy();
        ggdy0.k(list0);
        this.a = jqy.a(new bxmm(this, ggdy0));
        this.k = ggdy0.h();
        this.l = long0;
        this.b = exception0;
        this.m = executor0;
        this.n = new Object();
        this.c = new Object();
        this.o = false;
        this.e = false;
    }

    public final gmcd a() {
        gmcu gmcu0;
        synchronized(this.n) {
            gmcu0 = new gmcu();
            this.p = gmcu0;
        }
        return gmcu0;
    }

    public final gmcd b(Object object0) {
        return gmbu.i(gfsx.m(object0));
    }

    public final gmcd c() {
        return gmbu.i(gfqx.a);
    }

    public final void d() {
        ggeo ggeo0 = this.j;
        if(!ggeo0.containsKey(this.d)) {
            throw new IllegalStateException("Unrecognized step: " + this.d);
        }
        this.h(new bxmk(this));
        try {
            gmbu.t(((bxmw)ggeo0.get(this.d)).a(), new bxmq(this), this.m);
        }
        catch(Exception exception0) {
            this.e(exception0);
        }
    }

    public final void e(Throwable throwable0) {
        this.e = true;
        if(this.d != null) {
            this.h(new bxmi(this));
        }
        this.h(new bxmj(throwable0));
    }

    public final void f(Object object0) {
        this.l(gfsx.m(object0));
    }

    public final void g() {
        this.l(gfqx.a);
    }

    public final void h(kar kar0) {
        for(int v = 0; true; ++v) {
            gged_interceptors gged0 = this.k;
            if(v >= ((ggna)gged0).c) {
                break;
            }
            kar0.accept(((bxmv)gged0.get(v)));
        }
    }

    public final void i() {
        synchronized(this.c) {
            Long long0 = this.l;
            if(long0 != null && System.currentTimeMillis() >= ((long)long0)) {
                ((ggtj)((ggtj)bxmu.g.h()).ar(5802)).x("FlowRunner was started after the provided end time has passed.");
                this.j(this.b);
                return;
            }
            if(!this.o && !this.e) {
                this.o = true;
                this.d = this.i;
                if(long0 != null) {
                    if(((long)long0) - System.currentTimeMillis() <= 0L) {
                        this.j(this.b);
                        return;
                    }
                    bxml bxml0 = new bxml(this);
                    ((bbll)this.h).h(bxml0, ((long)long0) - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
                }
                this.d();
            }
        }
    }

    public final boolean j(Throwable throwable0) {
        gmcu gmcu0;
        synchronized(this.c) {
            if(this.e) {
                return false;
            }
            if(!this.o) {
                this.e(throwable0);
                return true;
            }
            synchronized(this.n) {
                gmcu0 = this.p;
                if(gmcu0 == null) {
                    this.e(throwable0);
                    return false;
                }
                this.p = null;
            }
            gmcu0.r(throwable0);
        }
        return true;
    }

    public final void k(int v, String s) {
        this.j(bxma.f(v, s));
    }

    private final void l(gfsx gfsx0) {
        gmcu gmcu0;
        synchronized(this.n) {
            gmcu0 = this.p;
            if(gmcu0 == null) {
                ((ggtj)((ggtj)bxmu.g.j()).ar(5801)).x("FlowRunner#resume() is called when the flow cannot be resumed.");
                return;
            }
            this.p = null;
        }
        gmcu0.q(gfsx0);
    }
}

