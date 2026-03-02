public final class bnul implements glzn {
    public final boolean a;
    public final bnvk b;
    public final bnvd c;

    public bnul(boolean z, bnvk bnvk0, bnvd bnvd0) {
        this.a = z;
        this.b = bnvk0;
        this.c = bnvd0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(!this.a) {
            return gmbu.h(((azuh)object0));
        }
        bntv bntv0 = bntw.a();
        bntv0.c(this.b);
        bntv0.a = gfsx.m(((azuh)object0).a);
        bntv0.d(this.c.f.d.d);
        return gmbu.i(new bnve(false, gfsx.m(bntv0.a())));
    }
}

