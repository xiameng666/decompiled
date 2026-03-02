import java.util.concurrent.Executor;

public final class ktv implements ibth {
    public final Executor a;
    public final kjk b;

    public ktv(Executor executor0, kjk kjk0) {
        this.a = executor0;
        this.b = kjk0;
    }

    @Override  // ibth
    public final Object a() {
        ktu ktu0 = new ktu(this.b);
        this.a.execute(ktu0);
        return ibom.a;
    }
}

