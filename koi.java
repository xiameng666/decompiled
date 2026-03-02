import java.util.concurrent.Executor;

public final class koi implements ibth {
    public final Executor a;
    public final kjk b;
    public final Exception c;

    public koi(Executor executor0, kjk kjk0, Exception exception0) {
        this.a = executor0;
        this.b = kjk0;
        this.c = exception0;
    }

    @Override  // ibth
    public final Object a() {
        koj koj0 = new koj(this.b, this.c);
        this.a.execute(koj0);
        return ibom.a;
    }
}

