import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public abstract class ajtb extends wby implements ajtc {
    public ajtb() {
        super("com.google.android.gms.auth.folsom.internal.IKeyRetrievalCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            ajtb.gr(parcel0);
            this.a(status0, apiMetadata0);
            return true;
        }
        return false;
    }
}

