public final class dpih implements gftc {
    public final ggfp a;
    public final ggfp b;

    public dpih(ggfp ggfp0, ggfp ggfp1) {
        this.a = ggfp0;
        this.b = ggfp1;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        hknp hknp0 = ((dpea)object0).c;
        if(hknp0 == null) {
            hknp0 = hknp.b;
        }
        if(this.a.contains((hknp0.g == null ? hjqu.a : hknp0.g))) {
            hknp hknp1 = ((dpea)object0).c;
            if(hknp1 == null) {
                hknp1 = hknp.b;
            }
            return this.b.contains((hknp1.g == null ? hjqu.a : hknp1.g));
        }
        return true;
    }
}

