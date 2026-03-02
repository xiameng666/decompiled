import android.os.PersistableBundle;
import android.os.UserManager;
import com.google.android.gms.kids.settings.download.AccountSeedingPrefetchInitIntentOperation;
import j..util.concurrent.ConcurrentMap.-EL;

public final class cboo extends ibsl implements ibtw {
    int a;
    final AccountSeedingPrefetchInitIntentOperation b;

    public cboo(AccountSeedingPrefetchInitIntentOperation accountSeedingPrefetchInitIntentOperation0, ibrl ibrl0) {
        this.b = accountSeedingPrefetchInitIntentOperation0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cboo)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cboo(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        einq einq0;
        ibom ibom0;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            AccountSeedingPrefetchInitIntentOperation accountSeedingPrefetchInitIntentOperation0 = this.b;
            this.a = 1;
            if(!accountSeedingPrefetchInitIntentOperation0.b.getAndSet(true)) {
                bboh bboh0 = AccountSeedingPrefetchInitIntentOperation.a;
                ((ggtj)bboh0.h()).x("Supervision app flags prefetch started.");
                Object object2 = accountSeedingPrefetchInitIntentOperation0.getSystemService(UserManager.class);
                ibuq.c(object2);
                PersistableBundle persistableBundle0 = ((UserManager)object2).getSeedAccountOptions();
                if(persistableBundle0 == null) {
                    persistableBundle0 = PersistableBundle.EMPTY;
                }
                int v1 = persistableBundle0.getInt("prefetchModuleVersion", -1);
                if(v1 < 0) {
                    ((ggtj)bboh0.j()).x("Couldn\'t find supervision app version in seeded data");
                }
                else {
                    String s = ((UserManager)object2).getSeedAccountName();
                    if(s == null) {
                        s = "";
                    }
                    if(s.length() == 0) {
                        ((ggtj)bboh0.j()).x("No account name present on seed data");
                    }
                    else {
                        ((ggtj)bboh0.h()).P("Prefetching P/H flags for account %s and module version %d", s, v1);
                        gfsx gfsx0 = gfsx.l(s);
                        synchronized(cbbc.class) {
                            einq0 = new einq(accountSeedingPrefetchInitIntentOperation0);
                        }
                        String s1 = (String)gfsx0.f("");
                        if(cbbc.a) {
                            cbbb cbbb0 = new cbbb(einq0, "com.google.android.gms.kids#com.google.android.gms", v1, s1);
                            evql evql0 = (evql)ConcurrentMap.-EL.compute(cbbc.b, "com.google.android.gms.kids#com.google.android.gms#" + v1 + "#" + s1, cbbb0);
                        }
                        else {
                            cbbc.a(einq0, "com.google.android.gms.kids#com.google.android.gms", v1, s1);
                        }
                    }
                }
            }
            ibom0 = ibom.a;
            if(ibom0 == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

