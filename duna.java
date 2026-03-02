public final class duna implements ibts {
    public final long a;

    public duna(long v) {
        this.a = v;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        hpd hpd0 = (hpd)object0;
        ibuq.f(hpd0, "$this$drawBehind");
        float f = hpd0.eg(0.0f);
        long v = ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(hpd0.o() >> 0x20))))) << 0x20;
        hpc.f(hpd0, this.a, ((long)Float.floatToRawIntBits(0.0f)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(0.0f)) << 0x20, v | ((long)Float.floatToRawIntBits(0.0f)) & 0xFFFFFFFFL, f, 0, 0x1F0);
        return ibom.a;
    }
}

