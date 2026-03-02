import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public final class eqcl {
    private eqik a;
    private eqtg b;

    public eqcl(eqik eqik0) {
        this.a = eqik0;
    }

    public eqcl(eqtg eqtg0) {
        this.b = eqtg0;
    }

    public final void a(Status status0) {
        try {
            eqik eqik0 = this.a;
            if(eqik0 != null) {
                eqik0.a(status0);
                return;
            }
            eqtg eqtg0 = this.b;
            if(eqtg0 != null) {
                eqtg0.a(status0);
            }
        }
        catch(RemoteException remoteException0) {
            eqcm.a.g("Error calling onAbortDirectTransferResult.", remoteException0, new Object[0]);
        }
    }

    public final void b(Status status0) {
        try {
            eqik eqik0 = this.a;
            if(eqik0 != null) {
                eqik0.g(status0);
                return;
            }
            eqtg eqtg0 = this.b;
            if(eqtg0 != null) {
                eqtg0.a(status0);
            }
        }
        catch(RemoteException remoteException0) {
            eqcm.a.g("Error calling onIsTransferInProgressResult.", remoteException0, new Object[0]);
        }
    }

    public final void c(Status status0) {
        try {
            eqik eqik0 = this.a;
            if(eqik0 != null) {
                eqik0.i(status0);
                return;
            }
            eqtg eqtg0 = this.b;
            if(eqtg0 != null) {
                eqtg0.a(status0);
            }
        }
        catch(RemoteException remoteException0) {
            eqcm.a.g("Error calling onStartDirectTransferResult.", remoteException0, new Object[0]);
        }
    }
}

