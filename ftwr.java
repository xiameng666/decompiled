public final class ftwr implements ibts {
    public final float a;
    public final float b;
    public final hmi c;

    public ftwr(float f, float f1, hmi hmi0) {
        this.a = f;
        this.b = f1;
        this.c = hmi0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((hpd)object0), "$this$Canvas");
        hli hli0 = ((hpd)object0).t().b();
        float f = Float.intBitsToFloat(((int)(((hpd)object0).o() >> 0x20)));
        float f1 = this.a;
        int v = (int)this.b;
        if(v <= 0) {
            throw new IllegalArgumentException(a.f(v, "Step must be positive, was: ", "."));
        }
        int v1 = (int)f1;
        int v2 = ibss.a(v1, ((int)(f - f1)), v);
        if(v1 <= v2) {
            while(true) {
                hli0.e(((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(((hpd)object0).o() & 0xFFFFFFFFL))) / 2.0f)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(v1)) << 0x20, f1, this.c);
                if(v1 == v2) {
                    break;
                }
                v1 += v;
            }
        }
        return ibom.a;
    }
}

