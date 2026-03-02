import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class aywb extends wbx implements IInterface {
    public aywb(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.clearcut.appdoctor.IAppDoctorClearcutLogManagerCallbacks");
    }

    public final void a(Status status0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        this.jq(2, parcel0);
    }

    public final void b(Status status0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        this.jq(3, parcel0);
    }
}

