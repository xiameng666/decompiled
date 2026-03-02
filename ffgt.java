import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

public final class ffgt implements evqc {
    public final fdiy a;

    public ffgt(fdiy fdiy0) {
        this.a = fdiy0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        Log.e("WearableService", "Account key creation error", exception0);
        try {
            Status status0 = new Status(4010);
            this.a.a(status0);
        }
        catch(RemoteException unused_ex) {
        }
    }
}

