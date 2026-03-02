public final class bnko implements gfsi {
    public final bnla a;
    public final int b;

    public bnko(bnla bnla0, int v) {
        this.a = bnla0;
        this.b = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gted gted0 = ((gtdq)object0).c;
        if(gted0 == null) {
            gted0 = gted.a;
        }
        int v = this.b;
        bnla bnla0 = this.a;
        gftb.q(gted0.c == v);
        gted gted1 = ((gtdq)object0).c;
        if(gted1 == null) {
            gted1 = gted.a;
        }
        bnla0.d.a(bnla0.b, gted1);
        return v;
    }
}

