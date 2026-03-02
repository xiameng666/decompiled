import java.util.concurrent.Executor;

public final class kqt implements ibth {
    public final krd a;

    public kqt(krd krd0) {
        this.a = krd0;
    }

    @Override  // ibth
    public final Object a() {
        krd krd0 = this.a;
        Executor executor0 = krd0.g;
        if(executor0 == null) {
            ibuq.j("executor");
            executor0 = null;
        }
        executor0.execute(new kqq(krd0));
        return ibom.a;
    }
}

