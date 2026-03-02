public final class ciyf implements ciyp {
    public final ggfp a;
    private final hfki b;

    public ciyf(ggfp ggfp0) {
        hfkm hfkm0;
        this.a = ggfp0;
        hfkc hfkc0 = new hfkc();
        hfkl hfkl0 = new hfkl();
        ggqj ggqj0 = ggfp0.om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            ciyp ciyp0 = (ciyp)object0;
            if((ciyp0 instanceof ciyf)) {
                throw new IllegalArgumentException("Nested OrNcc check is not allowed.");
            }
            if((ciyp0 instanceof cixa)) {
                ggfp ggfp1 = ciyp0.b().a;
                if(hfkc0.a == null) {
                    hfkc0.a = new ggfn();
                }
                hfkc0.a.k(ggfp1);
            }
            else {
                hfkl0.b(ciyp0.b().a);
            }
            continue;
        }
        if(!hfkc0.a().a.isEmpty()) {
            hfkd hfkd0 = hfkc0.a();
            if(hfkl0.a == null) {
                hfkl0.a = new ggfn();
            }
            hfkl0.a.i(hfkd0);
        }
        hfkm0 = hfkl0.a();
        hfkh hfkh0 = new hfkh();
        hfkh0.f(hfkm0);
        this.b = hfkh0.c();
    }

    @Override  // ciyp
    public final gmcd a() {
        ggdy ggdy0 = gged_interceptors.e(this.a.size());
        ggqj ggqj0 = this.a.om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            ggdy0.i(((ciyp)object0).a());
        }
        return glzd.f(gmbu.e(ggdy0.h()), new ciye(), gmap.a);
    }

    @Override  // ciyp
    public final hfki b() {
        return this.b;
    }
}

