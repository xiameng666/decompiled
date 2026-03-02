import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.presence.RangingData.AngleOfArrival;
import com.google.android.gms.nearby.presence.RangingData.Distance;
import com.google.android.gms.nearby.presence.RangingData;
import com.google.android.gms.nearby.presence.ZoneTransition;

public final class datq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        long v2 = 0L;
        RangingData.Distance rangingData$Distance0 = null;
        ZoneTransition zoneTransition0 = null;
        RangingData.AngleOfArrival rangingData$AngleOfArrival0 = null;
        RangingData.AngleOfArrival rangingData$AngleOfArrival1 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    rangingData$Distance0 = (RangingData.Distance)baua.m(parcel0, v3, RangingData.Distance.CREATOR);
                    break;
                }
                case 2: {
                    zoneTransition0 = (ZoneTransition)baua.m(parcel0, v3, ZoneTransition.CREATOR);
                    break;
                }
                case 3: {
                    rangingData$AngleOfArrival0 = (RangingData.AngleOfArrival)baua.m(parcel0, v3, RangingData.AngleOfArrival.CREATOR);
                    break;
                }
                case 4: {
                    rangingData$AngleOfArrival1 = (RangingData.AngleOfArrival)baua.m(parcel0, v3, RangingData.AngleOfArrival.CREATOR);
                    break;
                }
                case 5: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 6: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new RangingData(rangingData$Distance0, zoneTransition0, rangingData$AngleOfArrival0, rangingData$AngleOfArrival1, v2, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RangingData[v];
    }
}

