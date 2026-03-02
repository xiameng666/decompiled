import android.os.IBinder.DeathRecipient;
import com.google.android.gms.nearby.sharing.internal.UnregisterSharingProviderParams;

public final class dcfx implements IBinder.DeathRecipient {
    public final dchp a;
    public final ddoh b;

    public dcfx(dchp dchp0, ddoh ddoh0) {
        this.a = dchp0;
        this.b = ddoh0;
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        UnregisterSharingProviderParams unregisterSharingProviderParams0 = new UnregisterSharingProviderParams();
        unregisterSharingProviderParams0.b = this.b;
        unregisterSharingProviderParams0.a = this.a.d;
        this.a.ag(unregisterSharingProviderParams0);
    }
}

