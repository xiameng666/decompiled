import dagger.android.AndroidInjector;
import j..util.Optional;

final class ebfz implements AndroidInjector {
    private final dola a;

    public ebfz(dola dola0) {
        this.a = dola0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebgz ebgz0 = (ebgz)object0;
        ebgz0.b = new dtsh(dlnj.a(), dole.b(this.a), dmgy.a());
        ebgz0.c = new dtpl(dolc.b(this.a), dmhh.b(dlnj.a(), dolf.b(this.a), dole.b(this.a), dmgy.a(), null, Optional.empty()), dxei.b(dlnj.a()), new dmkl(dlnj.a()));
    }
}

