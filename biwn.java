import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dtdi.core.DeviceFilter;
import com.google.android.gms.dtdi.core.internal.StartOrUpdateDiscoveryParams;

public final class biwn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        DeviceFilter[] arr_deviceFilter = null;
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    arr_deviceFilter = (DeviceFilter[])baua.J(parcel0, v2, DeviceFilter.CREATOR);
                    break;
                }
                case 2: {
                    iBinder0 = baua.k(parcel0, v2);
                    break;
                }
                case 3: {
                    iBinder1 = baua.k(parcel0, v2);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new StartOrUpdateDiscoveryParams(arr_deviceFilter, iBinder0, iBinder1, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StartOrUpdateDiscoveryParams[v];
    }
}

