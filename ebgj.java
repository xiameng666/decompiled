import dagger.android.AndroidInjector;
import j..util.Optional;

final class ebgj implements AndroidInjector {
    private final dola a;

    public ebgj(dola dola0) {
        this.a = dola0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebir ebir0 = (ebir)object0;
        ebir0.b = new dtsh(dlnj.a(), dole.b(this.a), dmgy.a());
        ebir0.c = new dtpl(dolc.b(this.a), dmhh.b(dlnj.a(), dolf.b(this.a), dole.b(this.a), dmgy.a(), null, Optional.empty()), dxei.b(dlnj.a()), new dmkl(dlnj.a()));
        ebir0.d = donc.a();
    }
}

