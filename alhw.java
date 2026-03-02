import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class alhw extends wby implements alhx {
    final evqp a;

    public alhw() {
        super("com.google.android.gms.auth.proximity.internal.IGetFeatureEnabledStateCallback");
    }

    public alhw(alez alez0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(alez0);
        super("com.google.android.gms.auth.proximity.internal.IGetFeatureEnabledStateCallback");
    }

    @Override  // alhx
    public final void a(Status status0, int v) {
        azzf.b(status0, Integer.valueOf(v), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            int v1 = parcel0.readInt();
            alhw.gr(parcel0);
            this.a(status0, v1);
            return true;
        }
        return false;
    }
}

