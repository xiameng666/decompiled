public final class dele implements ibts {
    public final long a;
    public final hph b;

    public dele(long v, hph hph0) {
        this.a = v;
        this.b = hph0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        hpd hpd0 = (hpd)object0;
        ibuq.f(hpd0, "$this$drawBehind");
        float f = hpd0.eg(16.0f);
        hpc.i(hpd0, this.a, 0L, 0L, ((long)Float.floatToRawIntBits(f)) << 0x20 | ((long)Float.floatToRawIntBits(f)) & 0xFFFFFFFFL, this.b, 230);
        return ibom.a;
    }
}

