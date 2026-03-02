import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;

public final class epuk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ConnectionResult connectionResult0 = null;
        int v1 = 0;
        ResolveAccountResponse resolveAccountResponse0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    connectionResult0 = (ConnectionResult)baua.m(parcel0, v2, ConnectionResult.CREATOR);
                    break;
                }
                case 3: {
                    resolveAccountResponse0 = (ResolveAccountResponse)baua.m(parcel0, v2, ResolveAccountResponse.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new SignInResponse(v1, connectionResult0, resolveAccountResponse0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SignInResponse[v];
    }
}

