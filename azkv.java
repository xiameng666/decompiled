import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class azkv extends wbx implements IInterface {
    public azkv(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.cobalt.internal.ICobaltLoggerCallbacks");
    }

    public final void a(Status status0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        this.jq(2, parcel0);
    }

    public final void b(Status status0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        this.jq(1, parcel0);
    }
}

