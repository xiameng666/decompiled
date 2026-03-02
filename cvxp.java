import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.connection.v3.AnalyticOptions;
import com.google.android.gms.nearby.connection.v3.ConnectionOptions;

public final class cvxp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Strategy strategy0 = null;
        int[] arr_v = null;
        int[] arr_v1 = null;
        AnalyticOptions analyticOptions0 = null;
        String s = null;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        boolean z = true;
        boolean z1 = true;
        boolean z2 = true;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    strategy0 = (Strategy)baua.m(parcel0, v4, Strategy.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v4);
                    break;
                }
                case 4: {
                    z1 = baua.D(parcel0, v4);
                    break;
                }
                case 5: {
                    z2 = baua.D(parcel0, v4);
                    break;
                }
                case 6: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                case 7: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                case 8: {
                    arr_v = baua.H(parcel0, v4);
                    break;
                }
                case 9: {
                    arr_v1 = baua.H(parcel0, v4);
                    break;
                }
                case 10: {
                    analyticOptions0 = (AnalyticOptions)baua.m(parcel0, v4, AnalyticOptions.CREATOR);
                    break;
                }
                case 11: {
                    s = baua.s(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new ConnectionOptions(strategy0, v1, z, z1, z2, v2, v3, arr_v, arr_v1, analyticOptions0, s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ConnectionOptions[v];
    }
}

