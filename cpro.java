import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

public final class cpro implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        float f = 0.0f;
        float f1 = 0.0f;
        LatLng latLng0 = null;
        float f2 = 0.0f;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    latLng0 = (LatLng)baua.m(parcel0, v1, LatLng.CREATOR);
                    break;
                }
                case 3: {
                    f = baua.c(parcel0, v1);
                    break;
                }
                case 4: {
                    f2 = baua.c(parcel0, v1);
                    break;
                }
                case 5: {
                    f1 = baua.c(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new CameraPosition(latLng0, f, f2, f1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CameraPosition[v];
    }
}

