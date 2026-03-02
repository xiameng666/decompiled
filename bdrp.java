final class bdrp implements ibtx {
    final boolean a;
    final gra b;
    final long c;
    final bdsf d;

    public bdrp(boolean z, gra gra0, long v, bdsf bdsf0) {
        this.a = z;
        this.b = gra0;
        this.c = v;
        this.d = bdsf0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        boolean z = false;
        int v = ((Number)object2).intValue();
        ibuq.f(((dnj)object0), "$this$item");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        if(this.a && bdrz.b(this.b) != bdqm.b) {
            z = true;
        }
        bdsa.i(bdtv.a(hfc.e, z), (z ? 16.0f : 0.0f), gzf.e(902155372, new bdro(z, this.c, this.d, this.b), ((goz)object1)), ((goz)object1), 0xC00, 2);
        return ibom.a;
    }
}

