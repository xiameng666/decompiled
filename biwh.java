import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dtdi.core.ConnectionCapabilities;
import com.google.android.gms.dtdi.core.TokenWrapper;
import com.google.android.gms.dtdi.core.internal.RequireConnectionCapabilitiesChangeOrDisconnectParams;

public final class biwh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        TokenWrapper tokenWrapper0 = null;
        ConnectionCapabilities connectionCapabilities0 = null;
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    tokenWrapper0 = (TokenWrapper)baua.m(parcel0, v1, TokenWrapper.CREATOR);
                    break;
                }
                case 2: {
                    connectionCapabilities0 = (ConnectionCapabilities)baua.m(parcel0, v1, ConnectionCapabilities.CREATOR);
                    break;
                }
                case 3: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                case 4: {
                    iBinder1 = baua.k(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new RequireConnectionCapabilitiesChangeOrDisconnectParams(tokenWrapper0, connectionCapabilities0, iBinder0, iBinder1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RequireConnectionCapabilitiesChangeOrDisconnectParams[v];
    }
}

