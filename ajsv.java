import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public abstract class ajsv extends wby implements ajsw {
    public ajsv() {
        super("com.google.android.gms.auth.folsom.internal.IByteArrayCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            byte[] arr_b = parcel0.createByteArray();
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            ajsv.gr(parcel0);
            this.a(status0, arr_b, apiMetadata0);
            return true;
        }
        return false;
    }
}

