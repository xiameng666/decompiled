import java.util.concurrent.Executor;

public final class kqc implements ibts {
    public final kqe a;

    public kqc(kqe kqe0) {
        this.a = kqe0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((kle)object0), "e");
        kqe kqe0 = this.a;
        Executor executor0 = kqe0.g;
        if(executor0 == null) {
            ibuq.j("executor");
            executor0 = null;
        }
        executor0.execute(new kpv(kqe0, ((kle)object0)));
        return ibom.a;
    }
}

