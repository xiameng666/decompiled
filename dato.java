import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.presence.DeviceMotion;
import com.google.android.gms.nearby.presence.PresenceZone.AngleOfArrivalBoundary;
import com.google.android.gms.nearby.presence.PresenceZone.DistanceBoundary;
import com.google.android.gms.nearby.presence.PresenceZone;
import java.util.List;

public final class dato implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        PresenceZone.DistanceBoundary presenceZone$DistanceBoundary0 = null;
        PresenceZone.AngleOfArrivalBoundary presenceZone$AngleOfArrivalBoundary0 = null;
        PresenceZone.AngleOfArrivalBoundary presenceZone$AngleOfArrivalBoundary1 = null;
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    presenceZone$DistanceBoundary0 = (PresenceZone.DistanceBoundary)baua.m(parcel0, v1, PresenceZone.DistanceBoundary.CREATOR);
                    break;
                }
                case 2: {
                    presenceZone$AngleOfArrivalBoundary0 = (PresenceZone.AngleOfArrivalBoundary)baua.m(parcel0, v1, PresenceZone.AngleOfArrivalBoundary.CREATOR);
                    break;
                }
                case 3: {
                    presenceZone$AngleOfArrivalBoundary1 = (PresenceZone.AngleOfArrivalBoundary)baua.m(parcel0, v1, PresenceZone.AngleOfArrivalBoundary.CREATOR);
                    break;
                }
                case 4: {
                    list0 = baua.y(parcel0, v1, DeviceMotion.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new PresenceZone(presenceZone$DistanceBoundary0, presenceZone$AngleOfArrivalBoundary0, presenceZone$AngleOfArrivalBoundary1, list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PresenceZone[v];
    }
}

