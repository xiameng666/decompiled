import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;

public final class crob implements Runnable {
    public final croz a;

    public crob(croz croz0) {
        this.a = croz0;
    }

    @Override
    public final void run() {
        croz croz0 = this.a;
        crii crii0 = croz0.b;
        if(crii0 == null) {
            croz0.aJ().c.a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            AppMetadata appMetadata0 = croz0.q(false);
            batl.s(appMetadata0);
            crii0.q(appMetadata0);
            croz0.w();
        }
        catch(RemoteException remoteException0) {
            croz0.aJ().c.b("Failed to send Dma consent settings to the service", remoteException0);
        }
    }
}

