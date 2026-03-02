import j..util.Collection.-EL;
import java.util.Collection;

public final class bpeo implements glzn {
    public final bpik a;
    public final bnyt b;
    public final bprh c;

    public bpeo(bpik bpik0, bnyt bnyt0, bprh bprh0) {
        this.a = bpik0;
        this.b = bnyt0;
        this.c = bprh0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gfsx gfsx0 = this.b.e;
        fqys fqys0 = !gfsx0.i() || !Collection.-EL.stream(((Collection)gfsx0.d())).anyMatch(new bpia()) ? fqys.i : fqys.h;
        Object object1 = this.c.e.d();
        return this.a.k(fqys0, ((fqyi)object1), ((Boolean)object0).booleanValue());
    }
}

