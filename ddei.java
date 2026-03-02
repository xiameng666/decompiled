final class ddei implements ibtx {
    final ibth a;
    final ibth b;
    final gra c;

    public ddei(ibth ibth0, ibth ibth1, gra gra0) {
        this.a = ibth0;
        this.b = ibth1;
        this.c = gra0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        goz goz0 = (goz)object1;
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        eaa eaa0 = fpu.c(goz0).e;
        long v = fpu.a(goz0).G;
        gze gze0 = gzf.e(2106731926, new dded(this.b), goz0);
        gze gze1 = gzf.e(433142040, new ddef(this.a), goz0);
        gze gze2 = gzf.e(0x842FCA5B, new ddeh(this.c), goz0);
        fiqf.b(this.a, gze0, null, gze1, ddcl.c, ddcl.d, gze2, eaa0, v, 0.0f, 0L, 0L, 0L, null, goz0, 0x1B6C30, 0, 0x3E04);
        return ibom.a;
    }
}

