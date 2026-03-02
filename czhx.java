import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.internal.connection.ConnectionOptions;
import com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams;
import com.google.android.gms.nearby.presence.PresenceDevice;

public final class czhx implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        IBinder iBinder2 = null;
        String s = null;
        String s1 = null;
        byte[] arr_b = null;
        IBinder iBinder3 = null;
        byte[] arr_b1 = null;
        ConnectionOptions connectionOptions0 = null;
        PresenceDevice presenceDevice0 = null;
        ConnectionsDevice connectionsDevice0 = null;
        DctDevice dctDevice0 = null;
        byte[] arr_b2 = null;
        String s2 = null;
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
                    iBinder2 = baua.k(parcel0, v2);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 6: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                case 7: {
                    iBinder3 = baua.k(parcel0, v2);
                    break;
                }
                case 8: {
                    arr_b1 = baua.E(parcel0, v2);
                    break;
                }
                case 9: {
                    connectionOptions0 = (ConnectionOptions)baua.m(parcel0, v2, ConnectionOptions.CREATOR);
                    break;
                }
                case 10: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 11: {
                    presenceDevice0 = (PresenceDevice)baua.m(parcel0, v2, PresenceDevice.CREATOR);
                    break;
                }
                case 12: {
                    arr_b2 = baua.E(parcel0, v2);
                    break;
                }
                case 13: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 14: {
                    connectionsDevice0 = (ConnectionsDevice)baua.m(parcel0, v2, ConnectionsDevice.CREATOR);
                    break;
                }
                case 15: {
                    dctDevice0 = (DctDevice)baua.m(parcel0, v2, DctDevice.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new SendConnectionRequestParams(iBinder0, iBinder1, iBinder2, s, s1, arr_b, iBinder3, arr_b1, connectionOptions0, v1, presenceDevice0, connectionsDevice0, dctDevice0, arr_b2, s2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SendConnectionRequestParams[v];
    }
}

