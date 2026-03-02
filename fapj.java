import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.usonia.DeviceInfo;
import com.google.android.gms.usonia.directory.internal.OnDeviceOfflineParams;

public final class fapj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        DeviceInfo deviceInfo0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                deviceInfo0 = (DeviceInfo)baua.m(parcel0, v1, DeviceInfo.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new OnDeviceOfflineParams(deviceInfo0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OnDeviceOfflineParams[v];
    }
}

