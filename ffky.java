import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.GetTermsResponse;
import java.util.List;

public final class ffky implements evpz {
    public final fdiy a;

    public ffky(fdiy fdiy0) {
        this.a = fdiy0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        int v;
        fdiy fdiy0 = this.a;
        List list0 = ggna.a;
        if(evql0.n()) {
            list0 = (List)evql0.j();
            v = 0;
        }
        else if(((evqu)evql0).d) {
            if(Log.isLoggable("WearableService", 5)) {
                Log.w("WearableService", "GetTerms canceled");
            }
            v = 16;
        }
        else {
            if(Log.isLoggable("WearableService", 5)) {
                Log.w("WearableService", "GetTerms failed", evql0.i());
            }
            v = 8;
        }
        try {
            fdiy0.M(new GetTermsResponse(v, list0));
        }
        catch(RemoteException remoteException0) {
            if(Log.isLoggable("WearableService", 5)) {
                Log.w("WearableService", "GetTerms onStatus failed", remoteException0);
            }
        }
    }
}

