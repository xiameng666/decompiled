import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class gpbs extends jqs implements ScheduledFuture {
    private final ScheduledFuture c;

    public gpbs(gpbr gpbr0) {
        this.c = gpbr0.a(new gpbq(this));
    }

    @Override
    public final int compareTo(Object object0) {
        return this.c.compareTo(((Delayed)object0));
    }

    @Override  // jqs
    protected final void e() {
        this.c.cancel((this.value instanceof jqj) && ((jqj)this.value).c);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit0) {
        return this.c.getDelay(timeUnit0);
    }
}

