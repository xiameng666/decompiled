import java.util.concurrent.ScheduledFuture;

public final class iapr {
    private final iapq a;
    private final ScheduledFuture b;

    public iapr(iapq iapq0, ScheduledFuture scheduledFuture0) {
        this.a = iapq0;
        gftb.z(scheduledFuture0, "future");
        this.b = scheduledFuture0;
    }

    public final void a() {
        this.a.b = true;
        this.b.cancel(false);
    }

    public final boolean b() {
        return !this.a.c && !this.a.b;
    }
}

