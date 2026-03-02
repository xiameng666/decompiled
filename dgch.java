import android.accounts.Account;

final class dgch extends ibsl implements ibtw {
    final dgcp a;
    final Account b;

    public dgch(dgcp dgcp0, Account account0, ibrl ibrl0) {
        this.a = dgcp0;
        this.b = account0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgch)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dgch(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        dcpu dcpu0 = new dcpu();
        dcpu0.b = 1;
        dcpu0.a = 13;
        dcpv dcpv0 = new dcpv(dcpu0);
        return this.a.e.j(this.b, dcpv0);
    }
}

