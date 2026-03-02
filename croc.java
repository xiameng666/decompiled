import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.concurrent.atomic.AtomicReference;

public final class croc implements Runnable {
    public final croz a;
    public final AtomicReference b;
    public final AppMetadata c;
    public final Bundle d;

    public croc(croz croz0, AtomicReference atomicReference0, AppMetadata appMetadata0, Bundle bundle0) {
        this.a = croz0;
        this.b = atomicReference0;
        this.c = appMetadata0;
        this.d = bundle0;
    }

    @Override
    public final void run() {
        croz croz0 = this.a;
        AppMetadata appMetadata0 = this.c;
        AtomicReference atomicReference0 = this.b;
        Bundle bundle0 = this.d;
        synchronized(atomicReference0) {
            try {
                crii crii0 = croz0.b;
                if(crii0 == null) {
                    croz0.aJ().c.a("Failed to request trigger URIs; not connected to service");
                    return;
                }
                batl.s(appMetadata0);
                crii0.k(appMetadata0, bundle0, new crik(croz0, atomicReference0));
                croz0.w();
            }
            catch(RemoteException remoteException0) {
                croz0.aJ().c.b("Failed to request trigger URIs; remote exception", remoteException0);
                atomicReference0.notifyAll();
            }
        }
    }
}

