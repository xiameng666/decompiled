import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

final class aqa {
    public final ScheduledFuture a;
    public final AtomicBoolean b;
    final aqb c;

    public aqa(aqb aqb0) {
        this.c = aqb0;
        super();
        this.b = new AtomicBoolean(false);
        apy apy0 = new apy(this);
        this.a = aqb0.b.d.schedule(apy0, 2000L, TimeUnit.MILLISECONDS);
    }
}

