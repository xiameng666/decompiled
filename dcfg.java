import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.internal.GetDownloadsDirectoryParams;

public final class dcfg implements Runnable {
    public final dchp a;
    public final GetDownloadsDirectoryParams b;

    public dcfg(dchp dchp0, GetDownloadsDirectoryParams getDownloadsDirectoryParams0) {
        this.a = dchp0;
        this.b = getDownloadsDirectoryParams0;
    }

    @Override
    public final void run() {
        try {
            this.b.a.a(((dfsk)this.a.e.d.get()).i());
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke getDownloadsDirectory callback.", new Object[0]);
        }
    }
}

