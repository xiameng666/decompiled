import android.accounts.Account;
import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class dwcp implements AndroidInjector {
    private final domv a;
    private final dolg b;

    public dwcp(dolg dolg0, domv domv0) {
        this.a = domv0;
        this.b = dolg0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dwfo dwfo0 = (dwfo)object0;
        dwfo0.d = this.a.a();
        dwfo0.ag = this.b.d();
        Context context0 = this.a.a();
        Account account0 = this.b.a();
        String s = dmgy.a();
        frii frii0 = this.a.n();
        Preconditions.e(frii0);
        dwfo0.ah = new dsio(dsiq.b(context0, account0, s, frii0));
        dwfo0.ai = this.a.h();
        dwfo0.aj = new bawz(this.a.a());
        domj domj0 = this.a.b();
        Preconditions.e(domj0);
        dwfo0.ak = domj0;
        dwfo0.aq = new dwrf(edox.a());
        dwfo0.ap = new dwdi();
    }
}

