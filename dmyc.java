final class dmyc implements ibtx {
    final dmyx a;
    final boolean b;

    public dmyc(dmyx dmyx0, boolean z) {
        this.a = dmyx0;
        this.b = z;
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
        this.a.R(this.b, ((goz)object1), 0);
        return ibom.a;
    }
}

