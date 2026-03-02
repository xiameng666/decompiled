import android.location.Location;

public final class bpbp implements glzn {
    public final bpce a;
    public final bpcd b;
    public final haea c;
    public final gfsx d;
    public final long e;
    public final fqus f;
    public final long g;
    public final boolean h;

    public bpbp(bpce bpce0, bpcd bpcd0, haea haea0, gfsx gfsx0, long v, fqus fqus0, long v1, boolean z) {
        this.a = bpce0;
        this.b = bpcd0;
        this.c = haea0;
        this.d = gfsx0;
        this.e = v;
        this.f = fqus0;
        this.g = v1;
        this.h = z;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        haea haea0 = this.c;
        bpcd bpcd0 = this.b;
        if(!bpcd0.a.i() && hsxo.g()) {
            ciki ciki0 = ciki.v();
            bpbc bpbc0 = new bpbc(haea0, ((fqzl)object0));
            ciki0.j(((ProtoLiteMessage)bnns.a(hadq.b, bpbc0)));
        }
        if(!bouv.j(((fqzl)object0))) {
            return gmbx.a;
        }
        gfsx gfsx0 = this.d;
        bpce bpce0 = this.a;
        boolean z = bpce.f(bpcd0, gfsx0.i());
        if(z && !bouv.c(((fqzl)object0))) {
            return gmbx.a;
        }
        boolean z1 = bouv.e(((fqzl)object0));
        if(!hsxo.e()) {
            bpbz bpbz0 = new bpbz();
            bpce0.m.a(bpbz0);
        }
        synchronized(bpce0.e.a) {
            Location location0 = bpce0.e.b;
        }
        long v = this.e;
        if(location0 != null && (((double)boyf.a(location0, v)) <= hsxv.d())) {
            return gdta.g(gmbu.i(gfqx.a)).i(new bpca(bpce0, bpcd0, this.f, v, this.g, gfsx0, z, z1, haea0, this.h), bpce0.r);
        }
        bpaz bpaz0 = bpce0.h;
        if(bpaz0.c()) {
            return gdta.g(gmbu.i(gfqx.a)).i(new bpca(bpce0, bpcd0, this.f, v, this.g, gfsx0, z, z1, haea0, this.h), bpce0.r);
        }
        gdta gdta0 = gdta.g(fhra.b(bpaz0.f.d())).h(new bpax(), gmap.a);
        bpay bpay0 = new bpay();
        return gdta.g(gdta0.f(Throwable.class, bpay0, gmap.a)).i(new bpca(bpce0, bpcd0, this.f, v, this.g, gfsx0, z, z1, haea0, this.h), bpce0.r);
    }
}

