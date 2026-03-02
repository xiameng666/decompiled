import dagger.Lazy;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

@ibnh
final class foyg {
    public final Lazy a;
    public final Executor b;
    public final AtomicBoolean c;
    public volatile foyf d;
    public ScheduledFuture e;
    public ScheduledFuture f;
    private static final foyf g;

    static {
        foyg.g = new foya();
    }

    public foyg(foqv foqv0, gmch gmch0, Executor executor0, Lazy lazy0) {
        this.c = new AtomicBoolean(false);
        this.d = foyg.g;
        this.a = lazy0;
        this.b = executor0;
        foqv0.a(new foye(this, gmch0));
    }

    public final void a() {
        ScheduledFuture scheduledFuture0 = this.e;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(true);
            this.e = null;
        }
        ScheduledFuture scheduledFuture1 = this.f;
        if(scheduledFuture1 != null) {
            scheduledFuture1.cancel(true);
            this.f = null;
        }
    }
}

