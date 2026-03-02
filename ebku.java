import android.accounts.Account;
import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class ebku implements AndroidInjector {
    private final domv a;
    private final eefy b;
    private final dola c;

    public ebku(dola dola0, eefy eefy0, domv domv0) {
        this.a = domv0;
        this.b = eefy0;
        this.c = dola0;
    }

    final eefw a() {
        return new eefw(fcfo.d(this.a.a()), this.b.a);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebsr ebsr0 = (ebsr)object0;
        ebsr0.a = dmgy.a();
        Context context0 = this.a.a();
        frii frii0 = this.a.n();
        Preconditions.e(frii0);
        ebsr0.b = new dxyx(context0, frii0);
        ebsr0.c = easl.a();
        ebsr0.d = bbnk.a;
        ebsr0.e = new bblp(0x7FFFFFFF, 9);
        ebsr0.f = this.a();
        eefw eefw0 = this.a();
        Account account0 = dolc.b(this.c);
        this.a.a();
        new dmgi(dolf.b(this.c), dmgy.a());
        Preconditions.e(this.a.b());
        ebsr0.g = new dzrd(eefw0, account0);
    }
}

