import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;

public final class bqvs implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        long v3 = 0L;
        DataSource dataSource0 = null;
        DataType dataType0 = null;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    dataSource0 = (DataSource)baua.m(parcel0, v4, DataSource.CREATOR);
                    break;
                }
                case 2: {
                    dataType0 = (DataType)baua.m(parcel0, v4, DataType.CREATOR);
                    break;
                }
                case 3: {
                    v3 = baua.i(parcel0, v4);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 5: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new Subscription(dataSource0, dataType0, v3, v1, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Subscription[v];
    }
}

