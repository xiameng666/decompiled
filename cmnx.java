import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.LastLocationRequest;

public final class cmnx implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ClientIdentity clientIdentity0 = null;
        int v1 = 0;
        boolean z = false;
        long v2 = 0x7FFFFFFFFFFFFFFFL;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 5: {
                    clientIdentity0 = (ClientIdentity)baua.m(parcel0, v3, ClientIdentity.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new LastLocationRequest(v2, v1, z, clientIdentity0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LastLocationRequest[v];
    }
}

