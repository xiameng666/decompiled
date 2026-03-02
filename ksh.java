import java.util.concurrent.Executor;

public final class ksh implements ibth {
    public final Executor a;
    public final kjk b;
    public final Exception c;

    public ksh(Executor executor0, kjk kjk0, Exception exception0) {
        this.a = executor0;
        this.b = kjk0;
        this.c = exception0;
    }

    @Override  // ibth
    public final Object a() {
        ksd ksd0 = new ksd(this.b, this.c);
        this.a.execute(ksd0);
        return ibom.a;
    }
}

