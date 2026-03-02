final class desg implements ibtx {
    final ibth a;
    final ibth b;

    public desg(ibth ibth0, ibth ibth1) {
        this.a = ibth0;
        this.b = ibth1;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        goz goz0 = (goz)object1;
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        long v = fpu.a(goz0).G;
        eaa eaa0 = fpu.c(goz0).e;
        gze gze0 = gzf.e(0x3681943B, new desd(this.b), goz0);
        gze gze1 = gzf.e(0x26E7FF9, new desf(this.a), goz0);
        fiqf.b(this.a, gze0, null, gze1, null, null, degg.r, eaa0, v, 0.0f, 0L, 0L, 0L, null, goz0, 0x180C30, 0, 0x3E34);
        return ibom.a;
    }
}

