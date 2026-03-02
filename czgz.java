import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;
import com.google.android.gms.nearby.presence.PresenceDevice;

public final class czgz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        PayloadTransferUpdate payloadTransferUpdate0 = null;
        PresenceDevice presenceDevice0 = null;
        ConnectionsDevice connectionsDevice0 = null;
        DctDevice dctDevice0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 2: {
                    payloadTransferUpdate0 = (PayloadTransferUpdate)baua.m(parcel0, v2, PayloadTransferUpdate.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 4: {
                    presenceDevice0 = (PresenceDevice)baua.m(parcel0, v2, PresenceDevice.CREATOR);
                    break;
                }
                case 5: {
                    connectionsDevice0 = (ConnectionsDevice)baua.m(parcel0, v2, ConnectionsDevice.CREATOR);
                    break;
                }
                case 6: {
                    dctDevice0 = (DctDevice)baua.m(parcel0, v2, DctDevice.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new OnPayloadTransferUpdateParams(s, payloadTransferUpdate0, v1, presenceDevice0, connectionsDevice0, dctDevice0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OnPayloadTransferUpdateParams[v];
    }
}

