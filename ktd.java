import java.util.concurrent.Executor;

public final class ktd implements ibth {
    public final Executor a;
    public final kjk b;

    public ktd(Executor executor0, kjk kjk0) {
        this.a = executor0;
        this.b = kjk0;
    }

    @Override  // ibth
    public final Object a() {
        ktt ktt0 = new ktt(this.b);
        this.a.execute(ktt0);
        return ibom.a;
    }
}

