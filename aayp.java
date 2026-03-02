import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class aayp extends wby implements aayq {
    final evqp a;

    public aayp() {
        super("com.google.android.gms.activeunlock.internal.IEnrollmentCallbacks");
    }

    public aayp(evqp evqp0) {
        this.a = evqp0;
        super("com.google.android.gms.activeunlock.internal.IEnrollmentCallbacks");
    }

    @Override  // aayq
    public final void a(Status status0, boolean z, ApiMetadata apiMetadata0) {
        ibuq.f(status0, "status");
        azzf.b(status0, Boolean.valueOf(z), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            boolean z = wbz.i(parcel0);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            aayp.gr(parcel0);
            this.a(status0, z, apiMetadata0);
            return true;
        }
        return false;
    }
}

