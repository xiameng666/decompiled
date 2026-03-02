import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

public final class cpnw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        StreetViewPanoramaCamera streetViewPanoramaCamera0 = null;
        String s = null;
        LatLng latLng0 = null;
        Integer integer0 = null;
        StreetViewSource streetViewSource0 = null;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        while(parcel0.dataPosition() < v) {
            int v6 = parcel0.readInt();
            switch(((char)v6)) {
                case 2: {
                    streetViewPanoramaCamera0 = (StreetViewPanoramaCamera)baua.m(parcel0, v6, StreetViewPanoramaCamera.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v6);
                    break;
                }
                case 4: {
                    latLng0 = (LatLng)baua.m(parcel0, v6, LatLng.CREATOR);
                    break;
                }
                case 5: {
                    integer0 = baua.q(parcel0, v6);
                    break;
                }
                case 6: {
                    v1 = baua.a(parcel0, v6);
                    break;
                }
                case 7: {
                    v2 = baua.a(parcel0, v6);
                    break;
                }
                case 8: {
                    v3 = baua.a(parcel0, v6);
                    break;
                }
                case 9: {
                    v4 = baua.a(parcel0, v6);
                    break;
                }
                case 10: {
                    v5 = baua.a(parcel0, v6);
                    break;
                }
                case 11: {
                    streetViewSource0 = (StreetViewSource)baua.m(parcel0, v6, StreetViewSource.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v6);
                }
            }
        }
        baua.A(parcel0, v);
        return new StreetViewPanoramaOptions(streetViewPanoramaCamera0, s, latLng0, integer0, ((byte)v1), ((byte)v2), ((byte)v3), ((byte)v4), ((byte)v5), streetViewSource0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StreetViewPanoramaOptions[v];
    }
}

