import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.LocationAvailabilityRequest;

public final class cmnz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ClientIdentity clientIdentity0 = null;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 2: {
                    clientIdentity0 = (ClientIdentity)baua.m(parcel0, v1, ClientIdentity.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new LocationAvailabilityRequest(z, clientIdentity0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LocationAvailabilityRequest[v];
    }
}

