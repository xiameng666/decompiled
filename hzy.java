import java.util.List;
import java.util.Map;

final class hzy implements icr {
    public jlm a;
    public float b;
    public float c;
    final iag d;

    public hzy(iag iag0) {
        this.d = iag0;
        super();
        this.a = jlm.b;
    }

    @Override  // jks
    public final float dX() {
        return this.b;
    }

    @Override  // jlc
    public final float dY() {
        return this.c;
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

    @Override  // iax
    public final iav en(int v, int v1, Map map0, ibts ibts0) {
        return iaw.a(this, v, v1, map0, ibts0);
    }

    @Override  // iax
    public final iav eo(int v, int v1, Map map0, ibts ibts0, ibts ibts1) {
        if((v & 0xFF000000) != 0 || (0xFF000000 & v1) != 0) {
            hxt.d(a.x(v1, v, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new hzx(v, v1, map0, ibts0, this, this.d, ibts1);
    }

    @Override  // hzg
    public final boolean ep() {
        return this.d.a.aC() == 2 || this.d.a.aC() == 4;
    }

    @Override  // hzg
    public final jlm p() {
        return this.a;
    }

    @Override  // icr
    public final List q(Object object0, ibtw ibtw0) {
        iag iag0 = this.d;
        iag0.j();
        ify ify0 = iag0.a;
        int v = ify0.aC();
        if(v != 1 && v != 3 && (v != 2 && v != 4)) {
            hxt.d("subcompose can only be used inside the measure or layout blocks");
        }
        bzk bzk0 = iag0.m;
        Object object1 = bzk0.a(object0);
        if(object1 == null) {
            object1 = (ify)iag0.n.h(object0);
            if(object1 == null) {
                object1 = iag0.g(object0);
                if(object1 == null) {
                    object1 = iag0.f(iag0.d);
                }
            }
            else {
                hzw hzw0 = (hzw)iag0.l.a(object1);
                if(hzw0 != null) {
                    hzw0.a(5);
                }
                if(iag0.j <= 0) {
                    hxt.d("Check failed.");
                }
                --iag0.j;
            }
            bzk0.k(object0, object1);
        }
        if(ibpo.U(ify0.z(), iag0.d) != ((ify)object1)) {
            int v1 = ify0.z().indexOf(((ify)object1));
            if(v1 < iag0.d) {
                hxt.c(a.i(object0, "Key \"", "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."));
            }
            int v2 = iag0.d;
            if(v2 != v1) {
                iag0.l(v1, v2);
            }
        }
        ++iag0.d;
        iag0.m(((ify)object1), object0, ibtw0);
        return v == 1 || v == 3 ? ((ify)object1).x() : ((ify)object1).w();
    }
}

