import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.locationsharingreporter.IneligibilityRationale;
import com.google.android.gms.locationsharingreporter.LocationReportingStatus;

public final class cobk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IneligibilityRationale ineligibilityRationale0 = null;
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 2: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 4: {
                    ineligibilityRationale0 = (IneligibilityRationale)baua.m(parcel0, v3, IneligibilityRationale.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new LocationReportingStatus(v1, v2, z, ineligibilityRationale0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LocationReportingStatus[v];
    }
}

