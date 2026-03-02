import android.accounts.Account;

final class askl extends ibsl implements ibtw {
    int a;
    final Account b;
    final askr c;

    public askl(Account account0, askr askr0, ibrl ibrl0) {
        this.b = account0;
        this.c = askr0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((askl)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new askl(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            Account account0 = this.b;
            if(account0 == null) {
                this.a = 2;
                if(this.c.d.b(this) == object1) {
                    return object1;
                }
            }
            else {
                this.a = 1;
                if(this.c.d.c(account0, this) == object1) {
                    return object1;
                }
            }
        }
        return ibom.a;
    }
}

