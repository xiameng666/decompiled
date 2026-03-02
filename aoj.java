import java.util.concurrent.Executor;

public final class aoj implements Runnable {
    public final aow a;
    public final Executor b;
    public final bhl c;

    public aoj(aow aow0, Executor executor0, bhl bhl0) {
        this.a = aow0;
        this.b = executor0;
        this.c = bhl0;
    }

    @Override
    public final void run() {
        this.a.i.a.add(this.c);
        this.a.i.b.put(this.c, this.b);
    }
}

