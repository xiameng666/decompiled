import dagger.android.AndroidInjector;
import j..util.Optional;

final class ebgh implements AndroidInjector {
    private final dpss a;
    private final dola b;

    public ebgh(dola dola0, dpss dpss0) {
        this.a = dpss0;
        this.b = dola0;
    }

    static final azts a() {
        return dxei.b(dlnj.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebim ebim0 = (ebim)object0;
        ebim0.c = new dtrf(bxuw.a(dlnj.a()), this.a.a(), dlnj.a(), new bblp(0x7FFFFFFF, 10), new dtze(dlnj.a(), ebgh.a()), dolf.b(this.b), new dtrw(dlnj.a(), dole.b(this.b), dmgy.a()), new dtpl(dolc.b(this.b), dmhh.b(dlnj.a(), dolf.b(this.b), dole.b(this.b), dmgy.a(), null, Optional.empty()), ebgh.a(), new dmkl(dlnj.a())));
        ebim0.d = donc.a();
    }
}

