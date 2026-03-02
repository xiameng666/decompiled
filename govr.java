import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.model.GetTokenResponse;
import j..util.Objects;

public final class govr implements goxl {
    final goxa a;

    public govr(gowy gowy0, goxa goxa0) {
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
        goxa goxa0 = this.a;
        GetTokenResponse getTokenResponse0 = (GetTokenResponse)object0;
        try {
            Parcel parcel0 = goxa0.c.jo();
            wbz.f(parcel0, getTokenResponse0);
            goxa0.c.jq(1, parcel0);
        }
        catch(RemoteException remoteException0) {
            goxa0.b.g("RemoteException when sending token result.", remoteException0, new Object[0]);
        }
    }
}

