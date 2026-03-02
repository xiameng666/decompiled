import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.presence.DiscoveryDevice;
import com.google.android.gms.nearby.presence.PresenceAction;

public final class dask implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        PresenceAction[] arr_presenceAction = null;
        long v2 = 0L;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 2: {
                    arr_presenceAction = (PresenceAction[])baua.J(parcel0, v3, PresenceAction.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new DiscoveryDevice(v2, arr_presenceAction, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DiscoveryDevice[v];
    }
}

