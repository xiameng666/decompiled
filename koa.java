import java.util.concurrent.Executor;

public final class koa implements ibth {
    public final Executor a;
    public final kjk b;

    public koa(Executor executor0, kjk kjk0) {
        this.a = executor0;
        this.b = kjk0;
    }

    @Override  // ibth
    public final Object a() {
        knv knv0 = new knv(this.b);
        this.a.execute(knv0);
        return ibom.a;
    }
}

