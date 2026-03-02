import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import java.util.ArrayList;
import java.util.List;

public final class bqum implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ArrayList arrayList0 = new ArrayList();
        DataSource dataSource0 = null;
        int v1 = 0;
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    dataSource0 = (DataSource)baua.m(parcel0, v2, DataSource.CREATOR);
                    break;
                }
                case 3: {
                    baua.B(parcel0, v2, arrayList0, this.getClass().getClassLoader());
                    break;
                }
                case 4: {
                    list0 = baua.y(parcel0, v2, DataSource.CREATOR);
                    break;
                }
                case 1000: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new DataSet(v1, dataSource0, arrayList0, list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DataSet[v];
    }
}

