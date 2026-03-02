import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.InsertionDataPointChange;

public final class bqvi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        DataPoint dataPoint0 = null;
        long v1 = 0L;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 2: {
                    dataPoint0 = (DataPoint)baua.m(parcel0, v2, DataPoint.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new InsertionDataPointChange(v1, dataPoint0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new InsertionDataPointChange[v];
    }
}

