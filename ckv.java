public final class ckv implements chi {
    public Object a;
    public Object b;
    private final cmx c;
    private cht d;
    private cht e;
    private final cht f;
    private long g;
    private cht h;
    private final cmc i;

    public ckv(chl chl0, cmc cmc0, Object object0, Object object1) {
        this(chl0, cmc0, object0, object1, null);
    }

    public ckv(chl chl0, cmc cmc0, Object object0, Object object1, cht cht0) {
        cmx cmx0 = chl0.a(cmc0);
        super();
        this.c = cmx0;
        this.i = cmc0;
        this.a = object1;
        this.b = object0;
        this.d = (cht)cmc0.a.a(object0);
        this.e = (cht)cmc0.a.a(object1);
        this.f = cht0 == null ? ((cht)cmc0.a.a(object0)).c() : chu.a(cht0);
        this.g = -1L;
    }

    @Override  // chi
    public final long a() {
        long v = this.g;
        if(v < 0L) {
            v = this.c.a(this.d, this.e, this.f);
            this.g = v;
        }
        return v;
    }

    @Override  // chi
    public final cht b(long v) {
        if(!chh.a(this, v)) {
            return this.c.d(v, this.d, this.e, this.f);
        }
        cht cht0 = this.h;
        if(cht0 == null) {
            cht0 = this.c.b(this.d, this.e, this.f);
            this.h = cht0;
        }
        return cht0;
    }

    @Override  // chi
    public final Object c() {
        return this.a;
    }

    @Override  // chi
    public final Object d(long v) {
        if(!chh.a(this, v)) {
            cht cht0 = this.c.c(v, this.d, this.e, this.f);
            int v1 = cht0.b();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(Float.isNaN(cht0.a(v2))) {
                    cjo.b(("AnimationVector cannot contain a NaN. " + cht0 + ". Animation: " + this + ", playTimeNanos: " + v));
                }
            }
            return this.i.b.a(cht0);
        }
        return this.a;
    }

    @Override  // chi
    public final boolean e(long v) {
        return chh.a(this, v);
    }

    @Override  // chi
    public final boolean f() {
        return this.c.e();
    }

    @Override  // chi
    public final cmc g() {
        return this.i;
    }

    public final void h(Object object0) {
        if(!ibuq.m(object0, this.b)) {
            this.b = object0;
            this.d = (cht)this.i.a.a(object0);
            this.h = null;
            this.g = -1L;
        }
    }

    public final void i(Object object0) {
        if(!ibuq.m(this.a, object0)) {
            this.a = object0;
            this.e = (cht)this.i.a.a(object0);
            this.h = null;
            this.g = -1L;
        }
    }

    @Override
    public final String toString() {
        return "TargetBasedAnimation: " + this.b + " -> " + this.a + ",initial velocity: " + this.f + ", duration: " + this.a() / 1000000L + " ms,animationSpec: " + this.c;
    }
}

