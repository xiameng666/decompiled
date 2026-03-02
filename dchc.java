import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.internal.GetDeviceNameParams;

public final class dchc implements Runnable {
    public final dchp a;
    public final GetDeviceNameParams b;

    public dchc(dchp dchp0, GetDeviceNameParams getDeviceNameParams0) {
        this.a = dchp0;
        this.b = getDeviceNameParams0;
    }

    @Override
    public final void run() {
        try {
            this.b.a.a(this.a.e.F());
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke getDeviceName callback.", new Object[0]);
        }
    }
}

