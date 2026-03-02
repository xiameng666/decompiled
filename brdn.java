import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.result.DataSourceStatsResult;

public final class brdn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        long v2 = 0L;
        long v3 = 0L;
        long v4 = 0L;
        boolean z = false;
        DataSource dataSource0 = null;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 1: {
                    dataSource0 = (DataSource)baua.m(parcel0, v5, DataSource.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.i(parcel0, v5);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v5);
                    break;
                }
                case 4: {
                    v2 = baua.i(parcel0, v5);
                    break;
                }
                case 5: {
                    v3 = baua.i(parcel0, v5);
                    break;
                }
                case 6: {
                    v4 = baua.i(parcel0, v5);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new DataSourceStatsResult(dataSource0, v1, z, v2, v3, v4);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DataSourceStatsResult[v];
    }
}

