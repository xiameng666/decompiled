import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.connection.UwbSenderInfo;

public final class cuuu implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        int v1 = 0;
        int v2 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int v3 = 0;
        int v4 = 0;
        boolean z6 = false;
        boolean z7 = false;
        long v5 = 0L;
        long v6 = 0L;
        boolean z8 = true;
        boolean z9 = true;
        boolean z10 = true;
        boolean z11 = true;
        boolean z12 = true;
        boolean z13 = true;
        boolean z14 = true;
        boolean z15 = true;
        boolean z16 = true;
        boolean z17 = true;
        boolean z18 = true;
        boolean z19 = true;
        boolean z20 = true;
        boolean z21 = true;
        Strategy strategy0 = null;
        byte[] arr_b = null;
        ParcelUuid parcelUuid0 = null;
        byte[] arr_b1 = null;
        UwbSenderInfo[] arr_uwbSenderInfo = null;
        int[] arr_v = null;
        int[] arr_v1 = null;
        byte[] arr_b2 = null;
        while(parcel0.dataPosition() < v) {
            int v7 = parcel0.readInt();
            switch(((char)v7)) {
                case 1: {
                    strategy0 = (Strategy)baua.m(parcel0, v7, Strategy.CREATOR);
                    break;
                }
                case 2: {
                    z8 = baua.D(parcel0, v7);
                    break;
                }
                case 3: {
                    z9 = baua.D(parcel0, v7);
                    break;
                }
                case 4: {
                    z10 = baua.D(parcel0, v7);
                    break;
                }
                case 5: {
                    z11 = baua.D(parcel0, v7);
                    break;
                }
                case 6: {
                    arr_b = baua.E(parcel0, v7);
                    break;
                }
                case 7: {
                    z = baua.D(parcel0, v7);
                    break;
                }
                case 8: {
                    parcelUuid0 = (ParcelUuid)baua.m(parcel0, v7, ParcelUuid.CREATOR);
                    break;
                }
                case 9: {
                    z12 = baua.D(parcel0, v7);
                    break;
                }
                case 10: {
                    z13 = baua.D(parcel0, v7);
                    break;
                }
                case 11: {
                    z14 = baua.D(parcel0, v7);
                    break;
                }
                case 12: {
                    z1 = baua.D(parcel0, v7);
                    break;
                }
                case 13: {
                    z2 = baua.D(parcel0, v7);
                    break;
                }
                case 14: {
                    z3 = baua.D(parcel0, v7);
                    break;
                }
                case 15: {
                    v1 = baua.f(parcel0, v7);
                    break;
                }
                case 16: {
                    v2 = baua.f(parcel0, v7);
                    break;
                }
                case 17: {
                    arr_b1 = baua.E(parcel0, v7);
                    break;
                }
                case 18: {
                    v5 = baua.i(parcel0, v7);
                    break;
                }
                case 19: {
                    arr_uwbSenderInfo = (UwbSenderInfo[])baua.J(parcel0, v7, UwbSenderInfo.CREATOR);
                    break;
                }
                case 20: {
                    z4 = baua.D(parcel0, v7);
                    break;
                }
                case 21: {
                    z15 = baua.D(parcel0, v7);
                    break;
                }
                case 22: {
                    z5 = baua.D(parcel0, v7);
                    break;
                }
                case 23: {
                    z16 = baua.D(parcel0, v7);
                    break;
                }
                case 24: {
                    arr_v = baua.H(parcel0, v7);
                    break;
                }
                case 25: {
                    arr_v1 = baua.H(parcel0, v7);
                    break;
                }
                case 26: {
                    z17 = baua.D(parcel0, v7);
                    break;
                }
                case 27: {
                    v3 = baua.f(parcel0, v7);
                    break;
                }
                case 28: {
                    arr_b2 = baua.E(parcel0, v7);
                    break;
                }
                case 29: {
                    z18 = baua.D(parcel0, v7);
                    break;
                }
                case 30: {
                    v4 = baua.f(parcel0, v7);
                    break;
                }
                case 0x1F: {
                    z6 = baua.D(parcel0, v7);
                    break;
                }
                case 0x20: {
                    z19 = baua.D(parcel0, v7);
                    break;
                }
                case 33: {
                    z20 = baua.D(parcel0, v7);
                    break;
                }
                case 34: {
                    z21 = baua.D(parcel0, v7);
                    break;
                }
                case 35: {
                    v6 = baua.i(parcel0, v7);
                    break;
                }
                case 36: {
                    z7 = baua.D(parcel0, v7);
                    break;
                }
                default: {
                    baua.C(parcel0, v7);
                }
            }
        }
        baua.A(parcel0, v);
        return new AdvertisingOptions(strategy0, z8, z9, z10, z11, arr_b, z, parcelUuid0, z12, z13, z14, z1, z2, z3, v1, v2, arr_b1, v5, arr_uwbSenderInfo, z4, z15, z5, z16, arr_v, arr_v1, z17, v3, arr_b2, z18, v4, z6, z19, z20, z21, v6, z7);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AdvertisingOptions[v];
    }
}

