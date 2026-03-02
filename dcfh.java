import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.internal.GetAllowPermissionAutoParams;

public final class dcfh implements Runnable {
    public final dchp a;
    public final GetAllowPermissionAutoParams b;

    public dcfh(dchp dchp0, GetAllowPermissionAutoParams getAllowPermissionAutoParams0) {
        this.a = dchp0;
        this.b = getAllowPermissionAutoParams0;
    }

    @Override
    public final void run() {
        try {
            this.b.a.b(this.a.e.aE());
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke getAllowPermissionAuto callback.", new Object[0]);
        }
    }
}

