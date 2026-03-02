import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class dxgd implements AndroidInjector {
    private final domv a;

    public dxgd(domv domv0) {
        this.a = domv0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dxhl dxhl0 = (dxhl)object0;
        fhwk fhwk0 = this.a.i();
        Preconditions.e(fhwk0);
        dxhl0.a = fhwk0;
        dxhl0.b = this.a.g();
        dxhl0.c = this.a.j();
        dxhl0.d = new dxhm();
    }
}

