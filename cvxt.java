import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.connection.v3.AnalyticOptions;
import com.google.android.gms.nearby.connection.v3.DiscoveryOptions;
import com.google.android.gms.nearby.connection.v3.SafeParcelableDataElements;
import com.google.android.gms.nearby.connection.v3.UwbOptions;

public final class cvxt implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Strategy strategy0 = null;
        int[] arr_v = null;
        AnalyticOptions analyticOptions0 = null;
        UwbOptions uwbOptions0 = null;
        ParcelUuid parcelUuid0 = null;
        SafeParcelableDataElements safeParcelableDataElements0 = null;
        boolean z = true;
        boolean z1 = true;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    strategy0 = (Strategy)baua.m(parcel0, v2, Strategy.CREATOR);
                    break;
                }
                case 2: {
                    arr_v = baua.H(parcel0, v2);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 4: {
                    analyticOptions0 = (AnalyticOptions)baua.m(parcel0, v2, AnalyticOptions.CREATOR);
                    break;
                }
                case 5: {
                    uwbOptions0 = (UwbOptions)baua.m(parcel0, v2, UwbOptions.CREATOR);
                    break;
                }
                case 6: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 7: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                case 8: {
                    parcelUuid0 = (ParcelUuid)baua.m(parcel0, v2, ParcelUuid.CREATOR);
                    break;
                }
                case 9: {
                    safeParcelableDataElements0 = (SafeParcelableDataElements)baua.m(parcel0, v2, SafeParcelableDataElements.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new DiscoveryOptions(strategy0, arr_v, v1, analyticOptions0, uwbOptions0, z, z1, parcelUuid0, safeParcelableDataElements0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DiscoveryOptions[v];
    }
}

