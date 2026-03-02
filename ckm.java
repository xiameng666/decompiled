public final class ckm implements ibts {
    public final ibvd a;
    public final Object b;
    public final chi c;
    public final cht d;
    public final chn e;
    public final float f;
    public final ibts g;

    public ckm(ibvd ibvd0, Object object0, chi chi0, cht cht0, chn chn0, float f, ibts ibts0) {
        this.a = ibvd0;
        this.b = object0;
        this.c = chi0;
        this.d = cht0;
        this.e = chn0;
        this.f = f;
        this.g = ibts0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        long v = (long)(((Long)object0));
        cmc cmc0 = this.c.g();
        Object object1 = this.c.c();
        ckr ckr0 = new ckr(this.e);
        chk chk0 = new chk(this.b, cmc0, this.d, v, object1, v, ckr0);
        cku.e(chk0, v, this.f, this.c, this.e, this.g);
        this.a.a = chk0;
        return ibom.a;
    }
}

