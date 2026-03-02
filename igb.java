public final class igb implements hpd {
    public final hoz a;
    public iew b;

    public igb() {
        this(null);
    }

    public igb(byte[] arr_b) {
        hoz hoz0 = new hoz();
        super();
        this.a = hoz0;
    }

    @Override  // hpd
    public final void A(hlf hlf0, float f, long v, hpe hpe0) {
        this.a.A(hlf0, f, v, hpe0);
    }

    @Override  // hpd
    public final void B(long v, float f, long v1, float f1, hpe hpe0) {
        this.a.B(v, f, v1, f1, hpe0);
    }

    @Override  // hpd
    public final void C(long v, long v1, long v2, float f, int v3) {
        this.a.C(v, v1, v2, f, v3);
    }

    @Override  // hpd
    public final void D(hlf hlf0, long v, long v1, long v2, float f, hpe hpe0) {
        int v3 = (int)(v & 0xFFFFFFFFL);
        int v4 = (int)(v >> 0x20);
        this.a.a.c.h(Float.intBitsToFloat(v4), Float.intBitsToFloat(v3), Float.intBitsToFloat(v4) + Float.intBitsToFloat(((int)(v1 >> 0x20))), Float.intBitsToFloat(v3) + Float.intBitsToFloat(((int)(v1 & 0xFFFFFFFFL))), Float.intBitsToFloat(((int)(v2 >> 0x20))), Float.intBitsToFloat(((int)(v2 & 0xFFFFFFFFL))), hoz.v(this.a, hlf0, hpe0, f, null, 3));
    }

    @Override  // hpd
    public final void E(long v, long v1, long v2, long v3, hpe hpe0) {
        this.a.E(v, v1, v2, v3, hpe0);
    }

    @Override  // hpd
    public final void F(hkn hkn0, long v, long v1, float f, hpe hpe0, hlm hlm0, int v2, int v3) {
        this.a.F(hkn0, v, v1, f, hpe0, hlm0, v2, v3);
    }

    @Override  // hpd
    public final void G(hks hks0, long v, float f, hpe hpe0) {
        this.a.G(hks0, v, f, hpe0);
    }

    @Override  // jks
    public final float dX() {
        return this.a.dX();
    }

    @Override  // jlc
    public final float dY() {
        return this.a.dY();
    }

    @Override  // jlc
    public final float ea(long v) {
        return jlb.a(this.a, v);
    }

    @Override  // jks
    public final float eb(float f) {
        return jkr.a(this.a, f);
    }

    @Override  // jks
    public final float ec(int v) {
        return jkr.b(this.a, v);
    }

    @Override  // jks
    public final float ed(long v) {
        return jkr.c(this.a, v);
    }

    @Override  // jks
    public final float eg(float f) {
        return jkr.d(this.a, f);
    }

    @Override  // jks
    public final int eh(long v) {
        return jkr.e(this.a, v);
    }

    @Override  // jks
    public final int ei(float f) {
        return jkr.f(this.a, f);
    }

    @Override  // jks
    public final long ej(long v) {
        return jkr.g(this.a, v);
    }

    @Override  // jks
    public final long ek(long v) {
        return jkr.h(this.a, v);
    }

    @Override  // jlc
    public final long el(float f) {
        return jlb.b(this.a, f);
    }

    @Override  // jks
    public final long em(float f) {
        return jkr.i(this.a, f);
    }

    @Override  // hpd
    public final long n() {
        return hpc.a(this.a);
    }

    @Override  // hpd
    public final long o() {
        return hpc.b(this.a);
    }

    public final void p() {
        hli hli0 = this.t().b();
        iew iew0 = this.b;
        if(iew0 != null) {
            hfb hfb0 = iew0.I().v;
            if(hfb0 != null && (hfb0.t & 4) != 0) {
                while(hfb0 != null) {
                    int v = hfb0.s;
                    if((v & 2) != 0) {
                        break;
                    }
                    if((v & 4) != 0) {
                        goto label_12;
                    }
                    hfb0 = hfb0.v;
                }
            }
            hfb0 = null;
        label_12:
            if(hfb0 != null) {
                gwq gwq0 = null;
                while(hfb0 != null) {
                    if((hfb0 instanceof iew)) {
                        hpn hpn0 = this.t().a;
                        ihy ihy0 = ien.e(((iew)hfb0), 4);
                        long v1 = jll.b(ihy0.c);
                        ihy0.t.o().u(hli0, v1, ihy0, ((iew)hfb0), hpn0);
                    }
                    else if((hfb0.s & 4) != 0 && (hfb0 instanceof iep)) {
                        hfb hfb1 = ((iep)hfb0).D;
                        int v2 = 0;
                        while(hfb1 != null) {
                            if((hfb1.s & 4) != 0) {
                                ++v2;
                                if(v2 == 1) {
                                    hfb0 = hfb1;
                                }
                                else {
                                    if(gwq0 == null) {
                                        gwq0 = new gwq(new hfb[16]);
                                    }
                                    if(hfb0 != null) {
                                        gwq0.n(hfb0);
                                    }
                                    gwq0.n(hfb1);
                                    hfb0 = null;
                                }
                            }
                            hfb1 = hfb1.v;
                        }
                        if(v2 != 1) {
                            goto label_39;
                        }
                        continue;
                    }
                label_39:
                    hfb0 = ien.a(gwq0);
                }
                return;
            }
            ihy ihy1 = ien.e(iew0, 4);
            if(ihy1.B() == iew0.I()) {
                ihy1 = ihy1.w;
                ibuq.c(ihy1);
            }
            ihy1.F(hli0, this.t().a);
            return;
        }
        hxt.b("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        throw new ibnm();
    }

    @Override  // hpd
    public final jlm q() {
        return this.a.q();
    }

    @Override  // hpd
    public final void r(long v, long v1, long v2, float f, hpe hpe0, hlm hlm0, int v3) {
        this.a.r(v, v1, v2, f, hpe0, hlm0, v3);
    }

    @Override  // hpd
    public final void s(hpn hpn0, long v, ibts ibts0) {
        hpn0.i(this, this.q(), v, new iga(this, this.b, ibts0));
    }

    @Override  // hpd
    public final hoy t() {
        return this.a.b;
    }

    public final void u(hli hli0, long v, ihy ihy0, iew iew0, hpn hpn0) {
        iew iew1 = this.b;
        this.b = iew0;
        hpn hpn1 = this.a.b.a;
        this.a.b.f(ihy0);
        this.a.b.g(ihy0.p());
        this.a.b.e(hli0);
        this.a.b.h(v);
        this.a.b.a = hpn0;
        hli0.l();
        try {
            iew0.dW(this);
        }
        finally {
            hli0.j();
            this.a.b.f(this.a.b.c());
            this.a.b.g(this.a.b.d());
            this.a.b.e(this.a.b.b());
            this.a.b.h(this.a.b.a());
            this.a.b.a = hpn1;
        }
        this.b = iew1;
    }

    @Override  // hpd
    public final void w(hlf hlf0, long v, long v1, float f, hpe hpe0, int v2) {
        int v3 = (int)(v & 0xFFFFFFFFL);
        int v4 = (int)(v >> 0x20);
        this.a.a.c.g(Float.intBitsToFloat(v4), Float.intBitsToFloat(v3), Float.intBitsToFloat(v4) + Float.intBitsToFloat(((int)(v1 >> 0x20))), Float.intBitsToFloat(v3) + Float.intBitsToFloat(((int)(v1 & 0xFFFFFFFFL))), hoz.v(this.a, hlf0, hpe0, f, null, v2));
    }

    @Override  // hpd
    public final void x(hks hks0, hlf hlf0, float f, hpe hpe0, int v) {
        this.a.x(hks0, hlf0, f, hpe0, v);
    }

    @Override  // hpd
    public final void y(hlf hlf0, float f, float f1, long v, long v1, hpe hpe0) {
        this.a.y(hlf0, f, f1, v, v1, hpe0);
    }

    @Override  // hpd
    public final void z(long v, float f, float f1, boolean z, long v1, long v2, float f2, hpe hpe0) {
        this.a.z(v, f, f1, z, v1, v2, f2, hpe0);
    }
}

