import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public abstract class ajte extends wby implements ajtf {
    public ajte() {
        super("com.google.android.gms.auth.folsom.internal.IKeyRetrievalConsentCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            boolean z = wbz.i(parcel0);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            ajte.gr(parcel0);
            this.a(status0, z, apiMetadata0);
            return true;
        }
        return false;
    }
}

