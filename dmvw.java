final class dmvw implements ibtx {
    final String a;

    public dmvw(String s) {
        this.a = s;
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
        fuar.f(null, new fuat(new fryr(0x7F15238E), new fryu(this.a), null, null, 0, null, null, null, null, false, false, false, null, false, 0x3FFC), ((goz)object1), 0x40, 1);  // string:pay_wallet_bank_account_branch_code "Branch code"
        return ibom.a;
    }
}

