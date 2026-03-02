import java.util.concurrent.Executor;

public final class kpu implements ibth {
    public final kqe a;

    public kpu(kqe kqe0) {
        this.a = kqe0;
    }

    @Override  // ibth
    public final Object a() {
        kqe kqe0 = this.a;
        Executor executor0 = kqe0.g;
        if(executor0 == null) {
            ibuq.j("executor");
            executor0 = null;
        }
        executor0.execute(new kpt(kqe0));
        return ibom.a;
    }
}

