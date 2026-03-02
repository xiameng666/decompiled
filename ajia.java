import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class ajia extends wby implements ajib {
    final ajeg a;

    public ajia() {
        super("com.google.android.gms.auth.cryptauth.internal.IRetrieveDeviceSyncMetadataCallback");
    }

    public ajia(ajeg ajeg0) {
        Objects.requireNonNull(ajeg0);
        this.a = ajeg0;
        super("com.google.android.gms.auth.cryptauth.internal.IRetrieveDeviceSyncMetadataCallback");
    }

    @Override  // ajib
    public final void a(Status status0, ApiMetadata apiMetadata0) {
        this.a.d(status0);
    }

    @Override  // ajib
    public final void b(List list0, ApiMetadata apiMetadata0) {
        this.a.e(list0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                ArrayList arrayList0 = wbz.b(parcel0);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajia.gr(parcel0);
                this.b(arrayList0, apiMetadata0);
                return true;
            }
            case 2: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajia.gr(parcel0);
                this.a(status0, apiMetadata1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

