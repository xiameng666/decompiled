import java.util.List;

public final class fktg implements glzn {
    public final fktl a;
    public final fjcv b;

    public fktg(fktl fktl0, fjcv fjcv0) {
        this.a = fktl0;
        this.b = fjcv0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gmcd gmcd1;
        gfsx gfsx0;
        gged_interceptors gged0 = (gged_interceptors)((List)object0).get(0);
        if(gged0 != null && !gged0.isEmpty()) {
            fkjm fkjm0 = fkjn.a();
            fkjm0.b(((fizl)gged0.get(0)).o);
            fkjm0.c(((fizl)gged0.get(0)).p);
            gfsx0 = gfsx.m(fkjm0.a());
        }
        else {
            gfsx0 = gfqx.a;
        }
        gged_interceptors gged1 = (gged_interceptors)((List)object0).get(1);
        gfsx gfsx1 = gged1 != null && !gged1.isEmpty() ? gfsx.m(Long.valueOf(((fizl)gged1.get(0)).o)) : gfqx.a;
        fktl fktl0 = this.a;
        if(!gfsx0.i()) {
            fktl0.f.h().ar(0x48B6).x("No pending build available, skipping refresh.");
            return gmbx.a;
        }
        Object object1 = gfsx0.d();
        long v = (long)(((Long)gfsx1.f(Long.valueOf(-1L))));
        fkjt fkjt0 = gfsx1.i() ? fktl0.c : fkjt.a;
        gmcd gmcd0 = fktl0.b(v, ((fkjn)object1).c, fkjt0);
        gfsx gfsx2 = fktl0.g;
        if(gfsx2.i()) {
            fkkt fkkt0 = (fkkt)((aogw)gfsx2.d()).a;
            gmcd1 = glzd.g(((gmcd)fkkt0.b.mr()), new fkkr(fkkt0), gmap.a);
            return glzd.g(glzd.g(glzd.g(glzd.g(glzd.g(gmbt.h(gmbu.b(new gmcd[]{gmcd0, gmcd1}).a(new fktj(gmcd0, gmcd1), fktl0.e)), new fksv(fktl0, ((fkjn)object1)), fktl0.e), new fksw(fktl0, this.b, ((fkjn)object1)), fktl0.e), new fksx(fktl0, v, ((fkjn)object1), fkjt0), fktl0.e), new fksy(fktl0, ((fkjn)object1)), fktl0.e), new fksz(fktl0, ((fkjn)object1)), fktl0.e);
        }
        gmcd1 = gmbu.i(ggna.a);
        return glzd.g(glzd.g(glzd.g(glzd.g(glzd.g(gmbt.h(gmbu.b(new gmcd[]{gmcd0, gmcd1}).a(new fktj(gmcd0, gmcd1), fktl0.e)), new fksv(fktl0, ((fkjn)object1)), fktl0.e), new fksw(fktl0, this.b, ((fkjn)object1)), fktl0.e), new fksx(fktl0, v, ((fkjn)object1), fkjt0), fktl0.e), new fksy(fktl0, ((fkjn)object1)), fktl0.e), new fksz(fktl0, ((fkjn)object1)), fktl0.e);
    }
}

