import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.home.matter.beacon.BluetoothBeacon;
import com.google.android.gms.home.matter.commissioning.DeviceInfo;

public final class bwgz implements Parcelable.Creator {
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
        return new BluetoothBeacon(deviceInfo0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BluetoothBeacon[v];
    }
}

