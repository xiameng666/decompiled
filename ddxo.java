final class ddxo implements ibtx {
    final ibtx a;

    public ddxo(ibtx ibtx0) {
        this.a = ibtx0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dld)object0), "innerPadding");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dld)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hfc hfc0 = dla.c(dls.v(hfc.e), ((dld)object0));
        gze gze0 = gzf.e(0x63356D0A, new ddxn(this.a), ((goz)object1));
        dig.a(hfc0, hei.b, false, gze0, ((goz)object1), 0xC30, 4);
        return ibom.a;
    }
}

