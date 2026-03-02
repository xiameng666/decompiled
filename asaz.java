import android.os.Parcel;
import com.google.android.gms.backup.internal.RestoreOperationSpan;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class asaz extends wby implements asba {
    final evqp a;

    public asaz() {
        super("com.google.android.gms.backup.internal.IRestoreTimespanCallback");
    }

    public asaz(aqgg aqgg0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(aqgg0);
        super("com.google.android.gms.backup.internal.IRestoreTimespanCallback");
    }

    @Override  // asba
    public final void a(RestoreOperationSpan restoreOperationSpan0, ApiMetadata apiMetadata0) {
        this.a.b(restoreOperationSpan0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            RestoreOperationSpan restoreOperationSpan0 = (RestoreOperationSpan)wbz.a(parcel0, RestoreOperationSpan.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            asaz.gr(parcel0);
            this.a(restoreOperationSpan0, apiMetadata0);
            return true;
        }
        return false;
    }
}

