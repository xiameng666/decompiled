import android.os.RemoteException;
import j..util.Objects;

final class croi implements Runnable {
    final crns a;
    final croz b;

    public croi(croz croz0, crns crns0) {
        this.a = crns0;
        Objects.requireNonNull(croz0);
        this.b = croz0;
        super();
    }

    @Override
    public final void run() {
        croz croz0 = this.b;
        crii crii0 = croz0.b;
        if(crii0 == null) {
            croz0.aJ().c.a("Failed to send current screen to service");
            return;
        }
        try {
            crns crns0 = this.a;
            if(crns0 == null) {
                crii0.o(0L, null, null, "com.google.android.gms");
            }
            else {
                crii0.o(crns0.c, crns0.a, crns0.b, "com.google.android.gms");
            }
            croz0.w();
        }
        catch(RemoteException remoteException0) {
            this.b.aJ().c.b("Failed to send current screen to the service", remoteException0);
        }
    }
}

