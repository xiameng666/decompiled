import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

public final class baqy implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        RootTelemetryConfiguration rootTelemetryConfiguration0 = null;
        int[] arr_v = null;
        int[] arr_v1 = null;
        boolean z = false;
        boolean z1 = false;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    rootTelemetryConfiguration0 = (RootTelemetryConfiguration)baua.m(parcel0, v2, RootTelemetryConfiguration.CREATOR);
                    break;
                }
                case 2: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 3: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                case 4: {
                    arr_v = baua.H(parcel0, v2);
                    break;
                }
                case 5: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 6: {
                    arr_v1 = baua.H(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration0, z, z1, arr_v, v1, arr_v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ConnectionTelemetryConfiguration[v];
    }
}

