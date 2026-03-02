import android.accounts.Account;

final class cbts extends ibsl implements ibtw {
    int a;
    final cbuo b;

    public cbts(cbuo cbuo0, ibrl ibrl0) {
        this.b = cbuo0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbts)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbts(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            cbuo cbuo0 = this.b;
            Account account0 = cbuo0.d;
            if(account0 != null) {
                String s = account0.name;
                ibuq.e(s, "name");
                this.a = 1;
                if(cbuo0.N(s, this) == object1) {
                    return object1;
                }
            }
        }
        return ibom.a;
    }
}

