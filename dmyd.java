final class dmyd implements ibtx {
    final dmyx a;
    final hkhr b;
    final boolean c;

    public dmyd(dmyx dmyx0, hkhr hkhr0, boolean z) {
        this.a = dmyx0;
        this.b = hkhr0;
        this.c = z;
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
        this.a.Q(this.b, this.c, ((goz)object1), 0);
        return ibom.a;
    }
}

