import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class aisp extends wby implements aisq {
    final evqp a;

    public aisp() {
        super("com.google.android.gms.auth.blockstore.restorecredential.internal.IGetPrivateRestoreCredentialKeyCallback");
    }

    public aisp(evqp evqp0) {
        this.a = evqp0;
        super("com.google.android.gms.auth.blockstore.restorecredential.internal.IGetPrivateRestoreCredentialKeyCallback");
    }

    @Override  // aisq
    public final void a(Status status0, byte[] arr_b) {
        ibuq.f(status0, "status");
        ibuq.f(arr_b, "restoreKey");
        azzf.b(status0, arr_b, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            byte[] arr_b = parcel0.createByteArray();
            aisp.gr(parcel0);
            this.a(status0, arr_b);
            return true;
        }
        return false;
    }
}

