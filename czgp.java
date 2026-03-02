import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;
import com.google.android.gms.nearby.presence.PresenceDevice;

public final class czgp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        String s = null;
        PresenceDevice presenceDevice0 = null;
        ConnectionsDevice connectionsDevice0 = null;
        DctDevice dctDevice0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 3: {
                    presenceDevice0 = (PresenceDevice)baua.m(parcel0, v3, PresenceDevice.CREATOR);
                    break;
                }
                case 4: {
                    connectionsDevice0 = (ConnectionsDevice)baua.m(parcel0, v3, ConnectionsDevice.CREATOR);
                    break;
                }
                case 5: {
                    dctDevice0 = (DctDevice)baua.m(parcel0, v3, DctDevice.CREATOR);
                    break;
                }
                case 6: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new OnDisconnectedParams(s, v1, presenceDevice0, connectionsDevice0, dctDevice0, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OnDisconnectedParams[v];
    }
}

