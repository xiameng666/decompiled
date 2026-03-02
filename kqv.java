import java.util.concurrent.Executor;

public final class kqv implements ibts {
    public final krd a;

    public kqv(krd krd0) {
        this.a = krd0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((kle)object0), "e");
        krd krd0 = this.a;
        Executor executor0 = krd0.g;
        if(executor0 == null) {
            ibuq.j("executor");
            executor0 = null;
        }
        executor0.execute(new kqo(krd0, ((kle)object0)));
        return ibom.a;
    }
}

