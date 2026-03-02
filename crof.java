import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;
import j..util.Objects;

final class crof implements Runnable {
    final AppMetadata a;
    final boolean b;
    final croz c;

    public crof(croz croz0, AppMetadata appMetadata0, boolean z) {
        this.a = appMetadata0;
        this.b = z;
        Objects.requireNonNull(croz0);
        this.c = croz0;
        super();
    }

    @Override
    public final void run() {
        croz croz0 = this.c;
        crii crii0 = croz0.b;
        if(crii0 == null) {
            croz0.aJ().c.a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            AppMetadata appMetadata0 = this.a;
            batl.s(appMetadata0);
            crie crie0 = crif.aL;
            if(croz0.am().t(crie0) && this.b) {
                croz0.y(crii0, null, appMetadata0);
            }
            crii0.h(appMetadata0);
            croz0.g().v();
            if(!croz0.am().t(crie0) || this.b) {
                croz0.y(crii0, null, appMetadata0);
            }
            croz0.w();
        }
        catch(RemoteException remoteException0) {
            this.c.aJ().c.b("Failed to send app launch to the service", remoteException0);
        }
    }
}

