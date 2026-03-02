import android.os.RemoteException;
import android.util.Log;

public final class ffld implements evpz {
    public final fdiy a;

    public ffld(fdiy fdiy0) {
        this.a = fdiy0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        int v;
        fdiy fdiy0 = this.a;
        if(evql0.n()) {
            v = 0;
        }
        else {
            v = ((evqu)evql0).d ? 16 : 13;
        }
        try {
            fdiy0.a(fdlg.a(v));
        }
        catch(RemoteException remoteException0) {
            if(Log.isLoggable("WearableService", 5)) {
                Log.w("WearableService", "migrateToConsentPerWatch onStatus failed", remoteException0);
            }
        }
    }
}

