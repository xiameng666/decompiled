import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.Value;

public final class bquk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        long v2 = 0L;
        long v3 = 0L;
        DataSource dataSource0 = null;
        Value[] arr_value = null;
        DataSource dataSource1 = null;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    dataSource0 = (DataSource)baua.m(parcel0, v4, DataSource.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.i(parcel0, v4);
                    break;
                }
                case 4: {
                    v2 = baua.i(parcel0, v4);
                    break;
                }
                case 5: {
                    arr_value = (Value[])baua.J(parcel0, v4, Value.CREATOR);
                    break;
                }
                case 6: {
                    dataSource1 = (DataSource)baua.m(parcel0, v4, DataSource.CREATOR);
                    break;
                }
                case 7: {
                    v3 = baua.i(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new DataPoint(dataSource0, v1, v2, arr_value, dataSource1, v3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DataPoint[v];
    }
}

