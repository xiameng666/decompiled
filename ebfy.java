import dagger.android.AndroidInjector;
import j..util.Optional;

final class ebfy implements AndroidInjector {
    private final dola a;

    public ebfy(dola dola0) {
        this.a = dola0;
    }

    final dtrw a() {
        return new dtrw(dlnj.a(), dole.b(this.a), dmgy.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebgx ebgx0 = (ebgx)object0;
        ebgx0.b = this.a();
        dtpl dtpl0 = new dtpl(dolc.b(this.a), dmhh.b(dlnj.a(), dolf.b(this.a), dole.b(this.a), dmgy.a(), null, Optional.empty()), dxei.b(dlnj.a()), new dmkl(dlnj.a()));
        dtrw dtrw0 = this.a();
        ebgx0.c = new ebgp(bbnk.a, dtpl0, dtrw0);
    }
}

