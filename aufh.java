import j..util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class aufh extends augk {
    final aufi a;

    public aufh(aufi aufi0) {
        Objects.requireNonNull(aufi0);
        this.a = aufi0;
        super();
    }

    @Override  // augk
    protected final void a(int v) {
        aufi aufi0 = this.a;
        ScheduledFuture scheduledFuture0 = aufi0.f;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(false);
        }
        if(avjg.a(v)) {
            ScheduledExecutorService scheduledExecutorService0 = atzn.a();
            Objects.requireNonNull(aufi0);
            aufi0.f = scheduledExecutorService0.schedule(new aufg(aufi0), ((Long)aufi0.c.mr()).longValue(), TimeUnit.MILLISECONDS);
        }
    }

    @Override  // augk
    protected final void b() {
        ScheduledFuture scheduledFuture0 = this.a.f;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(false);
        }
    }
}

