import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class cprv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        boolean z1 = false;
        float f = 0.0f;
        float f1 = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        IBinder iBinder0 = null;
        LatLng latLng0 = null;
        LatLngBounds latLngBounds0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                case 3: {
                    latLng0 = (LatLng)baua.m(parcel0, v1, LatLng.CREATOR);
                    break;
                }
                case 4: {
                    f = baua.c(parcel0, v1);
                    break;
                }
                case 5: {
                    f1 = baua.c(parcel0, v1);
                    break;
                }
                case 6: {
                    latLngBounds0 = (LatLngBounds)baua.m(parcel0, v1, LatLngBounds.CREATOR);
                    break;
                }
                case 7: {
                    f2 = baua.c(parcel0, v1);
                    break;
                }
                case 8: {
                    f3 = baua.c(parcel0, v1);
                    break;
                }
                case 9: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 10: {
                    f4 = baua.c(parcel0, v1);
                    break;
                }
                case 11: {
                    f5 = baua.c(parcel0, v1);
                    break;
                }
                case 12: {
                    f6 = baua.c(parcel0, v1);
                    break;
                }
                case 13: {
                    z1 = baua.D(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GroundOverlayOptions(iBinder0, latLng0, f, f1, latLngBounds0, f2, f3, z, f4, f5, f6, z1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GroundOverlayOptions[v];
    }
}

