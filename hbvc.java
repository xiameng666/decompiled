public final class hbvc implements hbqx {
    public final hbvg a;
    public final long b;
    public final hbkn c;
    public final boolean d;
    public final hbtp e;
    public final hbuu f;

    public hbvc(hbvg hbvg0, long v, hbkn hbkn0, boolean z, hbtp hbtp0, hbuu hbuu0) {
        this.a = hbvg0;
        this.b = v;
        this.c = hbkn0;
        this.d = z;
        this.e = hbtp0;
        this.f = hbuu0;
    }

    @Override  // hbqx
    public final hbrb a() {
        hblw hblw0 = new hblw();
        hbjz hbjz0 = new hbjz();
        hbjz0.a(Long.valueOf(this.b));
        hbjz0.b = this.c;
        hbjz0.c = Boolean.valueOf(this.d);
        hblw0.a = new hbka(hbjz0);
        int v = hbtu.a.a(this.e);
        hblw0.c = hbrk.b(this.e.g, v);
        hbix hbix0 = new hbix();
        hbix0.a = this.a.d.h();
        hblw0.b = new hbiz(hbix0);
        hbuu hbuu0 = this.f;
        if(hbuu0 != null) {
            Float float0 = hbuu0.a;
            if(float0 != null) {
                hblw0.d = float0;
            }
            Float float1 = hbuu0.c;
            if(float1 != null) {
                hblw0.e = float1;
            }
            Float float2 = hbuu0.e;
            if(float2 != null) {
                hblw0.g = float2;
            }
            Integer integer0 = hbuu0.d;
            if(integer0 != null && ((int)integer0) != 0) {
                hblw0.f = hbux.a(integer0.intValue());
            }
        }
        hbkp hbkp0 = new hbkp();
        hbkp0.c = hbkm.b;
        hbkp0.n = new hblx(hblw0);
        return new hbrb(hbkp0, 0);
    }
}

