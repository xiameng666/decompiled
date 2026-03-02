import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocation.PlaceCandidate.Identifier;
import com.google.android.gms.semanticlocation.PlaceCandidate.Point;
import com.google.android.gms.semanticlocation.Trip.Origin;

public final class elvp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        PlaceCandidate.Identifier placeCandidate$Identifier0 = null;
        PlaceCandidate.Point placeCandidate$Point0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    placeCandidate$Identifier0 = (PlaceCandidate.Identifier)baua.m(parcel0, v1, PlaceCandidate.Identifier.CREATOR);
                    break;
                }
                case 2: {
                    placeCandidate$Point0 = (PlaceCandidate.Point)baua.m(parcel0, v1, PlaceCandidate.Point.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new Trip.Origin(placeCandidate$Identifier0, placeCandidate$Point0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Trip.Origin[v];
    }
}

