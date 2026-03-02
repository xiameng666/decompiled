import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;

public final class cpsq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        LatLng latLng0 = null;
        LatLng latLng1 = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLngBounds latLngBounds0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    latLng0 = (LatLng)baua.m(parcel0, v1, LatLng.CREATOR);
                    break;
                }
                case 3: {
                    latLng1 = (LatLng)baua.m(parcel0, v1, LatLng.CREATOR);
                    break;
                }
                case 4: {
                    latLng2 = (LatLng)baua.m(parcel0, v1, LatLng.CREATOR);
                    break;
                }
                case 5: {
                    latLng3 = (LatLng)baua.m(parcel0, v1, LatLng.CREATOR);
                    break;
                }
                case 6: {
                    latLngBounds0 = (LatLngBounds)baua.m(parcel0, v1, LatLngBounds.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new VisibleRegion(latLng0, latLng1, latLng2, latLng3, latLngBounds0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new VisibleRegion[v];
    }
}

