import java.util.concurrent.Executor;

public final class kpx implements ibth {
    public final kqe a;
    public final kle b;

    public kpx(kqe kqe0, kle kle0) {
        this.a = kqe0;
        this.b = kle0;
    }

    @Override  // ibth
    public final Object a() {
        kqe kqe0 = this.a;
        Executor executor0 = kqe0.g;
        if(executor0 == null) {
            ibuq.j("executor");
            executor0 = null;
        }
        executor0.execute(new kpr(kqe0, this.b));
        return ibom.a;
    }
}

