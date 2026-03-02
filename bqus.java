import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.DataUpdateNotification;

public final class bqus implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        DataSource dataSource0 = null;
        DataType dataType0 = null;
        int v1 = 0;
        long v2 = 0L;
        long v3 = 0L;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    v2 = baua.i(parcel0, v4);
                    break;
                }
                case 2: {
                    v3 = baua.i(parcel0, v4);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 4: {
                    dataSource0 = (DataSource)baua.m(parcel0, v4, DataSource.CREATOR);
                    break;
                }
                case 5: {
                    dataType0 = (DataType)baua.m(parcel0, v4, DataType.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new DataUpdateNotification(v2, v3, v1, dataSource0, dataType0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DataUpdateNotification[v];
    }
}

