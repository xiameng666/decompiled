import com.google.android.gms.auth.api.credentials.nextgen.database.VerifiableCredentialDatabase;
import com.google.android.gms.chimera.modules.auth.credentials.base.AppContextProvider;
import j..util.Collection.-EL;
import java.util.List;

public final class ahev implements glzm {
    public static final bxrs a;
    public final bxuv b;
    private final ahbs c;

    static {
        ahev.a = new bxrs(((gful_cronetEngineProvider)new ahep()));
    }

    public ahev() {
        this.b = bxuw.a(AppContextProvider.a());
        this.c = VerifiableCredentialDatabase.u(AppContextProvider.a()).v();
    }

    @Override  // glzm
    public final gmcd a() {
        List list0 = this.c.a();
        ggdy ggdy0 = new ggdy();
        for(Object object0: list0) {
            ggdy0.i(ahax.f(((ahbr)object0).b));
        }
        gged_interceptors gged0 = ggdy0.h();
        return bxsy.l(((gged_interceptors)Collection.-EL.stream(gged0).map(new aheq()).collect(ggaf.a)), new aher()).k(new ahes(list0, gged0)).n(new ahet(this)).e(new bxlw(cjuh.class).d(0x6F34)).k(new aheu());
    }
}

