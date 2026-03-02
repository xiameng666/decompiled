import com.google.android.gms.trustagent.activeunlock.primary.ui.authentication.ScreenLockSetUpFragment;
import dagger.android.AndroidInjector;

final class eymk implements AndroidInjector {
    private final eymy a;

    public eymk(eymy eymy0) {
        this.a = eymy0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ScreenLockSetUpFragment screenLockSetUpFragment0 = (ScreenLockSetUpFragment)object0;
        screenLockSetUpFragment0.a = new eynd();
        screenLockSetUpFragment0.b = (eyet)this.a.aP.get();
    }
}

