import java.util.concurrent.Executor;

final class gplr implements Executor {
    private volatile Executor a;

    public gplr(Executor executor0) {
        this.a = executor0;
    }

    public final void a() {
        this.a = gmap.a;
    }

    @Override
    public final void execute(Runnable runnable0) {
        this.a.execute(runnable0);
    }
}

