import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dtdi.core.AnalyticsInfo;
import com.google.android.gms.dtdi.core.WakeUpRequest;
import com.google.android.gms.dtdi.core.internal.CreateDevicePickerIntentParams;
import com.google.android.gms.dtdi.discovery.DiscoveryParams;

public final class bitn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        DiscoveryParams discoveryParams0 = null;
        IBinder iBinder0 = null;
        WakeUpRequest wakeUpRequest0 = null;
        AnalyticsInfo analyticsInfo0 = null;
        long v2 = 0L;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    discoveryParams0 = (DiscoveryParams)baua.m(parcel0, v3, DiscoveryParams.CREATOR);
                    break;
                }
                case 2: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 3: {
                    iBinder0 = baua.k(parcel0, v3);
                    break;
                }
                case 4: {
                    wakeUpRequest0 = (WakeUpRequest)baua.m(parcel0, v3, WakeUpRequest.CREATOR);
                    break;
                }
                case 5: {
                    analyticsInfo0 = (AnalyticsInfo)baua.m(parcel0, v3, AnalyticsInfo.CREATOR);
                    break;
                }
                case 6: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new CreateDevicePickerIntentParams(discoveryParams0, v2, iBinder0, wakeUpRequest0, analyticsInfo0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CreateDevicePickerIntentParams[v];
    }
}

