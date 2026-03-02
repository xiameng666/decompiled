import android.os.Parcel;
import com.google.android.gms.update.SystemUpdateStatus;

public abstract class ezuo extends wby implements ezup {
    public ezuo() {
        super("com.google.android.gms.update.ISystemUpdateStatusCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            SystemUpdateStatus systemUpdateStatus0 = (SystemUpdateStatus)wbz.a(parcel0, SystemUpdateStatus.CREATOR);
            ezuo.gr(parcel0);
            this.a(systemUpdateStatus0);
            return true;
        }
        return false;
    }
}

