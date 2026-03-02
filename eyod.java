import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.trustagent.activeunlock.primary.ui.discovereddevice.DiscoveredDeviceListFragment;

public final class eyod implements View.OnClickListener {
    public final DiscoveredDeviceListFragment a;

    public eyod(DiscoveredDeviceListFragment discoveredDeviceListFragment0) {
        this.a = discoveredDeviceListFragment0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        eypi eypi0 = this.a.E();
        ibuq.f(eyov.c, "enrollmentType");
        eypi0.i.c(eypi.a[2], eyov.c);
        if(eyov.c.ordinal() != 2) {
            return;
        }
        eypi.k(eypi0);
    }
}

