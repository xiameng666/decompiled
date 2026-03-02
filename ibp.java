public abstract class ibp implements jks {
    private boolean a;

    public static void A(ibp ibp0, ibq ibq0, int v, int v1) {
        ibp0.u(ibq0, v, v1, 0.0f);
    }

    public static void B(ibp ibp0, ibq ibq0, int v, int v1) {
        long v2 = ((long)v1) & 0xFFFFFFFFL | ((long)v) << 0x20;
        ibts ibts0 = ibs.a;
        if(ibp0.p() != jlm.a && ibp0.n() != 0) {
            long v3 = ((long)(ibp0.n() - ibq0.a - jlf.a(v2))) << 0x20;
            ibp0.r(ibq0);
            ibq0.dZ(jlf.d(((long)jlf.b(v2)) & 0xFFFFFFFFL | v3, ibq0.e), 0.0f, ibts0);
            return;
        }
        ibp0.r(ibq0);
        ibq0.dZ(jlf.d(v2, ibq0.e), 0.0f, ibts0);
    }

    public static void C(ibp ibp0, ibq ibq0, long v) {
        ibts ibts0 = ibs.a;
        if(ibp0.p() != jlm.a && ibp0.n() != 0) {
            int v1 = ibp0.n() - ibq0.a;
            ibp0.r(ibq0);
            ibq0.dZ(jlf.d(((long)jlf.b(v)) & 0xFFFFFFFFL | ((long)(v1 - jlf.a(v))) << 0x20, ibq0.e), 0.0f, ibts0);
            return;
        }
        ibp0.r(ibq0);
        ibq0.dZ(jlf.d(v, ibq0.e), 0.0f, ibts0);
    }

    public final void D(ibq ibq0, int v, int v1, ibts ibts0) {
        this.r(ibq0);
        ibq0.dZ(jlf.d(((long)v1) & 0xFFFFFFFFL | ((long)v) << 0x20, ibq0.e), 0.0f, ibts0);
    }

    public static void E(ibp ibp0, ibq ibq0, int v, int v1, ibts ibts0, int v2) {
        if((v2 & 8) != 0) {
            ibts0 = ibs.a;
        }
        ibp0.D(ibq0, v, v1, ibts0);
    }

    public static void F(ibp ibp0, ibq ibq0, long v, ibts ibts0, int v1) {
        if((v1 & 4) != 0) {
            ibts0 = ibs.a;
        }
        ibp0.v(ibq0, v, 0.0f, ibts0);
    }

    public static void G(ibp ibp0, ibq ibq0, long v, hpn hpn0) {
        ibp0.w(ibq0, v, hpn0, 0.0f);
    }

    @Override  // jks
    public float dX() {
        throw null;
    }

    @Override  // jlc
    public float dY() {
        throw null;
    }

    @Override  // jlc
    public final float ea(long v) {
        return jlb.a(this, v);
    }

    @Override  // jks
    public final float eb(float f) {
        return jkr.a(this, f);
    }

    @Override  // jks
    public final float ec(int v) {
        return jkr.b(this, v);
    }

    @Override  // jks
    public final float ed(long v) {
        return jkr.c(this, v);
    }

    @Override  // jks
    public final float eg(float f) {
        return jkr.d(this, f);
    }

    @Override  // jks
    public final int eh(long v) {
        return jkr.e(this, v);
    }

    @Override  // jks
    public final int ei(float f) {
        return jkr.f(this, f);
    }

    @Override  // jks
    public final long ej(long v) {
        return jkr.g(this, v);
    }

    @Override  // jks
    public final long ek(long v) {
        return jkr.h(this, v);
    }

    @Override  // jlc
    public final long el(float f) {
        return jlb.b(this, f);
    }

    @Override  // jks
    public final long em(float f) {
        return jkr.i(this, f);
    }

    public abstract int n();

    public hzk o() {
        throw null;
    }

    public abstract jlm p();

    public float q(ica ica0) {
        return NaNf;
    }

    public final void r(ibq ibq0) {
        if((ibq0 instanceof ihg)) {
            ((ihg)ibq0).T(this.a);
        }
    }

    public final void s(ibq ibq0, int v, int v1, float f) {
        this.r(ibq0);
        ibq0.dZ(jlf.d(((long)v1) & 0xFFFFFFFFL | ((long)v) << 0x20, ibq0.e), f, null);
    }

    public final void t(ibq ibq0, long v, float f) {
        this.r(ibq0);
        ibq0.dZ(jlf.d(v, ibq0.e), f, null);
    }

    public final void u(ibq ibq0, int v, int v1, float f) {
        long v2 = ((long)v1) & 0xFFFFFFFFL | ((long)v) << 0x20;
        if(this.p() != jlm.a && this.n() != 0) {
            long v3 = ((long)(this.n() - ibq0.a - jlf.a(v2))) << 0x20;
            this.r(ibq0);
            ibq0.dZ(jlf.d(((long)jlf.b(v2)) & 0xFFFFFFFFL | v3, ibq0.e), f, null);
            return;
        }
        this.r(ibq0);
        ibq0.dZ(jlf.d(v2, ibq0.e), f, null);
    }

    public final void v(ibq ibq0, long v, float f, ibts ibts0) {
        this.r(ibq0);
        ibq0.dZ(jlf.d(v, ibq0.e), f, ibts0);
    }

    public final void w(ibq ibq0, long v, hpn hpn0, float f) {
        this.r(ibq0);
        ibq0.y(jlf.d(v, ibq0.e), f, hpn0);
    }

    public final void x(ibts ibts0) {
        this.a = true;
        ibts0.a(this);
        this.a = false;
    }

    public static void y(ibp ibp0, ibq ibq0, int v, int v1) {
        ibp0.s(ibq0, v, v1, 0.0f);
    }

    public static void z(ibp ibp0, ibq ibq0, long v) {
        ibp0.t(ibq0, v, 0.0f);
    }
}

