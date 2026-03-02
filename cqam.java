import android.accounts.Account;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

public final class cqam implements Factory {
    private final Provider a;
    private final Provider b;
    private final Provider c;
    private final Provider d;

    public cqam(Provider provider0, Provider provider1, Provider provider2, Provider provider3) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        gful_cronetEngineProvider gful0 = ((cqdu)this.b).a();
        frhi frhi0 = (frhi)this.c.get();
        frii frii0 = (frii)this.d.get();
        frie frie0 = frif.a();
        frie0.h(new frjp(frhi0));
        frie0.e(((MessageLite)fkvu.a));
        frce frce0 = (frce)gful0.mr();
        frce0.c(((Account)((InstanceFactory)this.a).a));
        frce0.e("profilesync/public/profile_info.pb");
        frie0.f(frce0.a());
        return new fkrk(frii0.a(frie0.a()));
    }
}

