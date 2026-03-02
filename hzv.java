import java.util.List;
import java.util.Map;

final class hzv implements iax, icr {
    final iag a;
    private final hzy b;

    public hzv(iag iag0) {
        this.a = iag0;
        super();
        this.b = iag0.f;
    }

    @Override  // jks
    public final float dX() {
        return this.b.b;
    }

    @Override  // jlc
    public final float dY() {
        return this.b.c;
    }

    @Override  // jlc
    public final float ea(long v) {
        return jlb.a(this.b, v);
    }

    @Override  // jks
    public final float eb(float f) {
        return jkr.a(this.b, f);
    }

    @Override  // jks
    public final float ec(int v) {
        return jkr.b(this.b, v);
    }

    @Override  // jks
    public final float ed(long v) {
        return jkr.c(this.b, v);
    }

    @Override  // jks
    public final float eg(float f) {
        return jkr.d(this.b, f);
    }

    @Override  // jks
    public final int eh(long v) {
        return jkr.e(this.b, v);
    }

    @Override  // jks
    public final int ei(float f) {
        return jkr.f(this.b, f);
    }

    @Override  // jks
    public final long ej(long v) {
        return jkr.g(this.b, v);
    }

    @Override  // jks
    public final long ek(long v) {
        return jkr.h(this.b, v);
    }

    @Override  // jlc
    public final long el(float f) {
        return jlb.b(this.b, f);
    }

    @Override  // jks
    public final long em(float f) {
        return jkr.i(this.b, f);
    }

    @Override  // iax
    public final iav en(int v, int v1, Map map0, ibts ibts0) {
        return iaw.a(this.b, v, v1, map0, ibts0);
    }

    @Override  // iax
    public final iav eo(int v, int v1, Map map0, ibts ibts0, ibts ibts1) {
        return this.b.eo(v, v1, map0, ibts0, ibts1);
    }

    @Override  // hzg
    public final boolean ep() {
        return this.b.ep();
    }

    @Override  // hzg
    public final jlm p() {
        return this.b.a;
    }

    @Override  // icr
    public final List q(Object object0, ibtw ibtw0) {
        iag iag0 = this.a;
        bzk bzk0 = iag0.m;
        ify ify0 = (ify)bzk0.a(object0);
        if(ify0 != null && iag0.a.z().indexOf(ify0) < iag0.d) {
            return ify0.x();
        }
        gwq gwq0 = iag0.h;
        if(gwq0.b < iag0.e) {
            hxt.c("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        ify ify1 = (ify)bzk0.a(object0);
        int v = iag0.e;
        if(gwq0.b == v) {
            gwq0.n(object0);
        }
        else {
            gwq0.d(v, object0);
        }
        ++iag0.e;
        bzk bzk1 = iag0.n;
        boolean z = bzk1.b(object0);
        if(!z && ify1 == null) {
            icm icm0 = iag0.e(object0, ibtw0);
            iag0.o.k(object0, icm0);
        }
        else {
            if(!z) {
                iag0.l(iag0.a.z().indexOf(ify1), iag0.a.z().size());
                ++iag0.j;
                bzk0.h(object0);
                bzk1.k(object0, ify1);
                icm icm1 = iag0.a(object0);
                iag0.o.k(object0, icm1);
                if(iag0.a.am()) {
                    iag0.j();
                }
            }
            ify ify2 = (ify)bzk1.a(object0);
            hzw hzw0 = ify2 == null ? null : ((hzw)iag0.l.a(ify2));
            if(hzw0 != null && hzw0.c) {
                iag0.m(ify2, object0, ibtw0);
            }
        }
        ify ify3 = (ify)bzk1.a(object0);
        if(ify3 != null) {
            List list0 = ify3.q().q();
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ((ihc)list0.get(v2)).f.b = true;
            }
            return list0;
        }
        return ibps.a;
    }
}

