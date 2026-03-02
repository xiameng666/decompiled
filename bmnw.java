import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public abstract class bmnw extends wby implements bmnx {
    public bmnw() {
        super("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                PendingIntent pendingIntent0 = (PendingIntent)wbz.a(parcel0, PendingIntent.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnw.gr(parcel0);
                this.c(status0, pendingIntent0, apiMetadata0);
                return true;
            }
            case 2: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnw.gr(parcel0);
                this.a(status1, apiMetadata1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

