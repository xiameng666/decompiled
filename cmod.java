import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.WorkSource;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.LocationRequest;

public final class cmod implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        WorkSource workSource0 = new WorkSource();
        ClientIdentity clientIdentity0 = null;
        boolean z = false;
        int v1 = 0;
        int v2 = 0;
        boolean z1 = false;
        long v3 = -1L;
        float f = 0.0f;
        int v4 = 0x7FFFFFFF;
        long v5 = 0x7FFFFFFFFFFFFFFFL;
        long v6 = 0x7FFFFFFFFFFFFFFFL;
        long v7 = 0L;
        long v8 = 600000L;
        long v9 = 3600000L;
        int v10 = 102;
        while(parcel0.dataPosition() < v) {
            int v11 = parcel0.readInt();
            switch(((char)v11)) {
                case 1: {
                    v10 = baua.f(parcel0, v11);
                    break;
                }
                case 2: {
                    v9 = baua.i(parcel0, v11);
                    break;
                }
                case 3: {
                    v8 = baua.i(parcel0, v11);
                    break;
                }
                case 5: {
                    v5 = baua.i(parcel0, v11);
                    break;
                }
                case 6: {
                    v4 = baua.f(parcel0, v11);
                    break;
                }
                case 7: {
                    f = baua.c(parcel0, v11);
                    break;
                }
                case 8: {
                    v7 = baua.i(parcel0, v11);
                    break;
                }
                case 9: {
                    z = baua.D(parcel0, v11);
                    break;
                }
                case 10: {
                    v6 = baua.i(parcel0, v11);
                    break;
                }
                case 11: {
                    v3 = baua.i(parcel0, v11);
                    break;
                }
                case 12: {
                    v1 = baua.f(parcel0, v11);
                    break;
                }
                case 13: {
                    v2 = baua.f(parcel0, v11);
                    break;
                }
                case 15: {
                    z1 = baua.D(parcel0, v11);
                    break;
                }
                case 16: {
                    workSource0 = (WorkSource)baua.m(parcel0, v11, WorkSource.CREATOR);
                    break;
                }
                case 17: {
                    clientIdentity0 = (ClientIdentity)baua.m(parcel0, v11, ClientIdentity.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v11);
                }
            }
        }
        baua.A(parcel0, v);
        return new LocationRequest(v10, v9, v8, v7, v5, v6, v4, f, z, v3, v1, v2, z1, workSource0, clientIdentity0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LocationRequest[v];
    }
}

