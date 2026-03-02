import java.util.concurrent.Callable;

public final class dcec implements Callable {
    public final dchp a;
    public final int b;
    public final long c;
    public final String d;

    public dcec(dchp dchp0, int v, long v1, String s) {
        this.a = dchp0;
        this.b = v;
        this.c = v1;
        this.d = s;
    }

    @Override
    public final Object call() {
        return this.a.e.s(this.b, this.c, this.d);
    }
}

