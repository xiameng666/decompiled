import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.places.fencing.PlacefencingFilter;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;

public final class cnoj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        String s = null;
        PlacefencingFilter placefencingFilter0 = null;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 1: {
                    s = baua.s(parcel0, v5);
                    break;
                }
                case 2: {
                    placefencingFilter0 = (PlacefencingFilter)baua.m(parcel0, v5, PlacefencingFilter.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                case 4: {
                    v2 = baua.f(parcel0, v5);
                    break;
                }
                case 5: {
                    v3 = baua.f(parcel0, v5);
                    break;
                }
                case 6: {
                    v4 = baua.f(parcel0, v5);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new PlacefencingRequest(s, placefencingFilter0, v1, v2, v3, v4);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PlacefencingRequest[v];
    }
}

