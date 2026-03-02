import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public final class eqlh implements evqk {
    public final eqln a;

    public eqlh(eqln eqln0) {
        this.a = eqln0;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        Void void0 = (Void)object0;
        erhe erhe0 = this.a.c.e;
        if(erhe0 == null) {
            return evrg.c(new aztb(Status.d));
        }
        evqp evqp0 = new evqp();
        eqlb eqlb0 = new eqlb(evqp0);
        try {
            erhe0.j(new erfy(eqlb0));
        }
        catch(RemoteException remoteException0) {
            eqle.a.l(remoteException0);
        }
        return evqp0.a;
    }
}

