import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.internal.IsOptedInParams;

public final class dcdp implements Runnable {
    public final dchp a;
    public final IsOptedInParams b;

    public dcdp(dchp dchp0, IsOptedInParams isOptedInParams0) {
        this.a = dchp0;
        this.b = isOptedInParams0;
    }

    @Override
    public final void run() {
        try {
            this.b.a.b(djat.c(this.a.e.N));
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke isOptedIn callback.", new Object[0]);
        }
    }
}

