import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.model.RestoreResultEntity;
import com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.romanesco.protomodel.RawContactEntity;
import com.google.android.gms.romanesco.protomodel.RestoreInfoEntity;
import com.google.android.gms.romanesco.protomodel.SourceStatsEntity;
import java.util.ArrayList;
import java.util.List;

public class ekfg extends wby implements ekfh {
    public ekfg() {
        super("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
    }

    @Override  // ekfh
    public void a(Status status0, List list0, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }

    @Override  // ekfh
    public void c(Status status0, List list0, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }

    @Override  // ekfh
    public void d(Status status0, RestoreResultEntity restoreResultEntity0, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }

    @Override  // ekfh
    public void e(Status status0, List list0, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }

    @Override  // ekfh
    public void f(Status status0, List list0, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                ArrayList arrayList0 = parcel0.createTypedArrayList(RawContactEntity.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekfg.gr(parcel0);
                this.a(status0, arrayList0, apiMetadata0);
                return true;
            }
            case 2: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekfg.gr(parcel0);
                this.g(status1, apiMetadata1);
                return true;
            }
            case 3: {
                Status status2 = (Status)wbz.a(parcel0, Status.CREATOR);
                ArrayList arrayList1 = parcel0.createTypedArrayList(BackedUpContactsPerDeviceEntity.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekfg.gr(parcel0);
                this.e(status2, arrayList1, apiMetadata2);
                return true;
            }
            case 4: {
                Status status3 = (Status)wbz.a(parcel0, Status.CREATOR);
                ArrayList arrayList2 = parcel0.createTypedArrayList(SourceStatsEntity.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekfg.gr(parcel0);
                this.f(status3, arrayList2, apiMetadata3);
                return true;
            }
            case 5: {
                Status status4 = (Status)wbz.a(parcel0, Status.CREATOR);
                ArrayList arrayList3 = parcel0.createTypedArrayList(RestoreInfoEntity.CREATOR);
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekfg.gr(parcel0);
                this.c(status4, arrayList3, apiMetadata4);
                return true;
            }
            case 6: {
                Status status5 = (Status)wbz.a(parcel0, Status.CREATOR);
                RestoreResultEntity restoreResultEntity0 = (RestoreResultEntity)wbz.a(parcel0, RestoreResultEntity.CREATOR);
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekfg.gr(parcel0);
                this.d(status5, restoreResultEntity0, apiMetadata5);
                return true;
            }
            case 7: {
                Status status6 = (Status)wbz.a(parcel0, Status.CREATOR);
                RestoreResultEntity restoreResultEntity1 = (RestoreResultEntity)wbz.a(parcel0, RestoreResultEntity.CREATOR);
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekfg.gr(parcel0);
                this.h(status6, restoreResultEntity1, apiMetadata6);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // ekfh
    public void g(Status status0, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }

    @Override  // ekfh
    public void h(Status status0, RestoreResultEntity restoreResultEntity0, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }
}

