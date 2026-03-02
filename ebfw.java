import dagger.android.AndroidInjector;
import j..util.Optional;

final class ebfw implements AndroidInjector {
    private final dola a;

    public ebfw(dola dola0) {
        this.a = dola0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebgt ebgt0 = (ebgt)object0;
        ebgt0.b = new dtsh(dlnj.a(), dole.b(this.a), dmgy.a());
        ebgt0.c = new dtpl(dolc.b(this.a), dmhh.b(dlnj.a(), dolf.b(this.a), dole.b(this.a), dmgy.a(), null, Optional.empty()), dxei.b(dlnj.a()), new dmkl(dlnj.a()));
    }
}

