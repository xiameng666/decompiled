import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.List;

public final class cprr implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        LatLng latLng0 = null;
        List list0 = null;
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        boolean z1 = false;
        float f = 0.0f;
        float f1 = 0.0f;
        double f2 = 0.0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    latLng0 = (LatLng)baua.m(parcel0, v3, LatLng.CREATOR);
                    break;
                }
                case 3: {
                    f2 = baua.b(parcel0, v3);
                    break;
                }
                case 4: {
                    f = baua.c(parcel0, v3);
                    break;
                }
                case 5: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 6: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 7: {
                    f1 = baua.c(parcel0, v3);
                    break;
                }
                case 8: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 9: {
                    z1 = baua.D(parcel0, v3);
                    break;
                }
                case 10: {
                    list0 = baua.y(parcel0, v3, PatternItem.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new CircleOptions(latLng0, f2, f, v1, v2, f1, z, z1, list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CircleOptions[v];
    }
}

