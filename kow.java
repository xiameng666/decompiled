import java.util.concurrent.Executor;

public final class kow implements ibth {
    public final Executor a;
    public final kjk b;
    public final Exception c;

    public kow(Executor executor0, kjk kjk0, Exception exception0) {
        this.a = executor0;
        this.b = kjk0;
        this.c = exception0;
    }

    @Override  // ibth
    public final Object a() {
        kor kor0 = new kor(this.b, this.c);
        this.a.execute(kor0);
        return ibom.a;
    }
}

