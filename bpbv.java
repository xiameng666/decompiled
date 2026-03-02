import java.util.concurrent.TimeUnit;

public final class bpbv implements glzn {
    public final bpce a;
    public final bpjm b;
    public final boolean c;
    public final gfsx d;
    public final gfsx e;
    public final long f;
    public final long g;

    public bpbv(bpce bpce0, bpjm bpjm0, boolean z, gfsx gfsx0, gfsx gfsx1, long v, long v1) {
        this.a = bpce0;
        this.b = bpjm0;
        this.c = z;
        this.d = gfsx0;
        this.e = gfsx1;
        this.f = v;
        this.g = v1;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gmcd gmcd1;
        bpce bpce0 = this.a;
        bpjm bpjm0 = this.b;
        boolean z = this.c;
        Boolean boolean0 = Boolean.valueOf(false);
        if(((Boolean)object0).booleanValue()) {
            if(hsxo.h()) {
                fray.a(gdta.g(bpce0.k.f()).h(new bpbq(bpjm0), gmap.a), "Metrics logging error", new Object[0]);
            }
            return bpce0.d(bpjm0, z);
        }
        gfsx gfsx0 = this.d;
        if(z) {
            return gdtf.k(gmbu.i(boolean0), new bpbu(bpce0, bpjm0, this.e, z, this.f, this.g, gfsx0), bpce0.r);
        }
        gfsx gfsx1 = bpjm0.c;
        if(!gfsx1.i()) {
            return gdtf.k(gmbu.i(boolean0), new bpbu(bpce0, bpjm0, this.e, z, this.f, this.g, gfsx0), bpce0.r);
        }
        fqun fqun0 = (fqun)gfsx1.d();
        bpbx bpbx0 = new bpbx();
        gszr gszr0 = (gszr)fqun0.c.b(bpbx0).f(gszr.a);
        fqus fqus0 = bpjm0.d;
        int v = gszr0.ordinal();
        if(v != 0 && v != 1) {
            switch(v) {
                case 2: {
                    if(fqus0 != fqus.e) {
                        ggtl.c.o(1, TimeUnit.MINUTES);
                        return gdtf.k(gmbu.i(boolean0), new bpbu(bpce0, bpjm0, this.e, z, this.f, this.g, gfsx0), bpce0.r);
                    }
                    break;
                }
                case 3: {
                    if(fqus0 != fqus.f) {
                        ggtl.c.o(1, TimeUnit.MINUTES);
                        return gdtf.k(gmbu.i(boolean0), new bpbu(bpce0, bpjm0, this.e, z, this.f, this.g, gfsx0), bpce0.r);
                    }
                    break;
                }
                case 4: {
                    break;
                }
                default: {
                    throw new RuntimeException(null, null);
                }
            }
        }
        gsyz gsyz0 = fqun0.a;
        long v1 = bpce0.i.d().minusSeconds(hsxv.l()).toEpochMilli();
        gmcd gmcd0 = bpce0.d.e(gsyz0, v1);
        if(hsxd.e()) {
            gmcd1 = bpce0.n.c(gsyz0);
            return gdtf.k(gdtf.b(new gmcd[]{gmcd0}).a(new bpby(bpce0, gmcd0, gmcd1, gsyz0, bpjm0, fqus0, gszr0, gfsx0), bpce0.r), new bpbu(bpce0, bpjm0, this.e, z, this.f, this.g, gfsx0), bpce0.r);
        }
        gmcd1 = gmbu.i(boolean0);
        return gdtf.k(gdtf.b(new gmcd[]{gmcd0}).a(new bpby(bpce0, gmcd0, gmcd1, gsyz0, bpjm0, fqus0, gszr0, gfsx0), bpce0.r), new bpbu(bpce0, bpjm0, this.e, z, this.f, this.g, gfsx0), bpce0.r);
    }
}

