public final class bnkw implements gfsi {
    public final bnla a;

    public bnkw(bnla bnla0) {
        this.a = bnla0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gted gted0 = ((gtdq)object0).c;
        if(gted0 == null) {
            gted0 = gted.a;
        }
        this.a.d.a(this.a.b, gted0);
        return (gtdq)object0;
    }
}

