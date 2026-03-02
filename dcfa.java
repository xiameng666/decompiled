import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.internal.IsConsentIgnoredParams;

public final class dcfa implements Runnable {
    public final dchp a;
    public final IsConsentIgnoredParams b;

    public dcfa(dchp dchp0, IsConsentIgnoredParams isConsentIgnoredParams0) {
        this.a = dchp0;
        this.b = isConsentIgnoredParams0;
    }

    @Override
    public final void run() {
        try {
            this.b.c.b(this.a.e.aK(this.b.a, this.b.b));
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke isConsentIgnored callback.", new Object[0]);
        }
    }
}

