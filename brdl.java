import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.result.DataReadResult;
import java.util.ArrayList;
import java.util.List;

public final class brdl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        List list0 = null;
        int v1 = 0;
        Status status0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    baua.B(parcel0, v2, arrayList0, this.getClass().getClassLoader());
                    break;
                }
                case 2: {
                    status0 = (Status)baua.m(parcel0, v2, Status.CREATOR);
                    break;
                }
                case 3: {
                    baua.B(parcel0, v2, arrayList1, this.getClass().getClassLoader());
                    break;
                }
                case 5: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 6: {
                    list0 = baua.y(parcel0, v2, DataSource.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new DataReadResult(arrayList0, status0, arrayList1, v1, list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DataReadResult[v];
    }
}

