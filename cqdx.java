import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdisync.internal.SyncResult;

public final class cqdx extends wby implements cqdy {
    final evqp a;

    public cqdx() {
        super("com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
    }

    public cqdx(evqp evqp0) {
        this.a = evqp0;
        super("com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
    }

    @Override  // cqdy
    public final void a(Status status0, SyncResult syncResult0, ApiMetadata apiMetadata0) {
        azzf.c(status0, (status0.e() ? syncResult0.a : null), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            SyncResult syncResult0 = (SyncResult)wbz.a(parcel0, SyncResult.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            cqdx.gr(parcel0);
            this.a(status0, syncResult0, apiMetadata0);
            return true;
        }
        return false;
    }
}

