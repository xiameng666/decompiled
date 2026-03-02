import android.os.Bundle;
import com.google.android.gms.trustagent.activeunlock.primary.ui.discovereddevice.DiscoveredDeviceListFragment;

public final class eyoi extends eyui {
    final DiscoveredDeviceListFragment a;

    public eyoi(DiscoveredDeviceListFragment discoveredDeviceListFragment0, ibnn ibnn0) {
        this.a = discoveredDeviceListFragment0;
        super(discoveredDeviceListFragment0, ibnn0);
    }

    @Override  // eyui
    protected final void a() {
        ((nry)this.a.F().a(this.a)).i(0x7F0B0AD9);  // id:action_global_setup_complete_fragment
    }

    @Override  // eyui
    protected final void b() {
        Bundle bundle0 = jyu.a(new ibns[]{new ibns(this.a.getString(0x7F1500FB), this.a.E().b())});  // string:action_arg_device_to_be_set_up "deviceToBeSetUp"
        ((nry)this.a.F().a(this.a)).j(0x7F0B0AFB, bundle0);  // id:action_to_associated_device_screen_lock_set_up_fragment
    }
}

