import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dynamite.DynamiteModuleData;
import com.google.android.gms.dynamite.RequestStats;

public final class bjib implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        RequestStats requestStats0 = null;
        byte[] arr_b = null;
        long v1 = 0L;
        long v2 = 0L;
        int v3 = 0;
        boolean z = false;
        int v4 = 0;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 1: {
                    v1 = baua.i(parcel0, v5);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v5);
                    break;
                }
                case 3: {
                    v3 = baua.f(parcel0, v5);
                    break;
                }
                case 4: {
                    z = baua.D(parcel0, v5);
                    break;
                }
                case 5: {
                    v4 = baua.f(parcel0, v5);
                    break;
                }
                case 6: {
                    v2 = baua.i(parcel0, v5);
                    break;
                }
                case 7: {
                    requestStats0 = (RequestStats)baua.m(parcel0, v5, RequestStats.CREATOR);
                    break;
                }
                case 8: {
                    arr_b = baua.E(parcel0, v5);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new DynamiteModuleData(v1, s, v3, z, v4, v2, requestStats0, arr_b);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DynamiteModuleData[v];
    }
}

