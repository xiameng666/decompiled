import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class asag extends wby implements asah {
    final evqp a;

    public asag() {
        super("com.google.android.gms.backup.internal.IBackUpNowCallbacks");
    }

    public asag(aqgz aqgz0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(aqgz0);
        super("com.google.android.gms.backup.internal.IBackUpNowCallbacks");
    }

    @Override  // asah
    public final void a(Status status0, ApiMetadata apiMetadata0) {
        azzf.a(status0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            asag.gr(parcel0);
            this.a(status0, apiMetadata0);
            return true;
        }
        return false;
    }
}

