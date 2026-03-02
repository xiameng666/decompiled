import android.os.IBinder.DeathRecipient;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.NoSuchElementException;

public abstract class xfs implements IBinder.DeathRecipient {
    public final void a(IBinder iBinder0) {
        try {
            iBinder0.unlinkToDeath(this, 0);
        }
        catch(NoSuchElementException unused_ex) {
        }
    }

    public final boolean b(IBinder iBinder0) {
        try {
            iBinder0.linkToDeath(this, 0);
            return true;
        }
        catch(RemoteException remoteException0) {
            Log.e("ComponentDeathRpnt", "Error linking binder", remoteException0);
            return false;
        }
    }
}

