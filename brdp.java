import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.fitness.result.DataSourceStatsResult;
import com.google.android.gms.fitness.result.DataStatsResult;
import java.util.List;

public final class brdp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Status status0 = null;
        List list0 = null;
        String s = null;
        DataHolder dataHolder0 = null;
        long v1 = 0L;
        long v2 = 0L;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    status0 = (Status)baua.m(parcel0, v3, Status.CREATOR);
                    break;
                }
                case 2: {
                    list0 = baua.y(parcel0, v3, DataSourceStatsResult.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 5: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 6: {
                    dataHolder0 = (DataHolder)baua.m(parcel0, v3, DataHolder.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new DataStatsResult(status0, list0, v1, s, v2, dataHolder0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DataStatsResult[v];
    }
}

