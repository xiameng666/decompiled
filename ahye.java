import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ahye extends wby implements ahyf {
    final evqp a;

    public ahye() {
        super("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
    }

    public ahye(ahyu ahyu0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ahyu0);
        super("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
    }

    @Override  // ahyf
    public final void a(Status status0, boolean z) {
        azzf.b(status0, Boolean.valueOf(z), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            boolean z = wbz.i(parcel0);
            ahye.gr(parcel0);
            this.a(status0, z);
            return true;
        }
        return false;
    }
}

