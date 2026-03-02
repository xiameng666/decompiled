import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupWithDownloadStatus;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class cpun extends wby implements cpuo {
    final evqp a;

    public cpun() {
        super("com.google.android.gms.mdd.IMddFileGroupWithDownloadStatusCallback");
    }

    public cpun(azts azts0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(azts0);
        super("com.google.android.gms.mdd.IMddFileGroupWithDownloadStatusCallback");
    }

    @Override  // cpuo
    public final void a(Status status0, List list0, ApiMetadata apiMetadata0) {
        azzf.b(status0, list0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            ArrayList arrayList0 = parcel0.createTypedArrayList(FileGroupWithDownloadStatus.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            cpun.gr(parcel0);
            this.a(status0, arrayList0, apiMetadata0);
            return true;
        }
        return false;
    }
}

