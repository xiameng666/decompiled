import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.sharing.DiscoveryOptions;
import com.google.android.gms.nearby.sharing.internal.ProviderStartDiscoveryParams;

public final class ddtc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IBinder iBinder0 = null;
        DiscoveryOptions discoveryOptions0 = null;
        IBinder iBinder1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                case 2: {
                    discoveryOptions0 = (DiscoveryOptions)baua.m(parcel0, v1, DiscoveryOptions.CREATOR);
                    break;
                }
                case 3: {
                    iBinder1 = baua.k(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ProviderStartDiscoveryParams(iBinder0, discoveryOptions0, iBinder1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ProviderStartDiscoveryParams[v];
    }
}

