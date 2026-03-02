import com.google.android.gms.trustagent.activeunlock.primary.ui.screenlock.AssociatedDeviceScreenLockSetUpFragment;
import dagger.android.AndroidInjector;

final class eylr implements AndroidInjector {
    private final eymy a;

    public eylr(eymy eymy0) {
        this.a = eymy0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        AssociatedDeviceScreenLockSetUpFragment associatedDeviceScreenLockSetUpFragment0 = (AssociatedDeviceScreenLockSetUpFragment)object0;
        associatedDeviceScreenLockSetUpFragment0.a = (eyet)this.a.aP.get();
        associatedDeviceScreenLockSetUpFragment0.b = new eynd();
        associatedDeviceScreenLockSetUpFragment0.c = this.a.c();
    }
}

