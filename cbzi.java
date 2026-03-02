import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

public final class cbzi {
    private final azxs a;

    public cbzi(azxs azxs0) {
        this.a = azxs0;
    }

    public final void a(Status status0) {
        try {
            this.a.a(status0);
        }
        catch(RemoteException unused_ex) {
            Log.w("brella.ResultHdlingSvc", "An error occurred when trying to communicate with Brella.");
        }
    }
}

