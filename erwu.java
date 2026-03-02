final class erwu implements ibtx {
    public static final erwu a;

    static {
        erwu.a = new erwu();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        boolean z = ((Boolean)object0).booleanValue();
        int v = ((Number)object2).intValue();
        if((v & 6) == 0) {
            v |= (((goz)object1).Y(z) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        clwl.f(z, ((goz)object1), v & 14 | 0x30);
        return ibom.a;
    }
}

