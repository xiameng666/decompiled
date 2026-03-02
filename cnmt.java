import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.places.NearbyAlertFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;

public final class cnmt implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 110;
        int v2 = 0;
        boolean z = false;
        int v3 = 0;
        PlaceFilter placeFilter0 = null;
        NearbyAlertFilter nearbyAlertFilter0 = null;
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
                case 3: {
                    placeFilter0 = (PlaceFilter)baua.m(parcel0, v5, PlaceFilter.CREATOR);
                    break;
                }
                case 4: {
                    nearbyAlertFilter0 = (NearbyAlertFilter)baua.m(parcel0, v5, NearbyAlertFilter.CREATOR);
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
        return new NearbyAlertRequest(v2, v4, placeFilter0, nearbyAlertFilter0, z, v3, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new NearbyAlertRequest[v];
    }
}

