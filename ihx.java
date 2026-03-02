final class ihx extends ibur implements ibth {
    final ibts a;
    final ihy b;

    public ihx(ibts ibts0, ihy ihy0) {
        this.a = ibts0;
        this.b = ihy0;
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        hmr hmr0 = ihy.q;
        this.a.a(hmr0);
        ihy ihy0 = this.b;
        hmu hmu0 = hmr0.m;
        boolean z = hmr0.n;
        boolean z1 = ihy0.B != z;
        if(ihy0.A != hmu0) {
        label_9:
            ihy0.A = hmu0;
            ihy0.B = z;
            if(ihy0.C && (z1 || z)) {
                ihy0.t.N();
            }
        }
        else if(z1) {
            z1 = true;
            goto label_9;
        }
        ihy0.C = true;
        hmr0.t = hmr0.m.a(hmr0.p, hmr0.r, hmr0.q);
        return ibom.a;
    }
}

