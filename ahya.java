import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class ahya extends wbx implements IInterface {
    public ahya(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverCallbacks");
    }

    public final void a(PendingIntent pendingIntent0, Status status0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, pendingIntent0);
        wbz.f(parcel0, status0);
        this.jq(1, parcel0);
    }
}

