import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.internal.GetDataUsageParams;

public final class dces implements Runnable {
    public final dchp a;
    public final GetDataUsageParams b;

    public dces(dchp dchp0, GetDataUsageParams getDataUsageParams0) {
        this.a = dchp0;
        this.b = getDataUsageParams0;
    }

    @Override
    public final void run() {
        try {
            this.b.a.b(this.a.e.j());
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke getDataUsage callback.", new Object[0]);
        }
    }
}

