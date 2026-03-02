import java.util.concurrent.Executor;

public final class kso implements ibth {
    public final kta a;
    public final kiu b;

    public kso(kta kta0, kiu kiu0) {
        this.a = kta0;
        this.b = kiu0;
    }

    @Override  // ibth
    public final Object a() {
        kta kta0 = this.a;
        Executor executor0 = kta0.g;
        if(executor0 == null) {
            ibuq.j("executor");
            executor0 = null;
        }
        executor0.execute(new ksx(kta0, this.b));
        return ibom.a;
    }
}

