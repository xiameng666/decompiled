import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class bdib extends wby implements bdic {
    private final evqp a;

    public bdib() {
        super("com.google.android.gms.credential.manager.common.IPendingIntentCallback");
    }

    public bdib(evqp evqp0) {
        super("com.google.android.gms.credential.manager.common.IPendingIntentCallback");
        this.a = evqp0;
    }

    @Override  // bdic
    public final void a(Status status0, PendingIntent pendingIntent0, ApiMetadata apiMetadata0) {
        azzf.b(status0, pendingIntent0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            PendingIntent pendingIntent0 = (PendingIntent)wbz.a(parcel0, PendingIntent.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            bdib.gr(parcel0);
            this.a(status0, pendingIntent0, apiMetadata0);
            return true;
        }
        return false;
    }
}

