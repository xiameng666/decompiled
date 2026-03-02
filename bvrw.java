import java.util.concurrent.Callable;

public final class bvrw implements Callable {
    public final bvsd a;
    public final gqps b;
    public final String c;

    public bvrw(bvsd bvsd0, gqps gqps0, String s) {
        this.a = bvsd0;
        this.b = gqps0;
        this.c = s;
    }

    @Override
    public final Object call() {
        double f = (double)(this.b.c == null ? gqpl.a : this.b.c).b;
        double f1 = (double)(this.b.c == null ? gqpl.a : this.b.c).c;
        gqpl gqpl0 = this.b.b;
        double f2 = (double)(gqpl0 == null ? gqpl.a : gqpl0).b;
        if(gqpl0 == null) {
            gqpl0 = gqpl.a;
        }
        double f3 = (double)gqpl0.c;
        double f4 = (double)bweg.b(this.a.a);
        double f5 = (double)bweg.a(this.a.a);
        double f6 = ((double)this.a.a.getResources().getDisplayMetrics().densityDpi) / 160.0;
        double f7 = Math.max(f4, f5) / f6;
        double f8 = Math.min(f4, f5) / f6;
        return !(f7 >= f2) || !(f7 <= f3) || !(f8 >= f) || !(f8 <= f1) ? bvsc.a(this.c) : bvsc.c();
    }
}

