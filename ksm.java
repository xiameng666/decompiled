import java.util.concurrent.Executor;

public final class ksm implements ibts {
    public final kta a;

    public ksm(kta kta0) {
        this.a = kta0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((kle)object0), "e");
        kta kta0 = this.a;
        Executor executor0 = kta0.g;
        if(executor0 == null) {
            ibuq.j("executor");
            executor0 = null;
        }
        executor0.execute(new kss(kta0, ((kle)object0)));
        return ibom.a;
    }
}

