import com.google.android.gms.pay.pass.common.template.defaults.DefaultPassInfoCallback;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class dvoq implements AndroidInjector {
    private final domv a;

    public dvoq(domv domv0) {
        this.a = domv0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvpd dvpd0 = (dvpd)object0;
        dvpd0.a = new fuok();
        dvpd0.b = new DefaultPassInfoCallback();
        dvpd0.c = new dspv();
        dvpd0.d = new dspu();
        dvpd0.ag = new fshk();
        fhwk fhwk0 = this.a.i();
        Preconditions.e(fhwk0);
        dvpd0.ah = fhwk0;
    }
}

