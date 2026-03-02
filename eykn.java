import com.google.android.gms.trustagent.activeunlock.primary.ui.enrolleddevice.EnrolledDeviceListFragment;
import dagger.android.AndroidInjector;

final class eykn implements AndroidInjector {
    private final eylm a;

    public eykn(eylm eylm0) {
        this.a = eylm0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        EnrolledDeviceListFragment enrolledDeviceListFragment0 = (EnrolledDeviceListFragment)object0;
        enrolledDeviceListFragment0.a = new eyec();
        enrolledDeviceListFragment0.b = (eyet)this.a.aN.get();
        enrolledDeviceListFragment0.c = new eyzy(this.a.a());
        enrolledDeviceListFragment0.d = new eynd();
    }
}

