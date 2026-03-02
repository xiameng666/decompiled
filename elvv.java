import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocation.PlaceCandidate.Identifier;
import com.google.android.gms.semanticlocation.PlaceCandidate.Point;
import com.google.android.gms.semanticlocation.PlaceCandidate;

public final class elvv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        double f = 0.0;
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        PlaceCandidate.Identifier placeCandidate$Identifier0 = null;
        PlaceCandidate.Point placeCandidate$Point0 = null;
        float f1 = 0.0f;
        float f2 = 0.0f;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    placeCandidate$Identifier0 = (PlaceCandidate.Identifier)baua.m(parcel0, v2, PlaceCandidate.Identifier.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 3: {
                    f1 = baua.c(parcel0, v2);
                    break;
                }
                case 4: {
                    f2 = baua.c(parcel0, v2);
                    break;
                }
                case 5: {
                    placeCandidate$Point0 = (PlaceCandidate.Point)baua.m(parcel0, v2, PlaceCandidate.Point.CREATOR);
                    break;
                }
                case 6: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 7: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                case 8: {
                    f = baua.b(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new PlaceCandidate(placeCandidate$Identifier0, v1, f1, f2, placeCandidate$Point0, z, z1, f);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PlaceCandidate[v];
    }
}

