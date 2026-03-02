import android.content.Context;
import com.google.android.gms.chimera.modules.googlesettings.AppContextProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class buxf implements Factory {
    private final Provider a;
    private final Provider b;
    private final Provider c;
    private final Provider d;

    public buxf(Provider provider0, Provider provider1, Provider provider2, Provider provider3) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        Context context0 = AppContextProvider.b();
        ibuq.e(context0, "getApplicationContext(...)");
        Preconditions.f(context0);
        foeg foeg0 = (foeg)this.a.get();
        fnlf fnlf0 = (fnlf)this.b.get();
        fnfm fnfm0 = (fnfm)this.c.get();
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        ficq ficq0 = (ficq)this.d.get();
        ibuq.f(foeg0, "googleOwnersProvider");
        ibuq.f(fnlf0, "accountsModel");
        ibuq.f(fnfm0, "converter");
        ibuq.f(ficq0, "vePrimitives");
        fnld fnld0 = fnle.a(context0);
        fnld0.h(fnfm0);
        fnld0.i(fnlf0);
        fnld0.d = new fnub(context0, foeg0);
        fnld0.e = new fobg(fnfm0, context0);
        fnld0.k(bblp0);
        fnld0.l(ficq0);
        fnld0.j(new fodt("com.google.android.gms.googlesettings"));
        return fnld0.a();
    }
}

