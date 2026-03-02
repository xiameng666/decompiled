import java.util.concurrent.Executor;

final class aqf implements Runnable {
    public boolean a;
    final aqg b;
    private final Executor c;

    public aqf(aqg aqg0, Executor executor0) {
        this.b = aqg0;
        super();
        this.a = false;
        this.c = executor0;
    }

    @Override
    public final void run() {
        aqe aqe0 = new aqe(this);
        this.c.execute(aqe0);
    }
}

