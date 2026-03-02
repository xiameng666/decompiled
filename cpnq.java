import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

public final class cpnq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        CameraPosition cameraPosition0 = null;
        Float float0 = null;
        Float float1 = null;
        LatLngBounds latLngBounds0 = null;
        Integer integer0 = null;
        String s = null;
        int v3 = -1;
        int v4 = -1;
        int v5 = -1;
        int v6 = -1;
        int v7 = -1;
        int v8 = -1;
        int v9 = -1;
        int v10 = -1;
        int v11 = -1;
        int v12 = -1;
        int v13 = -1;
        int v14 = -1;
        while(parcel0.dataPosition() < v) {
            int v15 = parcel0.readInt();
            switch(((char)v15)) {
                case 2: {
                    v3 = baua.a(parcel0, v15);
                    break;
                }
                case 3: {
                    v4 = baua.a(parcel0, v15);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v15);
                    break;
                }
                case 5: {
                    cameraPosition0 = (CameraPosition)baua.m(parcel0, v15, CameraPosition.CREATOR);
                    break;
                }
                case 6: {
                    v5 = baua.a(parcel0, v15);
                    break;
                }
                case 7: {
                    v6 = baua.a(parcel0, v15);
                    break;
                }
                case 8: {
                    v7 = baua.a(parcel0, v15);
                    break;
                }
                case 9: {
                    v8 = baua.a(parcel0, v15);
                    break;
                }
                case 10: {
                    v9 = baua.a(parcel0, v15);
                    break;
                }
                case 11: {
                    v10 = baua.a(parcel0, v15);
                    break;
                }
                case 12: {
                    v11 = baua.a(parcel0, v15);
                    break;
                }
                case 14: {
                    v12 = baua.a(parcel0, v15);
                    break;
                }
                case 15: {
                    v13 = baua.a(parcel0, v15);
                    break;
                }
                case 16: {
                    float0 = baua.p(parcel0, v15);
                    break;
                }
                case 17: {
                    float1 = baua.p(parcel0, v15);
                    break;
                }
                case 18: {
                    latLngBounds0 = (LatLngBounds)baua.m(parcel0, v15, LatLngBounds.CREATOR);
                    break;
                }
                case 19: {
                    v14 = baua.a(parcel0, v15);
                    break;
                }
                case 20: {
                    integer0 = baua.q(parcel0, v15);
                    break;
                }
                case 21: {
                    s = baua.s(parcel0, v15);
                    break;
                }
                case 23: {
                    v2 = baua.f(parcel0, v15);
                    break;
                }
                default: {
                    baua.C(parcel0, v15);
                }
            }
        }
        baua.A(parcel0, v);
        return new GoogleMapOptions(((byte)v3), ((byte)v4), v1, cameraPosition0, ((byte)v5), ((byte)v6), ((byte)v7), ((byte)v8), ((byte)v9), ((byte)v10), ((byte)v11), ((byte)v12), ((byte)v13), float0, float1, latLngBounds0, ((byte)v14), integer0, s, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GoogleMapOptions[v];
    }
}

