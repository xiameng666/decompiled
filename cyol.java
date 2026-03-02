public final class cyol implements Runnable {
    public final cyom a;
    public final cyql b;
    public final cync c;
    public final long d;

    public cyol(cyom cyom0, cyql cyql0, cync cync0, long v) {
        this.a = cyom0;
        this.b = cyql0;
        this.c = cync0;
        this.d = v;
    }

    @Override
    public final void run() {
        cyom cyom0 = this.a;
        cyql cyql0 = this.b;
        int v = cyom0.f(cyql0.b);
        if(v != cyql0.b) {
            ggtj ggtj0 = (ggtj)cyom0.g.d().ar(0x1F25);
            String s = cyjv.a(cyql0.b);
            if(cyql0.b != 0) {
                String s1 = cyjv.a(v);
                if(v != 0) {
                    ggtj0.R("SwitchHistory: Update fail reason from %s to %s", s, s1);
                    goto label_12;
                }
            }
            throw null;
        }
    label_12:
        cync cync0 = this.c;
        cyql0.b = v;
        cync0.b(this.d, cyql0);
        kar kar0 = cyom0.f;
        if(kar0 != null) {
            kar0.accept(cync0);
        }
        cyom0.c.g(cync0);
    }
}

