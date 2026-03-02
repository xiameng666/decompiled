import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googleone.StorageQuotaInfo;
import j..util.Objects;

public final class buha extends wby implements buhb {
    final evqp a;

    public buha() {
        super("com.google.android.gms.googleone.internal.IStorageQuotaInfoCallback");
    }

    public buha(buhf buhf0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(buhf0);
        super("com.google.android.gms.googleone.internal.IStorageQuotaInfoCallback");
    }

    @Override  // buhb
    public final void a(Status status0, StorageQuotaInfo storageQuotaInfo0, ApiMetadata apiMetadata0) {
        azzf.b(status0, storageQuotaInfo0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            StorageQuotaInfo storageQuotaInfo0 = (StorageQuotaInfo)wbz.a(parcel0, StorageQuotaInfo.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            buha.gr(parcel0);
            this.a(status0, storageQuotaInfo0, apiMetadata0);
            return true;
        }
        return false;
    }
}

