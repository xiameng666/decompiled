import java.util.concurrent.Executor;

public final class knq implements ibth {
    public final Executor a;
    public final kjk b;
    public final Object c;

    public knq(Executor executor0, kjk kjk0, Object object0) {
        this.a = executor0;
        this.b = kjk0;
        this.c = object0;
    }

    @Override  // ibth
    public final Object a() {
        knp knp0 = new knp(this.b, this.c);
        this.a.execute(knp0);
        return ibom.a;
    }
}

