import android.accounts.Account;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import j..util.Objects;

final class alam implements gmbg {
    final String a;

    public alam(alao alao0, String s) {
        this.a = s;
        Objects.requireNonNull(alao0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        alao.a.g("Failed on updateAppStreamingAccessState", throwable0, new Object[0]);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        alao.a.h("updateAppStreamingAccessState success", new Object[0]);
        akwr.a(AppContextProvider.a()).b(new Account(this.a, "com.google"), gqus.n, true);
    }
}

