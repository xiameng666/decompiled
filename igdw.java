import java.io.Serializable;

public abstract class igdw extends igcm implements Serializable {
    private static final long serialVersionUID = 0x9A8A961C50F00A64L;

    @Override  // igcm
    public igcp A() {
        igcy igcy0 = this.N();
        return iggp.C(igcr.c, igcy0);
    }

    @Override  // igcm
    public igcy C() {
        return iggq.i(igda.b);
    }

    @Override  // igcm
    public igcy D() {
        return iggq.i(igda.g);
    }

    @Override  // igcm
    public igcy E() {
        return iggq.i(igda.a);
    }

    @Override  // igcm
    public igcy F() {
        return iggq.i(igda.h);
    }

    @Override  // igcm
    public igcy G() {
        return iggq.i(igda.i);
    }

    @Override  // igcm
    public igcy H() {
        return iggq.i(igda.l);
    }

    @Override  // igcm
    public igcy I() {
        return iggq.i(igda.j);
    }

    @Override  // igcm
    public igcy J() {
        return iggq.i(igda.e);
    }

    @Override  // igcm
    public igcy K() {
        return iggq.i(igda.k);
    }

    @Override  // igcm
    public igcy L() {
        return iggq.i(igda.f);
    }

    @Override  // igcm
    public igcy M() {
        return iggq.i(igda.c);
    }

    @Override  // igcm
    public igcy N() {
        return iggq.i(igda.d);
    }

    @Override  // igcm
    public final long O(igdm igdm0) {
        long v1 = 0L;
        for(int v = 0; v < igdm0.g(); ++v) {
            v1 = igdm0.n(v).a(this).l(v1, igdm0.e(v));
        }
        return v1;
    }

    @Override  // igcm
    public long a(int v, int v1, int v2, int v3) {
        long v4 = this.y().l(0L, v);
        long v5 = this.s().l(v4, v1);
        long v6 = this.h().l(v5, v2);
        return this.o().l(v6, v3);
    }

    @Override  // igcm
    public long b(int v, int v1, int v2, int v3, int v4, int v5, int v6) {
        long v7 = this.y().l(0L, v);
        long v8 = this.s().l(v7, v1);
        long v9 = this.h().l(v8, v2);
        long v10 = this.m().l(v9, v3);
        long v11 = this.r().l(v10, v4);
        long v12 = this.u().l(v11, v5);
        return this.p().l(v12, v6);
    }

    @Override  // igcm
    public igcp e() {
        igcy igcy0 = this.C();
        return iggp.C(igcr.d, igcy0);
    }

    @Override  // igcm
    public igcp f() {
        igcy igcy0 = this.G();
        return iggp.C(igcr.q, igcy0);
    }

    @Override  // igcm
    public igcp g() {
        igcy igcy0 = this.G();
        return iggp.C(igcr.p, igcy0);
    }

    @Override  // igcm
    public igcp h() {
        igcy igcy0 = this.D();
        return iggp.C(igcr.i, igcy0);
    }

    @Override  // igcm
    public igcp i() {
        igcy igcy0 = this.D();
        return iggp.C(igcr.m, igcy0);
    }

    @Override  // igcm
    public igcp j() {
        igcy igcy0 = this.D();
        return iggp.C(igcr.g, igcy0);
    }

    @Override  // igcm
    public igcp k() {
        igcy igcy0 = this.E();
        return iggp.C(igcr.b, igcy0);
    }

    @Override  // igcm
    public igcp l() {
        igcy igcy0 = this.F();
        return iggp.C(igcr.n, igcy0);
    }

    @Override  // igcm
    public igcp m() {
        igcy igcy0 = this.G();
        return iggp.C(igcr.r, igcy0);
    }

    @Override  // igcm
    public igcp n() {
        igcy igcy0 = this.G();
        return iggp.C(igcr.o, igcy0);
    }

    @Override  // igcm
    public igcp o() {
        igcy igcy0 = this.H();
        return iggp.C(igcr.w, igcy0);
    }

    @Override  // igcm
    public igcp p() {
        igcy igcy0 = this.H();
        return iggp.C(igcr.x, igcy0);
    }

    @Override  // igcm
    public igcp q() {
        igcy igcy0 = this.I();
        return iggp.C(igcr.s, igcy0);
    }

    @Override  // igcm
    public igcp r() {
        igcy igcy0 = this.I();
        return iggp.C(igcr.t, igcy0);
    }

    @Override  // igcm
    public igcp s() {
        igcy igcy0 = this.J();
        return iggp.C(igcr.h, igcy0);
    }

    @Override  // igcm
    public igcp t() {
        igcy igcy0 = this.K();
        return iggp.C(igcr.u, igcy0);
    }

    @Override  // igcm
    public igcp u() {
        igcy igcy0 = this.K();
        return iggp.C(igcr.v, igcy0);
    }

    @Override  // igcm
    public igcp v() {
        igcy igcy0 = this.L();
        return iggp.C(igcr.l, igcy0);
    }

    @Override  // igcm
    public igcp w() {
        igcy igcy0 = this.M();
        return iggp.C(igcr.k, igcy0);
    }

    @Override  // igcm
    public igcp x() {
        igcy igcy0 = this.M();
        return iggp.C(igcr.j, igcy0);
    }

    @Override  // igcm
    public igcp y() {
        igcy igcy0 = this.N();
        return iggp.C(igcr.f, igcy0);
    }

    @Override  // igcm
    public igcp z() {
        igcy igcy0 = this.N();
        return iggp.C(igcr.e, igcy0);
    }
}

