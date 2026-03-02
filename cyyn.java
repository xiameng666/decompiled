import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.internal.connection.ConnectionListeningOptions;

public final class cyyn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = true;
        boolean z1 = true;
        int v1 = 1;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int v2 = 0;
        Strategy strategy0 = null;
        int[] arr_v = null;
        int[] arr_v1 = null;
        long v3 = 0L;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    strategy0 = (Strategy)baua.m(parcel0, v4, Strategy.CREATOR);
                    break;
                }
                case 2: {
                    z = baua.D(parcel0, v4);
                    break;
                }
                case 3: {
                    z1 = baua.D(parcel0, v4);
                    break;
                }
                case 4: {
                    z6 = baua.D(parcel0, v4);
                    break;
                }
                case 5: {
                    arr_v = baua.H(parcel0, v4);
                    break;
                }
                case 6: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 7: {
                    z7 = baua.D(parcel0, v4);
                    break;
                }
                case 8: {
                    z2 = baua.D(parcel0, v4);
                    break;
                }
                case 9: {
                    z3 = baua.D(parcel0, v4);
                    break;
                }
                case 10: {
                    v3 = baua.i(parcel0, v4);
                    break;
                }
                case 11: {
                    arr_v1 = baua.H(parcel0, v4);
                    break;
                }
                case 12: {
                    z8 = baua.D(parcel0, v4);
                    break;
                }
                case 13: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                case 14: {
                    z4 = baua.D(parcel0, v4);
                    break;
                }
                case 15: {
                    z5 = baua.D(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new ConnectionListeningOptions(strategy0, z, z1, z6, arr_v, v1, z7, z2, z3, v3, arr_v1, z8, v2, z4, z5);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ConnectionListeningOptions[v];
    }
}

