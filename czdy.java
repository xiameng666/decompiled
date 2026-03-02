import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.internal.connection.DeviceParams;
import com.google.android.gms.nearby.presence.PresenceDevice;

public final class czdy implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        PresenceDevice presenceDevice0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    presenceDevice0 = (PresenceDevice)baua.m(parcel0, v2, PresenceDevice.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new DeviceParams(v1, presenceDevice0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DeviceParams[v];
    }
}

