import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.BooleanResponse;

public final class ffhf implements evqf {
    public final fdiy a;

    public ffhf(fdiy fdiy0) {
        this.a = fdiy0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Boolean boolean0 = (Boolean)object0;
        try {
            this.a.f(new BooleanResponse(0, boolean0.booleanValue()));
        }
        catch(RemoteException remoteException0) {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "Failed to deliver result to app", remoteException0);
            }
        }
    }
}

