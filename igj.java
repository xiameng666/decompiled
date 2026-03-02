final class igj extends ibur implements ibth {
    final igl a;
    final long b;
    final long c;
    final ija d;

    public igj(igl igl0, long v, long v1, ija ija0) {
        this.a = igl0;
        this.b = v;
        this.c = v1;
        this.d = ija0;
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        igl igl0 = this.a;
        igl0.M().a = false;
        igi igi0 = igl0.M();
        igi0.b = this.b;
        igi igi1 = igl0.M();
        igi1.c = this.c;
        ibts ibts0 = this.d.a.f();
        if(ibts0 != null) {
            ibts0.a(igl0.M());
        }
        return ibom.a;
    }
}

