import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.request.ReadStatsRequest;
import java.util.List;

public final class brct implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        IBinder iBinder0 = null;
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    iBinder0 = baua.k(parcel0, v2);
                    break;
                }
                case 3: {
                    list0 = baua.y(parcel0, v2, DataSource.CREATOR);
                    break;
                }
                case 1000: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ReadStatsRequest(iBinder0, list0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ReadStatsRequest[v];
    }
}

