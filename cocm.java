import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.locationsharingreporter.LocationShare;
import com.google.android.gms.locationsharingreporter.StopLocationReportingRequest;

public final class cocm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        LocationShare locationShare0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                locationShare0 = (LocationShare)baua.m(parcel0, v1, LocationShare.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new StopLocationReportingRequest(locationShare0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StopLocationReportingRequest[v];
    }
}

