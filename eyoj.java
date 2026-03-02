import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.trustagent.activeunlock.primary.ui.discovereddevice.DiscoveredDeviceListFragment;
import com.google.android.setupdesign.GlifLayout;
import java.util.List;

public final class eyoj extends ibuo implements ibts {
    public eyoj(Object object0) {
        super(1, object0, DiscoveredDeviceListFragment.class, "updateState", "updateState(Lcom/google/android/gms/trustagent/activeunlock/primary/ui/discovereddevice/DiscoveredDeviceListUiState;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((eyox)object0), "p0");
        DiscoveredDeviceListFragment discoveredDeviceListFragment0 = (DiscoveredDeviceListFragment)this.e;
        boolean z = true;
        if(honf.a.b().e()) {
            GlifLayout glifLayout0 = (GlifLayout)discoveredDeviceListFragment0.requireView().requireViewById(0x7F0B116F);  // id:discovered_suw_layout
            switch(((eyox)object0).e.ordinal()) {
                case 0: {
                    glifLayout0.L(0x7F150DE0);  // string:discovered_devices_title "Choose your watch"
                    glifLayout0.C().setVisibility(8);
                    break;
                }
                case 1: {
                    break;
                }
                case 2: {
                    glifLayout0.L(0x7F150DDF);  // string:discovered_devices_manual_enrollment_title "Set up using your watch"
                    glifLayout0.J(0x7F150DDE);  // string:discovered_devices_manual_enrollment_description "On your watch: \n\n 1. 
                                                // Go to Settings > Security > Watch Unlock > Other devices, and tap Tap to become 
                                                // visible \n\n 2. On this device, select your watch when it shows up under Available 
                                                // watches and tap Confirm"
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
        }
        boolean z1 = false;
        if(!((eyox)object0).a) {
            List list0 = ((eyox)object0).b;
            if(!list0.isEmpty()) {
                for(Object object1: list0) {
                    if(((eyoy)object1).b) {
                        z1 = true;
                        break;
                    }
                }
            }
        }
        boolean z2 = !((eyox)object0).c && ((eyox)object0).b.isEmpty();
        discoveredDeviceListFragment0.aj = z2 ? 2 : 1;
        View view0 = discoveredDeviceListFragment0.getView();
        ibuq.c(view0);
        ((ProgressBar)view0.findViewById(0x7F0B1259)).setVisibility(discoveredDeviceListFragment0.B(((eyox)object0).c));  // id:enrollment_list_progress_bar
        RecyclerView recyclerView0 = discoveredDeviceListFragment0.C();
        List list1 = ((eyox)object0).b;
        recyclerView0.setVisibility(discoveredDeviceListFragment0.B(((boolean)(list1.isEmpty() ^ 1))));
        discoveredDeviceListFragment0.D().setVisibility(discoveredDeviceListFragment0.B(z2 && !DiscoveredDeviceListFragment.a.contains(((eyox)object0).d.a)));
        gafh gafh0 = discoveredDeviceListFragment0.I();
        ibuq.c(gafh0);
        if(!z1 && !z2) {
            z = false;
        }
        gafh0.c(z);
        int v = discoveredDeviceListFragment0.aj == 2 ? 0x7F1508F2 : 0x7F15080A;  // string:common_try_again "Try again"
        gafh0.d(discoveredDeviceListFragment0.requireContext().getString(v));
        gafh gafh1 = discoveredDeviceListFragment0.J();
        if(gafh1 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if(((eyox)object0).f == eyow.b) {
            gafh1.d("Try another way");
            gafh1.f = new eyod(discoveredDeviceListFragment0);
        }
        else {
            gafh1.d("Cancel");
            gafh1.f = new eyoe(discoveredDeviceListFragment0);
        }
        discoveredDeviceListFragment0.ah.a = list1;
        discoveredDeviceListFragment0.ah.q();
        discoveredDeviceListFragment0.ai.c(((eyox)object0).d);
        return ibom.a;
    }
}

