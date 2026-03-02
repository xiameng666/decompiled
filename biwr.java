import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dtdi.core.AnalyticsInfo;
import com.google.android.gms.dtdi.core.internal.StopScanningForDeviceAvailabilityParams;

public final class biwr implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IBinder iBinder0 = null;
        int v1 = 0;
        AnalyticsInfo analyticsInfo0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    iBinder0 = baua.k(parcel0, v2);
                    break;
                }
                case 3: {
                    analyticsInfo0 = (AnalyticsInfo)baua.m(parcel0, v2, AnalyticsInfo.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new StopScanningForDeviceAvailabilityParams(v1, iBinder0, analyticsInfo0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StopScanningForDeviceAvailabilityParams[v];
    }
}

