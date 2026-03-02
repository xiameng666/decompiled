import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.request.DataUpdateRequest;

public final class brcg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        DataSet dataSet0 = null;
        IBinder iBinder0 = null;
        long v1 = 0L;
        long v2 = 0L;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                case 2: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 3: {
                    dataSet0 = (DataSet)baua.m(parcel0, v3, DataSet.CREATOR);
                    break;
                }
                case 4: {
                    iBinder0 = baua.k(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new DataUpdateRequest(v1, v2, dataSet0, iBinder0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DataUpdateRequest[v];
    }
}

