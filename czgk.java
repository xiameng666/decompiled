import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import com.google.android.gms.nearby.presence.PresenceDevice;

public final class czgk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        PresenceDevice presenceDevice0 = null;
        ConnectionsDevice connectionsDevice0 = null;
        DctDevice dctDevice0 = null;
        String s1 = null;
        String s2 = null;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        int v9 = -1;
        while(parcel0.dataPosition() < v) {
            int v10 = parcel0.readInt();
            switch(((char)v10)) {
                case 1: {
                    s = baua.s(parcel0, v10);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v10);
                    break;
                }
                case 3: {
                    v2 = baua.f(parcel0, v10);
                    break;
                }
                case 4: {
                    v3 = baua.f(parcel0, v10);
                    break;
                }
                case 5: {
                    presenceDevice0 = (PresenceDevice)baua.m(parcel0, v10, PresenceDevice.CREATOR);
                    break;
                }
                case 6: {
                    connectionsDevice0 = (ConnectionsDevice)baua.m(parcel0, v10, ConnectionsDevice.CREATOR);
                    break;
                }
                case 7: {
                    v9 = baua.f(parcel0, v10);
                    break;
                }
                case 8: {
                    v4 = baua.f(parcel0, v10);
                    break;
                }
                case 9: {
                    v5 = baua.f(parcel0, v10);
                    break;
                }
                case 10: {
                    v6 = baua.f(parcel0, v10);
                    break;
                }
                case 11: {
                    dctDevice0 = (DctDevice)baua.m(parcel0, v10, DctDevice.CREATOR);
                    break;
                }
                case 12: {
                    v7 = baua.f(parcel0, v10);
                    break;
                }
                case 13: {
                    v8 = baua.f(parcel0, v10);
                    break;
                }
                case 14: {
                    s1 = baua.s(parcel0, v10);
                    break;
                }
                case 15: {
                    s2 = baua.s(parcel0, v10);
                    break;
                }
                default: {
                    baua.C(parcel0, v10);
                }
            }
        }
        baua.A(parcel0, v);
        return new OnBandwidthChangedParams(s, v1, v2, v3, presenceDevice0, connectionsDevice0, dctDevice0, v9, v4, v5, v6, v7, v8, s1, s2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OnBandwidthChangedParams[v];
    }
}

