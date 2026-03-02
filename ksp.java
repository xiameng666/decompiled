import java.util.concurrent.Executor;

public final class ksp implements ibth {
    public final kta a;
    public final kle b;

    public ksp(kta kta0, kle kle0) {
        this.a = kta0;
        this.b = kle0;
    }

    @Override  // ibth
    public final Object a() {
        kta kta0 = this.a;
        Executor executor0 = kta0.g;
        if(executor0 == null) {
            ibuq.j("executor");
            executor0 = null;
        }
        executor0.execute(new ksu(kta0, this.b));
        return ibom.a;
    }
}

