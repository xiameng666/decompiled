public final class cia implements chi {
    private final Object a;
    private final cht b;
    private final cht c;
    private final cht d;
    private final Object e;
    private final long f;
    private final cng g;
    private final cmc h;

    public cia(cib cib0, cmc cmc0, Object object0, cht cht0) {
        cng cng0 = cib0.a();
        super();
        this.g = cng0;
        this.h = cmc0;
        this.a = object0;
        cht cht1 = (cht)cmc0.a.a(object0);
        this.b = cht1;
        this.c = chu.a(cht0);
        cht cht2 = cng0.a(cht1, cht0);
        this.e = cmc0.b.a(cht2);
        if(cng0.c == null) {
            cng0.c = cht1.c();
        }
        cht cht3 = cng0.c;
        if(cht3 == null) {
            ibuq.j("velocityVector");
            cht3 = null;
        }
        int v = cht3.b();
        long v2 = 0L;
        for(int v3 = 0; v3 < v; ++v3) {
            cht1.a(v3);
            float f = cht0.a(v3);
            v2 = Math.max(v2, cng0.a.d(f));
        }
        this.f = v2;
        cht cht4 = chu.a(this.g.b(v2, this.b, cht0));
        this.d = cht4;
        int v4 = cht4.b();
        for(int v1 = 0; v1 < v4; ++v1) {
            float f1 = ibwt.f(this.d.a(v1), -this.g.d, this.g.d);
            this.d.e(v1, f1);
        }
    }

    @Override  // chi
    public final long a() {
        return this.f;
    }

    @Override  // chi
    public final cht b(long v) {
        return chh.a(this, v) ? this.d : this.g.b(v, this.b, this.c);
    }

    @Override  // chi
    public final Object c() {
        return this.e;
    }

    @Override  // chi
    public final Object d(long v) {
        if(!chh.a(this, v)) {
            cng cng0 = this.g;
            cht cht0 = this.b;
            cht cht1 = this.c;
            ibts ibts0 = this.h.b;
            if(cng0.b == null) {
                cng0.b = cht0.c();
            }
            cht cht2 = cng0.b;
            if(cht2 == null) {
                ibuq.j("valueVector");
                cht2 = null;
            }
            int v1 = cht2.b();
            for(int v2 = 0; v2 < v1; ++v2) {
                cht cht3 = cng0.b;
                if(cht3 == null) {
                    ibuq.j("valueVector");
                    cht3 = null;
                }
                float f = cht0.a(v2);
                float f1 = cht1.a(v2);
                cht3.e(v2, cng0.a.c(v, f, f1));
            }
            cht cht4 = cng0.b;
            if(cht4 == null) {
                ibuq.j("valueVector");
                return ibts0.a(null);
            }
            return ibts0.a(cht4);
        }
        return this.e;
    }

    @Override  // chi
    public final boolean e(long v) {
        return chh.a(this, v);
    }

    @Override  // chi
    public final boolean f() {
        return false;
    }

    @Override  // chi
    public final cmc g() {
        return this.h;
    }
}

