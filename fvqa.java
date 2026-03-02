public final class fvqa {
    public long a;
    public long b;
    public cjds c;
    private final fvkc d;
    private final fvpy e;

    public fvqa(fvkc fvkc0) {
        this.c = null;
        this.a = -1L;
        this.b = -1L;
        this.e = new fvpy();
        this.d = fvkc0;
    }

    final void a(cjds cjds0, fvtm fvtm0, hecp hecp0) {
        if(cjds0 != null) {
            this.c = cjds0;
        }
        if(fvtm0 != null) {
            this.b = fvtm0.f;
            if(cjds0 != null) {
                this.e.a(fvtm0, cjds0);
            }
        }
        if(hecp0 != null) {
            this.a = hecp0.m();
            fvkc fvkc0 = this.d;
            long v = fvkc0.b.b();
            for(int v1 = 0; v1 < hecp0.d(); ++v1) {
                fvkc0.a(hecp0.l(v1), v).c = v;
            }
        }
    }

    final boolean b(fvtm fvtm0, cjds cjds0) {
        fvpy fvpy0;
        if(cjds0 == null) {
            return false;
        }
        long v = fvtm0.a();
        double f = cjds0.b();
        double f1 = cjds0.c();
        for(int v1 = 0; true; ++v1) {
            fvpy0 = this.e;
            if(v1 >= 20) {
                break;
            }
            if(fvpy0.b[v1] && fvpy0.a[v1] == v && (GeoMath.a(fvpy0.c[v1], fvpy0.d[v1], f, f1) < 50.0)) {
                return true;
            }
        }
        fvpy0.a(fvtm0, cjds0);
        return false;
    }

    final int c(hecq hecq0, long v) {
        int v2 = 0;
        for(int v1 = 0; v1 < hecq0.d(); ++v1) {
            long v3 = hecq0.l(v1);
            fvkb fvkb0 = this.d.a.b(v3);
            long v4 = fvkb0 == null ? -1L : fvkb0.c;
            if(v4 == -1L || v - v4 > 600000L) {
                ++v2;
            }
        }
        return v2;
    }
}

