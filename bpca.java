import android.accounts.Account;
import android.location.Location;

public final class bpca implements glzn {
    public final bpce a;
    public final bpcd b;
    public final fqus c;
    public final long d;
    public final long e;
    public final gfsx f;
    public final boolean g;
    public final boolean h;
    public final haea i;
    public final boolean j;

    public bpca(bpce bpce0, bpcd bpcd0, fqus fqus0, long v, long v1, gfsx gfsx0, boolean z, boolean z1, haea haea0, boolean z2) {
        this.a = bpce0;
        this.b = bpcd0;
        this.c = fqus0;
        this.d = v;
        this.e = v1;
        this.f = gfsx0;
        this.g = z;
        this.h = z1;
        this.i = haea0;
        this.j = z2;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        boyc boyc1;
        double f1;
        bpko bpko0;
        Location location0 = (Location)((gfsx)object0).g();
        gfsx gfsx0 = hsxl.c() ? gfsx.m(Double.valueOf(hsxv.e())) : gfqx.a;
        bpce bpce0 = this.a;
        long v = this.d;
        boyc boyc0 = bpce0.e;
        Location location1 = boyc0.a(location0, v, gfsx0);
        boolean z = ((gfsx)object0).i() && ((Location)((gfsx)object0).d()).equals(location1);
        double f = (double)boyf.a(location1, v);
        boolean z1 = f > 0.0 && f <= hsxv.c();
        boolean z2 = this.j;
        long v1 = this.e;
        haea haea0 = this.i;
        fqus fqus0 = this.c;
        bpcd bpcd0 = this.b;
        gfsx gfsx1 = bpcd0.b;
        if(gfsx1.i()) {
            gfsx gfsx2 = bpcd0.c;
            if(gfsx2.i()) {
                Object object1 = gfsx1.d();
                bpbr bpbr0 = new bpbr();
                bpko0 = bpko.b(((gsyz)object1), bpcd0.a.b(bpbr0), fqus0, ((Account)gfsx2.d()), v, v1, f, haea0);
                f1 = f;
                if(z2) {
                    bpkn bpkn0 = new bpkn(bpko0);
                    bpkn0.f(true);
                    bpko0 = bpkn0.a();
                }
                boyc1 = boyc0;
                goto label_49;
            }
            goto label_31;
        }
        else {
        label_31:
            f1 = f;
            ByteString hfsf0 = ((bpjm)bpcd0.a.d()).a;
            boyc1 = boyc0;
            bpkn bpkn1 = bpko.a();
            bpkn1.c(hfsf0);
            bpkn1.e(false);
            bpkn1.a = gfqx.a;
            bpkn1.b(fqus.a);
            bpkn1.b = gfqx.a;
            bpkn1.g(v);
            bpkn1.h(v1);
            bpkn1.d(f1);
            bpkn1.i(haea0);
            bpko0 = bpkn1.a();
            if(fqok.f(((bpjm)bpcd0.a.d()).b)) {
                bpkn bpkn2 = new bpkn(bpko0);
                bpkn2.j(true);
                bpko0 = bpkn2.a();
            }
        }
    label_49:
        boolean z3 = this.h;
        gfsx gfsx3 = this.f;
        if(!z1) {
            gfsx gfsx4 = boyc1.b();
            bpce0.f.b(bpko0, v, gfsx4, z3);
            if(!hsxo.e()) {
                bpcb bpcb0 = new bpcb();
                bpce0.m.a(bpcb0);
            }
            bpce0.e(v, gfsx3.i());
            return gmbx.a;
        }
        return this.g ? gdta.g(bpce0.l.a(location1)).i(new bpcc(bpce0, bpko0, gfsx3, z3, location1, z2, fqus0), bpce0.r).i(new bpbd(bpce0, bpko0, v, z3, f1, z, ((gfsx)object0), gfsx3), bpce0.r) : gdta.g(gmbu.i(bpcm.c)).i(new bpcc(bpce0, bpko0, gfsx3, z3, location1, z2, fqus0), bpce0.r).i(new bpbd(bpce0, bpko0, v, z3, f1, z, ((gfsx)object0), gfsx3), bpce0.r);
    }
}

