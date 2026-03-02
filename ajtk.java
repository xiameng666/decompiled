import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ajtk extends wby implements ajtl {
    final evqp a;

    public ajtk() {
        super("com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback");
    }

    public ajtk(ajve ajve0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ajve0);
        super("com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback");
    }

    @Override  // ajtl
    public final void a(Status status0, int v, ApiMetadata apiMetadata0) {
        azzf.c(status0, Integer.valueOf(v), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            int v1 = parcel0.readInt();
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            ajtk.gr(parcel0);
            this.a(status0, v1, apiMetadata0);
            return true;
        }
        return false;
    }
}

