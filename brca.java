import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.request.DataSourceQueryParams;

public final class brca implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        long v3 = 0L;
        long v4 = 0L;
        DataSource dataSource0 = null;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 1: {
                    dataSource0 = (DataSource)baua.m(parcel0, v5, DataSource.CREATOR);
                    break;
                }
                case 3: {
                    v3 = baua.i(parcel0, v5);
                    break;
                }
                case 4: {
                    v4 = baua.i(parcel0, v5);
                    break;
                }
                case 5: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                case 6: {
                    v2 = baua.f(parcel0, v5);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new DataSourceQueryParams(dataSource0, v3, v4, v1, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DataSourceQueryParams[v];
    }
}

