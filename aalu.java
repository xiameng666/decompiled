public final class aalu implements ibts {
    public final aamn a;

    public aalu(aamn aamn0) {
        this.a = aamn0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        grvg grvg0 = ((zho)object0).a().g;
        if(grvg0 == null) {
            grvg0 = grvg.a;
        }
        grxw grxw0 = grvg0.h == null ? grxw.a : grvg0.h;
        aamn aamn0 = this.a;
        if(hoju.j()) {
            lqd lqd0 = aamn0.b.a(grxw0);
            aalq aalq0 = new aalq(grxw0);
            return new zhd(lqd0, aamn0.b.c, aalq0);
        }
        return lsa.b(aamn0.b.a(grxw0), new aaly(grxw0));
    }
}

