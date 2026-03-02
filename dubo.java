import com.google.android.gms.pay.pass.common.template.defaults.DefaultPassInfoCallback;
import dagger.android.AndroidInjector;

final class dubo implements AndroidInjector {
    private final dolg a;

    public dubo(dolg dolg0) {
        this.a = dolg0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        duct duct0 = (duct)object0;
        duct0.a = this.a.a();
        duct0.b = new dspu();
        duct0.c = new DefaultPassInfoCallback();
        duct0.d = new dspv();
        duct0.ag = new fshk();
    }
}

