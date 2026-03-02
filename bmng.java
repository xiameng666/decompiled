import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public abstract class bmng extends wby implements bmnh {
    public bmng() {
        super("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            PendingIntent pendingIntent0 = (PendingIntent)wbz.a(parcel0, PendingIntent.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            bmng.gr(parcel0);
            this.a(status0, pendingIntent0, apiMetadata0);
            return true;
        }
        return false;
    }
}

