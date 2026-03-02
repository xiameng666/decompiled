public final class dekw implements ibts {
    public final gra a;
    public final long b;
    public final int c;
    public final long d;
    public final float e;
    public final jks f;
    public final long g;

    public dekw(gra gra0, long v, int v1, long v2, float f, jks jks0, long v3) {
        this.a = gra0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = f;
        this.f = jks0;
        this.g = v3;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        float f2;
        igb igb0 = (igb)object0;
        ibuq.f(igb0, "$this$onDrawWithContent");
        hzk hzk0 = (hzk)this.a.a();
        long v = this.g;
        jks jks0 = this.f;
        if(hzk0 != null) {
            hka hka0 = hzl.h(hzk0);
            int v1 = (int)(this.b >> 0x20);
            float f = hka0.b + (hka0.d - hka0.b) / 2.0f;
            float f1 = (float)this.c;
            int v2 = (int)(this.d >> 0x20);
            if(Float.compare(Float.intBitsToFloat(v1) / 2.0f + f, f1) <= 0 && (f - Float.intBitsToFloat(v1) / 2.0f >= 0.0f)) {
                f2 = Float.intBitsToFloat(v1) / 2.0f - Float.intBitsToFloat(v2) / 2.0f;
            }
            else {
                f2 = this.e;
                if(f + Float.intBitsToFloat(v1) - f2 - Float.intBitsToFloat(v2) / 2.0f > f1) {
                    f2 = Float.intBitsToFloat(v1) - f2 - Float.intBitsToFloat(v2);
                }
            }
            igb0.p();
            igb0.t().c.f(f2, 0.0f);
            try {
                hoy hoy0 = igb0.t();
                long v3 = hoy0.a();
                hoy0.b().l();
                try {
                    hoy0.c.d(0.0f, ((long)Float.floatToRawIntBits(Float.intBitsToFloat(v2) / 2.0f)) << 0x20 | ((long)Float.floatToRawIntBits(0.0f)) & 0xFFFFFFFFL);
                    hks hks0 = new hks(null);
                    long v4 = ((long)Float.floatToRawIntBits(jks0.eg(7.71499f))) << 0x20;
                    long v5 = ((long)Float.floatToRawIntBits(jks0.eg(1.85831f))) & 0xFFFFFFFFL;
                    float f3 = jks0.eg(6.93818f);
                    int v6 = Float.floatToRawIntBits(jks0.eg(0.563634f));
                    try {
                        float f4 = jks0.eg(5.06182f);
                        long v7 = ((long)Float.floatToRawIntBits(jks0.eg(0.563632f))) & 0xFFFFFFFFL;
                        float f5 = jks0.eg(4.28502f);
                        long v8 = ((long)Float.floatToRawIntBits(jks0.eg(1.85831f))) & 0xFFFFFFFFL;
                        long v9 = v5 | v4;
                        long v10 = ((long)Float.floatToRawIntBits(jks0.eg(12.0f))) << 0x20 | ((long)Float.floatToRawIntBits(jks0.eg(9.0f))) & 0xFFFFFFFFL;
                        hks0.f(Float.intBitsToFloat(((int)(v9 >> 0x20))), Float.intBitsToFloat(((int)(v9 & 0xFFFFFFFFL))) - Float.intBitsToFloat(((int)(v10 & 0xFFFFFFFFL))));
                        long v11 = ((long)Float.floatToRawIntBits(f3)) << 0x20 | ((long)v6) & 0xFFFFFFFFL;
                        long v12 = ((long)Float.floatToRawIntBits(f4)) << 0x20 | v7;
                        long v13 = ((long)Float.floatToRawIntBits(f5)) << 0x20 | v8;
                        hks0.d(Float.intBitsToFloat(((int)(v11 >> 0x20))), Float.intBitsToFloat(((int)(v11 & 0xFFFFFFFFL))) - Float.intBitsToFloat(((int)(v10 & 0xFFFFFFFFL))), Float.intBitsToFloat(((int)(v12 >> 0x20))), Float.intBitsToFloat(((int)(v12 & 0xFFFFFFFFL))) - Float.intBitsToFloat(((int)(v10 & 0xFFFFFFFFL))), Float.intBitsToFloat(((int)(v13 >> 0x20))), Float.intBitsToFloat(((int)(v13 & 0xFFFFFFFFL))) - Float.intBitsToFloat(((int)(v10 & 0xFFFFFFFFL))));
                        hks0.e(0.0f, 0.0f);
                        hks0.e(Float.intBitsToFloat(((int)(v10 >> 0x20))), 0.0f);
                        hks0.e(Float.intBitsToFloat(((int)(v9 >> 0x20))), Float.intBitsToFloat(((int)(v9 & 0xFFFFFFFFL))) - Float.intBitsToFloat(((int)(v10 & 0xFFFFFFFFL))));
                        hks0.c();
                        igb0 = igb0;
                    }
                    catch(Throwable throwable1) {
                        igb0 = igb0;
                        goto label_51;
                    }
                    hpc.l(igb0, hks0, v, 0.0f, null, 60);
                    goto label_54;
                }
                catch(Throwable throwable1) {
                }
            label_51:
                hoy0.b().j();
                hoy0.h(v3);
                throw throwable1;
            label_54:
                hoy0.b().j();
                hoy0.h(v3);
            }
            catch(Throwable throwable0) {
                igb0.t().c.f(-f2, 0.0f);
                throw throwable0;
            }
            igb0.t().c.f(-f2, 0.0f);
            return ibom.a;
        }
        return ibom.a;
    }
}

