import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.presence.DiscoveryFilter;
import com.google.android.gms.nearby.presence.internal.GetDevicesParams;

public final class dbal implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IBinder iBinder0 = null;
        DiscoveryFilter discoveryFilter0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                case 2: {
                    discoveryFilter0 = (DiscoveryFilter)baua.m(parcel0, v1, DiscoveryFilter.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetDevicesParams(iBinder0, discoveryFilter0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetDevicesParams[v];
    }
}

