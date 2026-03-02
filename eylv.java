import com.google.android.gms.trustagent.activeunlock.primary.ui.discovereddevice.DiscoveredDeviceListFragment;
import dagger.android.AndroidInjector;

final class eylv implements AndroidInjector {
    private final eymy a;

    public eylv(eymy eymy0) {
        this.a = eymy0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        DiscoveredDeviceListFragment discoveredDeviceListFragment0 = (DiscoveredDeviceListFragment)object0;
        discoveredDeviceListFragment0.b = (eyet)this.a.aP.get();
        discoveredDeviceListFragment0.c = new eynd();
        discoveredDeviceListFragment0.d = new eyzy(this.a.a());
        discoveredDeviceListFragment0.ag = this.a.c();
    }
}

