import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;

public final class baqx implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Bundle bundle0 = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration0 = null;
        int v1 = 0;
        Feature[] arr_feature = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    bundle0 = baua.j(parcel0, v2);
                    break;
                }
                case 2: {
                    arr_feature = (Feature[])baua.J(parcel0, v2, Feature.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 4: {
                    connectionTelemetryConfiguration0 = (ConnectionTelemetryConfiguration)baua.m(parcel0, v2, ConnectionTelemetryConfiguration.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ConnectionInfo(bundle0, arr_feature, v1, connectionTelemetryConfiguration0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ConnectionInfo[v];
    }
}

