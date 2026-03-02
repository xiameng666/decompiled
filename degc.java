final class degc implements ibtx {
    public static final degc a;

    static {
        degc.a = new degc();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((fzm)object0), "it");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((fzm)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        ddhr.b(((fzm)object0), ((goz)object1), v & 14);
        return ibom.a;
    }
}

