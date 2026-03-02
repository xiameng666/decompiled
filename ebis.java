import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import j..util.Optional;

public final class ebis implements evqf {
    public final ebiw a;

    public ebis(ebiw ebiw0) {
        this.a = ebiw0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Void void0 = (Void)object0;
        ebiw ebiw0 = this.a;
        try {
            ebiw0.b.x(Status.b);
            ebwm.c(ebiw0.e, ebiw.f);
        }
        catch(RemoteException unused_ex) {
            ebwm.b(ebiw0.e, ebiw.f, 16, Optional.empty());
        }
    }
}

