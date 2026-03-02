import android.os.RemoteException;
import android.util.Log;

public final class ffla implements evpz {
    public final fdiy a;

    public ffla(fdiy fdiy0) {
        this.a = fdiy0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        int v;
        fdiy fdiy0 = this.a;
        if(evql0.n()) {
            v = 0;
        }
        else if(((evqu)evql0).d) {
            if(Log.isLoggable("WearableService", 5)) {
                Log.w("WearableService", "acceptTerms canceled");
            }
            v = 16;
        }
        else {
            if(Log.isLoggable("WearableService", 5)) {
                Log.w("WearableService", "acceptTerms failed", evql0.i());
            }
            v = 13;
        }
        try {
            fdiy0.a(fdlg.a(v));
        }
        catch(RemoteException remoteException0) {
            if(Log.isLoggable("WearableService", 5)) {
                Log.w("WearableService", "acceptTerms onStatus failed", remoteException0);
            }
        }
    }
}

