import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class aios extends wby implements aiot {
    final evqp a;

    public aios() {
        super("com.google.android.gms.auth.blockstore.internal.IIsEndToEndEncryptionAvailableCallback");
    }

    public aios(aipl aipl0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(aipl0);
        super("com.google.android.gms.auth.blockstore.internal.IIsEndToEndEncryptionAvailableCallback");
    }

    @Override  // aiot
    public final void a(Status status0, boolean z) {
        azzf.b(status0, Boolean.valueOf(z), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            boolean z = wbz.i(parcel0);
            aios.gr(parcel0);
            this.a(status0, z);
            return true;
        }
        return false;
    }
}

