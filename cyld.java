public final class cyld implements Runnable {
    public final cylw a;
    public final String b;
    public final String c;
    public final float d;
    public final String e;
    public final fgta f;
    public final boolean g;
    public final String h;

    public cyld(cylw cylw0, String s, String s1, float f, String s2, fgta fgta0, boolean z, String s3) {
        this.a = cylw0;
        this.b = s;
        this.c = s1;
        this.d = f;
        this.e = s2;
        this.f = fgta0;
        this.g = z;
        this.h = s3;
    }

    @Override
    public final void run() {
        cylw cylw0 = this.a;
        String s = this.b;
        String s1 = this.c;
        float f = this.d;
        if(hvpp.bq()) {
            if(hvpg.bq()) {
                cylw0.n = cwfa.a(cwfa.c(this.e, cxlb.k), this.e);
            }
            cylh cylh0 = new cylh(cylw0, s, s1, f, this.f, this.g);
            cyna cyna0 = cylw0.o(this.h, false);
            if(cyna0 == null) {
                cylw0.i.c(s, s1, cusm.c.name(), ((double)f));
                return;
            }
            if(!cyna0.B()) {
                cylw0.i.c(s, s1, cusm.d.name(), ((double)f));
                return;
            }
            cylh0.accept(cyna0);
            return;
        }
        cylw0.i.c(s, s1, cusm.a.name(), ((double)f));
    }
}

