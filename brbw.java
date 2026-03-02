import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.request.DataInsertRequest;

public final class brbw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        DataSet dataSet0 = null;
        IBinder iBinder0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    dataSet0 = (DataSet)baua.m(parcel0, v1, DataSet.CREATOR);
                    break;
                }
                case 2: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                case 4: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new DataInsertRequest(dataSet0, iBinder0, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DataInsertRequest[v];
    }
}

