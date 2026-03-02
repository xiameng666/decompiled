import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

final class je implements Executor {
    final Queue a;
    final Executor b;
    Runnable c;
    private final Object d;

    public je(Executor executor0) {
        this.d = new Object();
        this.a = new ArrayDeque();
        this.b = executor0;
    }

    protected final void a() {
        synchronized(this.d) {
            Runnable runnable0 = (Runnable)this.a.poll();
            this.c = runnable0;
            if(runnable0 != null) {
                this.b.execute(runnable0);
            }
        }
    }

    @Override
    public final void execute(Runnable runnable0) {
        synchronized(this.d) {
            jd jd0 = new jd(this, runnable0);
            this.a.add(jd0);
            if(this.c == null) {
                this.a();
            }
        }
    }
}

