import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class dvop implements AndroidInjector {
    private final dolg a;
    private final domv b;

    public dvop(dolg dolg0, domv domv0) {
        this.a = dolg0;
        this.b = domv0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvpa dvpa0 = (dvpa)object0;
        dvpa0.ah = this.a.a();
        dvpa0.ai = new fuok();
        fhwk fhwk0 = this.b.i();
        Preconditions.e(fhwk0);
        dvpa0.aj = fhwk0;
        dvpa0.ak = new dvlr(this.b.h(), this.a.d());
        dvpa0.al = new dspu();
        dvpa0.am = new fshk();
    }
}

