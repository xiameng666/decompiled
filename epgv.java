import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class epgv extends wby implements epgw {
    final evqp a;

    public epgv() {
        super("com.google.android.gms.significantplaces.internal.IIntStatusCallback");
    }

    public epgv(evqp evqp0) {
        this.a = evqp0;
        super("com.google.android.gms.significantplaces.internal.IIntStatusCallback");
    }

    @Override  // epgw
    public final void a(Status status0, int v) {
        ibuq.f(status0, "status");
        azzf.b(status0, Integer.valueOf(v), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            int v1 = parcel0.readInt();
            epgv.gr(parcel0);
            this.a(status0, v1);
            return true;
        }
        return false;
    }
}

