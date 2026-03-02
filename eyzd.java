import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.trustagent.activeunlock.primary.ui.setup.SetupCompleteFragment;

public final class eyzd implements View.OnClickListener {
    public final SetupCompleteFragment a;

    public eyzd(SetupCompleteFragment setupCompleteFragment0) {
        this.a = setupCompleteFragment0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        SetupCompleteFragment setupCompleteFragment0 = this.a;
        eyep eyep0 = setupCompleteFragment0.ag;
        if(eyep0 != null) {
            eyep0.a.a(ibom.a);
            eyez eyez0 = eyep0.b;
            if(eyez0 != null) {
                eyez0.a(Boolean.valueOf(true));
            }
        }
        if(((eyvx)setupCompleteFragment0.d.a()).b) {
            xoc.b(setupCompleteFragment0).finish();
            return;
        }
        if(!((nry)setupCompleteFragment0.D().a(setupCompleteFragment0)).s(0x7F0B1236, false)) {  // id:enrolled_device_list_fragment
            ((nry)setupCompleteFragment0.D().a(setupCompleteFragment0)).i(0x7F0B0AD7);  // id:action_from_setupComplete_to_enrolledDeviceList
        }
    }
}

