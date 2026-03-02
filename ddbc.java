import android.accounts.Account;

final class ddbc implements ibtw {
    final Account a;
    final float b;

    public ddbc(Account account0, float f) {
        this.a = account0;
        this.b = f;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        String s = this.a.name;
        ibuq.e(s, "name");
        ddbf.e(s, ddhw.a(((goz)object0)).g, ddhw.a(((goz)object0)).f, this.b, ((goz)object0), 0);
        return ibom.a;
    }
}

