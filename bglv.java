import java.io.File;
import java.util.concurrent.ScheduledExecutorService;

public final class bglv implements evqk {
    public final bglw a;
    public final ScheduledExecutorService b;
    public final String c;

    public bglv(bglw bglw0, ScheduledExecutorService scheduledExecutorService0, String s) {
        this.a = bglw0;
        this.b = scheduledExecutorService0;
        this.c = s;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        evqp evqp0 = new evqp();
        bdwj bdwj0 = new bdwj(((bgjl)this.a.a).a, ((File)object0), this.b, this.c, evqp0);
        this.b.execute(bdwj0);
        return evqp0.a;
    }
}

