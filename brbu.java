import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DailyTotalRequest;

public final class brbu implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        IBinder iBinder0 = null;
        DataType dataType0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                case 2: {
                    dataType0 = (DataType)baua.m(parcel0, v1, DataType.CREATOR);
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
        return new DailyTotalRequest(iBinder0, dataType0, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DailyTotalRequest[v];
    }
}

