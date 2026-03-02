import android.app.KeyguardManager.KeyguardLockedStateListener;
import com.google.android.gms.trustagent.activeunlock.primary.trustagent.ActiveUnlockRemoteIntentChimeraService;

public final class eyia implements KeyguardManager.KeyguardLockedStateListener {
    public final ActiveUnlockRemoteIntentChimeraService a;

    public eyia(ActiveUnlockRemoteIntentChimeraService activeUnlockRemoteIntentChimeraService0) {
        this.a = activeUnlockRemoteIntentChimeraService0;
    }

    public final void onKeyguardLockedStateChanged(boolean z) {
        ActiveUnlockRemoteIntentChimeraService activeUnlockRemoteIntentChimeraService0 = this.a;
        Boolean boolean0 = Boolean.valueOf(z);
        ((ggtj)activeUnlockRemoteIntentChimeraService0.e().h()).B("Keyguard Locked State Changed: %s", boolean0);
        if(!icha.c(activeUnlockRemoteIntentChimeraService0.e.b(boolean0))) {
            activeUnlockRemoteIntentChimeraService0.e();
        }
    }
}

