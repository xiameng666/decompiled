public final class audr extends ausd {
    private Double g;
    private Boolean h;

    public audr(long v) {
        super(v, "volume-mute");
    }

    @Override  // ausd
    protected final void a() {
        super.a();
        this.g = null;
        this.h = null;
    }

    public final boolean b(long v, double f, boolean z) {
        if(Long.compare(v, 0L) == 0 || this.g == null && this.h == null) {
            this.b.c("Do not ignore broadcast volume or mute response.", new Object[0]);
            return false;
        }
        if(!this.i(v)) {
            this.b.c("Ignore volume or mute response with unmatched request ID (%d)", new Object[]{v});
            return true;
        }
        return this.g != null && !aurf.r(this.g.doubleValue(), f) || this.h != null && this.h.booleanValue() != z;
    }

    public final void c(long v, boolean z) {
        super.f(v, null);
        this.h = Boolean.valueOf(z);
        this.g = null;
    }

    public final void d(long v, double f) {
        super.f(v, null);
        this.g = f;
        this.h = null;
    }
}

