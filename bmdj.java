import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class bmdj extends wby implements bmdk {
    final evqp a;

    public bmdj() {
        super("com.google.android.gms.fido.credentialstore.internal.ILongValueCallbacks");
    }

    public bmdj(bmdz bmdz0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(bmdz0);
        super("com.google.android.gms.fido.credentialstore.internal.ILongValueCallbacks");
    }

    @Override  // bmdk
    public final void a(Status status0, long v, ApiMetadata apiMetadata0) {
        azzf.b(status0, Long.valueOf(v), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            long v1 = parcel0.readLong();
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            bmdj.gr(parcel0);
            this.a(status0, v1, apiMetadata0);
            return true;
        }
        return false;
    }
}

