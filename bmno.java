import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public abstract class bmno extends wby implements bmnp {
    public bmno() {
        super("com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            PendingIntent pendingIntent0 = (PendingIntent)wbz.a(parcel0, PendingIntent.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            bmno.gr(parcel0);
            this.a(status0, pendingIntent0, apiMetadata0);
            return true;
        }
        return false;
    }
}

