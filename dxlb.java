final class dxlb implements ibtx {
    final dxlm a;

    public dxlb(dxlm dxlm0) {
        this.a = dxlm0;
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
        this.a.D(((goz)object1), 0);
        return ibom.a;
    }
}

