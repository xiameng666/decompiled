import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.WorkSource;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.CurrentLocationRequest;

public final class cmmz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        WorkSource workSource0 = new WorkSource();
        ClientIdentity clientIdentity0 = null;
        int v1 = 0;
        boolean z = false;
        int v2 = 0;
        long v3 = 0x7FFFFFFFFFFFFFFFL;
        long v4 = 0x7FFFFFFFFFFFFFFFL;
        int v5 = 102;
        while(parcel0.dataPosition() < v) {
            int v6 = parcel0.readInt();
            switch(((char)v6)) {
                case 1: {
                    v3 = baua.i(parcel0, v6);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v6);
                    break;
                }
                case 3: {
                    v5 = baua.f(parcel0, v6);
                    break;
                }
                case 4: {
                    v4 = baua.i(parcel0, v6);
                    break;
                }
                case 5: {
                    z = baua.D(parcel0, v6);
                    break;
                }
                case 6: {
                    workSource0 = (WorkSource)baua.m(parcel0, v6, WorkSource.CREATOR);
                    break;
                }
                case 7: {
                    v2 = baua.f(parcel0, v6);
                    break;
                }
                case 9: {
                    clientIdentity0 = (ClientIdentity)baua.m(parcel0, v6, ClientIdentity.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v6);
                }
            }
        }
        baua.A(parcel0, v);
        return new CurrentLocationRequest(v3, v1, v5, v4, z, v2, workSource0, clientIdentity0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CurrentLocationRequest[v];
    }
}

