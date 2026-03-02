public final class cfe extends hfb implements idm, iew, ifk, iid {
    public boolean a;
    public cfk b;
    public final idk c;
    private hpn d;

    public cfe(cfk cfk0) {
        this.b = cfk0;
        this.d = cfk0.e();
        this.c = idn.a(new ibns(cfg.a, cfk0));
    }

    public final ccl a() {
        return this.b.b();
    }

    @Override  // ifk
    public final iav b(iax iax0, ias ias0, long v) {
        ibq ibq0 = ias0.e(v);
        return iaw.b(iax0, ibq0.a, ibq0.b, new cfd(ibq0, this));
    }

    @Override  // hfb
    public final void dM() {
        hpn hpn0 = this.d;
        if(hpn0 != null) {
            ien.k(this).c(hpn0);
        }
        this.r(ien.k(this).a());
    }

    @Override  // hfb
    public final void dO() {
        iie.a(this, this.i().f);
        this.p();
        this.b.i(true);
    }

    @Override  // hfb
    public final void dR() {
        this.r(null);
        this.b.h = null;
        this.b.k = null;
        this.b.i(false);
        this.a = false;
    }

    @Override  // iew
    public final void dU() {
    }

    @Override  // iew
    public final void dW(igb igb0) {
        hka hka0 = this.i().a().c();
        cfk cfk0 = this.b;
        if(cfk0.k() && hka0 != null) {
            cga cga0 = (cga)this.b.f.a();
            cft cft0 = this.b.d();
            ien.g(this);
            cfk cfk1 = cft0.a().h;
            cft cft1 = cfk1 == null ? null : cfk1.d();
            if(cft1 != null) {
                cft1.a();
            }
        }
        cfk0.l = null;
        hpn hpn0 = this.b.e();
        if(hpn0 == null) {
            throw new IllegalArgumentException("Error: Layer is null when accessed for shared bounds/element : " + this.i().a + ",target: " + this.b.b().f() + ", is attached: " + this.B);
        }
        hpc.j(igb0, hpn0, new cfc(igb0));
        cfk cfk2 = this.b;
        if(cfk2.c().d() && (cfk2.k() || !cfk2.j())) {
            return;
        }
        hpo.a(igb0, hpn0);
    }

    @Override  // ifk
    public final int e(hzg hzg0, hzf hzf0, int v) {
        return ifj.a(this, hzg0, hzf0, v);
    }

    @Override  // ifk
    public final int f(hzg hzg0, hzf hzf0, int v) {
        return ifj.b(this, hzg0, hzf0, v);
    }

    @Override  // ifk
    public final int g(hzg hzg0, hzf hzf0, int v) {
        return ifj.c(this, hzg0, hzf0, v);
    }

    @Override  // ifk
    public final int h(hzg hzg0, hzf hzf0, int v) {
        return ifj.d(this, hzg0, hzf0, v);
    }

    public final cfj i() {
        return this.b.c();
    }

    public final hzk j() {
        hzk hzk0 = this.i().b.c;
        if(hzk0 != null) {
            return hzk0;
        }
        throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
    }

    public final iav k(hyd hyd0, ias ias0, long v) {
        long v2;
        hka hka0 = this.a().c();
        if(hka0 == null) {
            cgj cgj0 = this.i().c;
            cgj0.d();
            hka0 = cgj0.a().d(cgj0.a);
        }
        if(hka0 != null) {
            long v1 = jll.a(hka0.b());
            if(((int)(v1 >> 0x20)) == 0x7FFFFFFF || ((int)(v1 & 0xFFFFFFFFL)) == 0x7FFFFFFF) {
                throw new IllegalArgumentException("Error: Infinite width/height is invalid. animated bounds: " + this.a().c() + ", current bounds: " + this.i().a().c());
            }
            v = jko.c(ibwt.g(((int)(v1 >> 0x20)), 0), ibwt.g(((int)(v1 & 0xFFFFFFFFL)), 0));
        }
        ibq ibq0 = ias0.e(v);
        if(this.i().a().i()) {
            cfr cfr0 = (cfr)this.b.d.a();
            v2 = this.b.c().b.dS(ien.b(this)).g();
            return iaw.b(hyd0, ((int)(v2 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL)), new cfb(this, ibq0));
        }
        v2 = ((long)ibq0.a) << 0x20 | ((long)ibq0.b) & 0xFFFFFFFFL;
        return iaw.b(hyd0, ((int)(v2 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL)), new cfb(this, ibq0));
    }

    @Override  // idm
    public final idk l() {
        return this.c;
    }

    @Override  // iid
    public final void o() {
        this.i().c();
        iie.a(this, this.i().f);
    }

    public final void p() {
        idk idk0 = this.c;
        idg idg0 = cfg.a;
        cfk cfk0 = this.b;
        if(idk0 == idf.a) {
            hxt.c("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if(!idk0.c(idg0)) {
            hxt.c(a.i(idg0, "Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key ", " was not found."));
        }
        idk0.b(idg0, cfk0);
        cfk cfk1 = this.b;
        cfk1.h = (cfk)idl.a(this, idg0);
        this.r(ien.k(this).a());
        this.a = false;
        this.b.k = this;
    }

    private final void r(hpn hpn0) {
        if(hpn0 == null) {
            hpn hpn1 = this.d;
            if(hpn1 != null) {
                ien.k(this).c(hpn1);
            }
        }
        else {
            this.b.i.b(hpn0);
        }
        this.d = hpn0;
    }
}

