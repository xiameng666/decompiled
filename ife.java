import java.util.List;

public final class ife extends ihy {
    public final iji f;
    public igm g;
    private static final hmi h;

    static {
        hkq hkq0 = new hkq();
        hkq0.k(hll.f);
        hkq0.r(1.0f);
        hkq0.s(1);
        ife.h = hkq0;
    }

    public ife(ify ify0) {
        super(ify0);
        iji iji0 = new iji();
        this.f = iji0;
        iji0.x = this;
        this.g = ify0.i == null ? null : new ifd(this);
    }

    @Override  // ihy
    public final hfb B() {
        return this.f;
    }

    @Override  // ihy
    public final igm C() {
        return this.g;
    }

    @Override  // ihy
    public final void D() {
        if(this.g == null) {
            this.g = new ifd(this);
        }
    }

    @Override  // ihy
    public final void E(ihs ihs0, long v, ifb ifb0, int v1, boolean z) {
        ihs ihs1 = ihs0;
        long v2 = v;
        ify ify0 = this.t;
        if(!ihs1.c(ify0)) {
            v3 = v1;
            z1 = z;
            z2 = false;
        }
        else if(this.aB(v2)) {
            int v3 = v1;
            boolean z1 = z;
            boolean z2 = true;
        }
        else {
            v3 = v1;
            if(v3 == 1 && (Float.floatToRawIntBits(this.X(v2, this.aa())) & 0x7FFFFFFF) < 0x7F800000) {
                z1 = false;
                z2 = true;
            }
            else {
                z1 = z;
                z2 = false;
            }
        }
        if(z2) {
            int v4 = ifb0.a;
            gwq gwq0 = ify0.j();
            Object[] arr_object = gwq0.a;
            int v5 = gwq0.b - 1;
            while(v5 >= 0) {
                ify ify1 = (ify)arr_object[v5];
                if(ify1.an()) {
                    boolean z3 = z1;
                    ihs ihs2 = ihs1;
                    ihs2.b(ify1, v2, ifb0, v3, z3);
                    long v6 = ifb0.b();
                    if((ieu.a(v6) < 0.0f) && ieu.d(v6) && !ieu.c(v6)) {
                        hfb hfb0 = ify1.s().super.ad(false);
                        if(hfb0 != null && hfb0.B) {
                            if(!hfb0.I().B) {
                                hxt.d("visitLocalDescendants called on an unattached node");
                            }
                            hfb hfb1 = hfb0.I();
                            if((hfb1.t & 16) != 0) {
                                while(hfb1 != null) {
                                    if((hfb1.s & 16) != 0) {
                                        hfb hfb2 = hfb1;
                                        gwq gwq1 = null;
                                        while(hfb2 != null) {
                                            if(!(hfb2 instanceof ijc)) {
                                                if((hfb2.s & 16) != 0 && (hfb2 instanceof iep)) {
                                                    hfb hfb3 = ((iep)hfb2).D;
                                                    int v7 = 0;
                                                    while(hfb3 != null) {
                                                        if((hfb3.s & 16) != 0) {
                                                            ++v7;
                                                            if(v7 == 1) {
                                                                hfb2 = hfb3;
                                                            }
                                                            else {
                                                                if(gwq1 == null) {
                                                                    gwq1 = new gwq(new hfb[16]);
                                                                }
                                                                if(hfb2 != null) {
                                                                    gwq1.n(hfb2);
                                                                }
                                                                gwq1.n(hfb3);
                                                                hfb2 = null;
                                                            }
                                                        }
                                                        hfb3 = hfb3.v;
                                                    }
                                                    if(v7 != 1) {
                                                        goto label_66;
                                                    }
                                                    continue;
                                                }
                                            }
                                            else if(((ijc)hfb2).B()) {
                                                ifb0.a = ifb0.a() - 1;
                                                goto label_75;
                                            }
                                        label_66:
                                            hfb2 = ien.a(gwq1);
                                        }
                                    }
                                    hfb1 = hfb1.v;
                                }
                            }
                        }
                        if(ihs2.d(ify1)) {
                            ifb0.a = ifb0.a() - 1;
                            goto label_75;
                        }
                    }
                    else {
                        goto label_75;
                    }
                }
                else {
                    z3 = z1;
                    ihs2 = ihs1;
                label_75:
                    --v5;
                    v2 = v;
                    ihs1 = ihs2;
                    z1 = z3;
                    v3 = v1;
                    continue;
                }
                break;
            }
            ifb0.a = v4;
        }
    }

    @Override  // ihy
    public final void F(hli hli0, hpn hpn0) {
        iio iio0 = igc.a(this.t);
        gwq gwq0 = this.t.j();
        Object[] arr_object = gwq0.a;
        int v = gwq0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            ify ify0 = (ify)arr_object[v1];
            if(ify0.an()) {
                ify0.F(hli0, hpn0);
            }
        }
        if(iio0.y()) {
            this.ak(hli0, ife.h);
        }
    }

    private final void G() {
        if(this.k) {
            return;
        }
        this.t.q().C();
    }

    @Override  // hzf
    public final int a(int v) {
        ifg ifg0 = this.t.m();
        iau iau0 = ifg0.a();
        List list0 = ifg0.a.x();
        return iau0.a(ifg0.a.s(), list0, v);
    }

    @Override  // hzf
    public final int b(int v) {
        ifg ifg0 = this.t.m();
        iau iau0 = ifg0.a();
        List list0 = ifg0.a.x();
        return iau0.b(ifg0.a.s(), list0, v);
    }

    @Override  // hzf
    public final int c(int v) {
        ifg ifg0 = this.t.m();
        iau iau0 = ifg0.a();
        List list0 = ifg0.a.x();
        return iau0.c(ifg0.a.s(), list0, v);
    }

    @Override  // hzf
    public final int d(int v) {
        ifg ifg0 = this.t.m();
        iau iau0 = ifg0.a();
        List list0 = ifg0.a.x();
        return iau0.d(ifg0.a.s(), list0, v);
    }

    @Override  // ihy
    public final void dZ(long v, float f, ibts ibts0) {
        super.dZ(v, f, ibts0);
        this.G();
    }

    @Override  // ias
    public final ibq e(long v) {
        if(this.v) {
            igm igm0 = this.g;
            ibuq.c(igm0);
            v = igm0.d;
        }
        this.eq(v);
        ify ify0 = this.t;
        gwq gwq0 = ify0.k();
        Object[] arr_object = gwq0.a;
        int v1 = gwq0.b;
        for(int v2 = 0; v2 < v1; ++v2) {
            ((ify)arr_object[v2]).q().G = 3;
        }
        this.ax(ify0.p.e(this, ify0.x(), v));
        this.aq();
        return this;
    }

    @Override  // igl
    public final int q(hxw hxw0) {
        igm igm0 = this.g;
        if(igm0 != null) {
            return igm0.q(hxw0);
        }
        ihc ihc0 = (ihc)this.ag();
        if(!ihc0.l) {
            if(ihc0.F() == 1) {
                ihc0.w.f = true;
                if(ihc0.w.b) {
                    ihc0.r();
                }
            }
            else {
                ihc0.w.g = true;
            }
        }
        ihc0.i().l = true;
        ihc0.k();
        ihc0.i().l = false;
        Integer integer0 = (Integer)ihc0.w.h.get(hxw0);
        return integer0 == null ? 0x80000000 : ((int)integer0);
    }

    @Override  // ihy
    public final void y(long v, float f, hpn hpn0) {
        super.y(v, f, hpn0);
        this.G();
    }
}

