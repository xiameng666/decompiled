import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocation.PlaceCandidate.Point;
import com.google.android.gms.semanticlocation.PointWithDetails;

public final class elwa implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        long v2 = 0L;
        PlaceCandidate.Point placeCandidate$Point0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    placeCandidate$Point0 = (PlaceCandidate.Point)baua.m(parcel0, v3, PlaceCandidate.Point.CREATOR);
                    break;
                }
                case 2: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new PointWithDetails(placeCandidate$Point0, v2, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PointWithDetails[v];
    }
}

