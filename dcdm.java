import java.util.concurrent.Callable;

public final class dcdm implements Callable {
    public final dchp a;
    public final dchl b;

    public dcdm(dchp dchp0, dchl dchl0) {
        this.a = dchp0;
        this.b = dchl0;
    }

    @Override
    public final Object call() {
        this.a.e.s.remove(this.b.a);
        return (int)0;
    }
}

