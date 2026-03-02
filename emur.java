import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocationhistory.FieldMask;
import com.google.android.gms.semanticlocationhistory.LocationHistorySegmentRequest;
import com.google.android.gms.semanticlocationhistory.LookupParameters;
import java.util.List;

public final class emur implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        List list0 = null;
        FieldMask fieldMask0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    list0 = baua.y(parcel0, v1, LookupParameters.CREATOR);
                    break;
                }
                case 2: {
                    fieldMask0 = (FieldMask)baua.m(parcel0, v1, FieldMask.CREATOR);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new LocationHistorySegmentRequest(list0, fieldMask0, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LocationHistorySegmentRequest[v];
    }
}

