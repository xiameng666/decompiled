import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ezcv extends wby implements ezcw {
    final evqp a;

    public ezcv() {
        super("com.google.android.gms.trustagent.internal.IAuthenticatorsCallbacks");
    }

    public ezcv(azts azts0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(azts0);
        super("com.google.android.gms.trustagent.internal.IAuthenticatorsCallbacks");
    }

    @Override  // ezcw
    public final void a(Status status0, boolean z, ApiMetadata apiMetadata0) {
        azzf.b(status0, Boolean.valueOf(z), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            boolean z = wbz.i(parcel0);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            ezcv.gr(parcel0);
            this.a(status0, z, apiMetadata0);
            return true;
        }
        return false;
    }
}

