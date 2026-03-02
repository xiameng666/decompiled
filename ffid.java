import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.internal.GetAppThemeResponse;

public final class ffid implements evpz {
    public final fdiy a;

    public ffid(fdiy fdiy0) {
        this.a = fdiy0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        AppTheme appTheme0;
        int v = 16;
        fdiy fdiy0 = this.a;
        if(evql0.n()) {
            appTheme0 = (AppTheme)evql0.j();
            v = 0;
        }
        else {
            if(!((evqu)evql0).d) {
                if(Log.isLoggable("WearableService", 5)) {
                    Log.w("WearableService", "getAppTheme failed", evql0.i());
                }
                v = 8;
            }
            else if(Log.isLoggable("WearableService", 5)) {
                Log.w("WearableService", "getAppTheme canceled");
            }
            appTheme0 = null;
        }
        try {
            fdiy0.d(new GetAppThemeResponse(v, appTheme0));
        }
        catch(RemoteException remoteException0) {
            Log.e("WearableService", "getAppTheme exception", remoteException0);
        }
    }
}

