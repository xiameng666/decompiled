import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.v3.DiscoveryOptions;
import com.google.android.gms.nearby.internal.connection.UpdateDiscoveryOptionsParamsV3;

public final class czis implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IBinder iBinder0 = null;
        String s = null;
        DiscoveryOptions discoveryOptions0 = null;
        String s1 = null;
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
                    discoveryOptions0 = (DiscoveryOptions)baua.m(parcel0, v1, DiscoveryOptions.CREATOR);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new UpdateDiscoveryOptionsParamsV3(iBinder0, s, discoveryOptions0, s1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UpdateDiscoveryOptionsParamsV3[v];
    }
}

