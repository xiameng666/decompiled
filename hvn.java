import java.util.List;

public abstract class hvn extends hfb implements iek, ijc, ijm {
    public iev a;
    public boolean b;
    private hwa c;

    public hvn(hwa hwa0, iev iev0) {
        this.a = iev0;
        this.c = hwa0;
    }

    @Override  // ijc
    public final boolean B() {
        return false;
    }

    @Override  // ijc
    public final void E() {
    }

    @Override  // hfb
    public final void dH() {
        ijb.a(this);
    }

    @Override  // ijc
    public final long dQ() {
        return this.a == null ? ijk.a : iev.a(ien.g(this));
    }

    @Override  // hfb
    public final void dR() {
        this.k();
    }

    public abstract void e(hwa arg1);

    public final void f(hwa hwa0) {
        if(!ibuq.m(this.c, hwa0)) {
            this.c = hwa0;
            if(this.b) {
                this.j();
            }
        }
    }

    public abstract boolean g(int arg1);

    protected final ikx h() {
        return (ikx)iel.a(this, ipa.o);
    }

    private final void i() {
        hwa hwa0;
        ibvd ibvd0 = new ibvd();
        ijn.b(this, new hvm());
        hvn hvn0 = (hvn)ibvd0.a;
        if(hvn0 == null) {
            hwa0 = this.c;
        }
        else {
            hwa0 = hvn0.c;
            if(hwa0 == null) {
                hwa0 = this.c;
            }
        }
        this.e(hwa0);
    }

    private final void j() {
        ibuz ibuz0 = new ibuz();
        ibuz0.a = true;
        ijn.d(this, new hvl(ibuz0));
        if(ibuz0.a) {
            this.i();
        }
    }

    private final void k() {
        if(this.b) {
            this.b = false;
            if(this.B) {
                ibvd ibvd0 = new ibvd();
                ijn.b(this, new hvk(ibvd0));
                hvn hvn0 = (hvn)ibvd0.a;
                if(hvn0 != null) {
                    hvn0.i();
                    return;
                }
                this.e(null);
            }
        }
    }

    @Override  // ijc
    public final void n() {
        this.k();
    }

    @Override  // ijc
    public final void q(hvt hvt0, hvv hvv0, long v) {
        if(hvv0 == hvv.b) {
            List list0 = hvt0.a;
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(this.g(((hwe)list0.get(v2)).i)) {
                    switch(hvt0.e) {
                        case 4: {
                            this.b = true;
                            this.j();
                            return;
                        }
                        case 5: {
                            this.k();
                            return;
                        }
                        default: {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override  // ijc
    public final void r() {
        ijb.b(this);
    }
}

