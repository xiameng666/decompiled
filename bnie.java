import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.findmydevice.spot.CachedSpotDevice;
import com.google.android.gms.findmydevice.spot.GetCachedDevicesResponse;

public final class bnie implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        CachedSpotDevice[] arr_cachedSpotDevice = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                arr_cachedSpotDevice = (CachedSpotDevice[])baua.J(parcel0, v1, CachedSpotDevice.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new GetCachedDevicesResponse(arr_cachedSpotDevice);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetCachedDevicesResponse[v];
    }
}

