import android.os.Looper;
import java.util.Map;
import java.util.concurrent.Executor;

public final class blul {
    public final Object a;
    public final Runnable b;
    public final kar c;
    public boolean d;
    public Object e;
    public gmcu f;
    public final Object g;
    private final ggeo h;
    private final Executor i;

    public blul(Object object0, Map map0, Runnable runnable0, kar kar0) {
        gftb.check(object0);
        this.a = object0;
        this.h = ggeo.k(map0);
        this.b = runnable0;
        this.c = kar0;
        this.i = new bbre(new clht(Looper.getMainLooper()));
        this.g = new Object();
    }

    public final void a() {
        synchronized(this.g) {
            gftb.r(this.f != null, "The flow has been aborted, or the current step cannot be aborted since it\'s not a step that waits for other events to happen (see #createWaitingNextStep() and #createUnknownNextStep() for details).");
            this.f = null;
        }
    }

    public final void b() {
        ggeo ggeo0 = this.h;
        if(!ggeo0.containsKey(this.e)) {
            throw new IllegalStateException("Unrecognized step: " + this.e);
        }
        gmbu.t(((gmcd)((kba)ggeo0.get(this.e)).a()), new bluj(this), this.i);
    }

    public static final gmcd c(Object object0) {
        return gmbu.i(gfsx.m(object0));
    }

    public static final gmcd d() {
        return gmbu.i(gfqx.a);
    }
}

