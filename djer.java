import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.uwb.internal.OnRangingInitializedParams;
import com.google.android.gms.nearby.uwb.internal.UwbDeviceParams;

public final class djer implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        UwbDeviceParams uwbDeviceParams0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                uwbDeviceParams0 = (UwbDeviceParams)baua.m(parcel0, v1, UwbDeviceParams.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new OnRangingInitializedParams(uwbDeviceParams0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OnRangingInitializedParams[v];
    }
}

