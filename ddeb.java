final class ddeb implements ibtx {
    final ibth a;
    final ibth b;
    final ibth c;
    final String d;
    final gra e;

    public ddeb(ibth ibth0, ibth ibth1, ibth ibth2, String s, gra gra0) {
        this.a = ibth0;
        this.b = ibth1;
        this.c = ibth2;
        this.d = s;
        this.e = gra0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        goz goz0 = (goz)object1;
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        eaa eaa0 = fpu.c(goz0).e;
        long v = fpu.a(goz0).G;
        gze gze0 = gzf.e(0x89130F98, new dddv(this.b), goz0);
        gze gze1 = gzf.e(0xD78F4FD6, new dddx(this.c), goz0);
        gze gze2 = gzf.e(0x260B9014, new dddy(this.d), goz0);
        gze gze3 = gzf.e(0x4D49B033, new ddea(this.e), goz0);
        fiqf.b(this.a, gze0, null, gze1, ddcl.h, gze2, gze3, eaa0, v, 0.0f, 0L, 0L, 0L, null, goz0, 0x1B6C30, 0, 0x3E04);
        return ibom.a;
    }
}

