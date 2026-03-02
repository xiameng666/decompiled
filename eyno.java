import android.app.KeyguardManager;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.trustagent.activeunlock.primary.ui.authentication.ScreenLockSetUpFragment;

public final class eyno implements acn {
    public final ScreenLockSetUpFragment a;

    public eyno(ScreenLockSetUpFragment screenLockSetUpFragment0) {
        this.a = screenLockSetUpFragment0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        ibuq.f(((ActivityResult)object0), "it");
        ScreenLockSetUpFragment screenLockSetUpFragment0 = this.a;
        if(!((KeyguardManager)screenLockSetUpFragment0.requireContext().getSystemService(KeyguardManager.class)).isDeviceSecure()) {
            return;
        }
        ((eyvx)screenLockSetUpFragment0.c.a()).c.g(screenLockSetUpFragment0, new eyns(new eynq(screenLockSetUpFragment0)));
    }
}

