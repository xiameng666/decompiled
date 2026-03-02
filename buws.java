import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlesettings.SelectedAccountResult;

public final class buws extends wby implements buwt {
    final evqp a;

    public buws() {
        super("com.google.android.gms.googlesettings.internal.ISelectedAccountManagerCallbacks");
    }

    public buws(evqp evqp0) {
        this.a = evqp0;
        super("com.google.android.gms.googlesettings.internal.ISelectedAccountManagerCallbacks");
    }

    @Override  // buwt
    public final void a(Status status0, SelectedAccountResult selectedAccountResult0, ApiMetadata apiMetadata0) {
        azzf.b(status0, (selectedAccountResult0 == null ? null : selectedAccountResult0.a), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            SelectedAccountResult selectedAccountResult0 = (SelectedAccountResult)wbz.a(parcel0, SelectedAccountResult.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            buws.gr(parcel0);
            this.a(status0, selectedAccountResult0, apiMetadata0);
            return true;
        }
        return false;
    }
}

