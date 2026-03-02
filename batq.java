import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;

public final class batq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        IBinder iBinder0 = null;
        ConnectionResult connectionResult0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    iBinder0 = baua.k(parcel0, v2);
                    break;
                }
                case 3: {
                    connectionResult0 = (ConnectionResult)baua.m(parcel0, v2, ConnectionResult.CREATOR);
                    break;
                }
                case 4: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 5: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ResolveAccountResponse(v1, iBinder0, connectionResult0, z, z1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ResolveAccountResponse[v];
    }
}

