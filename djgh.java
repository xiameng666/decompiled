import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.uwb.internal.UwbAddressParams;
import com.google.android.gms.nearby.uwb.internal.UwbDeviceParams;

public final class djgh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        UwbAddressParams uwbAddressParams0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                uwbAddressParams0 = (UwbAddressParams)baua.m(parcel0, v1, UwbAddressParams.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new UwbDeviceParams(uwbAddressParams0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UwbDeviceParams[v];
    }
}

