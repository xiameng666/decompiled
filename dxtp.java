import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class dxtp implements AndroidInjector {
    private final domv a;

    public dxtp(domv domv0) {
        this.a = domv0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        fhwk fhwk0 = this.a.i();
        Preconditions.e(fhwk0);
        ((dxva)object0).am = fhwk0;
    }
}

