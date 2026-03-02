import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class ghmu {
    public gfuv a;
    public ghmw b;
    private gfsx c;
    private gfsx d;

    public ghmu() {
        this.c = gfqx.a;
        this.d = gfqx.a;
        this.a = gfuv.b;
        this.b = ghmx.c;
    }

    public final ghmx a(gful_cronetEngineProvider gful0, ghml ghml0, gftc gftc0) {
        gftb.r(this.c.i() || this.d.i(), "Either executor or scheduledExecutorService needs to be set.");
        Executor executor0 = (Executor)this.c.a(this.d).d();
        return this.d.i() ? new ghmx(gful0, ghml0, gftc0, executor0, ((ScheduledExecutorService)this.d.d()), this.a, this.b) : new ghmx(gful0, ghml0, gftc0, executor0, ghmv.a, this.a, this.b);
    }

    public final void b(Executor executor0) {
        this.c = gfsx.m(executor0);
    }

    public final void c(ScheduledExecutorService scheduledExecutorService0) {
        this.d = gfsx.m(scheduledExecutorService0);
    }
}

