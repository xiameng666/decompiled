import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.internal.IsFastInitNotificationEnabledParams;

public final class dcdl implements Runnable {
    public final dchp a;
    public final IsFastInitNotificationEnabledParams b;

    public dcdl(dchp dchp0, IsFastInitNotificationEnabledParams isFastInitNotificationEnabledParams0) {
        this.a = dchp0;
        this.b = isFastInitNotificationEnabledParams0;
    }

    @Override
    public final void run() {
        try {
            this.b.a.b(this.a.e.aM());
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke isFastInitNotificationEnabled callback.", new Object[0]);
        }
    }
}

