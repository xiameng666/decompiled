import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.EventParams;
import j..util.Objects;

final class croj implements Runnable {
    final boolean a;
    final AppMetadata b;
    final boolean c;
    final EventParams d;
    final Bundle e;
    final croz f;

    public croj(croz croz0, boolean z, AppMetadata appMetadata0, boolean z1, EventParams eventParams0, Bundle bundle0) {
        this.a = z;
        this.b = appMetadata0;
        this.c = z1;
        this.d = eventParams0;
        this.e = bundle0;
        Objects.requireNonNull(croz0);
        this.f = croz0;
        super();
    }

    @Override
    public final void run() {
        croz croz0 = this.f;
        crii crii0 = croz0.b;
        if(crii0 == null) {
            croz0.aJ().c.a("Failed to send default event parameters to service");
            return;
        }
        if(croz0.am().t(crif.aL) && this.a) {
            batl.s(this.b);
            this.f.y(crii0, (this.c ? null : this.d), this.b);
            return;
        }
        try {
            batl.s(this.b);
            crii0.p(this.e, this.b);
            croz0.w();
        }
        catch(RemoteException remoteException0) {
            this.f.aJ().c.b("Failed to send default event parameters to service", remoteException0);
        }
    }
}

