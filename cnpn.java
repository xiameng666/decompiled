import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceExtendedDetailsEntity;
import com.google.android.gms.location.places.internal.PlaceOpeningHoursEntity;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

public final class cnpn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        List list0 = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        List list1 = null;
        LatLng latLng0 = null;
        LatLngBounds latLngBounds0 = null;
        String s4 = null;
        Uri uri0 = null;
        PlaceOpeningHoursEntity placeOpeningHoursEntity0 = null;
        PlaceExtendedDetailsEntity placeExtendedDetailsEntity0 = null;
        String s5 = null;
        boolean z = false;
        int v1 = 0;
        float f = 0.0f;
        float f1 = 0.0f;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    latLng0 = (LatLng)baua.m(parcel0, v2, LatLng.CREATOR);
                    break;
                }
                case 5: {
                    f = baua.c(parcel0, v2);
                    break;
                }
                case 6: {
                    latLngBounds0 = (LatLngBounds)baua.m(parcel0, v2, LatLngBounds.CREATOR);
                    break;
                }
                case 7: {
                    s4 = baua.s(parcel0, v2);
                    break;
                }
                case 8: {
                    uri0 = (Uri)baua.m(parcel0, v2, Uri.CREATOR);
                    break;
                }
                case 9: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 10: {
                    f1 = baua.c(parcel0, v2);
                    break;
                }
                case 11: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 14: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 15: {
                    s3 = baua.s(parcel0, v2);
                    break;
                }
                case 17: {
                    list1 = baua.x(parcel0, v2);
                    break;
                }
                case 19: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 20: {
                    list0 = baua.v(parcel0, v2);
                    break;
                }
                case 21: {
                    placeOpeningHoursEntity0 = (PlaceOpeningHoursEntity)baua.m(parcel0, v2, PlaceOpeningHoursEntity.CREATOR);
                    break;
                }
                case 22: {
                    placeExtendedDetailsEntity0 = (PlaceExtendedDetailsEntity)baua.m(parcel0, v2, PlaceExtendedDetailsEntity.CREATOR);
                    break;
                }
                case 23: {
                    s5 = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new PlaceEntity(s, list0, s1, s2, s3, list1, latLng0, f, latLngBounds0, s4, uri0, z, f1, v1, placeOpeningHoursEntity0, placeExtendedDetailsEntity0, s5);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PlaceEntity[v];
    }
}

