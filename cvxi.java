import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.connection.v3.AdvertisingOptions;
import com.google.android.gms.nearby.connection.v3.AnalyticOptions;
import com.google.android.gms.nearby.connection.v3.SafeParcelableDataElements;
import com.google.android.gms.nearby.connection.v3.UwbOptions;

public final class cvxi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Strategy strategy0 = null;
        int[] arr_v = null;
        int[] arr_v1 = null;
        AnalyticOptions analyticOptions0 = null;
        UwbOptions uwbOptions0 = null;
        ParcelUuid parcelUuid0 = null;
        String s = null;
        SafeParcelableDataElements safeParcelableDataElements0 = null;
        boolean z = true;
        boolean z1 = true;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        int v1 = 0;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    strategy0 = (Strategy)baua.m(parcel0, v3, Strategy.CREATOR);
                    break;
                }
                case 2: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 3: {
                    z1 = baua.D(parcel0, v3);
                    break;
                }
                case 4: {
                    z5 = baua.D(parcel0, v3);
                    break;
                }
                case 5: {
                    arr_v = baua.H(parcel0, v3);
                    break;
                }
                case 6: {
                    arr_v1 = baua.H(parcel0, v3);
                    break;
                }
                case 7: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 8: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 9: {
                    analyticOptions0 = (AnalyticOptions)baua.m(parcel0, v3, AnalyticOptions.CREATOR);
                    break;
                }
                case 10: {
                    uwbOptions0 = (UwbOptions)baua.m(parcel0, v3, UwbOptions.CREATOR);
                    break;
                }
                case 11: {
                    z2 = baua.D(parcel0, v3);
                    break;
                }
                case 12: {
                    z3 = baua.D(parcel0, v3);
                    break;
                }
                case 13: {
                    parcelUuid0 = (ParcelUuid)baua.m(parcel0, v3, ParcelUuid.CREATOR);
                    break;
                }
                case 14: {
                    z4 = baua.D(parcel0, v3);
                    break;
                }
                case 15: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 16: {
                    safeParcelableDataElements0 = (SafeParcelableDataElements)baua.m(parcel0, v3, SafeParcelableDataElements.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new AdvertisingOptions(strategy0, z, z1, z5, arr_v, arr_v1, v1, v2, analyticOptions0, uwbOptions0, z2, z3, parcelUuid0, z4, s, safeParcelableDataElements0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AdvertisingOptions[v];
    }
}

