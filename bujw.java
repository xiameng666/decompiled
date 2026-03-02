import android.accounts.Account;

final class bujw extends ibsl implements ibtw {
    int a;
    final bujx b;
    final Account c;

    public bujw(bujx bujx0, Account account0, ibrl ibrl0) {
        this.b = bujx0;
        this.c = account0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bujw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bujw(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        this.a = 1;
        Object object2 = this.b.b(this.c, this);
        return object2 == object1 ? object1 : object2;
    }
}

