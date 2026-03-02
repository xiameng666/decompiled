import android.os.SystemClock;
import j..time.Duration;
import j..util.Collection.-EL;
import java.util.Collection;
import java.util.concurrent.Executor;

public final class fvfi extends cjdc implements fvew {
    private final fvfm c;
    private final Object d;
    private fvfq e;

    public fvfi(fvfm fvfm0) {
        this.d = new Object();
        gftb.check(fvfm0);
        this.c = fvfm0;
    }

    @Override  // cjdc
    protected final void A() {
        fvfj fvfj0 = new fvfj(this.c);
        this.c.f.execute(fvfj0);
    }

    public final fvfq C() {
        synchronized(this.d) {
        }
        return this.e;
    }

    public final fvhd D(fvel fvel0) {
        synchronized(this.d) {
            fvfq fvfq0 = this.e;
            if(fvfq0 == null) {
                return null;
            }
            ggeo ggeo0 = fvfq0.a;
            if(ggeo0 == null) {
                return null;
            }
            fvhd fvhd0 = (fvhd)ggeo0.get(fvel0.a);
            if(fvhd0 != null && fvhd0.f(fvel0.b.bQ)) {
                return fvhd0;
            }
        }
        return null;
    }

    public final void E(fvfn fvfn0, fvew fvew0, Executor executor0) {
        fvfq fvfq0;
        boolean z;
        synchronized(this.d) {
            z = false;
            fvfq0 = this.e;
        }
        if(fvfq0 != null && SystemClock.elapsedRealtime() - fvfq0.l < fvfn0.b.toMillis()) {
            if(fvfq0.b != null && !fvfq0.b.isEmpty()) {
                z = true;
            }
            boolean z1 = fvfn0.d;
            if(!z1 || !fvfn0.a || z) {
                executor0.execute(new fvex(fvew0, fvfq0));
                if(z1) {
                    return;
                }
            }
        }
        if(fvfn0.d) {
            fvfn0 = new fvfn(fvfn0.a, Duration.ZERO, Duration.ZERO, true, fvfn0.e, fvfn0.f);
        }
        this.s(fvew0, new fvfw(executor0, this, fvfn0, new fvfx(fvew0)));
    }

    @Override  // fvew
    public final void a(fvfq fvfq0) {
        synchronized(this.d) {
            this.e = fvfq0;
        }
        this.l(new fvez(fvfq0));
    }

    @Override  // cjdc
    protected final Object b(Collection collection0) {
        Long long0 = (long)0x7FFFFFFFFFFFFFFFL;
        long v = (long)(((Long)Collection.-EL.stream(collection0).map(new fvfb()).min(new fvfc()).orElse(long0)));
        long v1 = (long)(((Long)Collection.-EL.stream(collection0).map(new fvfd()).min(new fvfc()).orElse(long0)));
        boolean z = Collection.-EL.stream(collection0).anyMatch(new fvfe());
        boolean z1 = Collection.-EL.stream(collection0).anyMatch(new fvff());
        gged_interceptors gged0 = (gged_interceptors)Collection.-EL.stream(collection0).filter(new fvfg(v)).flatMap(new fvfh()).collect(ggaf.a);
        return new fvfn(z, Duration.ofMillis(v), Duration.ofMillis(v1), z1, cjax.c(((Collection)Collection.-EL.stream(collection0).flatMap(new fvey()).collect(ggaf.a))), gged0);
    }

    @Override  // cjdc
    protected final void h(Object object0) {
        fvfk fvfk0 = new fvfk(this.c, ((fvfn)object0), this);
        this.c.f.execute(fvfk0);
    }

    @Override  // fvew
    public final void mv() {
        this.l(new fvfa());
    }

    @Override  // cjcp
    protected final boolean y(cjdm cjdm0) {
        fvfw fvfw0 = (fvfw)cjdm0;
        return true;
    }
}

