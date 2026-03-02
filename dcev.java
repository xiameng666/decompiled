import java.util.concurrent.Callable;

public final class dcev implements Callable {
    public final dchp a;
    public final dbzg b;
    public final int c;

    public dcev(dchp dchp0, dbzg dbzg0, int v) {
        this.a = dchp0;
        this.b = dbzg0;
        this.c = v;
    }

    @Override
    public final Object call() {
        this.a.e.s.put(this.b, Integer.valueOf(this.c));
        return (int)0;
    }
}

