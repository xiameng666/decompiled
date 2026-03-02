import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class hbtn implements Executor {
    public final AtomicBoolean a;
    private final Executor b;

    public hbtn(Executor executor0) {
        this.a = new AtomicBoolean();
        this.b = executor0;
    }

    @Override
    public final void execute(Runnable runnable0) {
        if(this.a.get()) {
            return;
        }
        hbtm hbtm0 = new hbtm(this, runnable0);
        this.b.execute(hbtm0);
    }
}

