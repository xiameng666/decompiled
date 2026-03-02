import java.util.List;

public final class bvfe implements ibts {
    public final List a;
    public final cmai b;
    public final eoqf c;

    public bvfe(List list0, cmai cmai0, eoqf eoqf0) {
        this.a = list0;
        this.b = cmai0;
        this.c = eoqf0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        dnr dnr0 = (dnr)object0;
        ibuq.f(dnr0, "$this$LazyColumn");
        bvfh bvfh0 = new bvfh(new bvfa(), this.a);
        bvfi bvfi0 = new bvfi(this.a);
        gze gze0 = new gze(802480018, true, new bvfj(this.a, this.c));
        dnr0.b(this.a.size(), bvfh0, bvfi0, gze0);
        dol.a(dnr0, new gze(1072002612, true, new bvfg(this.b)));
        return ibom.a;
    }
}

