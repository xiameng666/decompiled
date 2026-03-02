import java.util.List;

final class ifd extends igm {
    public ifd(ife ife0) {
        super(ife0);
    }

    @Override  // igm
    public final int a(int v) {
        ifg ifg0 = this.L().m();
        iau iau0 = ifg0.a();
        List list0 = ifg0.a.w();
        return iau0.a(ifg0.a.s(), list0, v);
    }

    @Override  // igm
    public final int b(int v) {
        ifg ifg0 = this.L().m();
        iau iau0 = ifg0.a();
        List list0 = ifg0.a.w();
        return iau0.b(ifg0.a.s(), list0, v);
    }

    @Override  // igm
    public final int c(int v) {
        ifg ifg0 = this.L().m();
        iau iau0 = ifg0.a();
        List list0 = ifg0.a.w();
        return iau0.c(ifg0.a.s(), list0, v);
    }

    @Override  // igm
    public final int d(int v) {
        ifg ifg0 = this.L().m();
        iau iau0 = ifg0.a();
        List list0 = ifg0.a.w();
        return iau0.d(ifg0.a.s(), list0, v);
    }

    @Override  // ias
    public final ibq e(long v) {
        this.eq(v);
        gwq gwq0 = this.L().k();
        Object[] arr_object = gwq0.a;
        int v1 = gwq0.b;
        for(int v2 = 0; v2 < v1; ++v2) {
            igt igt0 = ((ify)arr_object[v2]).p();
            ibuq.c(igt0);
            igt0.y = 3;
        }
        super.E(this.L().p.e(this, this.L().w(), v));
        return this;
    }

    @Override  // igl
    public final int q(hxw hxw0) {
        igt igt0 = (igt)this.C();
        if(!igt0.j) {
            if(igt0.G() == 2) {
                igt0.p.f = true;
                if(igt0.p.b) {
                    igt0.f.e();
                }
            }
            else {
                igt0.p.g = true;
            }
        }
        igm igm0 = ((ife)igt0.i()).g;
        if(igm0 != null) {
            igm0.l = true;
        }
        igt0.k();
        igm igm1 = ((ife)igt0.i()).g;
        if(igm1 != null) {
            igm1.l = false;
        }
        Integer integer0 = (Integer)igt0.p.h.get(hxw0);
        int v = integer0 == null ? 0x80000000 : ((int)integer0);
        this.q.f(hxw0, v);
        return v;
    }

    @Override  // igm
    protected final void s() {
        igt igt0 = this.L().p();
        ibuq.c(igt0);
        igt0.t();
    }
}

