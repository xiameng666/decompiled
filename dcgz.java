import android.os.IBinder.DeathRecipient;
import com.google.android.gms.nearby.sharing.internal.UnregisterSendSurfaceParams;

public final class dcgz implements IBinder.DeathRecipient {
    public final dchp a;
    public final ddpr b;

    public dcgz(dchp dchp0, ddpr ddpr0) {
        this.a = dchp0;
        this.b = ddpr0;
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        UnregisterSendSurfaceParams unregisterSendSurfaceParams0 = new UnregisterSendSurfaceParams();
        unregisterSendSurfaceParams0.a = this.b;
        unregisterSendSurfaceParams0.b = this.a.d;
        this.a.af(unregisterSendSurfaceParams0);
    }
}

