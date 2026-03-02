public final class ddyp implements ibts {
    public final long a;
    public final float b;
    public final long c;
    public final float d;

    public ddyp(long v, float f, long v1, float f1) {
        this.a = v;
        this.b = f;
        this.c = v1;
        this.d = f1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((hpd)object0), "$this$Canvas");
        hph hph0 = new hph(((hpd)object0).eg(this.b), 0.0f, 0, 0, null, 30);
        hpc.e(((hpd)object0), this.a, 0.0f, 0L, hph0, 110);
        float f = ((hpd)object0).eg(this.b) / 2.0f;
        ((hpd)object0).t().c.c(f, f, f, f);
        float f1 = -f;
        try {
            hpc.d(((hpd)object0), this.c, -90.0f, this.d, true, 0L, 0L, 0.0f, null, 0x3F0);
        }
        finally {
            ((hpd)object0).t().c.c(f1, f1, f1, f1);
        }
        return ibom.a;
    }
}

