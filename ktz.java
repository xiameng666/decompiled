import java.util.concurrent.Executor;

public final class ktz implements ibth {
    public final Executor a;
    public final kjk b;

    public ktz(Executor executor0, kjk kjk0) {
        this.a = executor0;
        this.b = kjk0;
    }

    @Override  // ibth
    public final Object a() {
        kua kua0 = new kua(this.b);
        this.a.execute(kua0);
        return ibom.a;
    }
}

