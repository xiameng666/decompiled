import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ezdn extends wby implements ezdo {
    final evqp a;

    public ezdn() {
        super("com.google.android.gms.trustagent.internal.ITrustedDevicesCallbacks");
    }

    public ezdn(azts azts0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(azts0);
        super("com.google.android.gms.trustagent.internal.ITrustedDevicesCallbacks");
    }

    @Override  // ezdo
    public final void a(Status status0, boolean z, ApiMetadata apiMetadata0) {
        azzf.b(status0, Boolean.valueOf(z), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            boolean z = wbz.i(parcel0);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            ezdn.gr(parcel0);
            this.a(status0, z, apiMetadata0);
            return true;
        }
        return false;
    }
}

