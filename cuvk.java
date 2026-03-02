import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.Strategy;

public final class cuvk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        boolean z1 = false;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = true;
        boolean z10 = true;
        boolean z11 = true;
        boolean z12 = true;
        boolean z13 = true;
        boolean z14 = true;
        long v4 = 0L;
        byte[] arr_b = null;
        int[] arr_v = null;
        int[] arr_v1 = null;
        byte[] arr_b1 = null;
        Strategy strategy0 = null;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 1: {
                    z = baua.D(parcel0, v5);
                    break;
                }
                case 2: {
                    z4 = baua.D(parcel0, v5);
                    break;
                }
                case 3: {
                    z5 = baua.D(parcel0, v5);
                    break;
                }
                case 4: {
                    z6 = baua.D(parcel0, v5);
                    break;
                }
                case 5: {
                    z7 = baua.D(parcel0, v5);
                    break;
                }
                case 6: {
                    z8 = baua.D(parcel0, v5);
                    break;
                }
                case 7: {
                    z9 = baua.D(parcel0, v5);
                    break;
                }
                case 8: {
                    z10 = baua.D(parcel0, v5);
                    break;
                }
                case 9: {
                    arr_b = baua.E(parcel0, v5);
                    break;
                }
                case 10: {
                    z1 = baua.D(parcel0, v5);
                    break;
                }
                case 11: {
                    z11 = baua.D(parcel0, v5);
                    break;
                }
                case 12: {
                    z12 = baua.D(parcel0, v5);
                    break;
                }
                case 13: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                case 14: {
                    v2 = baua.f(parcel0, v5);
                    break;
                }
                case 15: {
                    arr_v = baua.H(parcel0, v5);
                    break;
                }
                case 16: {
                    arr_v1 = baua.H(parcel0, v5);
                    break;
                }
                case 17: {
                    arr_b1 = baua.E(parcel0, v5);
                    break;
                }
                case 18: {
                    strategy0 = (Strategy)baua.m(parcel0, v5, Strategy.CREATOR);
                    break;
                }
                case 19: {
                    v3 = baua.f(parcel0, v5);
                    break;
                }
                case 20: {
                    v4 = baua.i(parcel0, v5);
                    break;
                }
                case 21: {
                    z2 = baua.D(parcel0, v5);
                    break;
                }
                case 22: {
                    z13 = baua.D(parcel0, v5);
                    break;
                }
                case 23: {
                    z14 = baua.D(parcel0, v5);
                    break;
                }
                case 24: {
                    z3 = baua.D(parcel0, v5);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new ConnectionOptions(z, z4, z5, z6, z7, z8, z9, z10, arr_b, z1, z11, z12, v1, v2, arr_v, arr_v1, arr_b1, strategy0, v3, v4, z2, z13, z14, z3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ConnectionOptions[v];
    }
}

