import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.service.FitnessSensorServiceRequest;

public final class brjd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        long v2 = 0L;
        DataSource dataSource0 = null;
        IBinder iBinder0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    dataSource0 = (DataSource)baua.m(parcel0, v3, DataSource.CREATOR);
                    break;
                }
                case 2: {
                    iBinder0 = baua.k(parcel0, v3);
                    break;
                }
                case 3: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                case 4: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new FitnessSensorServiceRequest(dataSource0, iBinder0, v1, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FitnessSensorServiceRequest[v];
    }
}

