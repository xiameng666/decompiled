final class ddzm implements ibtx {
    final ibtx a;

    public ddzm(ibtx ibtx0) {
        this.a = ibtx0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$TwoRowsTopAppBar");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dlp)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        this.a.a(((dlp)object0), ((goz)object1), Integer.valueOf(v & 14));
        dlv.a(dls.o(hfc.e, 12.0f), ((goz)object1));
        return ibom.a;
    }
}

