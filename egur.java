import android.accounts.Account;
import j..util.Objects;

final class egur implements gmbg {
    final efyq a;
    final Account b;
    final eguv c;

    public egur(eguv eguv0, efyq efyq0, Account account0) {
        this.a = efyq0;
        this.b = account0;
        Objects.requireNonNull(eguv0);
        this.c = eguv0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.c.q.ii(Boolean.valueOf(false));
        a.ae(eguv.a.j(), "Could not set remove result for given account.", throwable0);
        this.c.i.ii(Integer.valueOf(1));
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        this.c.q.ii(Boolean.valueOf(true));
        this.c.o(this.a, this.b);
    }
}

