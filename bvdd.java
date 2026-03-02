final class bvdd implements ibtx {
    final ibtx a;

    public bvdd(ibtx ibtx0) {
        this.a = ibtx0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$RegularFixedScaffold");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dim)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        ibtx ibtx0 = this.a;
        if(ibtx0 != null) {
            dlv.a(dla.j(hfc.e, 0.0f, cltw.f, 0.0f, 0.0f, 13), ((goz)object1));
            ibtx0.a(((dim)object0), ((goz)object1), Integer.valueOf(v & 14));
        }
        return ibom.a;
    }
}

