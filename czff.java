import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.DeviceParams;

public abstract class czff extends wby implements czfg {
    public czff() {
        super("com.google.android.gms.nearby.internal.connection.IDeviceResultListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 2) {
            DeviceParams deviceParams0 = (DeviceParams)wbz.a(parcel0, DeviceParams.CREATOR);
            czff.gr(parcel0);
            this.a(deviceParams0);
            return true;
        }
        return false;
    }
}

