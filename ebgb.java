import dagger.android.AndroidInjector;
import j..util.Optional;

public final class ebgb implements AndroidInjector {
    private final dola a;

    public ebgb(dola dola0) {
        this.a = dola0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebii ebii0 = (ebii)object0;
        ebii0.b = new dtsh(dlnj.a(), dole.b(this.a), dmgy.a());
        ebii0.c = new dtpl(dolc.b(this.a), dmhh.b(dlnj.a(), dolf.b(this.a), dole.b(this.a), dmgy.a(), null, Optional.empty()), dxei.b(dlnj.a()), new dmkl(dlnj.a()));
    }
}

