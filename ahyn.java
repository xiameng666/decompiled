import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ahyn extends wby implements ahyo {
    final evqp a;

    public ahyn() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    public ahyn(ahxd ahxd0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ahxd0);
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override  // ahyo
    public final void a(Status status0) {
        azzf.a(status0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            ahyn.gr(parcel0);
            this.a(status0);
            return true;
        }
        return false;
    }
}

