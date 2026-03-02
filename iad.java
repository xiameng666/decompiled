public final class iad implements icm {
    final iag a;
    final Object b;
    private final bxx c;

    public iad(iag iag0, Object object0) {
        this.a = iag0;
        this.b = object0;
        super();
        this.c = new bxx(null);
    }

    @Override  // icm
    public final int a() {
        ify ify0 = (ify)this.a.n.a(this.b);
        return ify0 == null ? 0 : ify0.y().size();
    }

    @Override  // icm
    public final void b() {
        iag iag0 = this.a;
        iag0.j();
        Object object0 = this.b;
        ify ify0 = (ify)iag0.n.h(object0);
        if(ify0 != null) {
            if(iag0.j <= 0) {
                hxt.d("No pre-composed items to dispose");
            }
            ify ify1 = iag0.a;
            int v = ify1.z().indexOf(ify0);
            if(v < ify1.z().size() - iag0.j) {
                hxt.d("Item is not in pre-composed item range");
            }
            ++iag0.i;
            --iag0.j;
            hzw hzw0 = (hzw)iag0.l.a(ify0);
            int v1 = ify1.z().size() - iag0.j - iag0.i;
            iag0.l(v, v1);
            iag0.i(v1);
        }
        if(iag0.h.l(object0)) {
            ify.ax(iag0.a, true, 6);
        }
    }

    @Override  // icm
    public final void c(int v, long v1) {
        iag iag0 = this.a;
        ify ify0 = (ify)iag0.n.a(this.b);
        if(ify0 != null && ify0.am()) {
            int v2 = ify0.y().size();
            if(v < 0 || v >= v2) {
                hxt.e(("Index (" + v + ") is out of bound of [0, " + v2 + ')'));
            }
            if(ify0.an()) {
                hxt.c("Pre-measure called on node that is not placed");
            }
            iag0.a.m = true;
            igc.a(ify0).p(((ify)ify0.y().get(v)), v1);
            iag0.a.m = false;
            this.c.d(v);
        }
    }

    @Override  // icm
    public final void d(ibts ibts0) {
        ify ify0 = (ify)this.a.n.a(this.b);
        if(ify0 != null) {
            ihl ihl0 = ify0.u;
            if(ihl0 != null) {
                hfb hfb0 = ihl0.f;
                if(hfb0 != null) {
                    ijn.e(hfb0, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", ibts0);
                }
            }
        }
    }

    @Override  // icm
    public final void e(int v) {
        ify ify0 = (ify)this.a.n.a(this.b);
        if(ify0 != null && ify0.am()) {
            int v1 = ify0.y().size();
            if(v < 0 || v >= v1) {
                hxt.e(("Index (" + v + ") is out of bound of [0, " + v1 + ')'));
            }
            if(this.c.a(v)) {
                ify ify1 = (ify)ify0.y().get(v);
                ify ify2 = (ify)ify0.y().get(v);
            }
        }
    }
}

