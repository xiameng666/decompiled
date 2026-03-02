import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.connection.v3.AnalyticOptions;
import com.google.android.gms.nearby.connection.v3.ConnectionListeningOptions;

public final class cvxo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Strategy strategy0 = null;
        int[] arr_v = null;
        int[] arr_v1 = null;
        AnalyticOptions analyticOptions0 = null;
        boolean z = true;
        boolean z1 = true;
        boolean z2 = true;
        boolean z3 = true;
        int v1 = 1;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    strategy0 = (Strategy)baua.m(parcel0, v3, Strategy.CREATOR);
                    break;
                }
                case 2: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 4: {
                    z1 = baua.D(parcel0, v3);
                    break;
                }
                case 5: {
                    z2 = baua.D(parcel0, v3);
                    break;
                }
                case 6: {
                    z3 = baua.D(parcel0, v3);
                    break;
                }
                case 7: {
                    arr_v = baua.H(parcel0, v3);
                    break;
                }
                case 8: {
                    arr_v1 = baua.H(parcel0, v3);
                    break;
                }
                case 9: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 10: {
                    analyticOptions0 = (AnalyticOptions)baua.m(parcel0, v3, AnalyticOptions.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new ConnectionListeningOptions(strategy0, v2, z, z1, z2, z3, arr_v, arr_v1, v1, analyticOptions0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ConnectionListeningOptions[v];
    }
}

