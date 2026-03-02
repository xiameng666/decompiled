import com.google.android.gms.trustagent.activeunlock.primary.ui.authentication.AuthenticationFragment;
import dagger.android.AndroidInjector;

final class eykj implements AndroidInjector {
    private final eylm a;

    public eykj(eylm eylm0) {
        this.a = eylm0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        AuthenticationFragment authenticationFragment0 = (AuthenticationFragment)object0;
        authenticationFragment0.a = exeg.a();
        authenticationFragment0.b = (eyet)this.a.aN.get();
        authenticationFragment0.c = new eynd();
    }
}

