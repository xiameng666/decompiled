import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.WifiScan;

public final class cmou implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long[] arr_v = WifiScan.a;
        int[] arr_v1 = WifiScan.b;
        int[] arr_v2 = arr_v1;
        int[] arr_v3 = arr_v2;
        int[] arr_v4 = arr_v3;
        int[] arr_v5 = arr_v4;
        int[] arr_v6 = arr_v5;
        long v1 = 0L;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 2: {
                    arr_v = baua.I(parcel0, v2);
                    break;
                }
                case 3: {
                    arr_v1 = baua.H(parcel0, v2);
                    break;
                }
                case 4: {
                    arr_v2 = baua.H(parcel0, v2);
                    break;
                }
                case 5: {
                    arr_v3 = baua.H(parcel0, v2);
                    break;
                }
                case 6: {
                    arr_v4 = baua.H(parcel0, v2);
                    break;
                }
                case 7: {
                    arr_v5 = baua.H(parcel0, v2);
                    break;
                }
                case 8: {
                    arr_v6 = baua.H(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new WifiScan(v1, arr_v, arr_v1, arr_v2, arr_v3, arr_v4, arr_v5, arr_v6);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new WifiScan[v];
    }
}

