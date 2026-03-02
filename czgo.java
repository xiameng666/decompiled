import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import com.google.android.gms.nearby.presence.PresenceDevice;

public final class czgo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        byte[] arr_b = null;
        PresenceDevice presenceDevice0 = null;
        ConnectionsDevice connectionsDevice0 = null;
        DctDevice dctDevice0 = null;
        int v1 = 0;
        int v2 = 0;
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
                    arr_b = baua.E(parcel0, v3);
                    break;
                }
                case 4: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 5: {
                    presenceDevice0 = (PresenceDevice)baua.m(parcel0, v3, PresenceDevice.CREATOR);
                    break;
                }
                case 6: {
                    connectionsDevice0 = (ConnectionsDevice)baua.m(parcel0, v3, ConnectionsDevice.CREATOR);
                    break;
                }
                case 7: {
                    dctDevice0 = (DctDevice)baua.m(parcel0, v3, DctDevice.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new OnConnectionResultParams(s, v1, arr_b, v2, presenceDevice0, connectionsDevice0, dctDevice0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OnConnectionResultParams[v];
    }
}

