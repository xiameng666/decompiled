import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocation.ActivityCandidate;
import com.google.android.gms.semanticlocation.ActivityOngoingEvent;
import com.google.android.gms.semanticlocation.AdditionalActivityCandidates;

public final class elus implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ActivityCandidate activityCandidate0 = null;
        float f = 0.0f;
        float f1 = 0.0f;
        AdditionalActivityCandidates additionalActivityCandidates0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    f = baua.c(parcel0, v1);
                    break;
                }
                case 2: {
                    f1 = baua.c(parcel0, v1);
                    break;
                }
                case 3: {
                    activityCandidate0 = (ActivityCandidate)baua.m(parcel0, v1, ActivityCandidate.CREATOR);
                    break;
                }
                case 4: {
                    additionalActivityCandidates0 = (AdditionalActivityCandidates)baua.m(parcel0, v1, AdditionalActivityCandidates.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ActivityOngoingEvent(f, f1, activityCandidate0, additionalActivityCandidates0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ActivityOngoingEvent[v];
    }
}

