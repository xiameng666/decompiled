import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.findmydevice.spot.ChangeFindMyDeviceSettingsRequest;
import com.google.android.gms.findmydevice.spot.FindMyDeviceNetworkSettings;

public final class bnht implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        Boolean boolean0 = null;
        Boolean boolean1 = null;
        FindMyDeviceNetworkSettings findMyDeviceNetworkSettings0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    boolean0 = baua.n(parcel0, v1);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 4: {
                    boolean1 = baua.n(parcel0, v1);
                    break;
                }
                case 5: {
                    findMyDeviceNetworkSettings0 = (FindMyDeviceNetworkSettings)baua.m(parcel0, v1, FindMyDeviceNetworkSettings.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ChangeFindMyDeviceSettingsRequest(boolean0, boolean1, findMyDeviceNetworkSettings0, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ChangeFindMyDeviceSettingsRequest[v];
    }
}

