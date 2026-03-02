import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.internal.GetShareTargetsParams;

public final class dcdi implements Runnable {
    public final dchp a;
    public final GetShareTargetsParams b;
    public final int c;

    public dcdi(dchp dchp0, GetShareTargetsParams getShareTargetsParams0, int v) {
        this.a = dchp0;
        this.b = getShareTargetsParams0;
        this.c = v;
    }

    @Override
    public final void run() {
        try {
            this.b.b.a(this.a.e.L(this.c));
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke getShareTargets callback.", new Object[0]);
        }
    }
}

