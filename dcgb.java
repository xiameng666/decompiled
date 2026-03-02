import android.os.IBinder.DeathRecipient;
import com.google.android.gms.nearby.sharing.internal.UnregisterReceiveSurfaceParams;

public final class dcgb implements IBinder.DeathRecipient {
    public final dchp a;
    public final ddpr b;

    public dcgb(dchp dchp0, ddpr ddpr0) {
        this.a = dchp0;
        this.b = ddpr0;
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        UnregisterReceiveSurfaceParams unregisterReceiveSurfaceParams0 = new UnregisterReceiveSurfaceParams();
        unregisterReceiveSurfaceParams0.a = this.b;
        unregisterReceiveSurfaceParams0.b = this.a.d;
        this.a.ae(unregisterReceiveSurfaceParams0);
    }
}

