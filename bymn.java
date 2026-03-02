final class bymn implements ibtx {
    public static final bymn a;

    static {
        bymn.a = new bymn();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dnj)object0), "$this$item");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        byml.b(isq.c(0x7F1529CA, ((goz)object1)), null, ((goz)object1), 0, 2);  // string:save_your_document "Save your document?"
        return ibom.a;
    }
}

