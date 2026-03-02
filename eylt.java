import com.google.android.gms.trustagent.activeunlock.primary.ui.authentication.AuthenticationFragment;
import dagger.android.AndroidInjector;

final class eylt implements AndroidInjector {
    private final eymy a;

    public eylt(eymy eymy0) {
        this.a = eymy0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        AuthenticationFragment authenticationFragment0 = (AuthenticationFragment)object0;
        authenticationFragment0.a = exeg.a();
        authenticationFragment0.b = (eyet)this.a.aP.get();
        authenticationFragment0.c = new eynd();
    }
}

