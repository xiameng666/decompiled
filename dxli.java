final class dxli implements ibtx {
    final dxlm a;

    public dxli(dxlm dxlm0) {
        this.a = dxlm0;
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
        hfc hfc0 = iqn.a(dla.c(hfc.e, ((dld)object0)), "Content");
        this.a.A(hfc0, ((goz)object1), 0);
        return ibom.a;
    }
}

