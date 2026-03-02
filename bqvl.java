import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.RawBucket;
import com.google.android.gms.fitness.data.RawDataSet;
import com.google.android.gms.fitness.data.Session;
import java.util.List;

public final class bqvl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        Session session0 = null;
        List list0 = null;
        long v3 = 0L;
        long v4 = 0L;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 1: {
                    v3 = baua.i(parcel0, v5);
                    break;
                }
                case 2: {
                    v4 = baua.i(parcel0, v5);
                    break;
                }
                case 3: {
                    session0 = (Session)baua.m(parcel0, v5, Session.CREATOR);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                case 5: {
                    list0 = baua.y(parcel0, v5, RawDataSet.CREATOR);
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
        return new RawBucket(v3, v4, session0, v1, list0, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RawBucket[v];
    }
}

