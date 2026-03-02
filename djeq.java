import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.uwb.internal.OnPeerDisconnectedParams;
import com.google.android.gms.nearby.uwb.internal.UwbDeviceParams;

public final class djeq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        UwbDeviceParams uwbDeviceParams0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    uwbDeviceParams0 = (UwbDeviceParams)baua.m(parcel0, v2, UwbDeviceParams.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new OnPeerDisconnectedParams(uwbDeviceParams0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OnPeerDisconnectedParams[v];
    }
}

