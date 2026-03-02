import java.util.concurrent.Executor;

final class dfsz extends ibuo implements ibts {
    public dfsz(Object object0) {
        super(1, object0, Executor.class, "execute", "execute(Ljava/lang/Runnable;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Runnable runnable0 = (Runnable)object0;
        ibuq.f(runnable0, "p0");
        ((Executor)this.e).execute(runnable0);
        return ibom.a;
    }
}

