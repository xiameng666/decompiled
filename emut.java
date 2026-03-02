import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.gms.semanticlocationhistory.LocationHistorySettings;

public final class emut implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ReportingState reportingState0 = null;
        boolean z = false;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 3: {
                    reportingState0 = (ReportingState)baua.m(parcel0, v2, ReportingState.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new LocationHistorySettings(z, v1, reportingState0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LocationHistorySettings[v];
    }
}

