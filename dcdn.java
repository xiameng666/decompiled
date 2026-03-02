import java.util.concurrent.Callable;

public final class dcdn implements Callable {
    public final dchp a;
    public final dcho b;

    public dcdn(dchp dchp0, dcho dcho0) {
        this.a = dchp0;
        this.b = dcho0;
    }

    @Override
    public final Object call() {
        this.a.e.r.remove(this.b.a);
        return (int)0;
    }
}

