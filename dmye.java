final class dmye implements ibtx {
    final dmyx a;
    final dmyy b;

    public dmye(dmyx dmyx0, dmyy dmyy0) {
        this.a = dmyx0;
        this.b = dmyy0;
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
        dmyx.W(this.a, this.b, ((goz)object1));
        return ibom.a;
    }
}

