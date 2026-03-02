import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.model.RestoreSuggestionEntity;
import java.util.ArrayList;
import java.util.List;

public class ekfd extends wby implements ekfe {
    public ekfd() {
        super("com.google.android.gms.romanesco.internal.IPromoRomanescoRestoresCallbacks");
    }

    @Override  // ekfe
    public void a(Status status0, List list0, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            ArrayList arrayList0 = parcel0.createTypedArrayList(RestoreSuggestionEntity.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            ekfd.gr(parcel0);
            this.a(status0, arrayList0, apiMetadata0);
            return true;
        }
        return false;
    }
}

