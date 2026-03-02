import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import com.google.android.gms.nearby.presence.PresenceDevice;

public final class czgy implements Parcelable.Creator {
    public static void a(OnPayloadReceivedParams onPayloadReceivedParams0, Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, onPayloadReceivedParams0.a, false);
        baub.t(parcel0, 2, onPayloadReceivedParams0.b, v, false);
        baub.e(parcel0, 3, onPayloadReceivedParams0.c);
        baub.o(parcel0, 4, onPayloadReceivedParams0.d);
        baub.t(parcel0, 5, onPayloadReceivedParams0.e, v, false);
        baub.t(parcel0, 6, onPayloadReceivedParams0.f, v, false);
        baub.t(parcel0, 7, onPayloadReceivedParams0.g, v, false);
        baub.c(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        ParcelablePayload parcelablePayload0 = null;
        PresenceDevice presenceDevice0 = null;
        ConnectionsDevice connectionsDevice0 = null;
        DctDevice dctDevice0 = null;
        boolean z = false;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 2: {
                    parcelablePayload0 = (ParcelablePayload)baua.m(parcel0, v2, ParcelablePayload.CREATOR);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 5: {
                    presenceDevice0 = (PresenceDevice)baua.m(parcel0, v2, PresenceDevice.CREATOR);
                    break;
                }
                case 6: {
                    connectionsDevice0 = (ConnectionsDevice)baua.m(parcel0, v2, ConnectionsDevice.CREATOR);
                    break;
                }
                case 7: {
                    dctDevice0 = (DctDevice)baua.m(parcel0, v2, DctDevice.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new OnPayloadReceivedParams(s, parcelablePayload0, z, v1, presenceDevice0, connectionsDevice0, dctDevice0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OnPayloadReceivedParams[v];
    }
}

