import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class ahla extends wbx implements IInterface {
    public ahla(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.auth.api.earlyupdate.internal.IEarlyUpdateCallbacks");
    }

    public final void a(Status status0, boolean z, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        parcel0.writeInt(((int)z));
        wbz.f(parcel0, apiMetadata0);
        this.jq(1, parcel0);
    }
}

