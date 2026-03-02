import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.List;

public final class eqet implements evpz {
    public final eqeu a;

    public eqet(eqeu eqeu0) {
        this.a = eqeu0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        eqeu eqeu0 = this.a;
        if(evql0.n()) {
            try {
                List list0 = (List)evql0.j();
                eqeu0.a.e(Status.b, list0);
            }
            catch(RemoteException remoteException0) {
                eqfd.a.l(remoteException0);
            }
            return;
        }
        Exception exception0 = evql0.i();
        eqfd.a.l(exception0);
        try {
            eqeu0.a.e(Status.d, null);
        }
        catch(RemoteException remoteException1) {
            eqfd.a.l(remoteException1);
        }
    }
}

