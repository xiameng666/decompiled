import android.accounts.Account;

final class cbsz extends ibsl implements ibtw {
    int a;
    final cbte b;
    final Account c;

    public cbsz(cbte cbte0, Account account0, ibrl ibrl0) {
        this.b = cbte0;
        this.c = account0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbsz)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbsz(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        ibuq.c(this.c);
        this.a = 1;
        Object object2 = this.b.h(this.c, this);
        return object2 == object1 ? object1 : object2;
    }
}

