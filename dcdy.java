import java.util.concurrent.Callable;

public final class dcdy implements Callable {
    public final dchp a;
    public final int b;

    public dcdy(dchp dchp0, int v) {
        this.a = dchp0;
        this.b = v;
    }

    @Override
    public final Object call() {
        return this.a.e.u(this.b);
    }
}

