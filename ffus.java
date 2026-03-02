import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class ffus extends wby implements IInterface {
    final evqp a;

    public ffus() {
        super("com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.IBooleanCallback");
    }

    public ffus(evqp evqp0) {
        this.a = evqp0;
        super("com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.IBooleanCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 2) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            boolean z = wbz.i(parcel0);
            ffus.gr(parcel0);
            ibuq.f(status0, "status");
            azzf.b(status0, Boolean.valueOf(z), this.a);
            return true;
        }
        return false;
    }
}

