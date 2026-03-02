import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.internal.IsEnabledParams;

public final class dcdw implements Runnable {
    public final dchp a;
    public final IsEnabledParams b;

    public dcdw(dchp dchp0, IsEnabledParams isEnabledParams0) {
        this.a = dchp0;
        this.b = isEnabledParams0;
    }

    @Override
    public final void run() {
        try {
            this.b.a.b(this.a.e.aL());
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke isEnabled callback.", new Object[0]);
        }
    }
}

