import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class goxg extends wbx implements IInterface {
    public goxg(IBinder iBinder0) {
        super(iBinder0, "com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
    }

    public final void a(Status status0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        this.jq(5, parcel0);
    }
}

