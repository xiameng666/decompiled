import android.os.IBinder.DeathRecipient;
import com.google.android.gms.nearby.sharing.internal.UnregisterStateObserverParams;

public final class dcgu implements IBinder.DeathRecipient {
    public final dchp a;
    public final ddpi b;

    public dcgu(dchp dchp0, ddpi ddpi0) {
        this.a = dchp0;
        this.b = ddpi0;
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        UnregisterStateObserverParams unregisterStateObserverParams0 = new UnregisterStateObserverParams();
        unregisterStateObserverParams0.a = this.b;
        unregisterStateObserverParams0.b = this.a.d;
        this.a.ah(unregisterStateObserverParams0);
    }
}

