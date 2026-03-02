import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.model.CreateAuthUriResponse;
import j..util.Objects;

public final class govo implements goxl {
    final goxa a;

    public govo(gowy gowy0, goxa goxa0) {
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
        CreateAuthUriResponse createAuthUriResponse0 = (CreateAuthUriResponse)object0;
        try {
            Parcel parcel0 = goxa0.c.jo();
            wbz.f(parcel0, createAuthUriResponse0);
            goxa0.c.jq(3, parcel0);
        }
        catch(RemoteException remoteException0) {
            goxa0.b.g("RemoteException when sending create auth uri response.", remoteException0, new Object[0]);
        }
    }
}

