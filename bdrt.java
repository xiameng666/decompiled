final class bdrt implements ibtx {
    final gra a;
    final boolean b;
    final long c;
    final bdsf d;

    public bdrt(gra gra0, boolean z, long v, bdsf bdsf0) {
        this.a = gra0;
        this.b = z;
        this.c = v;
        this.d = bdsf0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dnj)object0), "$this$item");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        boolean z = bdrz.b(this.a) != bdqm.c;
        bdsa.i(bdtv.a(hfc.e, z), (z ? 16.0f : 0.0f), gzf.e(0xFDB07D2A, new bdrs(this.b, z, this.c, this.d, this.a), ((goz)object1)), ((goz)object1), 0xC00, 2);
        return ibom.a;
    }
}

