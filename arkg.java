import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;

public final class arkg implements Runnable {
    public final arkk a;
    public final ExecutorService b;
    public final arkj c;

    public arkg(arkk arkk0, ExecutorService executorService0, arkj arkj0) {
        this.a = arkk0;
        this.b = executorService0;
        this.c = arkj0;
    }

    @Override
    public final void run() {
        arkk arkk0 = this.a;
        if(((ScheduledFuture)arkk0.d.getAndSet(null)) == null) {
            return;
        }
        arkk0.a.f("Timed out while finding compatible packages.", new Object[0]);
        arkf arkf0 = new arkf(this.c);
        this.b.execute(arkf0);
    }
}

