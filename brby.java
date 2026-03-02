import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataReadRequest;
import java.util.List;

public final class brby implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        List list1 = null;
        List list2 = null;
        List list3 = null;
        DataSource dataSource0 = null;
        IBinder iBinder0 = null;
        List list4 = null;
        List list5 = null;
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        boolean z1 = false;
        long v3 = 0L;
        long v4 = 0L;
        long v5 = 0L;
        while(parcel0.dataPosition() < v) {
            int v6 = parcel0.readInt();
            switch(((char)v6)) {
                case 1: {
                    list0 = baua.y(parcel0, v6, DataType.CREATOR);
                    break;
                }
                case 2: {
                    list1 = baua.y(parcel0, v6, DataSource.CREATOR);
                    break;
                }
                case 3: {
                    v3 = baua.i(parcel0, v6);
                    break;
                }
                case 4: {
                    v4 = baua.i(parcel0, v6);
                    break;
                }
                case 5: {
                    list2 = baua.y(parcel0, v6, DataType.CREATOR);
                    break;
                }
                case 6: {
                    list3 = baua.y(parcel0, v6, DataSource.CREATOR);
                    break;
                }
                case 7: {
                    v1 = baua.f(parcel0, v6);
                    break;
                }
                case 8: {
                    v5 = baua.i(parcel0, v6);
                    break;
                }
                case 9: {
                    dataSource0 = (DataSource)baua.m(parcel0, v6, DataSource.CREATOR);
                    break;
                }
                case 10: {
                    v2 = baua.f(parcel0, v6);
                    break;
                }
                case 12: {
                    z = baua.D(parcel0, v6);
                    break;
                }
                case 13: {
                    z1 = baua.D(parcel0, v6);
                    break;
                }
                case 14: {
                    iBinder0 = baua.k(parcel0, v6);
                    break;
                }
                case 18: {
                    list4 = baua.w(parcel0, v6);
                    break;
                }
                case 19: {
                    list5 = baua.w(parcel0, v6);
                    break;
                }
                default: {
                    baua.C(parcel0, v6);
                }
            }
        }
        baua.A(parcel0, v);
        return new DataReadRequest(list0, list1, v3, v4, list2, list3, v1, v5, dataSource0, v2, z, z1, iBinder0, list4, list5);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DataReadRequest[v];
    }
}

