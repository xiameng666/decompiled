import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.internal.GetDeviceVisibilityParams;

public final class dcga implements Runnable {
    public final dchp a;
    public final GetDeviceVisibilityParams b;

    public dcga(dchp dchp0, GetDeviceVisibilityParams getDeviceVisibilityParams0) {
        this.a = dchp0;
        this.b = getDeviceVisibilityParams0;
    }

    @Override
    public final void run() {
        try {
            this.b.a.a(this.a.e.w());
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke getDeviceName callback.", new Object[0]);
        }
    }
}

