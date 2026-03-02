import android.os.Parcel;
import com.google.android.gms.auth.api.fido.GetGooglePasskeyForExportResponse;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ahnp extends wby implements ahnq {
    final evqp a;

    public ahnp() {
        super("com.google.android.gms.auth.api.fido.internal.IGetGooglePasskeyForExportCallback");
    }

    public ahnp(ahow ahow0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ahow0);
        super("com.google.android.gms.auth.api.fido.internal.IGetGooglePasskeyForExportCallback");
    }

    @Override  // ahnq
    public final void a(Status status0, GetGooglePasskeyForExportResponse getGooglePasskeyForExportResponse0) {
        azzf.b(status0, getGooglePasskeyForExportResponse0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            GetGooglePasskeyForExportResponse getGooglePasskeyForExportResponse0 = (GetGooglePasskeyForExportResponse)wbz.a(parcel0, GetGooglePasskeyForExportResponse.CREATOR);
            ahnp.gr(parcel0);
            this.a(status0, getGooglePasskeyForExportResponse0);
            return true;
        }
        return false;
    }
}

