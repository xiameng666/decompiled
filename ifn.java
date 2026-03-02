public final class ifn extends ihy {
    private static final hmi H;
    private hyf I;
    public ifk f;
    public jkp g;
    public igm h;

    static {
        hkq hkq0 = new hkq();
        hkq0.k(hll.g);
        hkq0.r(1.0f);
        hkq0.s(1);
        ifn.H = hkq0;
    }

    public ifn(ify ify0, ifk ifk0) {
        super(ify0);
        this.f = ifk0;
        hyf hyf0 = null;
        this.h = ify0.i == null ? null : new ifl(this);
        if((ifk0.I().s & 0x200) != 0) {
            hyf0 = new hyf(this, ((cfe)ifk0));
        }
        this.I = hyf0;
    }

    @Override  // ihy
    public final hfb B() {
        return this.f.I();
    }

    @Override  // ihy
    public final igm C() {
        return this.h;
    }

    @Override  // ihy
    public final void D() {
        if(this.h == null) {
            this.h = new ifl(this);
        }
    }

    @Override  // ihy
    public final void F(hli hli0, hpn hpn0) {
        this.G().aj(hli0, hpn0);
        if(igc.a(this.t).y() && (this.w != null && (!jlk.c(this.c, this.w.c) || !jlf.f(this.w.y, 0L)))) {
            this.ak(hli0, ifn.H);
        }
    }

    public final ihy G() {
        ihy ihy0 = this.w;
        ibuq.c(ihy0);
        return ihy0;
    }

    public final void H(ifk ifk0) {
        if(!ibuq.m(ifk0, this.f)) {
            if((ifk0.I().s & 0x200) == 0) {
                this.I = null;
            }
            else {
                hyf hyf0 = this.I;
                if(hyf0 == null) {
                    hyf0 = new hyf(this, ((cfe)ifk0));
                }
                else {
                    hyf0.c = (cfe)ifk0;
                }
                this.I = hyf0;
            }
        }
        this.f = ifk0;
    }

    @Override  // hzf
    public final int a(int v) {
        hyf hyf0 = this.I;
        if(hyf0 != null) {
            cfe cfe0 = hyf0.c;
            ihy ihy0 = this.G();
            ihy ihy1 = cfe0.r.x;
            ibuq.c(ihy1);
            igm igm0 = ihy1.C();
            ibuq.c(igm0);
            if(igm0.U()) {
                iib iib0 = new iib(ihy0, 2, 2);
                long v1 = jkq.k(0, v, 0, 13);
                return cfe0.k(new hyc(hyf0, hyf0.p()), iib0, v1).a();
            }
            return ihy0.a(v);
        }
        return this.f.e(this, this.G(), v);
    }

    private final void aG() {
        boolean z;
        if(this.k) {
            return;
        }
        this.ar();
        hyf hyf0 = this.I;
        if(hyf0 != null) {
            jlk jlk0 = null;
            ibuq.c(this.h);
            if(!hyf0.b && jlk.b(this.c, (this.h == null ? null : new jlk(this.h.t())))) {
                long v = this.G().c;
                igm igm0 = this.G().C();
                if(igm0 != null) {
                    jlk0 = new jlk(igm0.t());
                }
                z = jlk.b(v, jlk0);
            }
            else {
                z = false;
            }
            this.G().u = z;
        }
        this.K().g();
        this.G().u = false;
    }

    @Override  // hzf
    public final int b(int v) {
        hyf hyf0 = this.I;
        if(hyf0 != null) {
            cfe cfe0 = hyf0.c;
            ihy ihy0 = this.G();
            ihy ihy1 = cfe0.r.x;
            ibuq.c(ihy1);
            igm igm0 = ihy1.C();
            ibuq.c(igm0);
            if(igm0.U()) {
                iib iib0 = new iib(ihy0, 2, 1);
                long v1 = jkq.k(0, 0, v, 7);
                return cfe0.k(new hyc(hyf0, hyf0.p()), iib0, v1).b();
            }
            return ihy0.b(v);
        }
        return this.f.f(this, this.G(), v);
    }

    @Override  // hzf
    public final int c(int v) {
        hyf hyf0 = this.I;
        if(hyf0 != null) {
            cfe cfe0 = hyf0.c;
            ihy ihy0 = this.G();
            ihy ihy1 = cfe0.r.x;
            ibuq.c(ihy1);
            igm igm0 = ihy1.C();
            ibuq.c(igm0);
            if(igm0.U()) {
                iib iib0 = new iib(ihy0, 1, 2);
                long v1 = jkq.k(0, v, 0, 13);
                return cfe0.k(new hyc(hyf0, hyf0.p()), iib0, v1).a();
            }
            return ihy0.c(v);
        }
        return this.f.g(this, this.G(), v);
    }

    @Override  // hzf
    public final int d(int v) {
        hyf hyf0 = this.I;
        if(hyf0 != null) {
            cfe cfe0 = hyf0.c;
            ihy ihy0 = this.G();
            ihy ihy1 = cfe0.r.x;
            ibuq.c(ihy1);
            igm igm0 = ihy1.C();
            ibuq.c(igm0);
            if(igm0.U()) {
                iib iib0 = new iib(ihy0, 1, 1);
                long v1 = jkq.k(0, 0, v, 7);
                return cfe0.k(new hyc(hyf0, hyf0.p()), iib0, v1).b();
            }
            return ihy0.d(v);
        }
        return this.f.h(this, this.G(), v);
    }

    @Override  // ihy
    public final void dZ(long v, float f, ibts ibts0) {
        super.dZ(v, f, ibts0);
        this.aG();
    }

    @Override  // ias
    public final ibq e(long v) {
        iav iav1;
        boolean z1;
        if(this.v) {
            jkp jkp0 = this.g;
            if(jkp0 == null) {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
            v = jkp0.a;
        }
        this.eq(v);
        hyf hyf0 = this.I;
        if(hyf0 == null) {
            iav1 = this.f.b(this, this.G(), v);
        }
        else {
            cfe cfe0 = hyf0.c;
            igm igm0 = hyf0.a.h;
            ibuq.c(igm0);
            iav iav0 = igm0.K();
            iav0.b();
            iav0.a();
            boolean z = true;
            if(cfe0.b.m()) {
                cfj cfj0 = cfe0.i();
                if((cfj0.a().f() || cfj0.a().i() || cfj0.c.c == 2) && cfe0.i().b.d()) {
                    z1 = true;
                    goto label_22;
                }
                goto label_21;
            }
            else {
            label_21:
                z1 = !jkp.g(v, this.g);
            }
        label_22:
            hyf0.b = z1;
            if(!z1) {
                this.G().v = true;
            }
            iav1 = cfe0.k(hyf0, this.G(), v);
            this.G().v = false;
            int v1 = iav1.b();
            igm igm1 = this.h;
            ibuq.c(igm1);
            if(v1 == igm1.a) {
                int v2 = iav1.a();
                igm igm2 = this.h;
                ibuq.c(igm2);
                if(v2 != igm2.b) {
                    z = false;
                }
            }
            else {
                z = false;
            }
            if(!hyf0.b) {
                long v3 = this.G().c;
                igm igm3 = this.G().C();
                if(jlk.b(v3, (igm3 == null ? null : new jlk(igm3.t()))) && !z) {
                    iav1 = new ifm(iav1, this);
                }
            }
        }
        this.ax(iav1);
        this.aq();
        return this;
    }

    @Override  // igl
    public final int q(hxw hxw0) {
        igm igm0 = this.h;
        return igm0 == null ? ifo.a(this, hxw0) : igm0.q.b(hxw0, 0x80000000);
    }

    @Override  // ihy
    public final void y(long v, float f, hpn hpn0) {
        super.y(v, f, hpn0);
        this.aG();
    }
}

