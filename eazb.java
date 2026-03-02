import android.accounts.Account;

final class eazb extends ibsl implements ibtw {
    int a;
    final eazd b;

    public eazb(eazd eazd0, ibrl ibrl0) {
        this.b = eazd0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eazb)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eazb(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        eazd eazd0 = this.b;
        dqhb dqhb0 = eazd0.f;
        Account account0 = null;
        if(dqhb0 == null) {
            ibuq.j("walletOnboardingStatusApi");
            dqhb0 = null;
        }
        Account account1 = eazd0.b;
        if(account1 == null) {
            ibuq.j("account");
        }
        else {
            account0 = account1;
        }
        this.a = 1;
        Object object2 = dqhb.c(dqhb0, account0, this);
        return object2 == object1 ? object1 : object2;
    }
}

