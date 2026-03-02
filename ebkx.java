import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class ebkx implements AndroidInjector {
    private final domv a;

    public ebkx(domv domv0) {
        this.a = domv0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebts ebts0 = (ebts)object0;
        ebts0.i = dxei.b(this.a.a());
        ebts0.d = eash.a();
        ebts0.e = dmgy.a();
        ebts0.f = new bblp(0x7FFFFFFF, 9);
        ebts0.g = this.a.h();
        fich fich0 = this.a.k();
        Preconditions.e(fich0);
        ebts0.h = fich0;
    }
}

