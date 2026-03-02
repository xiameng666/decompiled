import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocation.AdditionalPlaceCandidates;
import com.google.android.gms.semanticlocation.PlaceCandidate;
import com.google.android.gms.semanticlocation.TemporarilyClosedPlaceCandidates;
import com.google.android.gms.semanticlocation.Visit;

public final class elwt implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        PlaceCandidate placeCandidate0 = null;
        AdditionalPlaceCandidates additionalPlaceCandidates0 = null;
        TemporarilyClosedPlaceCandidates temporarilyClosedPlaceCandidates0 = null;
        float f = 0.0f;
        float f1 = 0.0f;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    f = baua.c(parcel0, v2);
                    break;
                }
                case 3: {
                    f1 = baua.c(parcel0, v2);
                    break;
                }
                case 4: {
                    placeCandidate0 = (PlaceCandidate)baua.m(parcel0, v2, PlaceCandidate.CREATOR);
                    break;
                }
                case 5: {
                    additionalPlaceCandidates0 = (AdditionalPlaceCandidates)baua.m(parcel0, v2, AdditionalPlaceCandidates.CREATOR);
                    break;
                }
                case 6: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 7: {
                    temporarilyClosedPlaceCandidates0 = (TemporarilyClosedPlaceCandidates)baua.m(parcel0, v2, TemporarilyClosedPlaceCandidates.CREATOR);
                    break;
                }
                case 8: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new Visit(v1, f, f1, placeCandidate0, additionalPlaceCandidates0, z, temporarilyClosedPlaceCandidates0, z1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Visit[v];
    }
}

