import android.app.KeyguardManager;
import androidx.activity.result.ActivityResult;

public final class bmrv implements acn {
    public final bmsd a;

    public bmrv(bmsd bmsd0) {
        this.a = bmsd0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        ActivityResult activityResult0 = (ActivityResult)object0;
        bmsd bmsd0 = this.a;
        KeyguardManager keyguardManager0 = (KeyguardManager)bmsd0.requireContext().getSystemService("keyguard");
        if(keyguardManager0 != null && keyguardManager0.isDeviceSecure()) {
            bmsd0.a.l(blhf.ad);
            bmsd0.a.v();
            return;
        }
        bmsd0.a.l(blhf.ae);
    }
}

