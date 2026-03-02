import java.util.concurrent.Executor;

public final class kob implements ibth {
    public final Executor a;
    public final kjk b;
    public final kkb c;

    public kob(Executor executor0, kjk kjk0, kkb kkb0) {
        this.a = executor0;
        this.b = kjk0;
        this.c = kkb0;
    }

    @Override  // ibth
    public final Object a() {
        knx knx0 = new knx(this.b, this.c);
        this.a.execute(knx0);
        return ibom.a;
    }
}

