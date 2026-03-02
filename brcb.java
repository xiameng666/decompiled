import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import java.util.List;

public final class brcb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        List list1 = null;
        IBinder iBinder0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    list0 = baua.y(parcel0, v1, DataType.CREATOR);
                    break;
                }
                case 2: {
                    list1 = baua.v(parcel0, v1);
                    break;
                }
                case 4: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new DataSourcesRequest(list0, list1, iBinder0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DataSourcesRequest[v];
    }
}

