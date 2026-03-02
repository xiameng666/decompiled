import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.significantplaces.SignificantPlacesRequest;

public final class epgb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ClientIdentity clientIdentity0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                clientIdentity0 = (ClientIdentity)baua.m(parcel0, v1, ClientIdentity.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new SignificantPlacesRequest(clientIdentity0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SignificantPlacesRequest[v];
    }
}

