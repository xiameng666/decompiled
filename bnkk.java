import android.accounts.Account;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

public final class bnkk implements Factory {
    private final Provider a;
    private final Provider b;

    public bnkk(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public final gtdj a() {
        return bnkk.b(((gpgz)this.a.get()), ((Account)((InstanceFactory)this.b).a));
    }

    public static gtdj b(gpgz gpgz0, Account account0) {
        iakr iakr0 = gpgz0.a(gtez.t);
        gtdj gtdj0 = (gtdj)gtdj.f(new gtdi(), iakr0);
        String s = hojd.c();
        gtdj gtdj1 = (gtdj)gtdj0.q(gpho.a, s);
        gpig gpig0 = gpig.b();
        gtdj gtdj2 = (gtdj)gtdj1.q(gpji.g, gpig0);
        return account0 == null || gfta.c(account0.name) ? ((gtdj)gtdj2.q(gphs.a, new gphs("no-account", "google"))) : ((gtdj)gtdj2.q(gphs.a, new gphs(account0.name, "google")));
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

