final class ddxm implements ibtw {
    final ibtx a;
    final ibty b;
    final ibtx c;

    public ddxm(ibtx ibtx0, ibty ibty0, ibtx ibtx1) {
        this.a = ibtx0;
        this.b = ibty0;
        this.c = ibtx1;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        gaq.c(dls.e(dls.w(hfc.e), 64.0f), eah.d(0.0f, 0.0f, 24.0f, 24.0f, 3), fpu.a(((goz)object0)).D, 0L, 0.0f, 0.0f, null, gzf.e(328707108, new ddxl(this.a, this.b, this.c), ((goz)object0)), ((goz)object0), 120);
        return ibom.a;
    }
}

