import java.util.concurrent.Executor;

public final class ktc implements ibth {
    public final Executor a;
    public final kjk b;
    public final kiu c;

    public ktc(Executor executor0, kjk kjk0, kiu kiu0) {
        this.a = executor0;
        this.b = kjk0;
        this.c = kiu0;
    }

    @Override  // ibth
    public final Object a() {
        kto kto0 = new kto(this.b, this.c);
        this.a.execute(kto0);
        return ibom.a;
    }
}

