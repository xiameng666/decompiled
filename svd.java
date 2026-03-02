import java.util.List;

public final class svd implements svi {
    private final sxd a;
    private final List b;
    private final boolean c;

    public svd(sxd sxd0, List list0, boolean z) {
        this.a = sxd0;
        this.b = list0;
        this.c = z;
    }

    @Override  // svi
    public final swj a(srb srb0) {
        sxd sxd1;
        List list0 = this.b;
        if(list0.isEmpty()) {
            throw sxf.h("ADF select without OIDs");
        }
        swe swe0 = srb0.b.c;
        ssp ssp0 = srb0.a().e().f;
        boolean z = this.c;
        boolean z1 = z || ssp0 != ssp.c;
        sre sre0 = srb0.e;
        Object object0 = null;
        for(Object object1: sxc.a(srb0.b.b())) {
            svt svt0 = (svt)object1;
            if((z || svt0.e().c() && (this.a.d() && sws.c(svt0.j(((ssg)this.a.b()))))) && 1 == (svt0.o(list0) & (object0 == null ? 1 : 0))) {
                object0 = svt0;
            }
        }
        sxd sxd0 = sxd.a(object0);
        svt svt1 = sxd0.d() && z1 ? ((svt)sxd0.b()) : sre0;
        srl srl0 = svt1.r() ? srl.c : srl.b;
        srz srz0 = new srz(srk.b, srl0);
        if(z) {
            sww.a(srb0, 6);
            sxd1 = sxd.a;
        }
        else {
            sxd1 = svt1.j(((ssg)this.a.c(ssg.a)));
            if(!sxd1.d()) {
                throw new IllegalStateException("BUG: Inconsistent privacy key existence\'");
            }
        }
        if(ssp0 == ssp.b && !z) {
            ssp0 = ssp.c;
        }
        swh swh0 = new swh();
        swh0.b(srb0.a(), ssp0);
        swh0.c(new swe((z1 || !sxd0.d() ? swe0.a : new sxd(((svt)sxd0.b()).e())), swe0.b, swe0.c));
        srb0.c(swh0);
        srb0.d(svt1, !srb0.c.e() || !sxd0.d(), z);
        ssr ssr0 = svt1.e();
        ssd ssd0 = svt1.d();
        return svt1 == sre0 ? new swo(srz0, ssr0, ssd0, sxd1, true) : new swo(srz0, ssr0, ssd0, sxd1, false);
    }
}

