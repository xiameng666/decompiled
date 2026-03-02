import com.google.android.gms.tapandpay.keyguard.KeyguardSecurityInfoChimeraActivity;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

public final class etlu implements AndroidInjector {
    private final domv a;

    public etlu(domv domv0) {
        this.a = domv0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        KeyguardSecurityInfoChimeraActivity keyguardSecurityInfoChimeraActivity0 = (KeyguardSecurityInfoChimeraActivity)object0;
        keyguardSecurityInfoChimeraActivity0.N = new fsbq(new fsch(new fscu(this.a.a())), this.a.a());
        foeg foeg0 = this.a.m();
        Preconditions.e(foeg0);
        keyguardSecurityInfoChimeraActivity0.O = foeg0;
        fhwk fhwk0 = this.a.i();
        Preconditions.e(fhwk0);
        keyguardSecurityInfoChimeraActivity0.k = fhwk0;
    }
}

