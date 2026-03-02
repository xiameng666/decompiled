import android.accounts.Account;
import j..util.Objects;

final class egus implements gmbg {
    final eguv a;

    public egus(eguv eguv0) {
        Objects.requireNonNull(eguv0);
        this.a = eguv0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        a.ae(eguv.a.j(), "Could not login to webview for trash", throwable0);
        this.a.i.ii(Integer.valueOf(0));
    }

    @Override  // gmbg
    public final void b(Object object0) {
        this.a.o.ii(((Account)object0));
    }
}

