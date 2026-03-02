import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.GetActionsParams;

public final class dcgr implements Runnable {
    public final dchp a;
    public final GetActionsParams b;
    public final ShareTarget c;

    public dcgr(dchp dchp0, GetActionsParams getActionsParams0, ShareTarget shareTarget0) {
        this.a = dchp0;
        this.b = getActionsParams0;
        this.c = shareTarget0;
    }

    @Override
    public final void run() {
        try {
            NearbySharingChimeraService nearbySharingChimeraService0 = this.a.e;
            this.b.b.a((hvrc.a.b().s() ? nearbySharingChimeraService0.af.b(this.c, new dcaw(nearbySharingChimeraService0)) : nearbySharingChimeraService0.a.k(this.c)));
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke getActions callback.", new Object[0]);
        }
    }
}

