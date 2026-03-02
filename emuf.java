import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocationhistory.DeviceMetadata;
import com.google.android.gms.semanticlocationhistory.ExperimentVisitsResponse;
import com.google.android.gms.semanticlocationhistory.LocationHistorySegment;
import java.util.List;

public final class emuf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        int v1 = 0;
        DeviceMetadata deviceMetadata0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    list0 = baua.y(parcel0, v2, LocationHistorySegment.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 3: {
                    deviceMetadata0 = (DeviceMetadata)baua.m(parcel0, v2, DeviceMetadata.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ExperimentVisitsResponse(list0, v1, deviceMetadata0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ExperimentVisitsResponse[v];
    }
}

