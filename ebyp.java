import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import j..util.Optional;

public final class ebyp implements evqf {
    public final ebyr a;

    public ebyp(ebyr ebyr0) {
        this.a = ebyr0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Void void0 = (Void)object0;
        ebyr ebyr0 = this.a;
        try {
            ebyr0.b.x(Status.b);
            ebwm.c(ebyr0.e, ebyr.f);
        }
        catch(RemoteException unused_ex) {
            ebwm.b(ebyr0.e, ebyr.f, 16, Optional.empty());
        }
    }
}

