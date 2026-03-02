import android.os.Parcel;
import android.os.RemoteException;
import j..util.Objects;

final class gown implements goxl {
    final goxa a;
    final goxl b;

    public gown(gowo gowo0, goxa goxa0, goxl goxl0) {
        this.a = goxa0;
        this.b = goxl0;
        Objects.requireNonNull(gowo0);
        super();
    }

    @Override  // goxk
    public final void a(String s) {
        this.b.a(s);
    }

    @Override  // goxl
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        goxa goxa0 = this.a;
        try {
            Parcel parcel0 = goxa0.c.jo();
            goxa0.c.jq(6, parcel0);
        }
        catch(RemoteException remoteException0) {
            goxa0.b.g("RemoteException when sending delete account response.", remoteException0, new Object[0]);
        }
    }
}

