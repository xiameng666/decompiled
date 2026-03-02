import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.connection.v3.SafeParcelableDataElements;
import com.google.android.gms.nearby.internal.connection.DiscoveryOptions;

public final class czed implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Strategy strategy0 = null;
        ParcelUuid parcelUuid0 = null;
        byte[] arr_b = null;
        int[] arr_v = null;
        SafeParcelableDataElements safeParcelableDataElements0 = null;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        int v1 = 0;
        int v2 = 0;
        boolean z3 = false;
        int v3 = 0;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = true;
        boolean z10 = true;
        boolean z11 = true;
        long v4 = 0L;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 1: {
                    strategy0 = (Strategy)baua.m(parcel0, v5, Strategy.CREATOR);
                    break;
                }
                case 2: {
                    z = baua.D(parcel0, v5);
                    break;
                }
                case 3: {
                    z4 = baua.D(parcel0, v5);
                    break;
                }
                case 4: {
                    z5 = baua.D(parcel0, v5);
                    break;
                }
                case 5: {
                    z1 = baua.D(parcel0, v5);
                    break;
                }
                case 6: {
                    parcelUuid0 = (ParcelUuid)baua.m(parcel0, v5, ParcelUuid.CREATOR);
                    break;
                }
                case 8: {
                    z6 = baua.D(parcel0, v5);
                    break;
                }
                case 9: {
                    z7 = baua.D(parcel0, v5);
                    break;
                }
                case 10: {
                    z8 = baua.D(parcel0, v5);
                    break;
                }
                case 11: {
                    z2 = baua.D(parcel0, v5);
                    break;
                }
                case 12: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                case 13: {
                    v2 = baua.f(parcel0, v5);
                    break;
                }
                case 14: {
                    arr_b = baua.E(parcel0, v5);
                    break;
                }
                case 15: {
                    v4 = baua.i(parcel0, v5);
                    break;
                }
                case 16: {
                    arr_v = baua.H(parcel0, v5);
                    break;
                }
                case 17: {
                    z9 = baua.D(parcel0, v5);
                    break;
                }
                case 18: {
                    z3 = baua.D(parcel0, v5);
                    break;
                }
                case 19: {
                    z10 = baua.D(parcel0, v5);
                    break;
                }
                case 20: {
                    z11 = baua.D(parcel0, v5);
                    break;
                }
                case 21: {
                    v3 = baua.f(parcel0, v5);
                    break;
                }
                case 22: {
                    safeParcelableDataElements0 = (SafeParcelableDataElements)baua.m(parcel0, v5, SafeParcelableDataElements.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new DiscoveryOptions(strategy0, z, z4, z5, z1, parcelUuid0, z6, z7, z8, z2, v1, v2, arr_b, v4, arr_v, z9, z3, z10, z11, v3, safeParcelableDataElements0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DiscoveryOptions[v];
    }
}

