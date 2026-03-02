import java.util.concurrent.Executor;

public final class kov implements ibth {
    public final Executor a;
    public final kjk b;
    public final kkb c;

    public kov(Executor executor0, kjk kjk0, kkb kkb0) {
        this.a = executor0;
        this.b = kjk0;
        this.c = kkb0;
    }

    @Override  // ibth
    public final Object a() {
        kos kos0 = new kos(this.b, this.c);
        this.a.execute(kos0);
        return ibom.a;
    }
}

