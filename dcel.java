import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.GetIntentParams;

public final class dcel implements Runnable {
    public final dchp a;
    public final GetIntentParams b;

    public dcel(dchp dchp0, GetIntentParams getIntentParams0) {
        this.a = dchp0;
        this.b = getIntentParams0;
    }

    @Override
    public final void run() {
        try {
            NearbySharingChimeraService nearbySharingChimeraService0 = this.a.e;
            Intent intent0 = nearbySharingChimeraService0.t == null ? null : ((Intent)nearbySharingChimeraService0.t.a);
            GetIntentParams getIntentParams0 = this.b;
            if(intent0 != null) {
                getIntentParams0.a.b(intent0);
                return;
            }
            getIntentParams0.a.a(0x8ABD);
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke getIntent callback.", new Object[0]);
        }
    }
}

