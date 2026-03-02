import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.usonia.DeviceInfo;
import com.google.android.gms.usonia.directory.internal.OnDistributedStateChangeParams;

public final class fapm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        DeviceInfo deviceInfo0 = null;
        String s = null;
        byte[] arr_b = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    deviceInfo0 = (DeviceInfo)baua.m(parcel0, v1, DeviceInfo.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 4: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new OnDistributedStateChangeParams(deviceInfo0, s, arr_b, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OnDistributedStateChangeParams[v];
    }
}

