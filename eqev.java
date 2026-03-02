import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;

public final class eqev implements evpz {
    public final eqew a;

    public eqev(eqew eqew0) {
        this.a = eqew0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        eqew eqew0 = this.a;
        if(evql0.n()) {
            try {
                ManagedAccountSetupInfo managedAccountSetupInfo0 = (ManagedAccountSetupInfo)evql0.j();
                eqew0.a.f(Status.b, managedAccountSetupInfo0);
            }
            catch(RemoteException remoteException0) {
                eqfd.a.l(remoteException0);
            }
            return;
        }
        Exception exception0 = evql0.i();
        eqfd.a.l(exception0);
        try {
            eqew0.a.f(Status.d, null);
        }
        catch(RemoteException remoteException1) {
            eqfd.a.l(remoteException1);
        }
    }
}

