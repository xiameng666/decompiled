public final class ddft implements ibts {
    public final ibq a;
    public final int b;
    public final ibq c;
    public final dhf d;
    public final long e;
    public final ibq f;
    public final dhn g;
    public final int h;
    public final int i;

    public ddft(ibq ibq0, int v, ibq ibq1, dhf dhf0, long v1, ibq ibq2, dhn dhn0, int v2, int v3) {
        this.a = ibq0;
        this.b = v;
        this.c = ibq1;
        this.d = dhf0;
        this.e = v1;
        this.f = ibq2;
        this.g = dhn0;
        this.h = v2;
        this.i = v3;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        int v4;
        ibuq.f(((ibp)object0), "$this$layout");
        int v = this.b;
        ibq ibq0 = this.a;
        int v1 = 0;
        ibp.A(((ibp)object0), ibq0, 0, (v - ibq0.b) / 2);
        dhf dhf0 = this.d;
        dhg dhg0 = dho.e;
        boolean z = ibuq.m(dhf0, dhg0);
        ibq ibq1 = this.c;
        long v2 = this.e;
        ibq ibq2 = this.f;
        if(z) {
            int v3 = ibq1.a;
            v4 = (jkp.b(v2) - v3) / 2;
            int v5 = ibq0.a;
            if(v4 < v5) {
                v4 += v5 - v4;
            }
            else {
                int v6 = v3 + v4;
                int v7 = ibq2.a;
                if(v6 > jkp.b(v2) - v7) {
                    v4 += jkp.b(v2) - v7 - v6;
                }
            }
        }
        else {
            v4 = ibuq.m(dhf0, dho.b) ? jkp.b(v2) - ibq1.a - ibq2.a : Math.max(jkr.f(((ibp)object0), ddfz.a), ibq0.a);
        }
        dhn dhn0 = this.g;
        if(ibuq.m(dhn0, dhg0)) {
            v1 = (v - ibq1.b) / 2;
        }
        else if(ibuq.m(dhn0, dho.d)) {
            v1 = this.h == 0 ? v - ibq1.b : v - ibq1.b - Math.max(0, this.h - ibq1.b + this.i);
        }
        ibp.A(((ibp)object0), ibq1, v4, v1);
        ibp.A(((ibp)object0), ibq2, jkp.b(v2) - ibq2.a, (v - ibq2.b) / 2);
        return ibom.a;
    }
}

