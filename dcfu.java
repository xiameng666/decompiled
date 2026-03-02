import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.internal.GetVisibilityParams;

public final class dcfu implements Runnable {
    public final dchp a;
    public final GetVisibilityParams b;

    public dcfu(dchp dchp0, GetVisibilityParams getVisibilityParams0) {
        this.a = dchp0;
        this.b = getVisibilityParams0;
    }

    @Override
    public final void run() {
        try {
            this.b.a.b(this.a.e.o());
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke getVisibility callback.", new Object[0]);
        }
    }
}

