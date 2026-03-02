import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.core.settings.ControlPageResponse;
import j..util.Objects;

public final class bcxy extends wby implements bcxz {
    final evqp a;

    public bcxy() {
        super("com.google.android.gms.core.settings.internal.ISettingsCallbacks");
    }

    public bcxy(bcyf bcyf0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(bcyf0);
        super("com.google.android.gms.core.settings.internal.ISettingsCallbacks");
    }

    @Override  // bcxz
    public final void a(Status status0, ControlPageResponse controlPageResponse0, ApiMetadata apiMetadata0) {
        azzf.b(status0, controlPageResponse0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            ControlPageResponse controlPageResponse0 = (ControlPageResponse)wbz.a(parcel0, ControlPageResponse.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            bcxy.gr(parcel0);
            this.a(status0, controlPageResponse0, apiMetadata0);
            return true;
        }
        return false;
    }
}

