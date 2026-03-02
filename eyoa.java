import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.trustagent.activeunlock.primary.ui.discovereddevice.DiscoveredDeviceListFragment;

public final class eyoa implements View.OnClickListener {
    public final DiscoveredDeviceListFragment a;

    public eyoa(DiscoveredDeviceListFragment discoveredDeviceListFragment0) {
        this.a = discoveredDeviceListFragment0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        DiscoveredDeviceListFragment discoveredDeviceListFragment0 = this.a;
        int v = discoveredDeviceListFragment0.aj - 1;
        if(discoveredDeviceListFragment0.aj != 0) {
            switch(v) {
                case 0: {
                    icbb.b(lpt.a(discoveredDeviceListFragment0.getViewLifecycleOwner()), null, null, new eyok(discoveredDeviceListFragment0, null), 3);
                    return;
                }
                case 1: {
                    discoveredDeviceListFragment0.H();
                    return;
                }
                default: {
                    throw new ibnq();
                }
            }
        }
        throw null;
    }
}

