import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

public final class ffho implements evqc {
    public final fdiy a;

    public ffho(fdiy fdiy0) {
        this.a = fdiy0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        try {
            Log.e("WearableService", "Error obtaining model ID from fast pair", exception0);
            Status status0 = new Status(0xFAB);
            this.a.a(status0);
        }
        catch(RemoteException unused_ex) {
        }
    }
}

