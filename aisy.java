import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class aisy extends wby implements aisz {
    final evqp a;

    public aisy() {
        super("com.google.android.gms.auth.blockstore.restorecredential.internal.ISetPrivateRestoreCredentialKeyCallback");
    }

    public aisy(evqp evqp0) {
        this.a = evqp0;
        super("com.google.android.gms.auth.blockstore.restorecredential.internal.ISetPrivateRestoreCredentialKeyCallback");
    }

    @Override  // aisz
    public final void a(Status status0, int v) {
        ibuq.f(status0, "status");
        azzf.b(status0, Integer.valueOf(v), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            int v1 = parcel0.readInt();
            aisy.gr(parcel0);
            this.a(status0, v1);
            return true;
        }
        return false;
    }
}

