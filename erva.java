import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.spatula.settings.SpatulaAvailability;

public final class erva extends wbx implements IInterface {
    public erva(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.spatula.settings.internal.ISpatulaAvailabilityCallbacks");
    }

    public final void a(Status status0, SpatulaAvailability spatulaAvailability0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        wbz.f(parcel0, spatulaAvailability0);
        wbz.f(parcel0, apiMetadata0);
        this.jq(1, parcel0);
    }
}

