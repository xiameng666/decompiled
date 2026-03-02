import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.presence.PresenceDevice;
import com.google.android.gms.nearby.presence.internal.RetrieveDeviceMetadataParams;

public final class dbcv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IBinder iBinder0 = null;
        String s = null;
        PresenceDevice presenceDevice0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    presenceDevice0 = (PresenceDevice)baua.m(parcel0, v1, PresenceDevice.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new RetrieveDeviceMetadataParams(iBinder0, s, presenceDevice0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RetrieveDeviceMetadataParams[v];
    }
}

