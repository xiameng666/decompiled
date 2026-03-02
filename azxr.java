import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public abstract class azxr extends wby implements azxs {
    public azxr() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            azxr.gr(parcel0);
            this.a(status0);
            return true;
        }
        return false;
    }
}

