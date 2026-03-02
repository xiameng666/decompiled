import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class bkx implements lqj {
    final AtomicBoolean a;
    final blc b;
    final Executor c;

    public bkx(Executor executor0, blc blc0) {
        this.a = new AtomicBoolean(true);
        this.c = executor0;
        this.b = blc0;
    }

    public final void b() {
        this.a.set(false);
    }

    @Override  // lqj
    public final void jS(Object object0) {
        bkw bkw0 = new bkw(this, ((bky)object0));
        this.c.execute(bkw0);
    }
}

