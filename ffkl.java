import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

public final class ffkl implements evpz {
    public final fdiy a;

    public ffkl(fdiy fdiy0) {
        this.a = fdiy0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        int v = 13;
        fdiy fdiy0 = this.a;
        if(evql0.n()) {
            v = 0;
        }
        else if(((evqu)evql0).d) {
            Log.e("WearableService", "addSupervisedAccount canceled");
        }
        else {
            Log.e("WearableService", "addSupervisedAccount failed", evql0.i());
        }
        try {
            fdiy0.a(new Status(v));
        }
        catch(RemoteException remoteException0) {
            Log.e("WearableService", "addSupervisedAccount onStatus failed", remoteException0);
        }
    }
}

