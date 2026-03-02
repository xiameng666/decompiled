import android.os.Parcel;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
import com.google.android.gms.common.api.Status;

public final class aism extends wby implements aisn {
    final evqp a;

    public aism() {
        super("com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback");
    }

    public aism(evqp evqp0) {
        this.a = evqp0;
        super("com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback");
    }

    @Override  // aisn
    public final void a(Status status0, CreateRestoreCredentialResponse createRestoreCredentialResponse0) {
        ibuq.f(status0, "status");
        ibuq.f(createRestoreCredentialResponse0, "response");
        azzf.b(status0, createRestoreCredentialResponse0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            CreateRestoreCredentialResponse createRestoreCredentialResponse0 = (CreateRestoreCredentialResponse)wbz.a(parcel0, CreateRestoreCredentialResponse.CREATOR);
            aism.gr(parcel0);
            this.a(status0, createRestoreCredentialResponse0);
            return true;
        }
        return false;
    }
}

