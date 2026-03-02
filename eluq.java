import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocation.Activity;
import com.google.android.gms.semanticlocation.ActivityCandidate;
import com.google.android.gms.semanticlocation.AdditionalActivityCandidates;
import com.google.android.gms.semanticlocation.Parking;
import com.google.android.gms.semanticlocation.PlaceCandidate.Point;

public final class eluq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        PlaceCandidate.Point placeCandidate$Point0 = null;
        PlaceCandidate.Point placeCandidate$Point1 = null;
        ActivityCandidate activityCandidate0 = null;
        AdditionalActivityCandidates additionalActivityCandidates0 = null;
        Parking parking0 = null;
        float f = 0.0f;
        float f1 = 0.0f;
        float f2 = 0.0f;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    placeCandidate$Point0 = (PlaceCandidate.Point)baua.m(parcel0, v1, PlaceCandidate.Point.CREATOR);
                    break;
                }
                case 2: {
                    placeCandidate$Point1 = (PlaceCandidate.Point)baua.m(parcel0, v1, PlaceCandidate.Point.CREATOR);
                    break;
                }
                case 3: {
                    f = baua.c(parcel0, v1);
                    break;
                }
                case 4: {
                    f1 = baua.c(parcel0, v1);
                    break;
                }
                case 5: {
                    f2 = baua.c(parcel0, v1);
                    break;
                }
                case 6: {
                    activityCandidate0 = (ActivityCandidate)baua.m(parcel0, v1, ActivityCandidate.CREATOR);
                    break;
                }
                case 7: {
                    additionalActivityCandidates0 = (AdditionalActivityCandidates)baua.m(parcel0, v1, AdditionalActivityCandidates.CREATOR);
                    break;
                }
                case 8: {
                    parking0 = (Parking)baua.m(parcel0, v1, Parking.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new Activity(placeCandidate$Point0, placeCandidate$Point1, f, f1, f2, activityCandidate0, additionalActivityCandidates0, parking0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Activity[v];
    }
}

