import dagger.android.AndroidInjector;
import j..util.Optional;

final class ebgi implements AndroidInjector {
    private final dola a;

    public ebgi(dola dola0) {
        this.a = dola0;
    }

    final dtrw a() {
        return new dtrw(dlnj.a(), dole.b(this.a), dmgy.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebip ebip0 = (ebip)object0;
        ebip0.b = bbnk.a;
        ebip0.c = dpsv.a(dlnj.a(), dolc.b(this.a));
        dtpl dtpl0 = new dtpl(dolc.b(this.a), dmhh.b(dlnj.a(), dolf.b(this.a), dole.b(this.a), dmgy.a(), null, Optional.empty()), dxei.b(dlnj.a()), new dmkl(dlnj.a()));
        dtrw dtrw0 = this.a();
        ebip0.d = new ebgp(bbnk.a, dtpl0, dtrw0);
        ebip0.e = easn.a();
        ebip0.f = this.a();
    }
}

