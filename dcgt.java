import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.internal.GetContactsParams;

public final class dcgt implements Runnable {
    public final dchp a;
    public final GetContactsParams b;

    public dcgt(dchp dchp0, GetContactsParams getContactsParams0) {
        this.a = dchp0;
        this.b = getContactsParams0;
    }

    @Override
    public final void run() {
        try {
            this.b.a.a(this.a.e.a.l(this.b.b, this.b.c, this.b.d));
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke getContacts callback.", new Object[0]);
        }
    }
}

