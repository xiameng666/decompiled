import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.ConnectionOptions;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.internal.connection.SendConnectionRequestParamsV3;
import com.google.android.gms.nearby.presence.PresenceDevice;

public final class czhy implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        ConnectionOptions connectionOptions0 = null;
        ConnectionsDevice connectionsDevice0 = null;
        PresenceDevice presenceDevice0 = null;
        ConnectionsDevice connectionsDevice1 = null;
        DctDevice dctDevice0 = null;
        String s = null;
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
                    connectionOptions0 = (ConnectionOptions)baua.m(parcel0, v2, ConnectionOptions.CREATOR);
                    break;
                }
                case 4: {
                    connectionsDevice0 = (ConnectionsDevice)baua.m(parcel0, v2, ConnectionsDevice.CREATOR);
                    break;
                }
                case 5: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 6: {
                    presenceDevice0 = (PresenceDevice)baua.m(parcel0, v2, PresenceDevice.CREATOR);
                    break;
                }
                case 7: {
                    connectionsDevice1 = (ConnectionsDevice)baua.m(parcel0, v2, ConnectionsDevice.CREATOR);
                    break;
                }
                case 8: {
                    s = baua.s(parcel0, v2);
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
        return new SendConnectionRequestParamsV3(iBinder0, iBinder1, connectionOptions0, connectionsDevice0, v1, presenceDevice0, connectionsDevice1, dctDevice0, s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SendConnectionRequestParamsV3[v];
    }
}

