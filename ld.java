import java.util.List;

final class ld implements Runnable {
    final List a;
    final List b;
    final int c;
    final lf d;

    public ld(lf lf0, List list0, List list1, int v) {
        this.d = lf0;
        this.a = list0;
        this.b = list1;
        this.c = v;
        super();
    }

    @Override
    public final void run() {
        lo lo0 = lt.a(new lb(this));
        this.d.c.execute(new lc(this, lo0));
    }
}

