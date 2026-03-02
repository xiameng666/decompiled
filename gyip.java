import android.os.Parcel;
import com.google.location.nearby.direct.client.internal.OperationStatus;

public abstract class gyip extends wby implements gyiq {
    public gyip() {
        super("com.google.location.nearby.direct.client.internal.INearbyDirectCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            OperationStatus operationStatus0 = (OperationStatus)wbz.a(parcel0, OperationStatus.CREATOR);
            gyip.gr(parcel0);
            this.a(operationStatus0);
            return true;
        }
        return false;
    }
}

