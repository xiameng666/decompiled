import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class arjx {
    private final long a;
    private final long b;
    private final ScheduledExecutorService c;
    private int d;

    public arjx(ScheduledExecutorService scheduledExecutorService0) {
        gftb.check(scheduledExecutorService0);
        this.c = scheduledExecutorService0;
        this.a = hqhq.a.j().q();
        this.b = hqhq.a.j().p();
    }

    public final void a(Runnable runnable0) {
        gftb.r(this.b(), "No remaining retries");
        int v = 1 << this.d;
        ++this.d;
        ((bbll)this.c).g(runnable0, ((long)v) * this.b, TimeUnit.MILLISECONDS);
    }

    public final boolean b() {
        return ((long)this.d) < this.a;
    }
}

