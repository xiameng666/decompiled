import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class ebqh implements AndroidInjector {
    private final domv a;

    public ebqh(domv domv0) {
        this.a = domv0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebyv ebyv0 = (ebyv)object0;
        ebyv0.d = dmgy.a();
        ebyv0.e = this.a.h();
        fich fich0 = this.a.k();
        Preconditions.e(fich0);
        ebyv0.f = fich0;
    }
}

