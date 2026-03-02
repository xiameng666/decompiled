import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocation.DebugData;
import com.google.android.gms.semanticlocation.InputSignals;
import com.google.android.gms.semanticlocation.SemanticSegment;
import java.util.List;

public final class eluz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        List list1 = null;
        List list2 = null;
        int v1 = 0;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    list0 = baua.y(parcel0, v2, InputSignals.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 3: {
                    list1 = baua.y(parcel0, v2, SemanticSegment.CREATOR);
                    break;
                }
                case 4: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 5: {
                    list2 = baua.x(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new DebugData(list0, v1, list1, z, list2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DebugData[v];
    }
}

