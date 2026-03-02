import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.RawDataPoint;
import com.google.android.gms.fitness.data.Value;

public final class bqvm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        long v2 = 0L;
        long v3 = 0L;
        int v4 = 0;
        int v5 = 0;
        Value[] arr_value = null;
        while(parcel0.dataPosition() < v) {
            int v6 = parcel0.readInt();
            switch(((char)v6)) {
                case 1: {
                    v1 = baua.i(parcel0, v6);
                    break;
                }
                case 2: {
                    v2 = baua.i(parcel0, v6);
                    break;
                }
                case 3: {
                    arr_value = (Value[])baua.J(parcel0, v6, Value.CREATOR);
                    break;
                }
                case 4: {
                    v4 = baua.f(parcel0, v6);
                    break;
                }
                case 5: {
                    v5 = baua.f(parcel0, v6);
                    break;
                }
                case 6: {
                    v3 = baua.i(parcel0, v6);
                    break;
                }
                default: {
                    baua.C(parcel0, v6);
                }
            }
        }
        baua.A(parcel0, v);
        return new RawDataPoint(v1, v2, arr_value, v4, v5, v3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RawDataPoint[v];
    }
}

