import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public final class eqfq {
    private final eqiw a;
    private final eqtg b;

    public eqfq(eqiw eqiw0) {
        this.a = eqiw0;
        this.b = null;
    }

    public eqfq(eqtg eqtg0) {
        this.b = eqtg0;
        this.a = null;
    }

    public final void a(Status status0) {
        try {
            eqiw eqiw0 = this.a;
            if(eqiw0 != null) {
                eqiw0.a(status0);
                return;
            }
            eqtg eqtg0 = this.b;
            if(eqtg0 != null) {
                eqtg0.a(status0);
            }
        }
        catch(RemoteException remoteException0) {
            eqfr.a.g("Error calling onAbortDirectTransferResult.", remoteException0, new Object[0]);
        }
    }

    public final void b(Status status0) {
        try {
            eqiw eqiw0 = this.a;
            if(eqiw0 != null) {
                eqiw0.i(status0);
                return;
            }
            eqtg eqtg0 = this.b;
            if(eqtg0 != null) {
                eqtg0.a(status0);
            }
        }
        catch(RemoteException remoteException0) {
            eqfr.a.g("Error calling onStartDirectTransferResult.", remoteException0, new Object[0]);
        }
    }
}

