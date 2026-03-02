import java.util.concurrent.Executor;

public final class kon implements ibth {
    public final Executor a;
    public final kjk b;
    public final ibvd c;

    public kon(Executor executor0, kjk kjk0, ibvd ibvd0) {
        this.a = executor0;
        this.b = kjk0;
        this.c = ibvd0;
    }

    @Override  // ibth
    public final Object a() {
        kog kog0 = new kog(this.b, this.c);
        this.a.execute(kog0);
        return ibom.a;
    }
}

