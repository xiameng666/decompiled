import java.util.concurrent.Executor;

public final class kps implements ibth {
    public final kqe a;
    public final kiu b;

    public kps(kqe kqe0, kiu kiu0) {
        this.a = kqe0;
        this.b = kiu0;
    }

    @Override  // ibth
    public final Object a() {
        kqe kqe0 = this.a;
        Executor executor0 = kqe0.g;
        if(executor0 == null) {
            ibuq.j("executor");
            executor0 = null;
        }
        executor0.execute(new kpw(kqe0, this.b));
        return ibom.a;
    }
}

