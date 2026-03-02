import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;
import j..util.Objects;

final class crol implements Runnable {
    final AppMetadata a;
    final croz b;

    public crol(croz croz0, AppMetadata appMetadata0) {
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
            croz0.aJ().c.a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            batl.s(this.a);
            crii0.v(this.a);
            croz0.w();
        }
        catch(RemoteException remoteException0) {
            this.b.aJ().c.b("Failed to send measurementEnabled to the service", remoteException0);
        }
    }
}

