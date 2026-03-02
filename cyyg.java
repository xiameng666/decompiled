import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams;
import com.google.android.gms.nearby.presence.PresenceDevice;

public final class cyyg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        String s = null;
        byte[] arr_b = null;
        IBinder iBinder2 = null;
        PresenceDevice presenceDevice0 = null;
        ConnectionsDevice connectionsDevice0 = null;
        DctDevice dctDevice0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    iBinder0 = baua.k(parcel0, v2);
                    break;
                }
                case 2: {
                    iBinder1 = baua.k(parcel0, v2);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                case 5: {
                    iBinder2 = baua.k(parcel0, v2);
                    break;
                }
                case 6: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 7: {
                    presenceDevice0 = (PresenceDevice)baua.m(parcel0, v2, PresenceDevice.CREATOR);
                    break;
                }
                case 8: {
                    connectionsDevice0 = (ConnectionsDevice)baua.m(parcel0, v2, ConnectionsDevice.CREATOR);
                    break;
                }
                case 9: {
                    dctDevice0 = (DctDevice)baua.m(parcel0, v2, DctDevice.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new AcceptConnectionRequestParams(iBinder0, iBinder1, s, arr_b, iBinder2, v1, presenceDevice0, connectionsDevice0, dctDevice0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AcceptConnectionRequestParams[v];
    }
}

