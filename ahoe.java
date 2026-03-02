import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public abstract class ahoe extends wby implements ahof {
    public ahoe() {
        super("com.google.android.gms.auth.api.fido.internal.IPendingIntentCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            PendingIntent pendingIntent0 = (PendingIntent)wbz.a(parcel0, PendingIntent.CREATOR);
            ahoe.gr(parcel0);
            this.a(status0, pendingIntent0);
            return true;
        }
        return false;
    }
}

