import android.util.Size;
import android.view.Surface;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class bel {
    public final Object a;
    public final Size b;
    public final bat c;
    public final bin d;
    public final boolean e;
    final gmcd f;
    public final bka g;
    public bej h;
    public bek i;
    public Executor j;
    public static final int k;
    private final jqt l;
    private final gmcd m;
    private final jqt n;
    private final jqt o;

    static {
    }

    public bel(Size size0, bin bin0, boolean z, bat bat0, Runnable runnable0) {
        this.a = new Object();
        this.b = size0;
        this.d = bin0;
        this.e = z;
        kay.b(bat0.b(), "SurfaceRequest\'s DynamicRange must always be fully specified.");
        this.c = bat0;
        String s = "SurfaceRequest[size: " + size0 + ", id: " + this.hashCode() + "]";
        AtomicReference atomicReference0 = new AtomicReference(null);
        gmcd gmcd0 = jqy.a(new bdy(atomicReference0, s));
        jqt jqt0 = (jqt)atomicReference0.get();
        kay.i(jqt0);
        this.o = jqt0;
        AtomicReference atomicReference1 = new AtomicReference(null);
        gmcd gmcd1 = jqy.a(new bdz(atomicReference1, s));
        this.m = gmcd1;
        bpt.j(gmcd1, new bec(jqt0, gmcd0), bol.a());
        jqt jqt1 = (jqt)atomicReference1.get();
        kay.i(jqt1);
        AtomicReference atomicReference2 = new AtomicReference(null);
        gmcd gmcd2 = jqy.a(new bea(atomicReference2, s));
        this.f = gmcd2;
        jqt jqt2 = (jqt)atomicReference2.get();
        kay.i(jqt2);
        this.l = jqt2;
        bed bed0 = new bed(this, size0);
        this.g = bed0;
        gmcd gmcd3 = bed0.c();
        bpt.j(gmcd2, new bee(gmcd3, jqt1, s), bol.a());
        gmcd3.hB(new beb(this), bol.a());
        Executor executor0 = bol.a();
        AtomicReference atomicReference3 = new AtomicReference(null);
        bpt.j(jqy.a(new bdx(this, atomicReference3)), new beg(runnable0), executor0);
        jqt jqt3 = (jqt)atomicReference3.get();
        kay.i(jqt3);
        this.n = jqt3;
    }

    public final void a(Executor executor0, Runnable runnable0) {
        this.o.a(runnable0, executor0);
    }

    public final void b() {
        synchronized(this.a) {
            this.i = null;
            this.j = null;
        }
    }

    public final void c(Surface surface0, Executor executor0, kar kar0) {
        if(!surface0.isValid()) {
            executor0.execute(new bdu(kar0, surface0));
            return;
        }
        if(!this.l.b(surface0)) {
            gmcd gmcd0 = this.f;
            if(!gmcd0.isCancelled()) {
                kay.c(gmcd0.isDone());
                try {
                    gmcd0.get();
                    executor0.execute(new bdv(kar0, surface0));
                }
                catch(InterruptedException | ExecutionException unused_ex) {
                    executor0.execute(new bdw(kar0, surface0));
                }
                return;
            }
        }
        bef bef0 = new bef(kar0, surface0);
        bpt.j(this.m, bef0, executor0);
    }

    public final void d(Executor executor0, bek bek0) {
        bej bej0;
        synchronized(this.a) {
            this.i = bek0;
            this.j = executor0;
            bej0 = this.h;
        }
        if(bej0 != null) {
            executor0.execute(new bdt(bek0, bej0));
        }
    }

    public final void e() {
        this.f();
        this.n.b(null);
    }

    public final void f() {
        bjz bjz0 = new bjz();
        this.l.c(bjz0);
    }
}

