import android.os.Parcel;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse;
import com.google.android.gms.common.api.Status;

public final class aiss extends wby implements aist {
    final evqp a;

    public aiss() {
        super("com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback");
    }

    public aiss(evqp evqp0) {
        this.a = evqp0;
        super("com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback");
    }

    @Override  // aist
    public final void a(Status status0, GetRestoreCredentialResponse getRestoreCredentialResponse0) {
        ibuq.f(status0, "status");
        ibuq.f(getRestoreCredentialResponse0, "response");
        azzf.b(status0, getRestoreCredentialResponse0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            GetRestoreCredentialResponse getRestoreCredentialResponse0 = (GetRestoreCredentialResponse)wbz.a(parcel0, GetRestoreCredentialResponse.CREATOR);
            aiss.gr(parcel0);
            this.a(status0, getRestoreCredentialResponse0);
            return true;
        }
        return false;
    }
}

