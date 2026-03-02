import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ezde extends wby implements ezdf {
    final evqp a;

    public ezde() {
        super("com.google.android.gms.trustagent.internal.IBridgeCallbacks");
    }

    public ezde(azts azts0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(azts0);
        super("com.google.android.gms.trustagent.internal.IBridgeCallbacks");
    }

    @Override  // ezdf
    public final void a(Status status0, Bundle bundle0, ApiMetadata apiMetadata0) {
        azzf.b(status0, bundle0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            ezde.gr(parcel0);
            this.a(status0, bundle0, apiMetadata0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

