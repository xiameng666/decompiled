import java.util.LinkedHashMap;
import java.util.Map;

public abstract class igm extends igl implements ias {
    private Map f;
    public final ihy g;
    public long h;
    public final iai p;
    public final bza q;
    private iav r;

    public igm(ihy ihy0) {
        this.g = ihy0;
        this.h = 0L;
        this.p = new iai(this);
        this.q = new bza(null);
    }

    public final long B(igm igm0, boolean z) {
        long v = 0L;
        while(!ibuq.m(this, igm0)) {
            if(!this.j || !z) {
                v = jlf.d(v, this.h);
            }
            ihy ihy0 = this.g.x;
            ibuq.c(ihy0);
            this = ihy0.C();
            ibuq.c(this);
        }
        return v;
    }

    public final ids C() {
        ids ids0 = this.g.t.v.p;
        ibuq.c(ids0);
        return ids0;
    }

    public final void D(long v) {
        if(!jlf.f(this.h, v)) {
            this.h = v;
            igt igt0 = this.L().v.p;
            if(igt0 != null) {
                igt0.s();
            }
            igm.W(this.g);
        }
        if(!this.l) {
            this.R(this.K());
        }
    }

    public final void E(iav iav0) {
        if(iav0 == null) {
            this.z(0L);
        }
        else {
            this.z(((long)iav0.b()) << 0x20 | ((long)iav0.a()) & 0xFFFFFFFFL);
        }
        if(!ibuq.m(this.r, iav0) && iav0 != null && ((this.f != null && !this.f.isEmpty() || !iav0.e().isEmpty()) && !ibuq.m(iav0.e(), this.f))) {
            ((igt)this.C()).p.e();
            Map map0 = this.f;
            if(map0 == null) {
                map0 = new LinkedHashMap();
                this.f = map0;
            }
            map0.clear();
            map0.putAll(iav0.e());
        }
        this.r = iav0;
    }

    @Override  // igl
    public final long I() {
        return this.h;
    }

    @Override  // igl
    public final hzk J() {
        return this.p;
    }

    @Override  // igl
    public final iav K() {
        iav iav0 = this.r;
        if(iav0 != null) {
            return iav0;
        }
        hxt.b("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new ibnm();
    }

    @Override  // igl
    public final ify L() {
        return this.g.t;
    }

    @Override  // igl
    public final igl N() {
        ihy ihy0 = this.g.w;
        return ihy0 != null ? ihy0.C() : null;
    }

    @Override  // igl
    public final igl O() {
        ihy ihy0 = this.g.x;
        return ihy0 != null ? ihy0.C() : null;
    }

    @Override  // igl
    public final void S() {
        this.dZ(this.h, 0.0f, null);
    }

    @Override  // igl
    public final boolean U() {
        return this.r != null;
    }

    @Override  // hzf
    public int a(int v) {
        throw null;
    }

    @Override  // hzf
    public int b(int v) {
        throw null;
    }

    @Override  // hzf
    public int c(int v) {
        throw null;
    }

    @Override  // hzf
    public int d(int v) {
        throw null;
    }

    @Override  // jks
    public final float dX() {
        return this.g.dX();
    }

    @Override  // jlc
    public final float dY() {
        return this.g.dY();
    }

    @Override  // ibq
    public final void dZ(long v, float f, ibts ibts0) {
        this.D(v);
        if(this.k) {
            return;
        }
        this.s();
    }

    @Override  // igl
    public final boolean ep() {
        return true;
    }

    @Override  // ibq, hzf
    public final Object f() {
        return this.g.f();
    }

    @Override  // hzg
    public final jlm p() {
        return this.g.p();
    }

    protected void s() {
        this.K().g();
    }

    public final long t() {
        return ((long)this.a) << 0x20 | ((long)this.b) & 0xFFFFFFFFL;
    }
}

