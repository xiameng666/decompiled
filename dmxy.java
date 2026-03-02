final class dmxy implements ibtx {
    final dmyx a;
    final boolean b;
    final hkhr c;
    final gui d;

    public dmxy(dmyx dmyx0, boolean z, hkhr hkhr0, gui gui0) {
        this.a = dmyx0;
        this.b = z;
        this.c = hkhr0;
        this.d = gui0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dld)object0), "contentPadding");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dld)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        dig.a(null, null, false, gzf.e(0x5885BDAD, new dmxx(this.a, ((dld)object0), this.b, this.c, this.d), ((goz)object1)), ((goz)object1), 0xC00, 7);
        return ibom.a;
    }
}

