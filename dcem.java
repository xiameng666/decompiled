import java.util.concurrent.Callable;

public final class dcem implements Callable {
    public final dchp a;
    public final dcng b;

    public dcem(dchp dchp0, dcng dcng0) {
        this.a = dchp0;
        this.b = dcng0;
    }

    @Override
    public final Object call() {
        this.a.e.r.add(this.b);
        return (int)0;
    }
}

