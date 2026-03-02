import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.uwb.internal.OnRangingResultParams;
import com.google.android.gms.nearby.uwb.internal.RangingPositionParams;
import com.google.android.gms.nearby.uwb.internal.UwbDeviceParams;

public final class djes implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        UwbDeviceParams uwbDeviceParams0 = null;
        RangingPositionParams rangingPositionParams0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    uwbDeviceParams0 = (UwbDeviceParams)baua.m(parcel0, v1, UwbDeviceParams.CREATOR);
                    break;
                }
                case 2: {
                    rangingPositionParams0 = (RangingPositionParams)baua.m(parcel0, v1, RangingPositionParams.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new OnRangingResultParams(uwbDeviceParams0, rangingPositionParams0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OnRangingResultParams[v];
    }
}

