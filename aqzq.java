import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class aqzq extends glyq {
    public static final baun a;
    public final int b;
    public int c;
    public final aqxh d;
    private final gful_cronetEngineProvider e;
    private final ScheduledExecutorService f;
    private final aqxp g;
    private gmcd h;
    private ScheduledFuture i;

    static {
        aqzq.a = aqql.a("RetryingListenableFuture");
    }

    public aqzq(gful_cronetEngineProvider gful0, ScheduledExecutorService scheduledExecutorService0, int v, aqxh aqxh0, aqxp aqxp0) {
        boolean z = false;
        this.c = 0;
        this.e = gful0;
        this.f = scheduledExecutorService0;
        this.g = aqxp0;
        if(v >= 0) {
            z = true;
        }
        batl.b(z);
        this.b = v;
        this.d = aqxh0;
        this.d();
    }

    @Override  // glyq
    protected final void a() {
        if(this.isCancelled()) {
            synchronized(this) {
                if(this.i != null) {
                    baun baun0 = aqzq.a;
                    baun0.d("Cancelling scheduled retry.", new Object[0]);
                    boolean z = this.s();
                    if(!this.i.cancel(z)) {
                        baun0.d("Could not cancel scheduled retry.", new Object[0]);
                    }
                }
                gmcd gmcd0 = this.h;
                this.h = null;
            }
            if(gmcd0 != null && !gmcd0.cancel(this.s())) {
                aqzq.a.d("Attempted to cancel underlying future but it had already completed.", new Object[0]);
            }
        }
    }

    // Detected as a lambda impl.
    public final void c() {
        synchronized(this) {
            this.i = null;
            gmcd gmcd0 = (gmcd)this.e.mr();
            this.h = gmcd0;
            gmbu.t(gmcd0, new aqzp(this), this.f);
        }
    }

    public final void d() {
        synchronized(this) {
            if(this.i != null) {
                aqzq.a.f("Attempting to schedule a future while one was already in flight", new Object[0]);
            }
            this.h = null;
            aqxp aqxp0 = this.g;
            if(this.c != 0) {
                long v1 = aqxp0.a;
                if(v1 != 0L) {
                    aqzq.a.d("Scheduling retry after %d ms", new Object[]{v1});
                    aqzo aqzo0 = () -> synchronized(this) {
                        this.i = null;
                        gmcd gmcd0 = (gmcd)this.e.mr();
                        this.h = gmcd0;
                        gmbu.t(gmcd0, new aqzp(this), this.f);
                    };
                    this.i = ((bbll)this.f).g(aqzo0, v1, TimeUnit.MILLISECONDS);
                    return;
                }
            }
            this.c();
        }
    }
}

