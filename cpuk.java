import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupResponse;
import j..util.Objects;

public final class cpuk extends wby implements cpul {
    final evqp a;

    public cpuk() {
        super("com.google.android.gms.mdd.IMddFileGroupCallback");
    }

    public cpuk(cpvn cpvn0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(cpvn0);
        super("com.google.android.gms.mdd.IMddFileGroupCallback");
    }

    @Override  // cpul
    public final void a(Status status0, FileGroupResponse fileGroupResponse0, ApiMetadata apiMetadata0) {
        azzf.b(status0, fileGroupResponse0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            FileGroupResponse fileGroupResponse0 = (FileGroupResponse)wbz.a(parcel0, FileGroupResponse.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            cpuk.gr(parcel0);
            this.a(status0, fileGroupResponse0, apiMetadata0);
            return true;
        }
        return false;
    }
}

