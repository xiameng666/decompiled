import androidx.compose.runtime.snapshots.SnapshotStateList;

public final class cgh extends hfb implements iew, ifk, iid {
    public cfz a;

    public cgh(cfz cfz0) {
        this.a = cfz0;
    }

    @Override  // ifk
    public final iav b(iax iax0, ias ias0, long v) {
        ibq ibq0 = ias0.e(v);
        return iaw.b(iax0, ibq0.a, ibq0.b, new cgg(iax0, this, ibq0));
    }

    @Override  // hfb
    public final void dO() {
        iie.a(this, this.a.b);
    }

    @Override  // iew
    public final void dU() {
    }

    @Override  // iew
    public final void dW(igb igb0) {
        igb0.p();
        SnapshotStateList snapshotStateList0 = this.a.e;
        if(snapshotStateList0.a() > 1) {
            ibpo.t(snapshotStateList0, new cfu());
        }
        int v = snapshotStateList0.a();
        for(int v1 = 0; v1 < v; ++v1) {
            cfk cfk0 = (cfk)snapshotStateList0.get(v1);
            hpn hpn0 = cfk0.e();
            if(hpn0 != null) {
                hka hka0 = cfk0.c().a().c();
                if(hka0 != null && cfk0.k()) {
                    long v2 = hka0.c();
                    float f = Float.intBitsToFloat(((int)(v2 >> 0x20)));
                    float f1 = Float.intBitsToFloat(((int)(v2 & 0xFFFFFFFFL)));
                    igb0.t().c.f(f, f1);
                    try {
                        hpo.a(igb0, hpn0);
                    }
                    finally {
                        igb0.t().c.f(-f, -f1);
                    }
                }
            }
        }
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

    @Override  // iid
    public final void o() {
        this.a.c();
        iie.a(this, this.a.b);
    }
}

