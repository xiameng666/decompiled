import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public final class cnmg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        LatLng latLng0 = null;
        String s1 = null;
        List list0 = null;
        String s2 = null;
        Uri uri0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    latLng0 = (LatLng)baua.m(parcel0, v1, LatLng.CREATOR);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    list0 = baua.v(parcel0, v1);
                    break;
                }
                case 5: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 6: {
                    uri0 = (Uri)baua.m(parcel0, v1, Uri.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new AddPlaceRequest(s, latLng0, s1, list0, s2, uri0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AddPlaceRequest[v];
    }
}

