import java.util.concurrent.Executor;

public final class ifzb implements Executor {
    public final Executor a;
    public final int b;
    public final boolean c;
    public final int d;

    public ifzb(Executor executor0, int v, boolean z, int v1) {
        this.a = executor0;
        this.b = v;
        this.c = z;
        this.d = v1;
    }

    @Override
    public final void execute(Runnable runnable0) {
        ifzd ifzd0 = new ifzd(this.b, this.c, this.d, runnable0);
        this.a.execute(ifzd0);
    }
}

