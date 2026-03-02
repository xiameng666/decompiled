import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.locationsharingreporter.BatteryState;
import com.google.android.gms.locationsharingreporter.LocationInfo;
import com.google.android.gms.locationsharingreporter.UserId;
import com.google.android.gms.locationsharingreporter.UserLocation;

public final class cocq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        UserId userId0 = null;
        LocationInfo locationInfo0 = null;
        BatteryState batteryState0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    userId0 = (UserId)baua.m(parcel0, v1, UserId.CREATOR);
                    break;
                }
                case 2: {
                    locationInfo0 = (LocationInfo)baua.m(parcel0, v1, LocationInfo.CREATOR);
                    break;
                }
                case 3: {
                    batteryState0 = (BatteryState)baua.m(parcel0, v1, BatteryState.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new UserLocation(userId0, locationInfo0, batteryState0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UserLocation[v];
    }
}

