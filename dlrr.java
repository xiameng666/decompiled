final class dlrr implements ibtx {
    public static final dlrr a;

    static {
        dlrr.a = new dlrr();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dnj)object0), "$this$item");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        ftzd.a(new fryr(0x7F152057), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, fpu.d(((goz)object1)).h, ((goz)object1), 0, 0, 0x1FFFE);  // string:pay_pix_why_link_account "Why link your account?"
        dlv.a(dls.e(hfc.e, 8.0f), ((goz)object1));
        return ibom.a;
    }
}

