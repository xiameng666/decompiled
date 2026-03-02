import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;
import j..util.Objects;

final class crom implements Runnable {
    final AppMetadata a;
    final croz b;

    public crom(croz croz0, AppMetadata appMetadata0) {
        this.a = appMetadata0;
        Objects.requireNonNull(croz0);
        this.b = croz0;
        super();
    }

    @Override
    public final void run() {
        croz croz0 = this.b;
        crii crii0 = croz0.b;
        if(crii0 == null) {
            croz0.aJ().c.a("Failed to send consent settings to service");
            return;
        }
        try {
            batl.s(this.a);
            crii0.n(this.a);
            croz0.w();
        }
        catch(RemoteException remoteException0) {
            this.b.aJ().c.b("Failed to send consent settings to the service", remoteException0);
        }
    }
}

