final class dmzm implements ibtx {
    public static final dmzm a;

    static {
        dmzm.a = new dmzm();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$TextButton");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        fiuk.b(isq.c(0x7F1523D6, ((goz)object1)), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ((goz)object1), 0, 0, 0x3FFFE);  // string:pay_wallet_fops_delete_payment_method_dialog_button "Remove"
        return ibom.a;
    }
}

