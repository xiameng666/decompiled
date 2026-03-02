import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class bnfp extends wbx implements IInterface {
    public bnfp(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.fido.u2f.internal.regular.IU2fAppCallbacks");
    }

    public final void a(Status status0, PendingIntent pendingIntent0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        wbz.f(parcel0, pendingIntent0);
        wbz.f(parcel0, apiMetadata0);
        this.jq(1, parcel0);
    }
}

