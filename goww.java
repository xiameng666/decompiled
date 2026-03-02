import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class goww implements goxl {
    final goxa a;

    public goww(gowy gowy0, goxa goxa0) {
        this.a = goxa0;
        Objects.requireNonNull(gowy0);
        super();
    }

    @Override  // goxk
    public final void a(String s) {
        Status status0 = gozl.a(s);
        this.a.b(status0);
    }

    @Override  // goxl
    public final void b(Object object0) {
        String s = ((goyq)object0).a;
        goxa goxa0 = this.a;
        try {
            Parcel parcel0 = goxa0.c.jo();
            parcel0.writeString(s);
            goxa0.c.jq(8, parcel0);
        }
        catch(RemoteException remoteException0) {
            goxa0.b.g("RemoteException when sending set account info response.", remoteException0, new Object[0]);
        }
    }
}

