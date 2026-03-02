final class eiay implements ibtx {
    final float a;
    final float b;
    final hfc c;
    final clj d;
    final gui e;
    final gui f;

    public eiay(float f, float f1, hfc hfc0, clj clj0, gui gui0, gui gui1) {
        this.a = f;
        this.b = f1;
        this.c = hfc0;
        this.d = clj0;
        this.e = gui0;
        this.f = gui1;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        goz goz0 = (goz)object1;
        ((Number)object2).intValue();
        ibuq.f(((ccg)object0), "$this$AnimatedVisibility");
        float f = ((Number)this.e.a()).floatValue();
        float f1 = ((Number)this.f.a()).floatValue();
        double f2 = Math.toRadians(f);
        long v = ((long)Float.floatToRawIntBits(f1 * (this.a / 4.0f) * ((float)Math.cos(f2)))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(this.b / 4.0f * f1 * ((float)Math.sin(f2)))) << 0x20;
        ehwv ehwv0 = (ehwv)this.d.g();
        jbn jbn0 = fpu.d(goz0).j;
        long v1 = fpu.a(goz0).q;
        gdh.b("", iqn.a(dku.b(this.c, Float.intBitsToFloat(((int)(v >> 0x20))), Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)))), "RangeText"), v1, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn0, goz0, 0, 0, 0x1FFF8);
        return ibom.a;
    }
}

