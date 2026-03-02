public final class ddgf implements ibts {
    public final float a;
    public final hlf b;
    public final hlf c;

    public ddgf(float f, hlf hlf0, hlf hlf1) {
        this.a = f;
        this.b = hlf0;
        this.c = hlf1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        igb igb0 = (igb)object0;
        ibuq.f(igb0, "$this$onDrawWithContent");
        igb0.p();
        long v = ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(igb0.o() & 0xFFFFFFFFL))))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(this.a)) << 0x20;
        hpc.g(igb0, this.b, ((long)Float.floatToRawIntBits(0.0f)) << 0x20 | ((long)Float.floatToRawIntBits(0.0f)) & 0xFFFFFFFFL, v, 0.0f, null, 6, 56);
        long v1 = ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(igb0.o() & 0xFFFFFFFFL))))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(this.a)) << 0x20;
        long v2 = ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(igb0.o() >> 0x20))) - this.a)) << 0x20 | ((long)Float.floatToRawIntBits(0.0f)) & 0xFFFFFFFFL;
        hpc.g(igb0, this.c, v2, v1, 0.0f, null, 6, 56);
        return ibom.a;
    }
}

