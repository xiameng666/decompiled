import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;

public final class fall implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 110;
        int v2 = 0;
        boolean z = false;
        int v3 = 0;
        UserLocationNearbyAlertFilter userLocationNearbyAlertFilter0 = null;
        int v4 = -1;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 1: {
                    v2 = baua.f(parcel0, v5);
                    break;
                }
                case 2: {
                    v4 = baua.f(parcel0, v5);
                    break;
                }
                case 4: {
                    userLocationNearbyAlertFilter0 = (UserLocationNearbyAlertFilter)baua.m(parcel0, v5, UserLocationNearbyAlertFilter.CREATOR);
                    break;
                }
                case 5: {
                    z = baua.D(parcel0, v5);
                    break;
                }
                case 6: {
                    v3 = baua.f(parcel0, v5);
                    break;
                }
                case 7: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new UserLocationNearbyAlertRequest(v2, v4, userLocationNearbyAlertFilter0, z, v3, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UserLocationNearbyAlertRequest[v];
    }
}

