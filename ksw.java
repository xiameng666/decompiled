import java.util.concurrent.Executor;

public final class ksw implements ibth {
    public final kta a;

    public ksw(kta kta0) {
        this.a = kta0;
    }

    @Override  // ibth
    public final Object a() {
        kta kta0 = this.a;
        Executor executor0 = kta0.g;
        if(executor0 == null) {
            ibuq.j("executor");
            executor0 = null;
        }
        executor0.execute(new kst(kta0));
        return ibom.a;
    }
}

