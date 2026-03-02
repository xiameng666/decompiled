import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceRequest;

public final class cnnw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        boolean z1 = false;
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        int v2 = -1;
        long v3 = -1L;
        PlaceFilter placeFilter0 = null;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 2: {
                    placeFilter0 = (PlaceFilter)baua.m(parcel0, v4, PlaceFilter.CREATOR);
                    break;
                }
                case 3: {
                    v3 = baua.i(parcel0, v4);
                    break;
                }
                case 4: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                case 5: {
                    v1 = baua.i(parcel0, v4);
                    break;
                }
                case 6: {
                    z = baua.D(parcel0, v4);
                    break;
                }
                case 7: {
                    z1 = baua.D(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new PlaceRequest(placeFilter0, v3, v2, v1, z, z1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PlaceRequest[v];
    }
}

