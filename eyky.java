import com.google.android.gms.trustagent.activeunlock.primary.ui.authentication.ScreenLockSetUpFragment;
import dagger.android.AndroidInjector;

final class eyky implements AndroidInjector {
    private final eylm a;

    public eyky(eylm eylm0) {
        this.a = eylm0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ScreenLockSetUpFragment screenLockSetUpFragment0 = (ScreenLockSetUpFragment)object0;
        screenLockSetUpFragment0.a = new eynd();
        screenLockSetUpFragment0.b = (eyet)this.a.aN.get();
    }
}

