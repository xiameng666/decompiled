import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dtdi.core.AnalyticsInfo;
import com.google.android.gms.dtdi.core.DeviceFilter;
import com.google.android.gms.dtdi.core.internal.StartScanningForDeviceAvailabilityParams;

public final class biwo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        DeviceFilter[] arr_deviceFilter = null;
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        AnalyticsInfo analyticsInfo0 = null;
        int v1 = 0;
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
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 4: {
                    iBinder1 = baua.k(parcel0, v2);
                    break;
                }
                case 5: {
                    analyticsInfo0 = (AnalyticsInfo)baua.m(parcel0, v2, AnalyticsInfo.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new StartScanningForDeviceAvailabilityParams(arr_deviceFilter, iBinder0, v1, iBinder1, analyticsInfo0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StartScanningForDeviceAvailabilityParams[v];
    }
}

