import j..util.Objects;
import java.util.concurrent.ScheduledExecutorService;

final class crot implements Runnable {
    final crii a;
    final croy b;

    public crot(croy croy0, crii crii0) {
        this.a = crii0;
        Objects.requireNonNull(croy0);
        this.b = croy0;
        super();
    }

    @Override
    public final void run() {
        croy croy0 = this.b;
        synchronized(croy0) {
            croy.c(croy0);
            croz croz0 = croy0.c;
            if(!croz0.C()) {
                croz0.aJ().j.a("Connected to remote service");
                croz0.B(this.a);
            }
        }
        croz croz1 = this.b.c;
        ScheduledExecutorService scheduledExecutorService0 = croz1.d;
        if(scheduledExecutorService0 != null) {
            scheduledExecutorService0.shutdownNow();
            croz1.d = null;
        }
    }
}

