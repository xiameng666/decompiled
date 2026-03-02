import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataSourceChange;

public final class bquo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        String s = null;
        DataSource dataSource0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 2: {
                    dataSource0 = (DataSource)baua.m(parcel0, v2, DataSource.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new DataSourceChange(s, dataSource0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DataSourceChange[v];
    }
}

