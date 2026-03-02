import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.SessionReadRequest;
import java.util.List;

public final class brcy implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = true;
        String s = null;
        String s1 = null;
        List list0 = null;
        List list1 = null;
        List list2 = null;
        IBinder iBinder0 = null;
        long v1 = 0L;
        long v2 = 0L;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 3: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                case 4: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 5: {
                    list0 = baua.y(parcel0, v3, DataType.CREATOR);
                    break;
                }
                case 6: {
                    list1 = baua.y(parcel0, v3, DataSource.CREATOR);
                    break;
                }
                case 7: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 8: {
                    z1 = baua.D(parcel0, v3);
                    break;
                }
                case 9: {
                    list2 = baua.x(parcel0, v3);
                    break;
                }
                case 10: {
                    iBinder0 = baua.k(parcel0, v3);
                    break;
                }
                case 12: {
                    z3 = baua.D(parcel0, v3);
                    break;
                }
                case 13: {
                    z2 = baua.D(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new SessionReadRequest(s, s1, v1, v2, list0, list1, z, z1, list2, iBinder0, z3, z2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SessionReadRequest[v];
    }
}

