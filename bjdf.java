import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dtdi.core.DeviceFilter;
import com.google.android.gms.dtdi.discovery.DiscoveryParams;

public final class bjdf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        DeviceFilter[] arr_deviceFilter = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    arr_deviceFilter = (DeviceFilter[])baua.J(parcel0, v2, DeviceFilter.CREATOR);
                    break;
                }
                case 2: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new DiscoveryParams(arr_deviceFilter, z, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DiscoveryParams[v];
    }
}

