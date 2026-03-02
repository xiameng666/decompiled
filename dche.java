import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.GetOptInStatusParams;

public final class dche implements Runnable {
    public final dchp a;
    public final GetOptInStatusParams b;

    public dche(dchp dchp0, GetOptInStatusParams getOptInStatusParams0) {
        this.a = dchp0;
        this.b = getOptInStatusParams0;
    }

    @Override
    public final void run() {
        int v;
        try {
            ddon ddon0 = this.b.a;
            NearbySharingChimeraService nearbySharingChimeraService0 = this.a.e;
            if(nearbySharingChimeraService0.aN() && djat.c(nearbySharingChimeraService0.N)) {
                v = 1;
            }
            else if(djat.c(nearbySharingChimeraService0.N)) {
                v = 2;
            }
            else {
                v = nearbySharingChimeraService0.aN() ? 3 : 0;
            }
            ddon0.b(v);
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke getOptInStatus callback.", new Object[0]);
        }
    }
}

