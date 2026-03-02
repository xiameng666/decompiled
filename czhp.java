import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.internal.connection.ProviderAuthenticateAsInitiatorParams;
import com.google.android.gms.nearby.presence.PresenceDevice;

public final class czhp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IBinder iBinder0 = null;
        PresenceDevice presenceDevice0 = null;
        ConnectionsDevice connectionsDevice0 = null;
        byte[] arr_b = null;
        IBinder iBinder1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                case 2: {
                    presenceDevice0 = (PresenceDevice)baua.m(parcel0, v1, PresenceDevice.CREATOR);
                    break;
                }
                case 3: {
                    connectionsDevice0 = (ConnectionsDevice)baua.m(parcel0, v1, ConnectionsDevice.CREATOR);
                    break;
                }
                case 4: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 5: {
                    iBinder1 = baua.k(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ProviderAuthenticateAsInitiatorParams(iBinder0, presenceDevice0, connectionsDevice0, arr_b, iBinder1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ProviderAuthenticateAsInitiatorParams[v];
    }
}

