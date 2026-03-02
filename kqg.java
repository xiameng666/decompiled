import java.util.concurrent.Executor;

public final class kqg implements ibth {
    public final krd a;
    public final Throwable b;

    public kqg(krd krd0, Throwable throwable0) {
        this.a = krd0;
        this.b = throwable0;
    }

    @Override  // ibth
    public final Object a() {
        krd krd0 = this.a;
        Executor executor0 = krd0.g;
        if(executor0 == null) {
            ibuq.j("executor");
            executor0 = null;
        }
        executor0.execute(new kqk(krd0, this.b));
        return ibom.a;
    }
}

