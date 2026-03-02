import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocation.DebugData;
import com.google.android.gms.semanticlocation.SemanticLocationEvent;
import com.google.android.gms.semanticlocation.SemanticLocationState;
import java.util.List;

public final class elwn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        long v1 = 0L;
        DebugData debugData0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    list0 = baua.y(parcel0, v2, SemanticLocationEvent.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 3: {
                    debugData0 = (DebugData)baua.m(parcel0, v2, DebugData.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new SemanticLocationState(list0, v1, debugData0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SemanticLocationState[v];
    }
}

