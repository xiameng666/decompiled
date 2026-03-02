import java.util.concurrent.Executor;

public final class koc implements ibth {
    public final Executor a;
    public final kjk b;
    public final kln c;

    public koc(Executor executor0, kjk kjk0, kln kln0) {
        this.a = executor0;
        this.b = kjk0;
        this.c = kln0;
    }

    @Override  // ibth
    public final Object a() {
        knw knw0 = new knw(this.b, this.c);
        this.a.execute(knw0);
        return ibom.a;
    }
}

