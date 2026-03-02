import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;
import com.google.android.gms.nearby.presence.PresenceDevice;

public final class czgl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        boolean z1 = false;
        int v1 = 0;
        int v2 = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        byte[] arr_b = null;
        byte[] arr_b1 = null;
        byte[] arr_b2 = null;
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
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 3: {
                    s2 = baua.s(parcel0, v3);
                    break;
                }
                case 4: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 5: {
                    arr_b = baua.E(parcel0, v3);
                    break;
                }
                case 6: {
                    arr_b1 = baua.E(parcel0, v3);
                    break;
                }
                case 7: {
                    arr_b2 = baua.E(parcel0, v3);
                    break;
                }
                case 8: {
                    z1 = baua.D(parcel0, v3);
                    break;
                }
                case 9: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 10: {
                    presenceDevice0 = (PresenceDevice)baua.m(parcel0, v3, PresenceDevice.CREATOR);
                    break;
                }
                case 11: {
                    connectionsDevice0 = (ConnectionsDevice)baua.m(parcel0, v3, ConnectionsDevice.CREATOR);
                    break;
                }
                case 12: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 13: {
                    dctDevice0 = (DctDevice)baua.m(parcel0, v3, DctDevice.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new OnConnectionInitiatedParams(s, s1, s2, z, arr_b, arr_b1, arr_b2, z1, v1, presenceDevice0, connectionsDevice0, dctDevice0, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OnConnectionInitiatedParams[v];
    }
}

