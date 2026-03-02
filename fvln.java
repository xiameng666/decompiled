import java.util.List;

public final class fvln implements Runnable {
    public final fvls a;
    public final long b;
    public final List c;
    public final long d;
    public final List e;

    public fvln(fvls fvls0, long v, List list0, long v1, List list1) {
        this.a = fvls0;
        this.b = v;
        this.c = list0;
        this.d = v1;
        this.e = list1;
    }

    @Override
    public final void run() {
        this.a.a.x(this.b, this.c, this.d, this.e);
    }
}

