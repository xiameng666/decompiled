import android.accounts.Account;
import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import j..util.Optional;

final class eayk implements AndroidInjector {
    private final dola a;
    private final domv b;
    private final dmgr c;
    private final domq d;
    private final domw e;

    public eayk(dola dola0, dmgr dmgr0, domw domw0, domv domv0, domq domq0) {
        this.a = dola0;
        this.b = domv0;
        this.c = dmgr0;
        this.d = domq0;
        this.e = domw0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        Account account0 = dolc.b(this.a);
        dlmc dlmc0 = new dlmc(this.b.a(), dole.b(this.a), dmgy.a());
        Context context0 = this.b.a();
        azts azts0 = dxei.b(this.b.a());
        etgl etgl0 = new etgl(this.b.a());
        Context context1 = this.b.a();
        String s = dolf.b(this.a);
        String s1 = dole.b(this.a);
        String s2 = dmgy.a();
        fpgc fpgc0 = this.d.d();
        Preconditions.e(fpgc0);
        fpfv fpfv0 = dxim.a(fpgc0, dolc.b(this.a));
        bblp bblp0 = new bblp(1, 10);
        easx easx0 = easq.a();
        dlnm dlnm0 = new dlnm(new acqn(this.b.a()), dolf.b(this.a), dole.b(this.a));
        this.b.a();
        dmgi dmgi0 = new dmgi(dolf.b(this.a), dmgy.a());
        ((ebbu)object0).a = new ecga(account0, dlmc0, context0, azts0, etgl0, new ecgd(dmhh.b(context1, s, s1, s2, this.c.a, Optional.empty()), fpfv0), bblp0, easx0, dlnm0, dmgi0, this.a.c);
    }
}

