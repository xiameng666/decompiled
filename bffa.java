import android.accounts.Account;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class bffa implements Factory {
    private final Provider a;
    private final Provider b;

    public bffa(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public final grrq a() {
        gpig gpig0;
        gpgz gpgz0 = ((bfez)this.a).a();
        Account account0 = ((bcyy)this.b).a();
        iakr iakr0 = gpgz0.a(grtc.E);
        grrq grrq0 = (grrq)grrq.k(new grrp(), iakr0);
        iakp iakp0 = gpji.g;
        if(hsbc.a.b().a()) {
            gpie gpie0 = new gpie(null);
            gpie0.b(new ggoh(hsap.a.b().b()));
            gpig0 = new gpig(gpie0.a());
        }
        else {
            gpig0 = gpig.b();
        }
        grrq grrq1 = (grrq)grrq0.q(iakp0, gpig0);
        gphs gphs0 = new gphs(account0.name, "google");
        return (grrq)grrq1.q(gphs.a, gphs0);
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

