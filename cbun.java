import android.accounts.Account;

final class cbun extends ibsl implements ibtw {
    int a;
    final cbuo b;

    public cbun(cbuo cbuo0, ibrl ibrl0) {
        this.b = cbuo0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbun)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbun(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            cbte cbte0 = this.b.y();
            this.a = 1;
            object0 = cbte0.i(this);
            if(object0 == object1) {
                return object1;
            }
        }
        if(((Number)object0).intValue() > 1) {
            Account account0 = this.b.d;
            ibuq.d(account0, "null cannot be cast to non-null type android.accounts.Account");
            String s = account0.name;
            ibuq.e(s, "name");
            this.b.ac(s);
        }
        return ibom.a;
    }
}

