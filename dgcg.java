import android.accounts.Account;

final class dgcg extends ibsl implements ibtw {
    final dgcp a;
    final Account b;
    final dcpv c;

    public dgcg(dgcp dgcp0, Account account0, dcpv dcpv0, ibrl ibrl0) {
        this.a = dgcp0;
        this.b = account0;
        this.c = dcpv0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgcg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dgcg(this.a, this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return this.a.e.e(this.b, this.c);
    }
}

