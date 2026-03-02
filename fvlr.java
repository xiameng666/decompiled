import java.util.List;

public final class fvlr implements Runnable {
    public final fvls a;
    public final List b;
    public final long c;

    public fvlr(fvls fvls0, List list0, long v) {
        this.a = fvls0;
        this.b = list0;
        this.c = v;
    }

    @Override
    public final void run() {
        this.a.a.g(this.b, this.c);
    }
}

