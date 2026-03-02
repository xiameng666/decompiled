import java.util.Map;

public final class hyf implements hyd, ial, iax {
    public final ifn a;
    public boolean b;
    public cfe c;

    public hyf(ifn ifn0, cfe cfe0) {
        this.a = ifn0;
        this.c = cfe0;
    }

    @Override  // ial
    public final hzk dS(hzk hzk0) {
        if(!(hzk0 instanceof iai)) {
            if(!(hzk0 instanceof ihy)) {
                hxt.a("Unsupported LayoutCoordinates");
                throw new ibnm();
            }
            igm igm0 = ((ihy)hzk0).C();
            if(igm0 != null) {
                return igm0.p == null ? hzk0 : igm0.p;
            }
        }
        return hzk0;
    }

    @Override  // ial
    public final long dT(hzk hzk0, hzk hzk1) {
        return iak.a(this, hzk0, hzk1);
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

    @Override  // iax
    public final iav en(int v, int v1, Map map0, ibts ibts0) {
        return iaw.a(this.a, v, v1, map0, ibts0);
    }

    @Override  // iax
    public final iav eo(int v, int v1, Map map0, ibts ibts0, ibts ibts1) {
        if((v & 0xFF000000) != 0 || (0xFF000000 & v1) != 0) {
            hxt.d(a.x(v1, v, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new hye(v, v1, map0, ibts0, ibts1, this);
    }

    @Override  // hzg
    public final boolean ep() {
        return false;
    }

    @Override  // hzg
    public final jlm p() {
        return this.a.p();
    }
}

