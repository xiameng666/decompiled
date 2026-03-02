import android.os.IBinder.DeathRecipient;
import com.google.android.gms.nearby.sharing.internal.UnregisterInstallCallbackParams;

public final class dceg implements IBinder.DeathRecipient {
    public final dchp a;
    public final ddok b;

    public dceg(dchp dchp0, ddok ddok0) {
        this.a = dchp0;
        this.b = ddok0;
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        UnregisterInstallCallbackParams unregisterInstallCallbackParams0 = new UnregisterInstallCallbackParams();
        unregisterInstallCallbackParams0.a = this.b;
        unregisterInstallCallbackParams0.b = this.a.d;
        this.a.ad(unregisterInstallCallbackParams0);
    }
}

