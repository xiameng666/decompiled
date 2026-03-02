import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class epgs extends wby implements epgt {
    final evqp a;

    public epgs() {
        super("com.google.android.gms.significantplaces.internal.IBooleanStatusCallback");
    }

    public epgs(evqp evqp0) {
        this.a = evqp0;
        super("com.google.android.gms.significantplaces.internal.IBooleanStatusCallback");
    }

    @Override  // epgt
    public final void a(Status status0, boolean z) {
        ibuq.f(status0, "status");
        azzf.b(status0, Boolean.valueOf(z), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            boolean z = wbz.i(parcel0);
            epgs.gr(parcel0);
            this.a(status0, z);
            return true;
        }
        return false;
    }
}

