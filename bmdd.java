import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.credentialstore.KeyData;

public abstract class bmdd extends wby implements bmde {
    public bmdd() {
        super("com.google.android.gms.fido.credentialstore.internal.IKeyDataCallbacks");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            KeyData keyData0 = (KeyData)wbz.a(parcel0, KeyData.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            bmdd.gr(parcel0);
            this.a(status0, keyData0, apiMetadata0);
            return true;
        }
        return false;
    }
}

