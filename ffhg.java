import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.BooleanResponse;

public final class ffhg implements evqc {
    public final String a;
    public final fdiy b;

    public ffhg(fdiy fdiy0) {
        this.a = "hasAvailableBackups";
        this.b = fdiy0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        try {
            Log.e("WearableService", this.a + ": exception during processing", exception0);
            BooleanResponse booleanResponse0 = new BooleanResponse(8, false);
            this.b.f(booleanResponse0);
        }
        catch(RemoteException remoteException0) {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "Failed to deliver result to app", remoteException0);
            }
        }
    }
}

