import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.internal.GetContactsCountParams;

public final class dcfw implements Runnable {
    public final dchp a;
    public final GetContactsCountParams b;

    public dcfw(dchp dchp0, GetContactsCountParams getContactsCountParams0) {
        this.a = dchp0;
        this.b = getContactsCountParams0;
    }

    @Override
    public final void run() {
        try {
            this.b.a.b(this.a.e.f(this.b.b));
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke getContactsCount callback.", new Object[0]);
        }
    }
}

