import java.util.concurrent.Executor;

public final class kqy implements ibth {
    public final krd a;
    public final kiu b;

    public kqy(krd krd0, kiu kiu0) {
        this.a = krd0;
        this.b = kiu0;
    }

    @Override  // ibth
    public final Object a() {
        krd krd0 = this.a;
        Executor executor0 = krd0.g;
        if(executor0 == null) {
            ibuq.j("executor");
            executor0 = null;
        }
        executor0.execute(new kqf(krd0, this.b));
        return ibom.a;
    }
}

