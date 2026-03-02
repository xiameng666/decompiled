import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.internal.connection.DiscoveryOptions;
import com.google.android.gms.nearby.internal.connection.StartDiscoveryParams;

public final class czid implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        String s = null;
        DiscoveryOptions discoveryOptions0 = null;
        IBinder iBinder2 = null;
        String s1 = null;
        long v1 = 0L;
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
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 5: {
                    discoveryOptions0 = (DiscoveryOptions)baua.m(parcel0, v2, DiscoveryOptions.CREATOR);
                    break;
                }
                case 6: {
                    iBinder2 = baua.k(parcel0, v2);
                    break;
                }
                case 7: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new StartDiscoveryParams(iBinder0, iBinder1, s, v1, discoveryOptions0, iBinder2, s1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StartDiscoveryParams[v];
    }
}

