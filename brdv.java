import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.fitness.result.ReadRawResult;
import java.util.List;

public final class brdv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        DataHolder dataHolder0 = null;
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    dataHolder0 = (DataHolder)baua.m(parcel0, v1, DataHolder.CREATOR);
                    break;
                }
                case 2: {
                    list0 = baua.y(parcel0, v1, DataHolder.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ReadRawResult(dataHolder0, list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ReadRawResult[v];
    }
}

