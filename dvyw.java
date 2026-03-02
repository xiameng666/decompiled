import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class dvyw implements AndroidInjector {
    private final domv a;

    public dvyw(domv domv0) {
        this.a = domv0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvyy dvyy0 = (dvyy)object0;
        this.a.a();
        dvyy0.a = new dvfw(new dmgk(dmgy.a()));
        fhwk fhwk0 = this.a.i();
        Preconditions.e(fhwk0);
        dvyy0.b = fhwk0;
    }
}

