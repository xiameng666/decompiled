import java.util.List;

public final class fkte implements glzn {
    public final fktl a;
    public final gged_interceptors b;
    public final List c;
    public final fkjn d;

    public fkte(fktl fktl0, gged_interceptors gged0, List list0, fkjn fkjn0) {
        this.a = fktl0;
        this.b = gged0;
        this.c = list0;
        this.d = fkjn0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ggdy ggdy0 = new ggdy();
        gged_interceptors gged0 = fkmh.a(this.b, ((fkjr)object0).a);
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            fkmh fkmh0 = (fkmh)gged0.get(v1);
            fkju fkju0 = new fkju(((fkjw)fkmh0.b));
            fkju0.b(((fkjl)fkmh0.a).b);
            ggdy0.i(fkju0.a());
        }
        fkjq fkjq0 = new fkjq(((fkjr)object0));
        fkjq0.c(ggdy0.h());
        fkjr fkjr0 = fkjq0.a();
        return this.a.b.e(this.c, this.d, fkjr0);
    }
}

