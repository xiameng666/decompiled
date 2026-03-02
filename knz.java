import java.util.concurrent.Executor;

public final class knz implements ibts {
    public final Executor a;
    public final kjk b;

    public knz(Executor executor0, kjk kjk0) {
        this.a = executor0;
        this.b = kjk0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        kln kln0 = (kln)object0;
        ibuq.f(kln0, "e");
        kod kod0 = new kod(this.b, kln0);
        this.a.execute(kod0);
        return ibom.a;
    }
}

