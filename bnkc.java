import android.accounts.Account;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

public final class bnkc implements Factory {
    private final Provider a;
    private final Provider b;

    public bnkc(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public final hnos a() {
        return bnkc.b(((gpgz)this.a.get()), ((Account)((InstanceFactory)this.b).a));
    }

    public static hnos b(gpgz gpgz0, Account account0) {
        hnos hnos0 = hnot.a(gpgz0.a(hnpg.n));
        String s = hojd.a.b().c();
        hnos hnos1 = (hnos)hnos0.q(gpho.a, s);
        gpie gpie0 = new gpie(null);
        gpie0.b(new ggoh(hojd.a.b().d()));
        gpig gpig0 = new gpig(gpie0.a());
        hnos hnos2 = (hnos)hnos1.q(gpji.g, gpig0);
        return account0 == null || gfta.c(account0.name) ? ((hnos)hnos2.q(gphs.a, new gphs("no-account", "google"))) : ((hnos)hnos2.q(gphs.a, new gphs(account0.name, "google")));
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

