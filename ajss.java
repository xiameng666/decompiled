import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ajss extends wby implements ajst {
    final evqp a;

    public ajss() {
        super("com.google.android.gms.auth.folsom.internal.IBooleanCallback");
    }

    public ajss(azts azts0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(azts0);
        super("com.google.android.gms.auth.folsom.internal.IBooleanCallback");
    }

    @Override  // ajst
    public final void a(Status status0, boolean z, ApiMetadata apiMetadata0) {
        azzf.b(status0, Boolean.valueOf(z), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            boolean z = wbz.i(parcel0);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            ajss.gr(parcel0);
            this.a(status0, z, apiMetadata0);
            return true;
        }
        return false;
    }
}

