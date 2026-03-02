public final class bnwv implements glzn {
    public final bnxf a;
    public final gfsx b;

    public bnwv(bnxf bnxf0, gfsx gfsx0) {
        this.a = bnxf0;
        this.b = gfsx0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if((((gtdq)object0).b & 1) != 0) {
            gted gted0 = ((gtdq)object0).c;
            if(gted0 == null) {
                gted0 = gted.a;
            }
            hfuo hfuo0 = gted0.d;
            gdta gdta0 = gdta.g(this.a.d.e());
            bnwr bnwr0 = new bnwr(this.a, hfuo0);
            return gdta0.f(Throwable.class, bnwr0, gmap.a).i(new bnww(this.a, hfuo0, this.b), this.a.c).i(new bnwx(this.a, hfuo0), this.a.c);
        }
        return gmbu.i(fqzu.a);
    }
}

