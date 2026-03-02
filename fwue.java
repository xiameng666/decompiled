import java.util.List;

public final class fwue implements fwyb {
    private long a;

    public fwue() {
        this.a = 0L;
    }

    @Override  // fwyb
    public final void a(int v, int v1) {
        cgia.v().d(((gful_cronetEngineProvider)new fwty(v, v1)));
    }

    @Override  // fwyb
    public final void b(long v, int v1, long v2, boolean z, boolean z1, int v3, int v4, int v5) {
        synchronized(this) {
            if(v < 0L) {
                return;
            }
            cgno.v().d(((gful_cronetEngineProvider)new fwtx(v, v1, v2, z, z1, v3, v4, v5)));
        }
    }

    @Override  // fwyb
    public final void c(List list0) {
        cglr cglr0 = cglr.v();
        for(Object object0: list0) {
            cglr0.j(((ProtoLiteMessage)(((gixy)object0))));
        }
    }

    @Override  // fwyb
    public final void d(String s, iaph iaph0, int v, boolean z, boolean z1, gkpz gkpz0) {
        cgmn.v().d(((gful_cronetEngineProvider)new fwua(s, iaph0, v, z, z1, gkpz0)));
    }

    @Override  // fwyb
    public final void e(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        cglb.v().d(((gful_cronetEngineProvider)new fwtz(v, v1, v2, v3, v4, v5, v6, v7)));
    }

    @Override  // fwyb
    public final void f(int v, fvtm fvtm0, int v1, long v2, long v3) {
        gged_interceptors gged0 = fvtm0.g;
        int v4 = gged0.size();
        int v6 = 0;
        for(int v5 = 0; v5 < v4; ++v5) {
            if(((fvtm)gged0.get(v5)).i != 0xFFFFD8F1) {
                ++v6;
            }
        }
        double f = gged0.isEmpty() ? -1.0 : ((double)(v6 / gged0.size()));
        long v7 = -1L;
        if((fvtm0 instanceof fvub)) {
            int v8 = ((fvub)fvtm0).l;
            int v9 = ((fvub)fvtm0).c;
            if(v8 != 0x7FFFFFFF) {
                v7 = (long)v8;
            }
            this.h(v, v9, v1, 6, v8 != 0x7FFFFFFF, v7, ((long)gged0.size()), ((long)v6), f, v2, v3);
            return;
        }
        if((fvtm0 instanceof fvue)) {
            int v10 = ((fvue)fvtm0).m;
            int v11 = ((fvue)fvtm0).c;
            if(v10 != 0x7FFFFFFF) {
                v7 = (long)v10;
            }
            this.h(v, v11, v1, 7, v10 != 0x7FFFFFFF, v7, ((long)gged0.size()), ((long)v6), f, v2, v3);
            return;
        }
        this.h(v, fvtm0.c, v1, fvtm.f(fvtm0.h), false, -1L, ((long)gged0.size()), ((long)v6), f, v2, v3);
    }

    @Override  // fwyb
    public final void g(int v, int v1, int v2, int v3, boolean z, int v4, int v5, int v6, int v7, boolean z1, long v8) {
        synchronized(this) {
            cgqi.v().d(((gful_cronetEngineProvider)new fwuc(v, v1, z, v7, z1, v2, v8, v4, v3, v5, v6)));
        }
    }

    private final void h(int v, int v1, int v2, int v3, boolean z, long v4, long v5, long v6, double f, long v7, long v8) {
        synchronized(this) {
            long v10 = this.a;
            this.a = (long)v1;
            cgjj.v().d(((gful_cronetEngineProvider)new fwub(v, v2, v3, z, ((long)v1) != v10, v5, v8, v7, v6, f, v4)));
        }
    }

    private static final boolean i(int v) {
        return v != 0x7FFFFFFF;
    }
}

