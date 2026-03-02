import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

public final class ghmx extends glyq {
    public static final Logger a;
    public static final Object b;
    static final ghmw c;
    public final gful_cronetEngineProvider d;
    public final ghml e;
    public final gftc f;
    public final gfug g;
    public final gmch h;
    public final ghmw i;
    public volatile int j;
    private final Executor o;
    private final AtomicReference p;

    static {
        ghmx.a = Logger.getLogger(ghmx.class.getCanonicalName());
        ghmx.b = new Object();
        ghmx.c = new ghmq();
    }

    public ghmx(gful_cronetEngineProvider gful0, ghml ghml0, gftc gftc0, Executor executor0, ScheduledExecutorService scheduledExecutorService0, gfuv gfuv0, ghmw ghmw0) {
        this.j = 0;
        this.p = new AtomicReference(gmbu.i(new Object()));
        this.d = gful0;
        this.e = ghml0;
        this.f = gftc0;
        this.o = new ghms(this, executor0);
        this.h = gmcn.b(scheduledExecutorService0);
        this.i = ghmw0;
        this.g = gfug.c(gfuv0);
        this.f(0L, TimeUnit.MILLISECONDS);
        this.hB(new ghmr(this, ghmw0), executor0);
    }

    @Override  // glyq
    protected final void a() {
        boolean z = true;
        gmcd gmcd0 = gmbu.g();
        gmcd gmcd1 = (gmcd)this.p.getAndSet(gmcd0);
        if(gmcd1 != null) {
            if(this.isCancelled() && !this.s()) {
                z = false;
            }
            gmcd1.cancel(z);
        }
    }

    public static ghmx d(gful_cronetEngineProvider gful0, ghml ghml0, gftc gftc0, Executor executor0) {
        ghmu ghmu0 = new ghmu();
        ghmu0.b(executor0);
        return ghmu0.a(gful0, ghml0, gftc0);
    }

    public static ghmx e(gful_cronetEngineProvider gful0, ghml ghml0, gftc gftc0, ScheduledExecutorService scheduledExecutorService0) {
        ghmu ghmu0 = new ghmu();
        ghmu0.c(scheduledExecutorService0);
        return ghmu0.a(gful0, ghml0, gftc0);
    }

    public final void f(long v, TimeUnit timeUnit0) {
        gmcu gmcu0 = new gmcu();
        gmcd gmcd0 = (gmcd)this.p.getAndSet(gmcu0);
        if(v != 0L) {
            gmcd0 = glzd.g(gmcd0, new ghmm(this, v, timeUnit0), gmap.a);
        }
        gmcd gmcd1 = glzd.g(gmcd0, new ghmn(this), this.o);
        ghmo ghmo0 = new ghmo(this, gmcd1);
        gmcu0.t(glyi.g(gmcd1, Exception.class, ghmo0, this.o));
        gmcu0.hB(new ghmt(this, gmcu0), gmap.a);
    }

    @Override  // glyq
    protected final String gX() {
        gmcd gmcd0 = (gmcd)this.p.get();
        String s = this.d.toString();
        String s1 = this.f.toString();
        String s2 = this.e.toString();
        int v = this.j;
        return gmcd0.isDone() ? "futureSupplier=[" + s + "], shouldContinue=[" + s1 + "], strategy=[" + s2 + "], tries=[" + v + "]" + "" : "futureSupplier=[" + s + "], shouldContinue=[" + s1 + "], strategy=[" + s2 + "], tries=[" + v + "]" + a.a(gmcd0.toString(), ", activeTry=[", "]");
    }
}

