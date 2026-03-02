import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.multidevice.XdFeatureStatusResult;

public final class ctby extends wby implements ctbz {
    final evqp a;

    public ctby() {
        super("com.google.android.gms.multidevice.internal.IFeatureSettingsCallback");
    }

    public ctby(evqp evqp0) {
        this.a = evqp0;
        super("com.google.android.gms.multidevice.internal.IFeatureSettingsCallback");
    }

    @Override  // ctbz
    public final void a(Status status0, XdFeatureStatusResult xdFeatureStatusResult0, ApiMetadata apiMetadata0) {
        ibuq.f(status0, "status");
        azzf.b(status0, xdFeatureStatusResult0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            XdFeatureStatusResult xdFeatureStatusResult0 = (XdFeatureStatusResult)wbz.a(parcel0, XdFeatureStatusResult.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            ctby.gr(parcel0);
            this.a(status0, xdFeatureStatusResult0, apiMetadata0);
            return true;
        }
        return false;
    }
}

