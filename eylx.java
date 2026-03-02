import com.google.android.gms.trustagent.activeunlock.primary.ui.enrolleddevice.EnrolledDeviceListFragment;
import dagger.android.AndroidInjector;

final class eylx implements AndroidInjector {
    private final eymy a;

    public eylx(eymy eymy0) {
        this.a = eymy0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        EnrolledDeviceListFragment enrolledDeviceListFragment0 = (EnrolledDeviceListFragment)object0;
        enrolledDeviceListFragment0.a = new eyec();
        enrolledDeviceListFragment0.b = (eyet)this.a.aP.get();
        enrolledDeviceListFragment0.c = new eyzy(this.a.a());
        enrolledDeviceListFragment0.d = new eynd();
    }
}

