import java.util.concurrent.Executor;

public final class kot implements ibth {
    public final Executor a;
    public final kjk b;
    public final ibvd c;

    public kot(Executor executor0, kjk kjk0, ibvd ibvd0) {
        this.a = executor0;
        this.b = kjk0;
        this.c = ibvd0;
    }

    @Override  // ibth
    public final Object a() {
        kou kou0 = new kou(this.b, this.c);
        this.a.execute(kou0);
        return ibom.a;
    }
}

